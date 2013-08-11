package com.korczak.oskar.refactoring.singleton.logger.before;

import com.korczak.oskar.refactoring.singleton.logger.Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

	private Logger carLogger = LoggerFactory.getLogger(Car.class);

	private Engine engine;

	public Car(Engine engine){
		this.engine = engine;
	}

	public void start(){
		engine.run();
		carLogger.info("Engine is running.");
	}

	public void stop(){
		engine.stop();
		carLogger.info("Engine is stopped.");
	}
}