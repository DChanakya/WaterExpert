package com.example.apbc.waterexpert;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video = (VideoView) findViewById(R.id.problem1_video);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        video.setVideoURI(Uri.parse(path));
        video.start();
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
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
    public void back(View v)
    {
        startActivity(new Intent(this,SecondPage.class));
    }
    @Override
    protected void onResume() {
        super.onResume();
        VideoView video = (VideoView) findViewById(R.id.problem1_video);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        video.setVideoURI(Uri.parse(path));
        video.start();
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
