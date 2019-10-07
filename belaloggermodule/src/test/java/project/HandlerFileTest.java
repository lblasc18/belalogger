package project;

import org.junit.Test;
import project.exception.LoggerException;
import project.utils.Level;
import project.utils.Message;
import project.utils.enums.AppenderType;

public class HandlerFileTest {
	private static ILogger log = LoggerFactory.getLogger(AppenderType.FILE);

	@Test
	public void testLogMessageIsSent() throws LoggerException {
		
		log.print(new Message(Level.MESSAGE, "file logger!"));
		log.print(new Message(Level.WARNING, "file logger!"));
		log.print(new Message(Level.ERROR, "file logger!"));
		
	}
}