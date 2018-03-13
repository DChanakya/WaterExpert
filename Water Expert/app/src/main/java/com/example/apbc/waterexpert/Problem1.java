package com.example.apbc.waterexpert;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

public class Problem1 extends AppCompatActivity {

    ProgressDialog progressDialog;
    EditText t1, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40, t41, t42, t43, t44;
    String st1, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16, st17, st18, st19, st20, st21, st22, st23, st24, st25, st26, st27, st28, st29, st30, st31, st32, st33, st34, st35, st36, st37, st38, st39, st40, st41, st42, st43, st44;
    TextView head, tt1, tt2, tt3, tt4, tt5, tt6, tt7, tt8, tt9, tt10, tt11, tt12, tt13, tt14, tt15, tt16, tt17, tt18, tt19, tt20, tt21, tt22, tt23, tt24, tt25, tt26, tt27, tt28, tt29, tt30, tt31, tt32, tt33, tt34, tt35, tt36, tt37, tt38, tt39, tt40, tt41, tt42, tt43, tt44;
    LinearLayout dataEntryLayout, ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8, ll9, ll10, ll11, ll12, ll13, ll14, ll15, ll16, ll17, ll18, ll19, ll20, ll21, ll22, ll23, ll24, ll25, ll26, ll27, ll28, ll29, ll30, ll31, ll32, ll33, ll34, ll35, ll36, ll37, ll38, ll39, ll40, ll41, ll42, ll43, ll44;
    Spinner t2,t3;
    int st2,st3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1);
        initialize();
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
    public void initialize() {
        t1 = (EditText) findViewById(R.id.editView1);
        //t2 = (Spinner) findViewById(R.id.odourSpin);
        //t3 = (Spinner) findViewById(R.id.tasteSpin);
        t4 = (EditText) findViewById(R.id.editView4);
        t5 = (EditText) findViewById(R.id.editView5);
        t6 = (EditText) findViewById(R.id.editView6);
        t7 = (EditText) findViewById(R.id.editView7);
        t8 = (EditText) findViewById(R.id.editView8);
        t9 = (EditText) findViewById(R.id.editView9);
        t10 = (EditText) findViewById(R.id.editView10);
        t11 = (EditText) findViewById(R.id.editView11);
        t12 = (EditText) findViewById(R.id.editView12);
        t13 = (EditText) findViewById(R.id.editView13);
        t14 = (EditText) findViewById(R.id.editView14);
        t15 = (EditText) findViewById(R.id.editView15);
        t16 = (EditText) findViewById(R.id.editView16);
        t17 = (EditText) findViewById(R.id.editView17);
        t18 = (EditText) findViewById(R.id.editView18);
        t19 = (EditText) findViewById(R.id.editView19);
        t20 = (EditText) findViewById(R.id.editView20);
        t21 = (EditText) findViewById(R.id.editView21);
        t22 = (EditText) findViewById(R.id.editView22);
        t23 = (EditText) findViewById(R.id.editView23);
        t24 = (EditText) findViewById(R.id.editView24);
        t25 = (EditText) findViewById(R.id.editView25);
        t26 = (EditText) findViewById(R.id.editView26);
        t27 = (EditText) findViewById(R.id.editView27);
        t28 = (EditText) findViewById(R.id.editView28);
        t29 = (EditText) findViewById(R.id.editView29);
        t30 = (EditText) findViewById(R.id.editView30);
        t31 = (EditText) findViewById(R.id.editView31);
        t32 = (EditText) findViewById(R.id.editView32);
        t33 = (EditText) findViewById(R.id.editView33);
        t34 = (EditText) findViewById(R.id.editView34);
        t35 = (EditText) findViewById(R.id.editView35);
        t36 = (EditText) findViewById(R.id.editView36);
        t37 = (EditText) findViewById(R.id.editView37);
        t38 = (EditText) findViewById(R.id.editView38);
        t39 = (EditText) findViewById(R.id.editView39);
//        t40 = (EditText) findViewById(R.id.editView40);
        t41 = (EditText) findViewById(R.id.editView41);
        t42 = (EditText) findViewById(R.id.editView42);
        t43 = (EditText) findViewById(R.id.editView43);
        t44 = (EditText) findViewById(R.id.editView44);
        ll1 = (LinearLayout) findViewById(R.id.colorlayout);
//        ll2 = (LinearLayout) findViewById(R.id.odourlayout);
//        ll3 = (LinearLayout) findViewById(R.id.tastelayout);
        ll4 = (LinearLayout) findViewById(R.id.turbiditylayout);
        ll5 = (LinearLayout) findViewById(R.id.phlayout);
        ll6 = (LinearLayout) findViewById(R.id.solidslayout);
        ll7 = (LinearLayout) findViewById(R.id.hardnesslayout);
        ll8 = (LinearLayout) findViewById(R.id.alkalinityaslayout);
        ll9 = (LinearLayout) findViewById(R.id.ironlayout);
        ll10 = (LinearLayout) findViewById(R.id.chloridelayout);
        ll11 = (LinearLayout) findViewById(R.id.freelayout);
        ll12 = (LinearLayout) findViewById(R.id.sulphatelayout);
        ll13 = (LinearLayout) findViewById(R.id.sulphidelayout);
        ll14 = (LinearLayout) findViewById(R.id.nitratelayout);
        ll15 = (LinearLayout) findViewById(R.id.fluoridelayout);
        ll16 = (LinearLayout) findViewById(R.id.calciumlayout);
        ll17 = (LinearLayout) findViewById(R.id.copperlayout);
        ll18 = (LinearLayout) findViewById(R.id.magnesiumlayout);
        ll19 = (LinearLayout) findViewById(R.id.manganeselayout);
        ll20 = (LinearLayout) findViewById(R.id.mercurylayout);
        ll21 = (LinearLayout) findViewById(R.id.cadmiumlayout);
        ll22 = (LinearLayout) findViewById(R.id.seleniumlayout);
        ll23 = (LinearLayout) findViewById(R.id.arseniclayout);
        ll24 = (LinearLayout) findViewById(R.id.cyanidelayout);
        ll25 = (LinearLayout) findViewById(R.id.leadlayout);
        ll26 = (LinearLayout) findViewById(R.id.zinclayout);
        ll27 = (LinearLayout) findViewById(R.id.chromiumlayout);
        ll28 = (LinearLayout) findViewById(R.id.aluminiumlayout);
        ll29 = (LinearLayout) findViewById(R.id.boronlayout);
        ll30 = (LinearLayout) findViewById(R.id.ammonialayout);
        ll31 = (LinearLayout) findViewById(R.id.bariumlayout);
        ll32 = (LinearLayout) findViewById(R.id.silverlayout);
        ll33 = (LinearLayout) findViewById(R.id.molybdenumlayout);
        ll34 = (LinearLayout) findViewById(R.id.nickellayout);
        ll35 = (LinearLayout) findViewById(R.id.phenollayout);
        ll36 = (LinearLayout) findViewById(R.id.polychlorinatedlayout);
        ll37 = (LinearLayout) findViewById(R.id.polynuclearlayout);
        ll38 = (LinearLayout) findViewById(R.id.anioniclayout);
        ll39 = (LinearLayout) findViewById(R.id.chloramineslayout);
//        ll40 = (LinearLayout) findViewById(R.id.trihalomethaneslayout);
        ll41 = (LinearLayout) findViewById(R.id.bromoformlayout);
        ll42 = (LinearLayout) findViewById(R.id.dibromochloromethanelayout);
        ll43 = (LinearLayout) findViewById(R.id.bromodichlorometanelayout);
        ll44 = (LinearLayout) findViewById(R.id.chloroformlayout);
        dataEntryLayout = (LinearLayout) findViewById(R.id.dataEntryLayout);
        tt1 = (TextView) findViewById(R.id.colortext);
        //tt2 = (TextView) findViewById(R.id.odourtext);
        //tt3 = (TextView) findViewById(R.id.tastetext);
        tt4 = (TextView) findViewById(R.id.turbiditytext);
        tt5 = (TextView) findViewById(R.id.phtext);
        tt6 = (TextView) findViewById(R.id.solidstext);
        tt7 = (TextView) findViewById(R.id.hardnesstext);
        tt8 = (TextView) findViewById(R.id.alkalinityastext);
        tt9 = (TextView) findViewById(R.id.irontext);
        tt10 = (TextView) findViewById(R.id.chloridetext);
        tt11 = (TextView) findViewById(R.id.freetext);
        tt12 = (TextView) findViewById(R.id.sulphatetext);
        tt13 = (TextView) findViewById(R.id.sulphidetext);
        tt14 = (TextView) findViewById(R.id.nitratetext);
        tt15 = (TextView) findViewById(R.id.fluoridetext);
        tt16 = (TextView) findViewById(R.id.calciumtext);
        tt17 = (TextView) findViewById(R.id.coppertext);
        tt18 = (TextView) findViewById(R.id.magnesiumtext);
        tt19 = (TextView) findViewById(R.id.manganesetext);
        tt20 = (TextView) findViewById(R.id.mercurytext);
        tt21 = (TextView) findViewById(R.id.cadmiumtext);
        tt22 = (TextView) findViewById(R.id.seleniumtext);
        tt23 = (TextView) findViewById(R.id.arsenictext);
        tt24 = (TextView) findViewById(R.id.cyanidetext);
        tt25 = (TextView) findViewById(R.id.leadtext);
        tt26 = (TextView) findViewById(R.id.zinctext);
        tt27 = (TextView) findViewById(R.id.chromiumtext);
        tt28 = (TextView) findViewById(R.id.aluminiumtext);
        tt29 = (TextView) findViewById(R.id.borontext);
        tt30 = (TextView) findViewById(R.id.ammoniatext);
        tt31 = (TextView) findViewById(R.id.bariumtext);
        tt32 = (TextView) findViewById(R.id.silvertext);
        tt33 = (TextView) findViewById(R.id.molybdenumtext);
        tt34 = (TextView) findViewById(R.id.nickeltext);
        tt35 = (TextView) findViewById(R.id.phenoltext);
        tt36 = (TextView) findViewById(R.id.polynchlorinatedtext);
        tt37 = (TextView) findViewById(R.id.polynucleartext);
        tt38 = (TextView) findViewById(R.id.anionictext);
        tt39 = (TextView) findViewById(R.id.chloraminestext);
//        tt40 = (TextView) findViewById(R.id.trihalomethanestext);
        tt41 = (TextView) findViewById(R.id.bromoformtext);
        tt42 = (TextView) findViewById(R.id.dibromochloromethanetext);
        tt43 = (TextView) findViewById(R.id.bromodichlorometanetext);
        tt44 = (TextView) findViewById(R.id.chloroformtext);
        head = (TextView) findViewById(R.id.problem1header);
    }

    public void read() {
        st1 = t1.getText().toString().trim();
        //st2 = t2.getSelectedItemPosition();
        //st3 = t3.getSelectedItemPosition();
        st4 = t4.getText().toString().trim();
        st5 = t5.getText().toString().trim();
        st6 = t6.getText().toString().trim();
        st7 = t7.getText().toString().trim();
        st8 = t8.getText().toString().trim();
        st9 = t9.getText().toString().trim();
        st10 = t10.getText().toString().trim();
        st11 = t11.getText().toString().trim();
        st12 = t12.getText().toString().trim();
        st13 = t13.getText().toString().trim();
        st14 = t14.getText().toString().trim();
        st15 = t15.getText().toString().trim();
        st16 = t16.getText().toString().trim();
        st17 = t17.getText().toString().trim();
        st18 = t18.getText().toString().trim();
        st19 = t19.getText().toString().trim();
        st20 = t20.getText().toString().trim();
        st21 = t21.getText().toString().trim();
        st22 = t22.getText().toString().trim();
        st23 = t23.getText().toString().trim();
        st24 = t24.getText().toString().trim();
        st25 = t25.getText().toString().trim();
        st26 = t26.getText().toString().trim();
        st27 = t27.getText().toString().trim();
        st28 = t28.getText().toString().trim();
        st29 = t29.getText().toString().trim();
        st30 = t30.getText().toString().trim();
        st31 = t31.getText().toString().trim();
        st32 = t32.getText().toString().trim();
        st33 = t33.getText().toString().trim();
        st34 = t34.getText().toString().trim();
        st35 = t35.getText().toString().trim();
        st36 = t36.getText().toString().trim();
        st37 = t37.getText().toString().trim();
        st38 = t38.getText().toString().trim();
        st39 = t39.getText().toString().trim();
//        st40 = t40.getText().toString().trim();
        st41 = t41.getText().toString().trim();
        st42 = t42.getText().toString().trim();
        st43 = t43.getText().toString().trim();
        st44 = t44.getText().toString().trim();

    }

    public void submitted1(View v) {
        progressDialog = ProgressDialog.show(this, "Processing", "This might take a few seconds...");
        read();
        dataEntryLayout.setVisibility(View.GONE);
        head.setText("Results".toUpperCase());
        calculate1();
        //calculate2();
        //calculate3();
        calculate4();
        calculate5();
        calculate6();
        calculate7();
        calculate8();
        calculate9();
        calculate10();
        calculate11();
        calculate12();
        calculate13();
        calculate14();
        calculate15();
        calculate16();
        calculate17();
        calculate18();
        calculate19();
        calculate20();
        calculate21();
        calculate22();
        calculate23();
        calculate24();
        calculate25();
        calculate26();
        calculate27();
        calculate28();
        calculate29();
        calculate30();
        calculate31();
        calculate32();
        calculate33();
        calculate34();
        calculate35();
        calculate36();
        calculate37();
        calculate38();
        calculate39();
//        calculate40();
        calculate41();
        calculate42();
        calculate43();
        calculate44();
        progressDialog.dismiss();

    }

    public void calculate1() {
        if (!st1.isEmpty()) {
            float i = Float.parseFloat(st1);
            ll1.setVisibility(View.VISIBLE);
            if (i > 4 && i < 16) {
                tt1.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Colour</span><br><br>" +
                        "\t<strong>Units</strong>: No<br><br>" +
                        "\t<strong>limits</strong>: 5-15<<br><br>" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "\t<strong>Results</strong>:It is Normal. It is acceptable for drinking.<br><br>" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i < 4) {
                tt1.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Colour</span><br><br>" +
                        "\t<strong>Units</strong>: No<br><br>" +
                        "\t<strong>limits</strong>: 5-15<<br><br>" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>" +
                        "\t\t\t------------------" +
                        "\t"));

            } else if (i > 16) {
                tt1.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Colour</span><br><br>" +
                        "\t<strong>Units</strong>: No<br><br>" +
                        "\t<strong>limits</strong>: 5-15<<br><br>" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "\t<strong>Results</strong>:Beyond limit.Red Brown or rusty colour is generally indicative of iron or manganese in your water.\n Green or blue colour generally a result of copper in water supply\n cloudy water is usually due to turbidity.<br><br>" +
                        "\t\t\t------------------" +
                        "\t"));
            }
        }


    }

