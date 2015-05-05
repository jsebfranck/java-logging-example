package javalogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainSlf4j {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainSlf4j.class);

    public static void main(String[] args) {
		LOGGER.debug("DEBUG message");
		LOGGER.info("First param is {}, second param is {}, third param is {}", "param1", 2, "param3");
		LOGGER.warn("WARN message");
		LOGGER.error("ERROR message");

		try {
			throw new BusinessException("Erreur métier");
		} catch (Exception e) {
			LOGGER.error("Cannot update user with id {}", 10, e);
		}

		IllegalArgumentException iae = new IllegalArgumentException();
		LOGGER.error(iae.toString(), iae);
	}
}
