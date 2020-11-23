package com.atager.perpetual_motion.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(Build.VERSION.SDK_INT < 28
                ? AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY
                : AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);

        // Set the default values for auto-save and show error to the boolean values in pref xml
        // PreferenceManager.setDefaultValues(getApplicationContext(), R.xml.root_preferences, true);

        startActivity (new Intent(getApplicationContext (), MainActivity.class));
        finish ();
    }
}