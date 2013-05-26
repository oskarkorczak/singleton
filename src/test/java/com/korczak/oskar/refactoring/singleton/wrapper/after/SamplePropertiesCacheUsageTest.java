package com.korczak.oskar.refactoring.singleton.wrapper.after;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class SamplePropertiesCacheUsageTest {

	@Mock private PropertiesCache cachedProperties;
	@Mock private PropertiesCacheWrapper propertiesCacheWrapper;
	@Mock private File file;

	@BeforeMethod
	public void initializeMocks() {
		initMocks(this);
		given(propertiesCacheWrapper.getInstance()).willReturn(cachedProperties);
	}

	@Test
	public void shouldOverrideExistingPropertiesWithFileProperties() {
		SamplePropertiesCacheUsage samplePropertiesCacheUsage = new SamplePropertiesCacheUsage(propertiesCacheWrapper);

		samplePropertiesCacheUsage.overrideExistingCachePropertiesWith(file);

		verify(cachedProperties).overrideWith(file);
	}
}
