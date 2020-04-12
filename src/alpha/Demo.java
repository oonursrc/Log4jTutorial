package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debug Log");

		if (5 > 4) {
			log.info("Info log");
		}

		log.error("Error log");
		log.fatal("Fatal log");

	}

}
