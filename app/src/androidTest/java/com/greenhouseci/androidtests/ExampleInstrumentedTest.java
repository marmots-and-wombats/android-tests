package com.greenhouseci.androidtests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.Suppress;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.greenhouseci.androidtests", appContext.getPackageName());
    }

    @Test
    public void thisWillPass() throws Exception {
        assertTrue(true);
    }

    @Test
    public void thisWillFail() throws Exception {
        assertTrue(false);
    }

    @Ignore
    @Test
    public void thisWillBeSkipped() throws Exception {
        assertTrue(true);
    }

}
