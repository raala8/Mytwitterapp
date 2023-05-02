package com.example.mytwitter;

import android.app.Application;

import com.parse.Parse;

public class ParseApp extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xxtRgDjUdw4AlOyPQYuu07nY0HoKOHrzgECbHwOM")
                .clientKey("2bSWC8L7irPLtZoA7Wm9MloFv4DTd0zOU1rbyU0C")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
