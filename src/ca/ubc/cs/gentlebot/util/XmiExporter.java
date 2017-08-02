package ca.ubc.cs.gentlebot.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.ubc.cs.gentlebot.model.discussions.Discussion;

/**
 * Export a Discussion object to an XMI file
 * 
 * @author famelis
 *
 */
public class XmiExporter {

	public static void export(Discussion d, String path) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(path).getAbsolutePath());

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		// Add the book and writer objects to the contents.
		resource.getContents().add(d);

		// Save the contents of the resource to the file system.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		}

	}

}
