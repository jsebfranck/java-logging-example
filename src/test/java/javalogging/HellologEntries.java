package javalogging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;

public class HellologEntries {
  private static Logger log = LogManager.getRootLogger();

  public static void main(String[] args)
  {
    log.debug("I'm a debug message");
    log.info("I'm an info message");

    // Wait here for user input, as logger needs a moment
    // to spawn its daemon thread and begin sending
    try{
      System.in.read();
    }catch(IOException e){
      //Do nothing
    }
  }
}
