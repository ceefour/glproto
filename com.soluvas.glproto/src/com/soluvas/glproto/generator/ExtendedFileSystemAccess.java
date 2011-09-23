/**
 * 
 */
package com.soluvas.glproto.generator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

/**
 * @author ceefour
 *
 */
public class ExtendedFileSystemAccess extends JavaIoFileSystemAccess implements
		IFileSystemAccess {

	public String getFileContents(String fileName) throws FileNotFoundException, IOException {
		Map<String, String> pathes = getPathes();
		String fullName = pathes.get(DEFAULT_OUTPUT) + "/" + fileName;
		return IOUtils.toString(new FileReader(fullName));
	}
	
}
