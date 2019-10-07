package project.handler;

import org.apache.log4j.Logger;
import project.AbstractLogger;

public class HandlerConsole extends AbstractLogger {
	private static final Logger logger = Logger.getLogger(HandlerConsole.class);

	@Override
	protected void logMessage(String msg) {
		logger.info(msg);

	}
}