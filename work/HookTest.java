package com.nagopy.android.downloadconfirm.extension;

import android.support.test.runner.AndroidJUnit4;

import com.nagopy.android.downloadconfirm.R;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class {{ extInfo.ext.capitalize() }}HookTest extends HookTest {

{% if extInfo.ext.lower() == "pdf" %}
    @org.junit.Ignore
{% endif %}
    @Test
    public void test{{ extInfo.ext.capitalize() }}HookEnabled() throws Throwable {
        testCheckboxOn("{{ extInfo.ext.lower() }}", R.string.label_{{ extInfo.ext.lower() }});
    }

    @Test
    public void test{{ extInfo.ext.capitalize() }}HookDisabled() throws Throwable {
        testCheckboxOff("{{ extInfo.ext.lower() }}");
    }
}
