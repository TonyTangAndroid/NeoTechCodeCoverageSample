package org.neotech.app;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueData {

  public abstract String name();

  public static AutoValueData create(String name) {
    return new AutoValue_AutoValueData(name);
  }


}
