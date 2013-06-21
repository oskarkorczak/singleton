package com.korczak.oskar.refactoring.singleton.setter.after;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SamplePropertiesCacheUsageTest {

	private File dummyFileProperties;
	private SamplePropertiesCacheUsage propertiesCache;

	@BeforeMethod
	public void setUp() {
		dummyFileProperties = new File("");
		propertiesCache = new SamplePropertiesCacheUsage();
	}

	@Test
	public void shouldReturnTrueDueToWeirdInternalSingletonLogic() {
		PropertiesCache.setInstance(new StubbedForTruePropertiesCache());

		boolean result = propertiesCache.overrideExistingCachePropertiesWith(dummyFileProperties);

		assertThat(result, is(equalTo(TRUE)));
	}

	@Test
	public void shouldReturnFalseDueToWeirdInternalSingletonLogic() {
		PropertiesCache.setInstance(new StubbedForFalsePropertiesCache());

		boolean result = propertiesCache.overrideExistingCachePropertiesWith(dummyFileProperties);

		assertThat(result, is(equalTo(FALSE)));
	}
}
