package com.korczak.oskar.refactoring.singleton.logger.after;

import com.korczak.oskar.refactoring.singleton.logger.Engine;
import org.slf4j.Logger;

public class DecentCar {

	private Engine engine;
	private Logger decentCarLogger;

	public DecentCar(Engine engine, Logger decentCarLogger){
		this.engine = engine;
		this.decentCarLogger = decentCarLogger;
	}

	public void start(){
		engine.run();
		decentCarLogger.info("Engine is running.");
	}

	public void stop(){
		engine.stop();
		decentCarLogger.info("Engine is stopped.");
	}
}
