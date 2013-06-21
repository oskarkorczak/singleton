package com.korczak.oskar.refactoring.singleton.setter.before;

import java.io.File;

public class PropertiesCache {

	private static PropertiesCache instance = new PropertiesCache();

	private PropertiesCache() {

	}

	public static PropertiesCache getInstance() {
		return instance;
	}

	public boolean overrideWith(File fileProperties) {
		return someWeirdComplicatedFilePropertiesLogic(fileProperties);
	}

	private boolean someWeirdComplicatedFilePropertiesLogic(File fileProperties) {
		if (fileProperties.length() % 2 == 0) {
			return true;
		}
		return false;
	}
}