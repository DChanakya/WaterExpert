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
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.apbc.waterexpert.Adapters.CustomCauseListAdapter;
import com.example.apbc.waterexpert.Adapters.CustomListAdapter;
import com.example.apbc.waterexpert.Models.CauseListModel;
import com.example.apbc.waterexpert.Models.ListModel;

import java.util.ArrayList;
import java.util.List;

public class Problem3 extends AppCompatActivity {

    ProgressDialog progressDialog;
    EditText t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40, t41, t42, t43, t44;
    String st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16, st17, st18, st19, st20, st21, st22, st23, st24, st25, st26, st27, st28, st29, st30, st31, st32, st33, st34, st35, st36, st37, st38, st39, st40, st41, st42, st43, st44;
    TextView head,summary,causeText, tt1, tt2, tt3, tt4, tt5, tt6, tt7, tt8, tt9, tt10, tt11, tt12, tt13, tt14, tt15, tt16, tt17, tt18, tt19, tt20, tt21, tt22, tt23, tt24, tt25, tt26, tt27, tt28, tt29, tt30, tt31, tt32, tt33, tt34, tt35, tt36, tt37, tt38, tt39, tt40, tt41, tt42, tt43, tt44;
    LinearLayout dataEntryLayout, ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8, ll9, ll10, ll11, ll12, ll13, ll14, ll15, ll16, ll17, ll18, ll19, ll20, ll21, ll22, ll23, ll24, ll25, ll26, ll27, ll28, ll29, ll30, ll31, ll32, ll33, ll34, ll35, ll36, ll37, ll38, ll39, ll40, ll41, ll42, ll43, ll44;
    ListView tableLayout,causeLayout;
    CustomListAdapter customListAdapter;
    CustomCauseListAdapter customCauseListAdapter;
    List<ListModel> list;
    List<CauseListModel> causeList;
    int count;
    ProgressDialog pDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);
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
        count=0;
        tableLayout = (ListView) findViewById(R.id.tableLayout);
        causeLayout = (ListView) findViewById(R.id.causeLayout);
        //---------------------------------------REFERENCING XML ELEMENTS-----------------------------------------

        list = new ArrayList<>();
        customListAdapter = new CustomListAdapter(Problem3.this,list);
        tableLayout.setAdapter(customListAdapter);
        list.add(
                new ListModel(

                        "Name","Entered Value","Range","Remarks"
                )
        );


        causeList = new ArrayList<>();
        customCauseListAdapter = new CustomCauseListAdapter(Problem3.this,causeList);
        causeLayout.setAdapter(customCauseListAdapter);


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

    public void initialize() {
        t1 = (EditText) findViewById(R.id.problem3_editView1);
//        t2 = (EditText) findViewById(R.id.problem3_editView2);
//        t3 = (EditText) findViewById(R.id.problem3_editView3);
        t4 = (EditText) findViewById(R.id.problem3_editView4);
        t5 = (EditText) findViewById(R.id.problem3_editView5);
        t6 = (EditText) findViewById(R.id.problem3_editView6);
        t7 = (EditText) findViewById(R.id.problem3_editView7);
        t8 = (EditText) findViewById(R.id.problem3_editView8);
        t9 = (EditText) findViewById(R.id.problem3_editView9);
        t10 = (EditText) findViewById(R.id.problem3_editView10);
        t11 = (EditText) findViewById(R.id.problem3_editView11);
        t12 = (EditText) findViewById(R.id.problem3_editView12);
        t13 = (EditText) findViewById(R.id.problem3_editView13);
        t14 = (EditText) findViewById(R.id.problem3_editView14);
        t15 = (EditText) findViewById(R.id.problem3_editView15);
        t16 = (EditText) findViewById(R.id.problem3_editView16);
        t17 = (EditText) findViewById(R.id.problem3_editView17);
        t18 = (EditText) findViewById(R.id.problem3_editView18);
        t19 = (EditText) findViewById(R.id.problem3_editView19);
        t20 = (EditText) findViewById(R.id.problem3_editView20);
        t21 = (EditText) findViewById(R.id.problem3_editView21);
        t22 = (EditText) findViewById(R.id.problem3_editView22);
        t23 = (EditText) findViewById(R.id.problem3_editView23);
        t24 = (EditText) findViewById(R.id.problem3_editView24);
        t25 = (EditText) findViewById(R.id.problem3_editView25);
        t26 = (EditText) findViewById(R.id.problem3_editView26);
        t27 = (EditText) findViewById(R.id.problem3_editView27);
        t28 = (EditText) findViewById(R.id.problem3_editView28);
        t29 = (EditText) findViewById(R.id.problem3_editView29);
        t30 = (EditText) findViewById(R.id.problem3_editView30);
        t31 = (EditText) findViewById(R.id.problem3_editView31);
        t32 = (EditText) findViewById(R.id.problem3_editView32);
        t33 = (EditText) findViewById(R.id.problem3_editView33);
        t34 = (EditText) findViewById(R.id.problem3_editView34);
        t35 = (EditText) findViewById(R.id.problem3_editView35);
        t36 = (EditText) findViewById(R.id.problem3_editView36);
        t37 = (EditText) findViewById(R.id.problem3_editView37);
        t38 = (EditText) findViewById(R.id.problem3_editView38);
        t39 = (EditText) findViewById(R.id.problem3_editView39);
        t40 = (EditText) findViewById(R.id.problem3_editView40);
        t41 = (EditText) findViewById(R.id.problem3_editView41);
        t42 = (EditText) findViewById(R.id.problem3_editView42);
        t43 = (EditText) findViewById(R.id.problem3_editView43);
        t44 = (EditText) findViewById(R.id.problem3_editView44);
        dataEntryLayout = (LinearLayout) findViewById(R.id.problem3_dataEntryLayout);
      head = (TextView) findViewById(R.id.problem3_problem1header);
      summary = (TextView) findViewById(R.id.problem3_summary);
      causeText = (TextView) findViewById(R.id.causeText);


    }
    public void read() {
        st1 = t1.getText().toString().trim();
//        st2 = t2.getText().toString().trim();
//        st3 = t3.getText().toString().trim();
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
        st40 = t40.getText().toString().trim();
        st41 = t41.getText().toString().trim();
        st42 = t42.getText().toString().trim();
        st43 = t43.getText().toString().trim();
        st44 = t44.getText().toString().trim();

    }
    public void submitted1(View v) {

        read();
        if (st1.isEmpty() && st4.isEmpty() && st5.isEmpty() && st6.isEmpty() && st8.isEmpty() && st7.isEmpty() && st9.isEmpty() && st10.isEmpty() && st11.isEmpty() && st12.isEmpty() && st13.isEmpty() && st14.isEmpty() && st15.isEmpty() && st16.isEmpty() && st17.isEmpty() && st18.isEmpty() && st19.isEmpty() && st20.isEmpty() && st21.isEmpty() && st22.isEmpty() && st23.isEmpty() && st24.isEmpty() && st25.isEmpty() && st26.isEmpty() && st27.isEmpty() && st28.isEmpty() && st29.isEmpty() && st30.isEmpty() && st31.isEmpty() && st32.isEmpty() && st33.isEmpty() && st34.isEmpty() && st35.isEmpty() && st36.isEmpty() && st37.isEmpty() && st38.isEmpty() && st39.isEmpty() && st41.isEmpty() && st42.isEmpty() && st43.isEmpty() && st44.isEmpty()) {
            Toast.makeText(this, "Please Enter any field", Toast.LENGTH_SHORT).show();

        } else {
            dataEntryLayout.setVisibility(View.GONE);
            head.setText("Results".toUpperCase());
            calculate1();
//        calculate2();
//        calculate3();
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
            calculate40();
            calculate41();
            calculate42();
            calculate43();
            calculate44();
            if (count > 0) {
                summary.setVisibility(View.VISIBLE);
                summary.setText("SUMMARY:Based on the above parameters entered, Your water is unfit for drinking");
                causeText.setVisibility(View.VISIBLE);

            } else {
                summary.setVisibility(View.VISIBLE);
                summary.setText("SUMMARY:Based on the above parameters entered Your water is Safe for drinking");
            }
        }
    }


    public void calculate1() {
        if (!st1.isEmpty()) {
            float i = Float.parseFloat(st1);
//
            if (i > 4 && i < 16) {
                list.add(
                        new ListModel(

                                "Color",String.valueOf(i),"5-15","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if (i < 4) {
                list.add(
                        new ListModel(

                               "Color",String.valueOf(i),"5-15","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();

            }

             else if (i > 16) {
                list.add(
                        new ListModel(

                                "Color",String.valueOf(i),"5-15","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
                count++; 
                causeList.add(
                new CauseListModel(

                        "Color","1"
                )
        );
            }
        }


    }


//    public void calculate2() {
//        if (!st2.isEmpty()) {
//            list.add(
//                    new ListModel(
//
//                            "Odour",st2,"4-16","Normal"
//                    )
//            );
//            customListAdapter.notifyDataSetChanged();
//
//        }
//
//
//    }
//
//    public void calculate3() {
//        if (!st3.isEmpty()) {
//            list.add(
//                    new ListModel(
//
//                            "Taste",st3,"4-16","Normal"
//                    )
//            );
//            customListAdapter.notifyDataSetChanged();
//
//        }
//
//
//    }
    public void calculate4() {
        if (!st4.isEmpty()) {
            float i = Float.parseFloat(st4);
//
            if (i > 1 && i < 5) {
                list.add(
                        new ListModel(

                                "Turbidity NTU", String.valueOf(i), "1-5", "Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i < 1) {
                list.add(
                        new ListModel(

                                "Turbidity NTU",String.valueOf(i),"1-5","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();

            } else if (i > 5) {
                list.add(
                        new ListModel(

                                "Turbidity NTU",String.valueOf(i),"1-5","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Turbidity","5"
                )
        );

            }
        }
    }

    public void calculate5() {
        if (!st5.isEmpty()) {
            float i = Float.parseFloat(st5);

            if (i > 6.5 && i < 8.5) {

                list.add(
                        new ListModel(

                                "PH Value",String.valueOf(i),"6.5-8.5","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i < 6.5) {
                list.add(
                        new ListModel(

                                "PH Value",String.valueOf(i),"6.5-8.5","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();

            } else if (i > 8.5) {
                list.add(
                        new ListModel(

                                "PH Value",String.valueOf(i),"6.5-8.5","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "PH","3"
                )
        );
            }


        }


    }


    public void calculate6() {
        if (!st6.isEmpty()) {
            float i = Float.parseFloat(st6);

            if (i > 499 && i < 2001) {
                list.add(
                        new ListModel(

                                "Total Dissolved Solids Mg/L",String.valueOf(i),"500-2000","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i < 499) {
                list.add(
                        new ListModel(

                                "Total Dissolved Solids Mg/L",String.valueOf(i),"500-2000","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i > 2000)
                list.add(
                        new ListModel(

                                "Total Dissolved Solids Mg/L",String.valueOf(i),"500-2000","Above the limit"
                        )
                );
            customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Total Dissolved Solids Mg/L","6"
                )
        );
        }

    }

    public void  calculate7()
    {
        if(!st7.isEmpty()) {
            float i = Float.parseFloat(st7);

            if (i >= 200 && i <= 600) {
                list.add(
                        new ListModel(

                                "Total Hardness Mg/L", String.valueOf(i), "200-600", "Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i < 200) {
                list.add(
                        new ListModel(

                                "Total Hardness Mg/L", String.valueOf(i), "200-600", "Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();

            } else if (i > 600) {
                list.add(
                        new ListModel(

                                "Total Hardness Mg/L", String.valueOf(i), "200-600", "Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
                count++;
                causeList.add(
                        new CauseListModel(

                                "Total Hardness Mg/L", "29"
                        )
                );
            }
        }
    }


    public void  calculate8() {
        if (!st8.isEmpty()) {
            float i = Float.parseFloat(st8);

            if (i>= 200 && i<= 600) {
                list.add(
                        new ListModel(

                                "Total Alkalinity Mg/L",String.valueOf(i),"200-600","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i < 200) {
                list.add(
                        new ListModel(

                                "Total Alkalinity Mg/L",String.valueOf(i),"200-600","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            } else if (i > 600) {
                list.add(
                        new ListModel(

                                "Total Alkalinity Mg/L",String.valueOf(i),"200-600","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Total Alkalinity Mg/L","28"
                )
        );
            }
        }

    }
    public void  calculate9()
    {

        if(!st9.isEmpty())
        {   float i = Float.parseFloat(st9);

            if(i<=0.3)
            {
                list.add(
                        new ListModel(

                                "Iron Mg/L",String.valueOf(i),"0.3","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.3)
            {
                list.add(
                        new ListModel(

                                "Iron Mg/L",String.valueOf(i),"0.3","Above the limit."
                        )
                );
                customListAdapter.notifyDataSetChanged();count++;
                causeList.add(
                        new CauseListModel(

                                "Iron","18"
                        )
                );
            }
        }


    }

    public void  calculate10()
    {
        if(!st10.isEmpty())
        {   float i = Float.parseFloat(st10);

            if(i>=250 && i<=1000)
            {
                list.add(
                        new ListModel(

                                "Chloride Mg/L",String.valueOf(i),"250-1000","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<250)
            {
                list.add(
                        new ListModel(

                                "Chloride Mg/L",String.valueOf(i),"250-1000","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>250)
            {
                list.add(
                        new ListModel(

                                "Chloride Mg/L",String.valueOf(i),"250-1000","Above the limit"
                        )
                );
                            customListAdapter.notifyDataSetChanged();count++;
             causeList.add(
                            new CauseListModel(

                                    "Chloride","14"
                            )
                    );
                        }
        }


    }

    public void  calculate11()
    {
        if(!st11.isEmpty())
        {   float i = Float.parseFloat(st11);

            if(i>=0.2 && i<=1.0)
            {
                list.add(
                        new ListModel(

                                "Free residual Chlorine Mg/L",String.valueOf(i),"0.2-1.0","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.2)
            {
                list.add(
                        new ListModel(

                                "Free residual Chlorine Mg/L",String.valueOf(i),"0.2-1.0","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Free residual Chlorine Mg/L",String.valueOf(i),"0.2-1.0","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Free residual Chlorine Mg/L","17"
                )
        );
            }

        }


    }

    public void  calculate12()
    {
        if(!st12.isEmpty())
        {   float i = Float.parseFloat(st12);

            if(i>=200 && i<=400)
            {
                list.add(
                        new ListModel(

                                "Sulphate Mg/L",String.valueOf(i),"200-400","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<200)
            {
                list.add(
                        new ListModel(

                                "Sulphate Mg/L",String.valueOf(i),"250-400","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Sulphate Mg/L",String.valueOf(i),"200-400","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Sulphate","26"
                )
        );
            }
        }


    }

    public void  calculate13()
    {
        if(!st13.isEmpty())
        {   float i = Float.parseFloat(st13);

            if(i<=0.05)
            {
                list.add(
                        new ListModel(

                                "Sulphide Mg/L",String.valueOf(i),"0.05","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.05)
            {
                list.add(
                        new ListModel(

                                "Sulphide Mg/L",String.valueOf(i),"0.05","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++;
 causeList.add(
                new CauseListModel(

                        "Sulphide","27"
                )
        );
            }
        }


    }

    public void  calculate14()
    {
        if(!st14.isEmpty())
        {   float i = Float.parseFloat(st14);

            if(i<=45)
            {
                list.add(
                        new ListModel(

                                "Nitrate Mg/L",String.valueOf(i),"45","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>45)
            {
                list.add(
                        new ListModel(

                                "Nitrate Mg/L",String.valueOf(i),"45","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Nitrate","22"
                )
        );
            }
        }


    }

    public void  calculate15()
    {
        if(!st15.isEmpty())
        {   float i = Float.parseFloat(st15);

            if(i>=1.0 && i<=1.5)
            {
                list.add(
                        new ListModel(

                                "Fluoride Mg/L",String.valueOf(i),"1.0-1.5","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<1.0)
            {
                list.add(
                        new ListModel(

                                "Fluoride Mg/L",String.valueOf(i),"1.0-1.5","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Fluoride Mg/L",String.valueOf(i),"1.0-1.5","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Fluoride","16"
                )
        );
            }
        }


    }

    public void  calculate16()
    {
        if(!st16.isEmpty())
        {   float i = Float.parseFloat(st16);

            if(i>=75 && i<=200)
            {
                list.add(
                        new ListModel(

                                "Calcium Mg/L",String.valueOf(i),"75-200","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<75)
            {
                list.add(
                        new ListModel(

                                "Calcium Mg/L",String.valueOf(i),"75-200","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Calcium Mg/L",String.valueOf(i),"75-200","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Calcium","12"
                )
        );
            }
        }


    }

    public void  calculate17()
    {
        if(!st17.isEmpty())
        {   float i = Float.parseFloat(st17);

            if(i>=0.05 && i<=1.5)
            {
                list.add(
                        new ListModel(

                                "Copper Mg/L",String.valueOf(i),"0.05-1.5","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.05)
            {
                list.add(
                        new ListModel(

                                "Copper Mg/L",String.valueOf(i),"0.05-1.5","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Copper Mg/L",String.valueOf(i),"0.05-1.5","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Copper","15"
                )
        );
            }
        }


    }

    public void  calculate18()
    {
        if(!st18.isEmpty())
        {   float i = Float.parseFloat(st18);

            if(i>=30 && i<=100)
            {
                list.add(
                        new ListModel(

                                "Magnesium Mg/L",String.valueOf(i),"30-100","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<30)
            {
                list.add(
                        new ListModel(

                                "Magnesium Mg/L",String.valueOf(i),"30-100","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>100)
            {
                list.add(
                        new ListModel(

                                "Magnesium Mg/L",String.valueOf(i),"30-100","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Magnesium","19"
                )
        );
            }
        }


    }

    public void  calculate19()
    {
        if(!st19.isEmpty())
        {   float i = Float.parseFloat(st19);

            if(i>=0.1 && i<=0.3)
            {
                list.add(
                        new ListModel(

                                "Manganese Mg/L",String.valueOf(i),"0.1-0.3","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.1)
            {
                list.add(
                        new ListModel(

                                "Manganese Mg/L",String.valueOf(i),"0.1-0.3","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Manganese Mg/L",String.valueOf(i),"0.1-0.3","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Manganese","20"
                )
        );
            }
        }


    }

    public void  calculate20()
    {
        if(!st20.isEmpty())
        {   float i = Float.parseFloat(st20);

            if(i<=0.001)
            {
                list.add(
                        new ListModel(

                                "Mercury Mg/L",String.valueOf(i),"0.001","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }

            else if(i>0.001)
            {
                list.add(
                        new ListModel(

                                "Mercury Mg/L",String.valueOf(i),"0.001","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Mercury","34"
                )
        );
            }
        }


    }

    public void  calculate21()
    {
        if(!st21.isEmpty())
        {   float i = Float.parseFloat(st21);

            if(i<=0.003)
            {
                list.add(
                        new ListModel(

                                "Cadmium Mg/L",String.valueOf(i),"0.003","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.003)
            {
                list.add(
                        new ListModel(

                                "Cadmium Mg/L",String.valueOf(i),"0.003","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Cadmium","31"
                )
        );
            }
        }


    }

    public void  calculate22()
    {
        if(!st22.isEmpty())
        {   float i = Float.parseFloat(st22);

            if(i<=0.01)
            {
                list.add(
                        new ListModel(

                                "Selenium Mg/L",String.valueOf(i),"0.01","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.01)
            {
                list.add(
                        new ListModel(

                                "Selenium Mg/L",String.valueOf(i),"0.01","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Selenium","24"
                )
        );
            }
        }


    }

    public void  calculate23()
    {
        if(!st23.isEmpty())
        {   float i = Float.parseFloat(st23);

            if(i>=0.01 && i<=0.05)
            {
                list.add(
                        new ListModel(

                                "Total Arsenic Mg/L",String.valueOf(i),"0.01-0.05","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.01)
            {
                list.add(
                        new ListModel(

                                "Total Arsenic  Mg/L",String.valueOf(i),"0.01-0.05","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Total Arsenic Mg/L",String.valueOf(i),"0.01-0.05","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Total Arsenic","40"
                )
        );
            }
        }


    }

    public void  calculate24()
    {
        if(!st24.isEmpty())
        {   float i = Float.parseFloat(st24);

            if(i<=0.05)
            {
                list.add(
                        new ListModel(

                                "Cyanide Mg/L",String.valueOf(i),"0.05","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.05)
            {
                list.add(
                        new ListModel(

                                "Cyanide Mg/L",String.valueOf(i),"0.05","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Cyanide","32"
                )
        );
            }
        }


    }

    public void  calculate25()
    {
        if(!st25.isEmpty())
        {   float i = Float.parseFloat(st25);

            if(i<=0.01)
            {
                list.add(
                        new ListModel(

                                "Lead Mg/L",String.valueOf(i),"0.01","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.01)
            {
                list.add(
                        new ListModel(

                                "Lead Mg/L",String.valueOf(i),"0.01","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Lead","33"
                )
        );
            }
        }


    }

    public void  calculate26()
    {
        if(!st26.isEmpty())
        {   float i = Float.parseFloat(st26);

            if(i>=5 && i<=15)
            {
                list.add(
                        new ListModel(

                                "Zinc Mg/L",String.valueOf(i),"5-15","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<5)
            {
                list.add(
                        new ListModel(

                                "Zinc Mg/L",String.valueOf(i),"5-15","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Zinc Mg/L",String.valueOf(i),"5-15","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Zinc","30"
                )
        );
            }
        }


    }

    public void  calculate27()
    {
        if(!st27.isEmpty())
        {   float i = Float.parseFloat(st27);

            if(i<=0.05)
            {
                list.add(
                        new ListModel(

                                "Total Chromium Mg/L",String.valueOf(i),"0.05","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.05)
            {
                list.add(
                        new ListModel(

                                "Total Chromium Mg/L",String.valueOf(i),"0.05","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Total Chromium Mg/L","41"
                )
        );
            }
        }


    }

    public void  calculate28()
    {
        if(!st28.isEmpty())
        {   float i = Float.parseFloat(st28);

            if(i>=0.03 && i<=0.2)
            {
                list.add(
                        new ListModel(

                                "Aluminium Mg/L",String.valueOf(i),"0.03-0.2","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.03)
            {
                list.add(
                        new ListModel(

                                "Aluminium Mg/L",String.valueOf(i),"0.03-0.2","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Aluminium Mg/L",String.valueOf(i),"0.03-0.2","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Aluminium Mg/L","7"
                )
        );
            }
        }


    }

    public void  calculate29()
    {
        if(!st29.isEmpty())
        {   float i = Float.parseFloat(st29);

            if(i>=0.5 && i<=1.0)
            {
                list.add(
                        new ListModel(

                                "Boron Mg/L",String.valueOf(i),"0.5-1.0","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.5)
            {
                list.add(
                        new ListModel(

                                "Boron Mg/L",String.valueOf(i),"0.5-1.0","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Boron Mg/L",String.valueOf(i),"0.5-1.0","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Boron","11"
                )
        );
            }
        }


    }

    public void  calculate30()
    {
        if(!st30.isEmpty())
        {   float i = Float.parseFloat(st30);

            if(i<=0.5)
            {
                list.add(
                        new ListModel(

                                "Ammonia Mg/L",String.valueOf(i),"0.5","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.5)
            {
                list.add(
                        new ListModel(

                                "Ammonia Mg/L",String.valueOf(i),"0.5","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Ammonia","8"
                )
        );
            }
        }


    }

    public void  calculate31()
    {
        if(!st31.isEmpty())
        {   float i = Float.parseFloat(st31);

            if(i<=0.7)
            {
                list.add(
                        new ListModel(

                                "Barium Mg/L",String.valueOf(i),"0.7","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.7)
            {
                list.add(
                        new ListModel(

                                "Barium Mg/L",String.valueOf(i),"0.7","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Barium","10"
                )
        );
            }
        }


    }

    public void  calculate32()
    {
        if(!st32.isEmpty())
        {   float i = Float.parseFloat(st32);

            if(i<=0.1)
            {
                list.add(
                        new ListModel(

                                "Silver Mg/L",String.valueOf(i),"0.1","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.1)
            {
                list.add(
                        new ListModel(

                                "Silver Mg/L",String.valueOf(i),"0.1","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Silver","25"
                )
        );
            }
        }


    }

    public void  calculate33()
    {
        if(!st33.isEmpty())
        {   float i = Float.parseFloat(st33);

            if(i<=0.07)
            {
                list.add(
                        new ListModel(

                                "Molybdenum Mg/L",String.valueOf(i),"0.07","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.07)
            {
                list.add(
                        new ListModel(

                                "Molybdenum Mg/L",String.valueOf(i),"0.07","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Molybdenum","35"
                )
        );
            }
        }


    }

    public void  calculate34()
    {
        if(!st34.isEmpty())
        {   float i = Float.parseFloat(st34);

            if(i<=0.02)
            {
                list.add(
                        new ListModel(

                                "Nickel Mg/L",String.valueOf(i),"0.02","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.02)
            {
                list.add(
                        new ListModel(

                                "Nickel Mg/L",String.valueOf(i),"0.02","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Nickel","36"
                )
        );
            }
        }


    }

    public void  calculate35()
    {
        if(!st35.isEmpty())
        {   float i = Float.parseFloat(st35);

            if(i<=0.001)
            {
                list.add(
                        new ListModel(

                                "Phenolic Compound Mg/L",String.valueOf(i),"0.001","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.001)
            {
                list.add(
                        new ListModel(

                                "Phenolic Compound Mg/L",String.valueOf(i),"0.001","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Phenolic Compound ","23"
                )
        );
            }
        }


    }

    public void  calculate36()
    {
        if(!st36.isEmpty())
        {   float i = Float.parseFloat(st36);

            if(i<=0.0005)
            {
                list.add(
                        new ListModel(

                                "PolyChlorinated Biphenyls Mg/L",String.valueOf(i),"0.0005","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.0005)
            {
                list.add(
                        new ListModel(

                                "PolyChlorinated Biphenyls Mg/L",String.valueOf(i),"0.0005","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "PolyChlorinated Biphenyls","39"
                )
        );
            }
        }


    }

    public void  calculate37()
    {
        if(!st37.isEmpty())
        {   float i = Float.parseFloat(st37);

            if(i<=0.0001)
            {  list.add(
                    new ListModel(

                            "Polynuclear aromatic Hydrocarbons Mg/L",String.valueOf(i),"0.0001","Normal"
                    )
            );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.0001)
            {
                list.add(
                        new ListModel(

                                "Polynuclear aromatic Hydrocarbons Mg/L",String.valueOf(i),"0.0001","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Polynuclear aromatic Hydrocarbons","39"
                )
        );
            }
        }


    }

    public void  calculate38()
    {
        if(!st38.isEmpty())
        {   float i = Float.parseFloat(st38);

            if(i>=0.2 && i<=1.0)
            {
                list.add(
                        new ListModel(

                                "Anionic Detergents Mg/L",String.valueOf(i),"0.2-1.0","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i<0.2)
            {
                list.add(
                        new ListModel(

                                "Anionic Detergents Mg/L",String.valueOf(i),"0.2-1.0","Below the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else
            {
                list.add(
                        new ListModel(

                                "Anionic Detergents Mg/L",String.valueOf(i),"0.2-1.0","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Anionic Detergents","9"
                )
        );
            }
        }


    }

    public void  calculate39()
    {
        if(!st39.isEmpty())
        {   float i = Float.parseFloat(st39);

            if(i<=4)
            {
                list.add(
                        new ListModel(

                                "Chloramines Mg/L",String.valueOf(i),"4","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>4)
            {
                list.add(
                        new ListModel(

                                "Chloramines Mg/L",String.valueOf(i),"4","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Chloramines","13"
                )
        );
            }
        }


    }

    public void  calculate40()
    {



    }

    public void  calculate41()
    {
        if(!st41.isEmpty())
        {   float i = Float.parseFloat(st41);

            if(i<=0.1)
            {
                list.add(
                        new ListModel(

                                "Bromoform Mg/L",String.valueOf(i),"0.1","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.1)
            {
                list.add(
                        new ListModel(

                                "Bromoform Mg/L",String.valueOf(i),"0.1","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Bromoform","42"
                )
        );
            }
        }


    }

    public void  calculate42()
    {
        if(!st42.isEmpty())
        {   float i = Float.parseFloat(st42);

            if(i<=0.1)
            {
                list.add(
                        new ListModel(

                                "Dibromochloromethane Mg/L",String.valueOf(i),"0.1","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.1)
            {
                list.add(
                        new ListModel(

                                "Dibromochloromethane Mg/L",String.valueOf(i),"0.1","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Dibromochloromethane","43"
                )
        );
            }
        }


    }

    public void  calculate43()
    {
        if(!st43.isEmpty())
        {   float i = Float.parseFloat(st43);

            if(i<=0.06)
            {
                list.add(
                        new ListModel(

                                "Bromodichloromethane Mg/L",String.valueOf(i),"0.06","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.06)
            {
                list.add(
                        new ListModel(

                                "Bromodichloromethane Mg/L",String.valueOf(i),"0.06","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Bromodichloromethane","44"
                )
        );
            }
        }


    }

    public void  calculate44()
    {
        if(!st44.isEmpty())
        {   float i = Float.parseFloat(st44);

            if(i<=0.2)
            {
                list.add(
                        new ListModel(

                                "Chloroform Mg/L",String.valueOf(i),"0.2","Normal"
                        )
                );
                customListAdapter.notifyDataSetChanged();
            }
            else if(i>0.2)
            {
                list.add(
                        new ListModel(

                                "Chloroform Mg/L",String.valueOf(i),"0.2","Above the limit"
                        )
                );
                customListAdapter.notifyDataSetChanged();count++; 
 causeList.add(
                new CauseListModel(

                        "Chloroform","45"
                )
        );
            }
        }


    }


}
