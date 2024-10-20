package logger4jDemo;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		
		log.fatal("hello this is fatal");
		log.error("hello this is error");
		log.info("hello this is info");
		log.warn("hello this is warn");
		log.debug("hello this is debug");
		log.trace("hello this is trace");

	}

}
