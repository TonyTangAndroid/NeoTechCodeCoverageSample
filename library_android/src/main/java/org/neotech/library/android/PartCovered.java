package org.neotech.library.android;

public class PartCovered {

  private String thing = "Part Covered";

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
