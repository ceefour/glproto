package com.soluvas.glproto.generator;

import org.eclipse.xtext.generator.IFileSystemAccess;

public class GeneratorUtils {

	public static void check(IFileSystemAccess fsa) {
		System.out.println(fsa.getClass());
	}
}
