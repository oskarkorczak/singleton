package com.korczak.oskar.refactoring.singleton.setter.before;

import java.io.File;

public class SamplePropertiesCacheUsage {

	public boolean overrideExistingCachePropertiesWith(File fileProperties){
		PropertiesCache cachedProperties = PropertiesCache.getInstance();
		return cachedProperties.overrideWith(fileProperties);
	}
}