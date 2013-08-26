package demo;

import org.apache.log4j.Logger;

public class HelloLog {

	private static Logger logger = Logger.getLogger(HelloLog.class);

	public static void main(String[] args) {
		HelloLog p = new HelloLog();
		p.log("TEST TEST");
		p.hello("Helooooooooo");
	}

	private void log(String message) {
		logger.debug(message);
	}
	
	private void hello(String message) {
		logger.debug(message);
	}
}
