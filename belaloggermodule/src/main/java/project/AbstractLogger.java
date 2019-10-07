package project;


import org.apache.log4j.PropertyConfigurator;
import project.exception.LoggerException;
import project.utils.Message;
import project.utils.time.DateUtils;

import java.net.URL;

public abstract class AbstractLogger implements ILogger {

	private String propertiesName = "log4j.properties";

	public void print(Message message) throws LoggerException {

		if (!message.isValid()) {
			throw new LoggerException("Invalid configuration");
		}

		this.initConfigurator();

		this.logMessage(this.getMessageFormat(message));
	}

	private void initConfigurator() {
		URL config = ClassLoader.getSystemResource(propertiesName);
		PropertyConfigurator.configure(config);
	}

	private String getMessageFormat(Message message) {

		StringBuilder messageFormatted = new StringBuilder();

		messageFormatted.append(message.getLevel());
		messageFormatted.append(": ");
		messageFormatted.append(DateUtils.getCurrentTimeStamp());
		messageFormatted.append(" - ");
		messageFormatted.append(message.getMessage());

		return messageFormatted.toString();
	}

	protected abstract void logMessage(String msg);

}