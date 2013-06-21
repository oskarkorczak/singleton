package com.korczak.oskar.refactoring.singleton.setter.after;

import java.io.File;

public class StubbedForTruePropertiesCache extends PropertiesCache {

	@Override
	public boolean overrideWith(File fileProperties) {
		return true;
	}
}
