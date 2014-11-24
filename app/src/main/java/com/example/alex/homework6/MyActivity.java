package com.example.alex.homework6;

import android.app.Activity;

import com.parse.Parse;
import com.parse.ParseObject;

public class MyActivity extends Activity {
    public void onCreate()

    {
        
        Parse.initialize(this, "dUmKozLRIAg1KoV5sZTVTxHijTm66HRSifQO0Z25", "tNPUXDkvP0kbuUhItI2Ez2F1J0hZl7CFBoL5i3ys");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}