package project.handler;

import org.apache.log4j.Logger;
import project.AbstractLogger;

public class HandlerFile extends AbstractLogger {
	private static final Logger logger = Logger.getLogger(HandlerFile.class);

	@Override
	protected void logMessage(String msg) {
		logger.warn(msg);

	}

}