package com.example.app_webserver;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        httpHandler handler =new httpHandler();
        String txt = handler.post("http://192.168.0.5/app_android/android.php");
        TextView t =(TextView) findViewById(R.id.text1);
        t.setText(txt);
    }


  
}
