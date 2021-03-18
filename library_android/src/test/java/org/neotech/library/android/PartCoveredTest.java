package org.neotech.library.android;


import com.google.common.truth.Truth;
import org.junit.Test;

public class PartCoveredTest {

  @Test
  public void getThing() {

    PartCovered partCovered = new PartCovered();
    partCovered.setThing("123");
    Truth.assertThat(partCovered.expectedToBeCoveredInApp()).isEqualTo("123");
  }
}