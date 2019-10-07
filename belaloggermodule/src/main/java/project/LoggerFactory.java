package project;

import project.exception.LoggerException;
import project.handler.HandlerConsole;
import project.handler.HandlerDatabase;
import project.handler.HandlerFile;
import project.utils.enums.AppenderType;

public class LoggerFactory {

	public static ILogger getLogger(AppenderType appenderType) {

		try {

			ILogger logger = null;

			switch (appenderType) {
			case FILE:
				logger = new HandlerFile();
				break;

			case CONSOLE:
				logger = new HandlerConsole();
				break;

			case DATABASE:
				logger = new HandlerDatabase();
				break;

			default:
				throw new LoggerException("Invalid Parameter: " + appenderType);
			}

			return logger;

		} catch (LoggerException e) {
			System.err.println("Error in getLogger(): " + e);
		}

		return null;

	}
}