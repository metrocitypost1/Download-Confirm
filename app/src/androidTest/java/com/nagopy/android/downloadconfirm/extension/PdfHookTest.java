package com.nagopy.android.downloadconfirm.extension;

import android.support.test.runner.AndroidJUnit4;

import com.nagopy.android.downloadconfirm.R;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PdfHookTest extends HookTest {


    @org.junit.Ignore

    @Test
    public void testPdfHookEnabled() throws Throwable {
        testCheckboxOn("pdf", R.string.label_pdf);
    }

    @Test
    public void testPdfHookDisabled() throws Throwable {
        testCheckboxOff("pdf");
    }
}