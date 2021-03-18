package org.neotech.library.android;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.neotech.library.a.R;

public class LibraryActivity extends AppCompatActivity implements View.OnClickListener {

  private TextView text;
  private PojoFullCovered pojoMissed;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_library);

    findViewById(R.id.button).setOnClickListener(this);
    findViewById(R.id.hide).setOnClickListener(this);
    text = findViewById(R.id.text);
  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.button) {
      text.setText("Hello Library!");
    } else {
      pojoMissed = new PojoFullCovered();
      pojoMissed.setThing("test");
      v.setVisibility(View.GONE);
    }
  }

  public String activityNameForRobolectricTest() {
    return "LibraryActivity";
  }
}
