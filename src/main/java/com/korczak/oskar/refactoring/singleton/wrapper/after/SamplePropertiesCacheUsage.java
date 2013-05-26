package com.korczak.oskar.refactoring.singleton.wrapper.after;

import java.io.File;

public class SamplePropertiesCacheUsage {

	private PropertiesCacheWrapper propertiesCacheWrapper;

	public SamplePropertiesCacheUsage(PropertiesCacheWrapper aPropertiesCacheWrapper) {
		propertiesCacheWrapper = aPropertiesCacheWrapper;
	}

	public void overrideExistingCachePropertiesWith(File fileProperties){
		PropertiesCache cachedProperties = propertiesCacheWrapper.getInstance();
		cachedProperties.overrideWith(fileProperties);
	}
}