//    public void calculate2() {
//        if (!st2.isEmpty()) {
//            ll2.setVisibility(View.VISIBLE);
//
//            tt2.setText(Html.fromHtml("<p>\n" +
//                    "\t\t\t------------------<br><br>" +
//                    "" +
//                    "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Odour</span><br><br>" +
//                    "" +
//                    "\t<strong>Units</strong>: No<br><br>" +
//                    "" +
//                    "\t<strong>limits</strong>: Agreeable<br><br>" +
//                    "" +
//                    "\t<strong>Entered Value:</strong>" + st2 + "<br><br>" +
//                    "" +
//                    "\t<strong>Results</strong>: Test&nbsp; Rotten egg odour is a result of decaying organic deposits.<br><br>" +
//                    "" +
//                    "\t\t\t------------------" +
//                    "\t"));
//
//        }

//    if(st2>0){
//     if(st2==1)
//     {
//         ll2.setVisibility(View.VISIBLE);
//
//            tt2.setText(Html.fromHtml("<p>\n" +
//                    "\t\t\t------------------<br><br>" +
//                    "" +
//                    "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Odour</span><br><br>" +
//                    "" +
//                    "\t<strong>Units</strong>: No<br><br>" +
//                    "" +
//                    "\t<strong>limits</strong>: Agreeable<br><br>" +
//                    "" +
//                    "\t<strong>Entered Value:</strong>" + st2 + "<br><br>" +
//                    "" +
//                    "\t<strong>Results</strong>: Test&nbsp; Rotten egg odour is a result of decaying organic deposits.<br><br>" +
//                    "" +
//                    "\t\t\t------------------" +
//                    "\t"));
//     }

