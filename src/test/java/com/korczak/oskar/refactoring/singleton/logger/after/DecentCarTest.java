package com.korczak.oskar.refactoring.singleton.logger.after;

import com.korczak.oskar.refactoring.singleton.logger.Engine;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.AssertJUnit.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DecentCarTest {

	@Mock private Engine engine;
	@Mock private Logger decentCarLogger;
	@InjectMocks private DecentCar decentCar;

	@Captor private ArgumentCaptor<String> argument;

	@BeforeMethod
	public void initializeMocks() {
		initMocks(this);
		argument = ArgumentCaptor.forClass(String.class);
	}

	@Test
	public void shouldRunEngineAndLogMessage() {
		decentCar.start();

		verify(engine).run();
		verify(decentCarLogger).info(argument.capture());
		assertEquals("Engine is running.", argument.getValue());
	}

	@Test
	public void shouldStopEngineAndLogMessage() {
		decentCar.stop();

		verify(engine).stop();
		verify(decentCarLogger).info(argument.capture());
		assertEquals("Engine is stopped.", argument.getValue());
	}
}