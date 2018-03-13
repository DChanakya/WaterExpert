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

public class FirstPage extends AppCompatActivity {

    TextView dev,guidance,name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        dev = (TextView) findViewById(R.id.appDevelopers);
        guidance = (TextView) findViewById(R.id.bIdea);
        name = (TextView) findViewById(R.id.appDevelopers111);
        dev.setText(Html.fromHtml("<p><strong><u>App Developers</u></strong>:</p>\n" +
                "<p>&nbsp; &nbsp;1) K. Teja</p>\n" +
                "<p>&nbsp; &nbsp;2) s. Vamsi krishna</p>\n" +
                "<p>&nbsp; &nbsp;3) M. Karthik Varma</p>\n" +
                "<p>&nbsp; &nbsp;4) p. Gayatri varma</p>\n" +
                "<p>&nbsp; &nbsp;5) P. Vamsi Kumar</p>"));
        guidance.setText(Html.fromHtml("<p><strong><u>Behind The Idea</u></strong>:</p>\n" +
                "<p>(Under the Guidance of)</p>\n" +
                "<p><strong>Mr. K.SUNDARA KUMAR\n M.Tech(IITM),(Ph.D), MISTE,MIE.</strong></p>"));
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
public void mainProblem(View v)
{
    Intent i = new Intent(this,SecondPage.class);
    startActivity(i);
}

}

