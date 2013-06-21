package com.korczak.oskar.refactoring.singleton.setter.after;

import java.io.File;

public class StubbedForFalsePropertiesCache extends PropertiesCache {

	@Override
	public boolean overrideWith(File fileProperties) {
		return false;
	}
}
