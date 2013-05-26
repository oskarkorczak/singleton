package com.korczak.oskar.refactoring.singleton.wrapper.after;

import java.io.File;

public class PropertiesCache {

	private static PropertiesCache instance = new PropertiesCache();

	private PropertiesCache() {

	}

	public static PropertiesCache getInstance() {
		return instance;
	}

	public void overrideWith(File fileProperties) {
		// some logic comes here
	}
}