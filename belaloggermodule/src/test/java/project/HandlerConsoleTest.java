package project;

import org.junit.Test;
import project.exception.LoggerException;
import project.utils.Level;
import project.utils.Message;
import project.utils.enums.AppenderType;

public class HandlerConsoleTest {

	private static ILogger log = LoggerFactory.getLogger(AppenderType.CONSOLE);

	@Test
	public void testLogToConsoleSuccess() throws LoggerException {
		String msg = "console logger!";
		log.print(new Message(Level.MESSAGE, msg));
		log.print(new Message(Level.ERROR, msg));
	}

}
