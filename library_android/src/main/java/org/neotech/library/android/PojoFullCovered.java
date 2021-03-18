package org.neotech.library.android;

public class PojoFullCovered {

  private String thing = "default string";

  public void setThing(String thing) {
    this.thing = thing;
  }

  public String getThing() {
    return thing;
  }

  public Object expectedToBeCoveredInApp() {
    return thing;
  }
}
