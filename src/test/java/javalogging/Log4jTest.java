package javalogging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
  private static final Logger LOGGER = LogManager.getLogger(Log4jTest.class);

  @Test
  public void test() {
    LOGGER.debug("DEBUG message");
    LOGGER.info("INFO message");
    LOGGER.warn("WARN message");
    LOGGER.error("ERROR message");

    try {
      throw new CustomException("Erreur métier");
    } catch (Exception e) {
      LOGGER.error("Erreur", e);
      LOGGER.info("Sans message");
      LOGGER.error(e);
    }
  }
}
