package project;

import org.junit.Test;
import project.exception.LoggerException;
import project.utils.Level;
import project.utils.Message;
import project.utils.enums.AppenderType;

public class HandlerDatabaseTest {
	private static ILogger log = LoggerFactory.getLogger(AppenderType.DATABASE);

	@Test
	public void testLogMessageIsSent() throws LoggerException {
		log.print(new Message(Level.MESSAGE, "database logger!"));
		log.print(new Message(Level.WARNING, "database logger!"));
		log.print(new Message(Level.ERROR, "database logger!"));
	}
}