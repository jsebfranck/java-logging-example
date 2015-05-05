package javalogging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MainLog4j {
    private static final Logger LOGGER = LogManager.getLogger(MainLog4j.class);

    public static void main(String[] args) {
		LOGGER.debug("DEBUG message");
		LOGGER.info("INFO message");
		LOGGER.warn("WARN message");
		LOGGER.error("ERROR message");

		try {
			throw new BusinessException("Erreur métier");
		} catch (Exception e) {
			LOGGER.error("Erreur", e);
			LOGGER.info("Sans message");
			LOGGER.error(e);
		}
	}
}
