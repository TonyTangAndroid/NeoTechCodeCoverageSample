package org.neotech.app.multimoduleapplication;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.neotech.library.android.LibraryAndroidJava;

@RunWith(AndroidJUnit4.class)
public class TouchLibraryCodeFromJavaAndroidTest {

    @Test
    public void touchJavaCode() {
        LibraryAndroidJava.getInstance().touchedByAndroidTestInConsumer();
    }
}
