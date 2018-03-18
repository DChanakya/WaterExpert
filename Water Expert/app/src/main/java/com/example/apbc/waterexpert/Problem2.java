package com.example.apbc.waterexpert;


import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import static android.view.View.GONE;


public class Problem2 extends AppCompatActivity {
    Spinner color, odour, taste, turbidity, source;
    String colourstring, odourstring, tastestring, turbuditystring, sourcestring,colorDataString,odourDataString,tasteDataString,turbidityDataString,sourceDataString,resultDataString;
    LinearLayout problem2layout, problem2resultlaout;
    TextView resultText,head;
    int count;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);
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
        color = (Spinner) findViewById(R.id.color);
        odour = (Spinner) findViewById(R.id.odour);
        taste = (Spinner) findViewById(R.id.taste);
        turbidity = (Spinner) findViewById(R.id.turbidity);
        source = (Spinner) findViewById(R.id.source);
        problem2layout = (LinearLayout) findViewById(R.id.problem2linear);
        problem2resultlaout = (LinearLayout) findViewById(R.id.problem2Result);
        resultText = (TextView)findViewById(R.id.problem2ResultText);
        head = (TextView)findViewById(R.id.problem2header);
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

    public void back(View v)
    {
        startActivity(new Intent(this,MainActivity.class));
    }
    public void submitted2(View v) {

        if(count==1) {
            startActivity(new Intent(this,Problem2.class));
        }
        if(color.getSelectedItemPosition()<1 || taste.getSelectedItemPosition()<1 || odour.getSelectedItemPosition()<1 || turbidity.getSelectedItemPosition()<1 || source.getSelectedItemPosition()<1){
            Toast.makeText(this, "Please Select Every Field", Toast.LENGTH_SHORT).show();
        }
        else {
            count=count+1;
            Button sub = (Button) findViewById(R.id.subButton);
            sub.setText("back");
            ProgressDialog pd = ProgressDialog.show(this, "Analyzing", "This may take few seconds..");
            problem2layout.setVisibility(GONE);
            problem2resultlaout.setVisibility(View.VISIBLE);
            read();
            searchInData();
            head.setText("Results");
            pd.dismiss();

        }
    }

    public void read() {
        colourstring = color.getSelectedItem().toString().toUpperCase();
        sourcestring = source.getSelectedItem().toString().toUpperCase();
        turbuditystring = turbidity.getSelectedItem().toString().toUpperCase();
        tastestring = taste.getSelectedItem().toString().toUpperCase();
        odourstring = odour.getSelectedItem().toString().toUpperCase();
    }

    public void searchInData()
    {
        InputStream is = getResources().openRawResource(R.raw.query);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line;
        try{
            while((line = bufferedReader.readLine())!=null){
                String[] tokens = line.split(",");
                ParaData data = new ParaData();

                data.setTurbidity(tokens[0]);
                data.setSource(tokens[1]);
                data.setTaste(tokens[2]);
                data.setOdour(tokens[3]);
                data.setColor(tokens[4]);
                data.setResult(tokens[5]);

                sourceDataString = data.getSource().toUpperCase();
                tasteDataString = data.getTaste().toUpperCase();
                odourDataString = data.getOdour().toUpperCase();
                colorDataString = data.getColor().toUpperCase();
                turbidityDataString = data.getTurbidity().toUpperCase();
                resultDataString = data.getResult();
               Log.d("TAG","Result is" + data);
                if(sourceDataString.equals(sourcestring)){

                    if(tasteDataString.equals(tastestring)){
                        if(odourDataString.equals(odourstring)){
                            if(colorDataString.equals(colourstring)){
                                if(turbidityDataString.equals(turbuditystring)){
                                    resultDataString = data.getResult();
                                    head.setText("Results");
                                    String rString="<p>\n" +
                                            "\t\t\t-------------------------------</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Source:&nbsp;</strong>"+ sourcestring +"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Turbidity:&nbsp;</strong>"+turbuditystring+"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Colour:&nbsp;</strong>"+colourstring+"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Taste:&nbsp;</strong>"+tastestring+"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Odour:&nbsp;</strong>"+odourstring+"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Result:</strong>"+resultDataString+"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t-------------------------------</p>\n" +
                                            "\t";
                                    resultText.setText(Html.fromHtml(rString));
                                    break;
                                }
                            }
                        }
                    }
                }

            }

        }
        catch(IOException e){
            e.printStackTrace();
        }


    }


}

