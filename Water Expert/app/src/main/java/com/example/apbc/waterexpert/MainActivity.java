package com.example.apbc.waterexpert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button2(View v)
    {
        Intent i = new Intent(this,Problem2.class);
        startActivity(i);
    }
    public void button1(View v)
    {
        Intent i = new Intent(this,Problem1.class);
        startActivity(i);
    }
    public void button4(View v)
    {
        Intent i = new Intent(this,Problem4.class);
        startActivity(i);
    }
    public void button3(View v)
    {
        Intent i = new Intent(this,Problem3.class);
        startActivity(i);
    }
}