//}

//    public void calculate3() {
//        if (!st3.isEmpty()) {
//            ll3.setVisibility(View.VISIBLE);
//
//            tt3.setText(Html.fromHtml("<p>\n" +
//                    "\t\t\t------------------<br><br>" +
//                    "" +
//                    "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Taste</span><br><br>" +
//                    "" +
//                    "\t<strong>Units</strong>: No<br><br>" +
//                    "" +
//                    "\t<strong>limits</strong>: Agreeable<br><br>" +
//                    "" +
//                    "\t<strong>Entered Value:</strong>" + st3 + "<br><br>" +
//                    "" +
//                    "\t<strong>Results</strong>: Test to be conducted only after safety has been established<br><br>" +
//                    "" +
//                    "\t\t\t------------------" +
//                    "\t"));
//
//        }
//        if(st3==1)
//        {
//            ll3.setVisibility(View.VISIBLE);
//
//            tt3.setText(Html.fromHtml("<p>\n" +
//                    "\t\t\t------------------<br><br>" +
//                    "" +
//                    "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Taste</span><br><br>" +
//                    "" +
//                    "\t<strong>Units</strong>: No<br><br>" +
//                    "" +
//                    "\t<strong>limits</strong>: Agreeable<br><br>" +
//                    "" +
//                    "\t<strong>Entered Value:</strong>" + st3 + "<br><br>" +
//                    "" +
//                    "\t<strong>Results</strong>: Test to be conducted only after safety has been established<br><br>" +
//                    "" +
//                    "\t\t\t------------------" +
//                    "\t"));
//
//        }


