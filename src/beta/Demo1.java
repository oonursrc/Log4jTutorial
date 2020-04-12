package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debug Log Demo1");

		if (5 > 4) {
			log.info("Info log Demo1");
		}

		log.error("Error log Demo1");
		log.fatal("Fatal log Demo1");

	}

}
