package org.neotech.library.android;


import com.google.common.truth.Truth;
import org.junit.Test;

public class PartCoveredTest {

  @Test
  public void getThing() {

    Truth.assertThat(new PartCovered().expectedToBeCoveredInApp()).isEqualTo("Part Covered");
  }
}