package com.example.apbc.waterexpert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Problem1Result extends AppCompatActivity {

    TextView colortext;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1_result);
        colortext = (TextView)findViewById(R.id.colortext);

        colortext.setText(Html.fromHtml("<p>\n\n" +
                "\t\t\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Color</span></p>\n" +
                "\t\t<p>\n" +
                "\t\t\t<strong>Units</strong>: No</p>\n" +
                "\t\t<p>\n" +
                "\t\t\t<strong>Range</strong>: 5-15</p>\n" +
                "\t\t<p>\n" +
                "\t\t\t<strong>Remarks</strong>: Extended to 15 only, If toxic substance are not suspected in absence of alternate sources.</p>"));

    }
}
