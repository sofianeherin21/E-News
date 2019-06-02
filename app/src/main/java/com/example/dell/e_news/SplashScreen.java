package com.example.dell.e_news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread= new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent i2 =new Intent(getApplicationContext(),start_activity.class);
                    startActivity(i2);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
                thread.start();
    }
}
