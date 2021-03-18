package org.neotech.library.android;

import static com.google.common.truth.Truth.assertThat;

import android.view.View;
import android.widget.Button;
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
      scenario.onActivity(this::verifyButtonClicked);
    }
  }

  private void verifyButtonClicked(LibraryActivity activity) {
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
    assertThat(activity.activityNameForRobolectricTest()).isEqualTo("LibraryActivity");
  }
}
