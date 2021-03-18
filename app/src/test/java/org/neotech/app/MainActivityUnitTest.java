package org.neotech.app;

import static com.google.common.truth.Truth.assertThat;

import android.view.View;
import android.widget.Button;
import androidx.test.core.app.ActivityScenario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityUnitTest {

  @Test
  public void shouldHideButtonAfterClick() {
    try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
      scenario.onActivity(this::verifyButtonClicked);
    }
  }

  private void verifyButtonClicked(MainActivity activity) {
    Button button = activity.findViewById(R.id.hide);
    button.performClick();
    assertThat(button.getVisibility()).isEqualTo(View.GONE);
  }

  @Test
  public void activityNameForRobolectricTest() {
    try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
      scenario.onActivity(this::verifyNameCorrect);
    }
  }

  private void verifyNameCorrect(MainActivity activity) {
    assertThat(activity.supposeToBeCoveredButNotCoveredInAppModule()).isEqualTo("MainActivity");
  }
}
