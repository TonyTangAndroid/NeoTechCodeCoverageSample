package org.neotech.app;

import static org.junit.Assert.*;

import com.google.common.truth.Truth;
import org.junit.Test;

public class AutoValueDataTest {

  @Test
  public void name() {

    Truth.assertThat(AutoValueData.create("1")).isNotNull();
  }
}