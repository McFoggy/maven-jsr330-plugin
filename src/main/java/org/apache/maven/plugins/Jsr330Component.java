package org.apache.maven.plugins;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.codehaus.plexus.logging.Logger;

@Named
@Singleton
public class Jsr330Component {
  @Inject private Logger logger;

  public void hello() {
    logger.info("Hello! I am a component that is being used via constructor injection! That's right, I'm badass.");
  }
  
  Logger getLogger() {
	  return logger;
  }
}
