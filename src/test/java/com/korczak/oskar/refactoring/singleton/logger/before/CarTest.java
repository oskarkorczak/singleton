package com.korczak.oskar.refactoring.singleton.logger.before;

import com.korczak.oskar.refactoring.singleton.logger.Engine;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

	@Mock private Engine engine;
	@InjectMocks private Car car;

	@BeforeMethod
	public void setUp() {
		initMocks(this);
	}

	@Test
	public void shouldRunEngine() {
		car.start();

		verify(engine).run();
	}

	@Test
	public void shouldStopEngine() {
		car.stop();

		verify(engine).stop();
	}
}