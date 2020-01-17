package Drmo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.message.LoggerNameAwareMessage;

public class Log4jDemo {

	
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("Hi ");
	
		logger.trace("HI TRACE");
	logger.info("HI THIS IS A TYM PASS THING");
	logger.error("WHAT AM I DOING");
	logger.warn("OH THIS IS GONNA MAKE SOME IMPACT");
	logger.fatal("GAME OVER");
	System.out.println("BYE ");
	
	}

}
