package com.hvyas.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hvyas.volleyrequestconverter.VRC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VRC v = new VRC();
    }
}
