package project;

import project.exception.LoggerException;
import project.utils.Message;

public interface ILogger {

	void print(Message message) throws LoggerException;

}