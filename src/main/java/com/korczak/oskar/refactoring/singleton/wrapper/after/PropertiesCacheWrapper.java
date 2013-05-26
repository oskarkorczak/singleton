package com.korczak.oskar.refactoring.singleton.wrapper.after;

public class PropertiesCacheWrapper {

	public PropertiesCacheWrapper() {
	}

	public PropertiesCache getInstance() {
		return PropertiesCache.getInstance();
	}
}