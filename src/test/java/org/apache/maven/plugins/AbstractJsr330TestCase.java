package org.apache.maven.plugins;

import java.util.Collections;

import org.codehaus.plexus.DefaultPlexusContainer;
import org.codehaus.plexus.PlexusTestCase;

public abstract class AbstractJsr330TestCase extends PlexusTestCase {
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    getContainer();
  }

  @Override
  protected synchronized void setupContainer() {
    super.setupContainer();

    ((DefaultPlexusContainer) getContainer())
        .addPlexusInjector(Collections.emptyList(), binder -> binder.requestInjection(this));
  }
}
