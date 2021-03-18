package org.neotech.library.android;

import com.google.common.truth.Truth;
import org.junit.Test;
import org.neotech.library.android.PojoFullCovered;

public class PojoFullCoveredTest {

  @Test
  public void setThing() {
    PojoFullCovered instance = new PojoFullCovered();
    instance.setThing("123");
    Truth.assertThat(instance.getThing()).isEqualTo("123");
  }

}