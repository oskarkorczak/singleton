package com.korczak.oskar.refactoring.singleton.setter.after;

import java.io.File;

public class PropertiesCache {

	private static PropertiesCache instance = new PropertiesCache();

	protected PropertiesCache() {

	}

	public static PropertiesCache getInstance() {
		return instance;
	}

	public static void setInstance(PropertiesCache instance) {
		PropertiesCache.instance = instance;
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