package com.korczak.oskar.refactoring.singleton.wrapper.before;

import java.io.File;

public class SamplePropertiesCacheUsage {

	public void overrideExistingCachePropertiesWith(File fileProperties){
		PropertiesCache cachedProperties = PropertiesCache.getInstance();
		cachedProperties.overrideWith(fileProperties);
	}
}