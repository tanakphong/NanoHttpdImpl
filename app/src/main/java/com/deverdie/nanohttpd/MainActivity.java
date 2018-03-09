package com.deverdie.nanohttpd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            AndroidWebServer androidWebServer = new AndroidWebServer(8080);
            androidWebServer.start();
            Log.i("dlg", "Android Web Server : "+"start");
        } catch (IOException e) {
            e.printStackTrace();
            Log.i("dlg", "Android Web Server : "+"stop");
            Log.i("dlg", "Error : "+e.getMessage());

        }
    }
}
