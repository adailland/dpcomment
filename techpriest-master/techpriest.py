import requests
import bs4
import glob
import sys
import json
import urllib3
import urllib3.contrib.pyopenssl

projects_repos = ["nodejs/node", "rust-lang/rust", "rails/rails"]
to_add = []
headers = {"Authorization": "token 64bf7b94f849d96f7d74831d2000fa7f90be0894"}

class Comment:
    def __init__(self, author, paragraphs, time):
        self.author = author
        self.paragraphs = paragraphs
        self.time = time

    def formattedPrint(self):
        joint_string = "\n".join(self.paragraphs)
        return ">>>%s\n%s\n" % (self.author, joint_string)

class Thread:
    def __init__(self, comments, time, number):
        self.comments = comments
        self.time = time
        self.number = number

    def formattedPrint(self):
        return ">>>Thread start\n\n%s\n\n>>>Thread end\n\n" % "".join([comment.formattedPrint() for comment in self.comments])
    
        
def extractComment(comment):
    author = comment.select("[class~=author]")[0].text.strip()
    role = "Other" if not comment.select("[class~=tooltipped]") else comment.select("[class~=tooltipped]")[0].text.strip()
    author = "%s, %s" % (author, role)

    paragraphs = []
    try:
        comment_body = comment.select("[class~=comment-body]")[0]
    except:
        print "ERROR"
        print comment        
        sys.exit(1)

    #hack to handle formatting tags, pt1
    for x in ["b", "strong", "i", "em", "mark", "small", "del", "ins", "sub", "sup", "blockquote", "ul", "ol"]:
        for tag in comment_body.findAll(x):
            tag.unwrap()
    for tag in comment_body.findAll("pre"):
        tag.decompose()

    for children in comment_body.children:
        
        if type(children) == bs4.element.Tag:
            paragraphs.append(children.get_text())
        elif type(children) == bs4.element.NavigableString:
            paragraphs.append(children)
        else :
            print "ERROR 2"
            print type(children)
            print children
            sys.exit(1)
            
  
    date = comment.select("[class=timestamp] relative-time")[0]["datetime"]
    return Comment(author, paragraphs, date)

urllib3.disable_warnings()
urllib3.contrib.pyopenssl.inject_into_urllib3()

with open("discussion.txt", "r") as f:
    prs = [x.strip() for x in f.readlines()]
    
to_add.extend(prs)
for pr in prs:
    print pr

    r = requests.get(pr, headers=headers)
        
    soup = bs4.BeautifulSoup(r.text, "html5lib")
        
    comments = soup.select(".comment.timeline-comment")
    threads = soup.select(".review-thread,.outdated-comment")
    
    results =[]

    for comment in comments:
        results.append(extractComment(comment))

    for x in range(len(threads)):
        thread = threads[x]
        comments = [extractComment(comment) for comment in  thread.select("[class~=review-comment]")]
        if len(comments) is 0:
            continue
        
        date = comments[0].time
        results.append(Thread(comments, date, x))
    
    results.sort(key=lambda x: x.time)

    with open("data/%s.txt" % ".".join([pr.split("/")[x] for x in [-3,-1]]), "w") as f:
        for x in results:
            f.write(x.formattedPrint().encode("UTF-8"))