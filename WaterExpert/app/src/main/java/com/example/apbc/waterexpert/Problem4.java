package com.example.apbc.waterexpert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Problem4 extends AppCompatActivity {

   Spinner option;
   int selectedOption;
   TextView textView;
   LinearLayout makeVisible,original;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);
        option = (Spinner)findViewById(R.id.spin);
        textView = (TextView) findViewById(R.id.problem4ResultText);
        makeVisible = (LinearLayout)findViewById(R.id.problem4ResultLayout);
        original = (LinearLayout)findViewById(R.id.problem4linear);
    }


    public void submitted4(View v){
        original.setVisibility(View.GONE);
        makeVisible.setVisibility(View.VISIBLE);
        selectedOption = option.getSelectedItemPosition();
        if(selectedOption==0){
            textView.setText("Details:- While relatively small quantities of water appear to be colorless, water's tint becomes a deeper blue as the thickness of the observed sample increases. The blue hue of water is an intrinsic property and is caused by the selective absorption and scattering of white light. Impurities dissolved or suspended in water may give water different colored appearances.\n" +
                    "\n" +
                    "Units:-Hazen .\n" +
                    "\n" +
                    "Limits:-Desirable Limits: 5 , Permissible Limits: 15\n" +
                    "\n" +
                    "Source :- Iron, Copper, Manganese.\n");
        }

        if(selectedOption==1){
            textView.setText("Details:-The dissolved organic materials re the in organic salts are the dissolved gases may impart to odour to odour which may be caused by the presence of dissolved gases such as H2S, CH4,CO2,O2  etc., combined with organic matter mineral substances like Nacl ,iron compound carbonates and sulphates of other elements; and phenols and other tarry or oil matter, Especially after chlorination .evidently ,for drinking purpose the water must not contain any un desirable or objectable odour . Basically Odour   is divided into different  types . such as Petroleum, gasoline, turpentine, fuel, or solvent odours, Chlorine, chemical, or medicinal odours, Sulfur or rotten egg odor, Moldy, musty, earthy, grassy, or fishy odour.\n" +
                    "\n" +
                    "Limits :-Desirable Limits:-Un objectionable.\n" +
                    "\n" +
                    "Effects:-Odor is not a reliable way to determine the risk of health effects. For some chemicals, odors will be noticeable at low concentrations where the risk for health effects is also very low.\n");
        }

        if(selectedOption==2){
            textView.setText("Details:-If large amount of suspended matter such as clay, silt,or some other finely divided organic materials present in water it will appear to be muddy or cloudy or turbine in appearance. The turbidity depends upon the finesse and concentration of particles present in water. Although, the clay or other inert suspended particles. And is measured by Turbidity meter and Turbidity tube. \n" +
                    "\n" +
                    "Units:-NTU(Nephelometric Turbidity Units)\n" +
                    "\n" +
                    "Limits:-Desirable Limits:5     ,    Permissible Limits:10\n" +
                    "\n" +
                    "Measurement :-  Turbidity Meter\n");
        }


        if(selectedOption==3){
            textView.setText("Details:-pH stands for (potential of hydrogen) referring to the amount of hydrogen found in a substance (In This case of water). pH is measured on a scale that runs from 0 to 14. Seven is Neutral, Meaning there is a balance between acid and alkalinity. A Measurement below 7 Means Acid is present and a Measurement above 7 is Basic (or alkaline).\n" +
                    "\n" +
                    "Limits:-Desirable Limits: 6.5-8.5          Permissible Limits: No relaxation.\n" +
                    "\n" +
                    "Effects:-Beyond this range water will affect the mucous membrane.\n" +
                    "\n" +
                    "Measurement :-  pH Meter\n");
        }


        if(selectedOption==4){
            textView.setText("Details:-The dissolved organic materials are the in orcanic salts or the dissolved gases may impart to taste to water which may be caused by the presence of dissolved gases such as H2S, CH4,CO2,O2 etc., are combined with organic matter ; mineral substances like Nacl ,iron compound carbonates and sulphates of other elements; and phenols and other tarry or oil matter, Especially after chlorination .evidently ,for drinking purpose the water must not contain any un desirable or objectable taste . Basically taste is divided into different types . such as Sweety Salty, Bitter ,Medical ,Metallic ,etc.,.\n" +
                    "\n" +
                    "Limits:-Desirable Limits: Agreeable\n" +
                    "\n" +
                    "Effects:- A taste disorder can have a negative effect on your health and quality of life. More than 200,000 people visit a doctor each year for problems with their ability to taste or smell. Scientists believe that up to 15 percent of adults might have a taste or smell problem, but many don’t seek a doctor’s help.\n");
        }


        if(selectedOption==5){
            textView.setText("Details:-Total dissolved solids (TDS)  is the term used to describe the inorganic salts and small amounts of organic matter present in solution in water. The principal constituents are usually calcium, magnesium, sodium, and potassium etc.,\n" +
                    "\n" +
                    "Units:-Mg/l\n" +
                    "\n" +
                    "Limits:-Desirable Limits: 500               Permissible Limits: 2000\n" +
                    "\n" +
                    "Effects:-Undesirable  Taste, Gastro Intestinal Irritations, corrosion or incrustation.\n" +
                    "\n" +
                    "Measurment :-  TDS Meter.\n");
        }


        if(selectedOption==6){
            textView.setText("Details:- The total hardness is determined by titration with ethylenediamine-tetraacetic acid, disodium salt dehydrate (From now on referred to as Na2EDTA). Na2EDTA forms few dissociated complexes using a particular pH with calcium and magnesium ions. During titration, the Na2EDTA complex the free calcium ions first, followed by the free magnesium ions and finally the magnesium which forms a compound with the small amount of added indicator. The colour changes as a result of the release of the indicator. Eriochrome black T is used as indicator which gives complex red compounds with the ions of the alkaline earth metals. Under the conditions of the determination, the free eriochrome black T is colored blue so that the end of the titration is marked because the last trace of red disappears from the blue colour. Because the calcium complex with eriochrome black T is less stable than the magnesium complex and furthennore, in many kinds of water, there is only a very small amount of magnesium ions present, the end point of the titration is marked more clearly by adding a small amount of magnesium EDT A beforehand. The titration is carried out in a solution buffered by a pH between 10.0 and 10.5 and which has a temperature between 20 and 40 C. In a stronger alkaline solution and by using calconcarboxylic acid as indicator, only the calcium ion content is determined. The difference between the two titrations is a measure of the magnesium ion content.\n" +
                    "\n" +
                    "Limits:- Desirable Limits: 200mg/lit      Permissible Limits : 600,mg/lit\n" +
                    "\n" +
                    "Measurment :- EDTA Method\n");
        }


    }

}