//    }

    public void calculate4() {
        if (!st4.isEmpty()) {
            float i = Float.parseFloat(st4);
            ll4.setVisibility(View.VISIBLE);
            if (i > 1 && i < 5) {
                tt4.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">turbidity</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: NTU<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 1-5<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is Normal.\nIt is acceptable for drinking.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i < 1) {
                tt4.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">turbidity</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: NTU<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 1-5<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is under limit.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));

            } else if (i > 5) {
                tt4.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Turbidity</span><br><br>" +
                        "\t<strong>Units</strong>: NTU<br><br>" +
                        "\t<strong>limits</strong>: 1-5<<br><br>" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "\t<strong>Results</strong>:Beyond limit.Excess turbidity causes silt, fine organic and inorganic matter. soluble coloured organic compounds,algae and other microscopic organisms.<br><br>" +
                        "\t\t\t------------------" +
                        "\t"));
            }


        }

    }

    public void calculate5() {
        if (!st5.isEmpty()) {
            float i = Float.parseFloat(st5);
            ll5.setVisibility(View.VISIBLE);
            if (i>=6.5 && i<=8.5) {

                tt5.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Ph value</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: No Units<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 6.5-8.5 to No Relaxation<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i<6.5) {
                tt5.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Ph value</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: No units<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 6.5-8.5 to No Relaxation<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is under limit. Below 6.5 the water is Acid.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));

            } else if (i>8.5) {
                tt5.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Turbidity</span><br><br>" +
                        "\t<strong>Units</strong>: NTU<br><br>" +
                        "\t<strong>limits</strong>: 1-5<<br><br>" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "\t<strong>Results</strong>:Beyond limit.Above 8.5 the water is Base.<br><br>" +
                        "\t\t\t------------------" +
                        "\t"));
            }


        }


    }


    public void calculate6() {
        if (!st6.isEmpty()) {
            float i = Float.parseFloat(st6);
            ll6.setVisibility(View.VISIBLE);
            if (i>= 499 && i<= 2001) {
                tt6.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Dissolved Solids</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l <br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 500 to 2000Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i < 499) {
                tt6.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Dissolved Solids</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l <br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 500 to 2000Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:It is under limit.Below 500 Causes cardiovascular diseases.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));

            } else if (i > 2000)
                tt6.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Dissolved Solids</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l <br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 500 to 2000Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:Beyond limit.Above 2000 it is Unacceptable for drinking<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
        }

    }

    public void  calculate7()
    {
        if(!st7.isEmpty())
        {   float i = Float.parseFloat(st7);
            ll7.setVisibility(View.VISIBLE);
            if(i>=200 && i<=600)
            {
                tt7.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Hardness</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if (i<200) {
                tt7.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Hardness</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:It is under Limit.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            }
            else if (i>600)

                tt7.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Hardness</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Beyond limit.Excess hardness causes Scale in utensils and hot water system,soap scums.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
        }

    }


    public void  calculate8() {
        if (!st8.isEmpty()) {
            float i = Float.parseFloat(st8);
            ll8.setVisibility(View.VISIBLE);
            if (i>=200 && i<=600) {
                tt8.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Alkalinity</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i < 200) {
                tt8.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Alkalinity</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>: Below 200 it is under limit.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            } else if (i > 600) {
                tt8.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Alkalinity.</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 200 to 600Mg/l<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:Beyond 600 it causes deterioration of plumbing and increases the chance for many heavy metals in water are present in pipes, solder or plumbing fixtures<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            }
        }

    }
    public void  calculate9()
    {
        if(!st9.isEmpty())
        {
            float i = Float.parseFloat(st9);
            if(i>=0.3) {
                ll9.setVisibility(View.VISIBLE);
                tt9.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Iron</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>:Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 0.3 Mg/l to No Relaxation<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:It is Normal.Excess Iron causes Brackish color, rusty sediment, bitter or metallic taste, browngreen stains, iron bacteria, discolored beverages <br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            }
            else
            {
                ll9.setVisibility(View.VISIBLE);
                tt9.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>" +
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Iron</span><br><br>" +
                        "" +
                        "\t<strong>Units</strong>:Mg/l<br><br>" +
                        "" +
                        "\t<strong>limits</strong>: 0.3 Mg/l to No Relaxation<br><br>" +
                        "" +
                        "\t<strong>Entered Value:</strong>" + String.valueOf(i) + "<br><br>" +
                        "" +
                        "\t<strong>Results</strong>:It is under Limit.<br><br>" +
                        "" +
                        "\t\t\t------------------" +
                        "\t"));
            }
        }

    }

    public void  calculate10()
    {
        if(!st10.isEmpty())
        {   float i = Float.parseFloat(st10);
            ll10.setVisibility(View.VISIBLE);
            if(i>=250 && i<=1000)
            {
                tt10.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Chloride</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l <br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 250 to 1000Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<250)
            {
                tt10.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Chloride</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 250 to 1000Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: Below 250 it is under Limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>1000)
            {
                tt10.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Chloride</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 250 to 1000Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 1000 it causes High blood pressure, salty taste, corroded pipes, fixtures and appliances, blackening and pitting of stainless steel<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate11()
    {
        if(!st11.isEmpty())
        {   float i = Float.parseFloat(st11);
            ll11.setVisibility(View.VISIBLE);
            if(i>=0.2 && i<=1.0)
            {
                tt11.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Free Residual Chlorine</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 to 1.0Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>0.2)
            {
                tt11.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Free Residual Chlorine </span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 to 1.0Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: Below 0.2 is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<1.0)
            {
                tt11.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Free Residual Chlorine</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 to 1.0Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Excess free residual chlorine causes diarrheal diseases.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }

        }


    }

    public void  calculate12()
    {
        if(!st12.isEmpty())
        {   float i = Float.parseFloat(st12);
            ll12.setVisibility(View.VISIBLE);
            if(i>=200 && i<=400)
            {
                tt12.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Sulphate</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 200 to 400Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<200)
            {
                tt12.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Sulphate</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 200 to 400Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: Below 200 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>400)
            {
                tt12.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Sulphate</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 200 to 400Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 400 it causes Bitter, medicinal taste, scaly deposits, corrosion, laxative effects,rotten-egg odor from hydrogen sulfide gas formation<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate13()
    {
        if(!st13.isEmpty())
        {   float i = Float.parseFloat(st13);
            ll13.setVisibility(View.VISIBLE);
            if(i>=0.05)
            {
                tt13.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Sulphide</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is normal. Excess sulphide causes diarrhea and dehydration.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt13.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Sulphide</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate14()
    {
        if(!st14.isEmpty())
        {   float i = Float.parseFloat(st14);
            ll14.setVisibility(View.VISIBLE);
            if(i>=45)
            {
                tt14.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Nitrate</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 45Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal. Excess Nitrate Causes Methemoglobinimeia or Blue baby disease .<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt14.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Nitrate Mg/l Max</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 45Mg/l to No Relaxation.<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate15()
    {
        if(!st15.isEmpty())
        {   float i = Float.parseFloat(st15);
            ll15.setVisibility(View.VISIBLE);
            if(i>=1.0 && i<=1.5)
            {
                tt15.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Fluoride</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 1.0 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<1.0)
            {
                tt15.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Fluoride Mg/l Max</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 1.0 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 1.0 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>1.5)
            {
                tt15.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size: 20px;\">Fluoride</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 1.0 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 1.5 it causes Brownish discoloration of teeth, bone damage.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate16()
    {
        if(!st16.isEmpty())
        {   float i = Float.parseFloat(st16);
            ll16.setVisibility(View.VISIBLE);
            if(i>=75 && i<=200)
            {
                tt16.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Calcium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 75 to 200 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<75)
            {
                tt16.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Calcium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 75  to 200 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 75 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>200)
            {
                tt16.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Calcium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 75  to 200 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 200 it causes Poor lathering and deterioration of the quality of  clothes; incrustation in pipes; scale formation.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate17()
    {
        if(!st17.isEmpty())
        {   float i = Float.parseFloat(st17);
            ll17.setVisibility(View.VISIBLE);
            if(i>=0.05 && i<=1.5)
            {
                tt17.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Copper&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if (i<0.05)
            {
                tt17.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Copper&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: Below 0.05 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if (i>1.5)
            {
                tt17.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Copper&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 to 1.5 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 1.5 it causes Liver damage; mucosal irritation, renal damage and depression; restricts growth of aquatic plants.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate18()
    {
        if(!st18.isEmpty())
        {   float i = Float.parseFloat(st18);
            ll18.setVisibility(View.VISIBLE);
            if(i>=30 && i<=100)
            {
                tt18.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Magnesium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 30 to 100 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<30)
            {
                tt18.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Magnesium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 30 Mg/l to 100 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 30 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>100)
            {
                tt18.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Magnesium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 30 to 100 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 100 it causes Poor lathering and deterioration of clothes; with sulfate laxative.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate19()
    {
        if(!st19.isEmpty())
        {   float i = Float.parseFloat(st19);
            ll19.setVisibility(View.VISIBLE);
            if(i>=0.1 && i<=0.3)
            {
                tt19.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Manganese&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1  to 0.3 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<0.1)
            {
                tt19.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Manganese&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 to 0.3 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 0.1 It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>0.3)
            {
                tt19.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Manganese&nbsp;</span><span style=\"font-size: 20px;\">Mg/l Max</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 to 0.3 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 0.3 it causes Poor taste, color and turbidity; staining; black slime.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate20()
    {
        if(!st20.isEmpty())
        {   float i = Float.parseFloat(st20);
            ll20.setVisibility(View.VISIBLE);
            if(i>=0.001)
            {
                tt20.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Mercury</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.001  to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal. Excess mercury causes 'minamata' disease-neurological impairment and renal disturbances; mutagenic diseases.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt20.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Mercury</span><span style=\"font-size: 20px;\">Mg/l Max</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.001 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate21()
    {
        if(!st21.isEmpty())
        {   float i = Float.parseFloat(st21);
            ll21.setVisibility(View.VISIBLE);
            if(i>=0.003)
            {
                tt21.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Cadmium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.003 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess Cadmium Causes 'itai-itai' disease-painful rheumatic condition; cardio vascular system affected; gastrointestinal upsets and hyper tension .<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt21.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Cadmium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.003 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate22()
    {
        if(!st22.isEmpty())
        {   float i = Float.parseFloat(st22);
            ll22.setVisibility(View.VISIBLE);
            if(i>=0.01)
            {
                tt22.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Selenium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess selenium causes toxicity in water .<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt22.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Selenium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate23()
    {
        if(!st23.isEmpty())
        {   float i = Float.parseFloat(st23);
            ll23.setVisibility(View.VISIBLE);
            if(i>=0.01 && i<=0.05)
            {
                tt23.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Arsenic&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to 0.05 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<0.01)
            {
                tt23.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Arsenic&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to 0.05 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 0.01 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>0.05)
            {
                tt23.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Arsenic&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to 0.05 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Excess arsenic causes Toxic bio-accumulation; central nervous system affected carcinogenic diseases .<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate24()
    {
        if(!st24.isEmpty())
        {   float i = Float.parseFloat(st24);
            ll24.setVisibility(View.VISIBLE);
            if(i>=0.05)
            {
                tt24.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Cyanide&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal. Excess cyanide causes Thyroid, nervous system damage.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt24.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Cyanide&nbsp;</span><span style=\"font-size: 20px;\"</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate25()
    {
        if(!st25.isEmpty())
        {   float i = Float.parseFloat(st25);
            ll25.setVisibility(View.VISIBLE);
            if(i>=0.01)
            {
                tt25.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Lead</span><span style=\"font-size: 20px;\"</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is normal.Excess lead causes Reduces mental capacity (mental retardation), interference with  kidney and neurological functions, hearing loss, blood disorders, hypertension, death at high levels.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt25.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Lead</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.01 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate26()
    {
        if(!st26.isEmpty())
        {   float i = Float.parseFloat(st26);
            ll26.setVisibility(View.VISIBLE);
            if(i>=5 && i<=15)
            {
                tt26.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Zinc&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 5 Mg/l to 15 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<5)
            {
                tt26.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Zinc&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 5 Mg/l to 15 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 5 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>15)
            {
                tt26.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Zinc&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 5 Mg/l to 15 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 15 it causes Metallic taste.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate27()
    {
        if(!st27.isEmpty())
        {   float i = Float.parseFloat(st27);
            ll27.setVisibility(View.VISIBLE);
            if(i>=0.05)
            {
                tt27.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Chromium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal. Excess chromium causes skin irritation, damage to liver, kidney, circulatory nerve tissues.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt27.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Total Chromium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.05 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate28()
    {
        if(!st28.isEmpty())
        {   float i = Float.parseFloat(st28);
            ll28.setVisibility(View.VISIBLE);
            if(i>=0.03 && i<=0.2)
            {
                tt28.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Aluminium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.03 Mg/l to 0.2 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<0.03)
            {
                tt28.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Aluminium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.03 Mg/l to 0.2 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 0.03 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>0.2)
            {
                tt28.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Aluminium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.03 Mg/l to 0.2 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 0.2 it causes Neurological disorders and Alzheimer's disease .<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate29()
    {
        if(!st29.isEmpty())
        {   float i = Float.parseFloat(st29);
            ll29.setVisibility(View.VISIBLE);
            if(i>=0.5 && i<=1.0)
            {
                tt29.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Boron&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.5 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<0.5)
            {
                tt29.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Boron&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.5 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 0.5 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>1.0)
            {
                tt29.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Boron&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.5 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 1.0 it causes several health effects may occur and there is a risk for testacles and unborn babies.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate30()
    {
        if(!st30.isEmpty())
        {   float i = Float.parseFloat(st30);
            ll30.setVisibility(View.VISIBLE);
            if(i>=0.5)
            {
                tt30.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Ammonia</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.5 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal. Excess ammonia causes loss of equilibrium ,convulsions,coma and death.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt30.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Ammonia</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.5 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate31()
    {
        if(!st31.isEmpty())
        {   float i = Float.parseFloat(st31);
            ll31.setVisibility(View.VISIBLE);
            if(i>=0.7)
            {
                tt31.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Barium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.7 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>: It is Normal.Excess barium causes blood pressure, gastrointestinal problems.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt31.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Barium&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.7 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate32()
    {
        if(!st32.isEmpty())
        {   float i = Float.parseFloat(st32);
            ll32.setVisibility(View.VISIBLE);
            if(i>=0.1)
            {
                tt32.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Silver&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal. Excess silver causes breathing problem, throat irritation, stomach pain.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt32.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Silver&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate33()
    {
        if(!st33.isEmpty())
        {   float i = Float.parseFloat(st33);
            ll33.setVisibility(View.VISIBLE);
            if(i>=0.07)
            {
                tt33.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Molybdenum&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.07 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal and it has no effects.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt33.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Molybdenum&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.07 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate34()
    {
        if(!st34.isEmpty())
        {   float i = Float.parseFloat(st34);
            ll34.setVisibility(View.VISIBLE);
            if(i>=0.02)
            {
                tt34.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Nickel&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.02 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess nickel causes dermatitis, when inhaled it is highly carcinogenic.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt34.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Nickel&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.02 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate35()
    {
        if(!st35.isEmpty())
        {   float i = Float.parseFloat(st35);
            ll35.setVisibility(View.VISIBLE);
            if(i>=0.001)
            {
                tt35.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Phenolic Compound (C6H50H)&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.001 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Remarks</strong>:It is normal.Excess phenolic compounds causes objectionable taste and colour.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt35.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Phenolic Compound (C6H50H)&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.001 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate36()
    {
        if(!st36.isEmpty())
        {   float i = Float.parseFloat(st36);
            ll36.setVisibility(View.VISIBLE);
            if(i>=0.0005)
            {
                tt36.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">PolyChlorinated biphenlys&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.0005 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal. Excess causes cancer.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt36.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">PolyChlorinated biphenyls&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.0005 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate37()
    {
        if(!st37.isEmpty())
        {   float i = Float.parseFloat(st37);
            ll37.setVisibility(View.VISIBLE);
            if(i>=0.0001)
            {
                tt37.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">PolyNuclear Aromatic Hydrocarbons&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.0001 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess causes eye irritation and vomitings and gastro intestinals cancers.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt37.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">PolyNuclear Aromatic Hydrocarbons&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.0001 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate38()
    {
        if(!st38.isEmpty())
        {   float i = Float.parseFloat(st38);
            ll38.setVisibility(View.VISIBLE);
            if(i>=0.2 && i<=1.0)
            {
                tt38.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Anionic Detergents&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i<0.2)
            {
                tt38.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Anionic Detergents&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Below 0.2 it is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else if(i>1.0)
            {
                tt38.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Anionic Detergents&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.2 Mg/l to 1.0 Mg/l<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:Above 1.0 water becomes toxic, weight loss, depression , lack of energy,skin and nervous system toxicity.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate39()
    {
        if(!st39.isEmpty())
        {   float i = Float.parseFloat(st39);
            ll39.setVisibility(View.VISIBLE);
            if(i>=4)
            {
                tt39.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Chloromines&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 4.0 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal. Excess chloromines effects cells genetic material and produce high toxic human carcinogenic substances.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt39.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Chloromines&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 4.0 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

//    public void  calculate40()
//    {
//        tt40.setText(Html.fromHtml("<p>\n" +
//                "\t\t\t------------------<br><br>"+
//                "" +
//                "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Trihalomethanes</span><br><br>"+
//                "" +
//                "\t<strong>Units</strong>: Mg/l<br><br>"+
//                "" +
//                "\t<strong>Entered Value:</strong>"+ st40 +"<br><br>"+
//                "" +
//                "\t<strong>Results</strong>:It is Normal.<br><br>"+
//                "" +
//                "\t\t\t------------------"+
//                "\t"));
//
//
// }

    public void  calculate41()
    {
        if(!st41.isEmpty())
        {   float i = Float.parseFloat(st41);
            ll41.setVisibility(View.VISIBLE);
            if(i>=0.1)
            {
                tt41.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Bromoform&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is Normal.Excess bromoform causes liver and kidney diseases.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt41.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Bromolom&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate42()
    {
        if(!st42.isEmpty())
        {   float i = Float.parseFloat(st42);
            ll42.setVisibility(View.VISIBLE);
            if(i>=0.1)
            {
                tt42.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Dibromochloromethane&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess dibromochloromethane is a serious risk for cancer.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt42.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Dibromochloromethane&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.1 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate43()
    {
        if(!st43.isEmpty())
        {   float i = Float.parseFloat(st43);
            ll43.setVisibility(View.VISIBLE);
            if(i>=0.06)
            {
                tt43.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Bromodichloromethane&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.06 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.It is acceptable for drinking.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
            else
            {
                tt43.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Bromodichiromethane&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.06 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


    }

    public void  calculate44()
    {
        if(!st44.isEmpty())
        {   float i = Float.parseFloat(st44);
            ll44.setVisibility(View.VISIBLE);
            if(i>=0.2)
            {
                tt44.setText(Html.fromHtml("<p>\n\n" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Chloroform</span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.02 Mg/l to No relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is normal.Excess may damage liver and kidney functions. </p>"));
            }
            else
            {
                tt44.setText(Html.fromHtml("<p>\n" +
                        "\t\t\t------------------<br><br>"+
                        "" +
                        "\t<strong>Parameter</strong>: <span style=\"font-size:20px;\">Chlorofom&nbsp;</span><span style=\"font-size: 20px;\"></span><br><br>"+
                        "" +
                        "\t<strong>Units</strong>: Mg/l<br><br>"+
                        "" +
                        "\t<strong>limits</strong>: 0.02 Mg/l to No Relaxation<br><br>"+
                        "" +
                        "\t<strong>Entered Value:</strong>"+ String.valueOf(i) +"<br><br>"+
                        "" +
                        "\t<strong>Results</strong>:It is under limit.<br><br>"+
                        "" +
                        "\t\t\t------------------"+
                        "\t"));
            }
        }


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


