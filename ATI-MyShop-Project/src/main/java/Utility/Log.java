package Utility;

import org.apache.log4j.Logger;

public class Log {
	
	public static Logger logger = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String textCaseName)
	{
		logger.info("-----------------"+textCaseName+"-----------------------");
	}

	public static void endTEstCase(String testCaseName)
	{
		logger.info("-----------------------"+testCaseName+"---------------------");
	}
	public static void info(String message)
	{
		logger.info(message);
	}
	public static void warn(String message)
	{
		logger.warn(message);
	}
	public static void error(String message)
	{
		logger.error(message);
	}
	public static void fatal(String message)
	{
		logger.fatal(message);
	}
	public static void debug(String message)
	{
		logger.debug(message);
	}
	
	
	
	
}
