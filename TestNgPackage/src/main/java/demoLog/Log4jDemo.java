package demoLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(log4jDemo.class);
	
	public static void main(String[] args) {
		System.out.println("\n   Hello World...!   \n");
		
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.fatal("This is an error message");
		logger.warn("This is an error message");
	}
	

}
