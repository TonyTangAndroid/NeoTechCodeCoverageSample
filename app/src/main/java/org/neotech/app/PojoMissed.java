package org.neotech.app;

public class PojoMissed {

  private String thing = "default string";

  public void setThing(String thing) {
    this.thing = thing;
  }

  public String getThing() {
    return thing;
  }

  public Object missedTest() {
    return thing;
  }
}
