package com.example.apbc.waterexpert;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class SecondPage extends AppCompatActivity {

    TextView cont;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        cont = (TextView) findViewById(R.id.contentText);
        cont.setText(Html.fromHtml("<p style=\"text-align: center;\"><span style=\"font-size: 14pt; font-family: 'times new roman', times;\"><em><strong>The Water Expert system is Very Useful to know the Details, Limits and Their Effects of any Water Quality Parameter and Explore Different Treatment Methods to remove excess parameters. It is also Useful to Trace Out the Clear Discription of Water Quality and its Ranking so that the People can know whether the Water is Safe for Drinking or Not.</strong></em></span></p>"));
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
    public void mainProblem(View v)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void back(View v){
        startActivity(new Intent(this,FirstPage.class));

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
