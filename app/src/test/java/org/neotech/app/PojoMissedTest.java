package org.neotech.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PojoMissedTest {

  @Test
  public void testPojo() {
    PojoMissed p = new PojoMissed();
    assertEquals("default string", p.getThing());
    p.setThing("String1");
    assertEquals("String1", p.getThing());
  }
}
