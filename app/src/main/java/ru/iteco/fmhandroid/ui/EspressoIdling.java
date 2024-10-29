package ru.iteco.fmhandroid.ui;

import android.util.Log;

import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdling {
    private static final String RESOURCE = "GLOBAL"; // Tag
    private static final String TAG = "EspressoIdlingResources";

    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);

    public static void increment() {
        Log.d(TAG, "Incrementing idling resource");
        idlingResource.increment();
    }

    public static void decrement() {
        if (!idlingResource.isIdleNow()) {
            Log.d(TAG, "Decrementing idling resource");
            idlingResource.decrement();
        } else {
            Log.w(TAG, "Attempted to decrement when idling resource is already idle");
        }
    }
}
