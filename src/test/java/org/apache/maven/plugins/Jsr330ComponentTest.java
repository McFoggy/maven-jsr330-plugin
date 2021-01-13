package org.apache.maven.plugins;

import javax.inject.Inject;

public class Jsr330ComponentTest extends AbstractJsr330TestCase {
  @Inject Jsr330Component component;

  public void test_injected_objects() {
    assertNotNull(component);
    assertNotNull(component.getLogger());
  }

  public void test_calls() {
    component.hello();
  }
}
