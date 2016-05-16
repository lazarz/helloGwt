package eu.lazar.hello.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "eu.lazar.hello.HelloProject";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
