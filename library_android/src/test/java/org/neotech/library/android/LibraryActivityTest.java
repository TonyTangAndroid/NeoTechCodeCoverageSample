package org.neotech.library.android;

import static com.google.common.truth.Truth.assertThat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.test.core.app.ActivityScenario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neotech.library.a.R;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class LibraryActivityTest {

  @Test
  public void shouldHideButtonAfterClick() {
    try (ActivityScenario<LibraryActivity> scenario = ActivityScenario.launch(LibraryActivity.class)) {
      scenario.onActivity(this::verifyHideButton);
    }
  }


  @Test
  public void shouldUpdateTextWhenButtonClicked() {
    try (ActivityScenario<LibraryActivity> scenario = ActivityScenario.launch(LibraryActivity.class)) {
      scenario.onActivity(this::verifyClickButton);
    }
  }

  private void verifyClickButton(LibraryActivity activity) {
    assertThat(((TextView)activity.findViewById(R.id.text)).getText()).isEqualTo("Hello");

    Button button = activity.findViewById(R.id.button);
    button.performClick();
    assertThat(((TextView)activity.findViewById(R.id.text)).getText()).isEqualTo("Hello Library!");
  }

  private void verifyHideButton(LibraryActivity activity) {
    Button button = activity.findViewById(R.id.hide);
    button.performClick();
    assertThat(button.getVisibility()).isEqualTo(View.GONE);
  }

  @Test
  public void activityNameForRobolectricTest() {
    try (ActivityScenario<LibraryActivity> scenario = ActivityScenario.launch(LibraryActivity.class)) {
      scenario.onActivity(this::verifyNameCorrect);
    }
  }

  private void verifyNameCorrect(LibraryActivity activity) {
    assertThat(activity.supposeToBeCoveredAndActuallyCoveredInLibraryModule()).isEqualTo("LibraryActivity");
  }
}
