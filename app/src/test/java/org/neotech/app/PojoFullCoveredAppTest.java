package org.neotech.app;

import com.google.common.truth.Truth;
import org.junit.Test;
import org.neotech.library.android.PojoFullCovered;

public class PojoFullCoveredAppTest {

  @Test
  public void setThing() {
    PojoFullCovered instance = new PojoFullCovered();

    instance.setThing("123");
    Truth.assertThat(instance.coveredInApp()).isEqualTo("123");
  }

}