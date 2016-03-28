package com.example.espressotestlab;

import android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by williamtygret on 3/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Test
    public void testIfEverythingIsDisplayed() throws Exception{
        onView(withId(R.id.textView)).check(matches(isDisplayed()));
    }

    @Test
    public void testIfAddButtonWorks() throws Exception {
        String value1 = "1";


        String expectedValue = "$5.00";

        onView(withId(R.id.editText)).perform(typeText(value1), closeSoftKeyboard());

        onView(withId(R.id.button1)).perform(click());

        onView(withId(R.id.textView)).check(matches(withText(expectedValue)));
    }

    @Test
    public void testIfSubtractButtonWorks() throws Exception {
        String value1 = "1";


        String expectedValue = "$3.00";

        onView(withId(R.id.editText)).perform(typeText(value1), closeSoftKeyboard());

        onView(withId(R.id.buttonSubtract)).perform(click());

        onView(withId(R.id.textView)).check(matches(withText(expectedValue)));
    }

    @Test
    public void changeIntent() throws Exception {
        onView(withId(R.id.button2)).perform(click());

        onView(withId(R.id.textView2)).check(matches(isDisplayed()));
        onView(withId(R.id.textView3)).check(matches(isDisplayed()));
    }

}
