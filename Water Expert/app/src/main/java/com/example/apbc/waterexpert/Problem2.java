package com.example.apbc.waterexpert;


import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import static android.view.View.GONE;


public class Problem2 extends AppCompatActivity {
    Spinner color, odour, taste, turbudity, source;
    String colourstring, odourstring, tastestring, turbuditystring, sourcestring,colorDataString,odourDataString,tasteDataString,turbudityDataString,sourceDataString,resultDataString;
    LinearLayout problem2layout, problem2resultlaout;
    TextView resultText,head;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);

        color = (Spinner) findViewById(R.id.color);
        odour = (Spinner) findViewById(R.id.odour);
        taste = (Spinner) findViewById(R.id.taste);
        turbudity = (Spinner) findViewById(R.id.turbudity);
        source = (Spinner) findViewById(R.id.source);
        problem2layout = (LinearLayout) findViewById(R.id.problem2linear);
        problem2resultlaout = (LinearLayout) findViewById(R.id.problem2Result);
        resultText = (TextView)findViewById(R.id.problem2ResultText);
        head = (TextView)findViewById(R.id.problem2header);
    }


    public void submitted2(View v) {

        if(color.getSelectedItemPosition()<1 || taste.getSelectedItemPosition()<1 || odour.getSelectedItemPosition()<1 || turbudity.getSelectedItemPosition()<1 || source.getSelectedItemPosition()<1){
            Toast.makeText(this, "Please Select Every Field", Toast.LENGTH_SHORT).show();
        }
        else {

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
        turbuditystring = turbudity.getSelectedItem().toString().toUpperCase();
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

                data.setTurbudity(tokens[0]);
                data.setSource(tokens[1]);
                data.setTaste(tokens[2]);
                data.setOdour(tokens[3]);
                data.setColor(tokens[4]);
                data.setResult(tokens[5]);

                sourceDataString = data.getSource().toUpperCase();
                tasteDataString = data.getTaste().toUpperCase();
                odourDataString = data.getOdour().toUpperCase();
                colorDataString = data.getColor().toUpperCase();
                turbudityDataString = data.getTurbudity().toUpperCase();
                resultDataString = data.getResult();
               Log.d("TAG","Result is" + data);
                if(sourceDataString.equals(sourcestring)){

                    if(tasteDataString.equals(tastestring)){
                        if(odourDataString.equals(odourstring)){
                            if(colorDataString.equals(colourstring)){
                                if(turbudityDataString.equals(turbuditystring)){
                                    resultDataString = data.getResult();
                                    head.setText("Results");
                                    String rString="<p>\n" +
                                            "\t\t\t-------------------------------</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Source:&nbsp;</strong>"+ sourcestring +"</p>\n" +
                                            "\t\t<p>\n" +
                                            "\t\t\t<strong>Turbudity:&nbsp;</strong>"+turbuditystring+"</p>\n" +
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
        catch (IOException e){}


    }


}

