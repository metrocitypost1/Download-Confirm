package com.nagopy.android.downloadconfirm.extension;

import android.support.test.runner.AndroidJUnit4;

import com.nagopy.android.downloadconfirm.R;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TgzHookTest extends HookTest {


    @Test
    public void testTgzHookEnabled() throws Throwable {
        testCheckboxOn("tgz", R.string.label_tgz);
    }

    @Test
    public void testTgzHookDisabled() throws Throwable {
        testCheckboxOff("tgz");
    }
}