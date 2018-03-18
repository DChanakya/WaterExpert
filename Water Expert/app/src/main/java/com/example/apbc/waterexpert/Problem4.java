package com.example.apbc.waterexpert;

import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Problem4 extends AppCompatActivity {

    Spinner option;
    int selectedOption;
    ImageView img, img1;
    TextView textView, textView1, header;
    Button treatment;
    LinearLayout makeVisible, original, treatmentlay, treatbuttonlay;
    //Zooming
    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    int count;

    // We can be in one of these 3 states
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;

    // Remember some things for zooming
    PointF start = new PointF();
    PointF mid = new PointF();
    float oldDist = 1f;
    String savedItemClicked;
    //Zooming

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);
        option = (Spinner) findViewById(R.id.spin);
        textView = (TextView) findViewById(R.id.problem4ResultText);
        textView1 = (TextView) findViewById(R.id.problem4ResultText1);
        makeVisible = (LinearLayout) findViewById(R.id.problem4ResultLayout);
        treatmentlay = (LinearLayout) findViewById(R.id.problem4ResultLayout1);
        original = (LinearLayout) findViewById(R.id.problem4linear);
        treatment = (Button) findViewById(R.id.problem4treatment);
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
        img = (ImageView) findViewById(R.id.problem4Image);
        treatbuttonlay = (LinearLayout) findViewById(R.id.treatbutlay);
        img1 = (ImageView) findViewById(R.id.problem4Image1);
        header = (TextView) findViewById(R.id.problem2header);


        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(img);
        photoAttacher.update();
        PhotoViewAttacher photoAttacher1;
        photoAttacher1= new PhotoViewAttacher(img1);
        photoAttacher1.update();

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

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,Problem4.class));
    }

    public void submitted4(View v) {
        selectedOption = option.getSelectedItemPosition();
        if(selectedOption==0)
        {
            Toast.makeText(this, "Please Select an option", Toast.LENGTH_SHORT).show();
        }
        else {
        Button sub = (Button) findViewById(R.id.subButton);
        sub.setText("back");
        count=count+1;
        if(count==2) {
            startActivity(new Intent(this,Problem4.class));
        }
        original.setVisibility(View.GONE);
        makeVisible.setVisibility(View.VISIBLE);
        header.setVisibility(View.GONE);

            if (selectedOption == 1) {
                //Before Treatment

                textView.setText("Details:-Drinking-water should ideally have no visible colour. Colour in drinking-water is usually due to the presence of coloured organic matter associated with the humus fraction of soil. Colour is also strongly influenced by the presence of iron and other metals, either as natural impurities or as corrosion products. It may also result from the contamination of the water source with industrial effluents and may be the first indication of a hazardous situation. The source of colour in a drinking-water supply should be investigated, particularly if a substantial change has taken place.\n" +
                        "\n" +
                        "Units:-Hazen .\n" +
                        "\n" +
                        "Limits:-Levels of colour Between 5 to 15 TCU are often acceptable to consumers.\n" +
                        "\n" +
                        "Measurements: Colour is measured by visual comparison of the sample with platinum-cobalt standards. One unit of colour is that produced by 1 mg/L platinum in the form of the chloroplatinate ion.\n\nAvailability:  The presence of metals like Tannins, Iron, Copper, Manganese, Natural deposits in water in high amounts adds colour to water.\n" +
                        "Red or brown colour: A red, brown or rusty colour is generally indicative of iron or magnesium in water.\n" +
                        "Yellow Colour: This coloration occurs in regions where the water has passed through marshlands and then moved through peat soils. It is more commonly found in surface water supplies and shallow wells. Although the yellow colour may be displeasing, it presents no health hazard, as it is only small particles suspended in the water.\n" +
                        "Blue or Green Colour: A green or blue colour is generally a result of copper in your water supply, or copper pipes and corrosive water.\n" +
                        "Cloudy White or Foamy: Cloudy water is usually due to turbidity. Turbidity is caused by finely divided particles in the water.\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.color_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "\n" +
                                "\n" +
                                "                                      Activated Carbon is the most common method of removing color from water, but it is not always the most appropriate method.  Sometimes the color in water comes from very small particles of suspended solids and not from dissolved solids.  The particles imparting the color are so small they cannot be seen with the naked eye, but they do exist.  If color results from these small particles, activated carbon is an unnecessarily expensive way to remove it. A multi-media filter is the most efficient and least expensive choice.\n" +
                                "In order to determine whether color is coming from suspended solids or from dissolved solids, have a water laboratory test for color units in a representative sample of water.  Then have the lab technician pour the water through 5-micron filter paper and test the filtered water again for color units.\n" +
                                "If color is not detectable and the water appears clear, a multi-media filter is the most effective choice and activated carbon will not be necessary.  If most, but not enough of the color is removed, then a multi-media filter followed by activated carbon should produce the desired result.  If color is virtually unaffected by the filter paper, then use activated carbon.\n");

                        img1.setImageResource(R.drawable.colorteatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment

            }

            if (selectedOption == 2) {
                textView.setText("Details:-Odour at objectionable levels, occur in approximately 10 to 15 percent of water wells in New Hampshire. Hydrogen sulphide odour (rotten eggs) is reported most often. This fact sheet discusses taste and odour contaminants other than hydrogen sulphide.\n" +
                        "\n" +
                        "Limits :-Desirable Limits:-Un objectionable.\n" +
                        "\n" +
                        "Availability:  presence of these elements like Chlorine, Hydrogen sulphide, Organic matter, Septic contamination, Methane gas in water results in odour.\n\nEffects:-Odour is not a reliable way to determine the risk of health effects. For some chemicals, odors will be noticeable at low concentrations where the risk for health effects is also very low.\n");


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.odour_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Odour characteristics generally can be removed from drinking water. The most common treatment options are listed below.\n" +
                                "1)\tAeration\n" +
                                "2)\tOxidation\n" +
                                "3)\tActivated carbon absorption.\n");

                        img1.setImageResource(R.drawable.colorteatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }

            if (selectedOption == 3) {
                textView.setText("Details:-The pH of a solution is the negative common logarithm of the hydrogen ion activity: pH = -log (H+)\n" +
                        "\n" +
                        "Availability: The normal range for pH in surface water systems is 6.5 to 8.5, and the pH range for groundwater systems is Between 6 to 8.5.\n" +
                        "\n" +
                        "Limits:-In general, water with a pH lower than 7 is considered acidic, and with a pH greater than 7 is considered basic. And 6.5 to 8.5 pH water is considered fit for drinking.\n" +
                        "\n" +
                        "Measurement :- Measurements: Digital meter, litmus paper, or reagent drops can be used to find the pH value of acidic or alkaline water.\n Effects: Exposure to extreme pH values results in irritation to the eyes, skin, and mucous membranes. Eye irritation and exacerbation of skin disorders have been associated with pH values greater than 11.");
                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.eye_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Water distiller, neutralizing filter, neutralizing solution, water ionizer, alkaline ingredients are some of the best treatments for pH of water.\n");

                        //img1.setImageResource(R.drawable.colorteatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment

            }


            if (selectedOption == 4) {
                textView.setText("Details:-The dissolved organic materials are the in orcanic salts or the dissolved gases may impart to taste to water which may be caused by the presence of dissolved gases such as H2S, CH4,CO2,O2 etc., are combined with organic matter ; mineral substances like Nacl ,iron compound carbonates and sulphates of other elements; and phenols and other tarry or oil matter, Especially after chlorination .evidently ,for drinking purpose the water must not contain any un desirable or objectable taste . Basically taste is divided into different types . such as Sweety Salty, Bitter ,Medical ,Metallic ,etc.,.\n" +
                        "\n" +
                        "Limits:-Desirable Limits: Agreeable\n" +
                        "\n"
                );


                // img.setVisibility(View.VISIBLE);//For image in first page
                // img.setImageResource(R.drawable.color);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "\n" +
                                "\n" +
                                "                                      Activated Carbon is the most common method of removing color from water, but it is not always the most appropriate method.  Sometimes the color in water comes from very small particles of suspended solids and not from dissolved solids.  The particles imparting the color are so small they cannot be seen with the naked eye, but they do exist.  If color results from these small particles, activated carbon is an unnecessarily expensive way to remove it. A multi-media filter is the most efficient and least expensive choice.\n" +
                                "In order to determine whether color is coming from suspended solids or from dissolved solids, have a water laboratory test for color units in a representative sample of water.  Then have the lab technician pour the water through 5-micron filter paper and test the filtered water again for color units.\n" +
                                "If color is not detectable and the water appears clear, a multi-media filter is the most effective choice and activated carbon will not be necessary.  If most, but not enough of the color is removed, then a multi-media filter followed by activated carbon should produce the desired result.  If color is virtually unaffected by the filter paper, then use activated carbon.\n");

                        img1.setImageResource(R.drawable.colorteatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment

            }


            if (selectedOption == 5) {
                textView.setText("Details:-Turbidity is a measure of the cloudiness or murkiness of water due to suspended particles.\n" +
                        "\n" +
                        "Availability: • surface water (lakes, reservoirs, rivers and streams) \n" +
                        "• Shallow or poorly-built wells or springs.\n" +
                        "\n" +
                        "Measurements: Turbidity is measured in nephelometric turbidity units (NTU) using a turbid meter. This instrument shines a beam of light at a water sample and measures the amount of light that passes through the water compared to the amount of light that reflects off particles in the water.\n\n Effects: Turbidity has no health effects, but can interfere with disinfection and provide a medium for microbial growth. Turbidity may indicate the presence of disease-causing organisms. These organisms include bacteria, viruses, and parasites that can cause symptoms such as nausea, cramps, diarrhea and associated headaches\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.turbidity_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "These are some of the treatment methods for turbid water\n" +
                                "1)\tCloth Filtration\n" +
                                "2)\tSand Filtration\n" +
                                "3)\tSettling & Decanting\n");

                        img1.setImageResource(R.drawable.turbidity_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }


            if (selectedOption == 6) {
                textView.setText("Details:-Total dissolved solids (TDS) are the term used to describe the inorganic salts and small amounts of organic matter present in solution in water. The principal constituents are usually calcium, magnesium, sodium, and potassium cations and carbonate, hydrogen carbonate, chloride, sulphate, and nitrate anions.\n" +
                        "\n" +
                        "Availability: TDS in water supplies originate from natural sources, sewage, urban and agricultural run-off, and industrial wastewater. Salts used for road de-icing can also contribute to the TDS loading of water supplies.\n" +
                        "\n" +
                        "Limits:-Its acceptable limit is 500 mg/l and permissible limit is 2000mg/l.\n" +
                        "\n" +
                        "Effects:-Undesirable  Taste, Gastro Intestinal Irritations, corrosion or incrustation.\n" +
                        "\n" +
                        "Measurements: In a laboratory setting, the total dissolved solids are determined by filtering a measured volume of sample through a standard glass fiber filter.\n\nEffects:\n" +
                        "Inadequate levels: Water with extremely low concentrations of TDS may also be unacceptable to consumers because of its flat, insipid taste; it is also often corrosive to water-supply systems.\n" +
                        "Excessive levels: TDS concentrations in drinking water and the incidence of cancer, coronary heart disease, arteriosclerotic heart disease, and cardiovascular disease. Total mortality rates were reported to be inversely correlated with TDS levels in drinking-water.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.tds_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Excess calcium and magnesium as well as small amounts of iron can usually be removed through traditional salt-based softeners.\n" +
                                "For other compounds like sulphates, nitrates and sodium, a reverse osmosis, distillation is usually needed.\n");

                        img1.setImageResource(R.drawable.tds_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }

//start of option

            if (selectedOption == 7) {
                textView.setText("Details:- Aluminium is the most abundant metallic element and constitutes about 8% of the Earth's crust. It occurs naturally in the environment as silicates, oxides, and hydroxides, combined with other elements, such as sodium and fluoride, and as complexes with organic matter.\n" +
                        "\n" +
                        "Availability: The concentration of aluminium in natural waters can vary significantly depending on various physicochemical and mineralogical factors. Dissolved aluminium concentrations in waters with near-neutral pH values usually range from 0.001 to 0.05 mg/litre but rise to 0.5–1 mg/litre in more acidic waters or water rich in organic matter. At the extreme acidity of waters affected by acid mine drainage.\n" +
                        "\n" +
                        "Limits:- Its acceptable limit is 0.03 mg/l and permissible limit is 0.2 mg/l.\n\n Measurements: Aluminium is reacted with pyrocatechol violet followed by spectrometric measurement of the resulting coloured complex.\n\n Effects: Symptoms including nausea, vomiting, diarrhoea, mouth ulcers, skin ulcers, skin rashes, and arthritic pain were observed\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.aluminium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Aluminium can be removed by a cation exchanger (water softener) but this is not regarded as a practical home treatment because regeneration of the exchange bed must be done with sulfuric or hydrochloric acid. Home treatment of drinking water is easy. Reverse osmosis and distillation remove 98 percent plus\n");

                        img1.setImageResource(R.drawable.aluminium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 8) {
                textView.setText("Details:- The term \"Ammonia\" covers both the nonionized form (NH3) and the ammonium cation (NH4 + ) unless stated otherwise.\n" +
                        "\n" +
                        "Availability:Natural levels in ground waters are usually below 0.2 mg of ammonia per litre. Higher natural contents (up to 3 mg/litre) are found in strata rich in humic substances or iron or in forests. Surface waters may contain up to 12 mg/litre. Ammonia may be present in drinking-water as a result of disinfection with chloramines\n" +
                        "\n" +
                        "Limits: Its acceptable limit is 0.5 mg/l and has no permissible limit.\n" +
                        "\n" +
                        "Measurements: Ammonia and ammonium cation at concentrations between 0.025 and 3 mg/litre can be determined by the indophenol reaction. An ammonia-selective electrode can also be used, as can titrimetry, which is less sensitive.\n\n Effects: Exposure to high concentrations of ammonia in air causes immediate burning of the eyes, nose, throat and respiratory tract and can result in blindness, lung damage or death. Skin or eye contact with concentrated ammonia can also cause irritation and burns.");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.aluminium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Ion exchange clinoptilolite (natural zeolith) has occasionally been suggested for removing NH4but is expensive to use.\n");

                        img1.setImageResource(R.drawable.ammonia_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 9) {
                textView.setText("Details:- The presence of the anionic detergents is due to the discharge of industrial and household waste waters.\n" +
                        "\n" +
                        "Availability:Anionic surface active agents commonly used in the domestic and industrial applications.\n" +
                        "\n" +
                        "Limits: Its acceptable limit is 0.2 mg/l and permissible limit is 1.0 mg/l.\n" +
                        "\n" +
                        " Effects: The main ingredients of modern life detergents are surfactants, long-term use cause skin irritation effect and lead to some degree of damage.\n");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.anionic_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Aeration, lime softening, electro dialysis are some of the treatment methods to remove anionic detergents\n");

                        img1.setImageResource(R.drawable.anionic_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 10) {
                textView.setText("Details:- Barium is present as a trace element in both igneous and sedimentary rocks. Although it is not found free in nature, it occurs in a number of compounds, most commonly barium sulphate and, to a lesser extent, barium carbonate.\n" +
                        "\n" +
                        "Availability:Barium in water comes primarily from natural sources. The acetate, nitrate and halides are soluble in water, but the carbonate, chromate, fluoride, oxalate, phosphate and sulphate are quite insoluble.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.7 mg/l and has no permissible limit..\n" +
                        "\n" +
                        " Effects: At high concentrations, barium causes vasoconstriction by its direct stimulation of arterial muscle, peristalsis as a result of the violent stimulation of smooth muscles and convulsions and paralysis following stimulation of the central nervous system. Depending on the dose and solubility of the barium salt, death may occur in a few hours or a few days.\n\n" +
                        "Measurements: Barium in water may be determined by inductively coupled plasma atomic emission spectrometry, the detection limits being equivalent or superior to those of flame atomic absorption spectroscopy.\n\n");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.anionic_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Barium can be removed from your home water in a number of ways. You can use a reverse osmosis system to remove it from the drinking water for a single faucet, or you can use an Aqualux water softener like this one to remove it from the water for your entire dwelling.\n");

                        img1.setImageResource(R.drawable.barium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 11) {
                textView.setText("Details:- Health effects of boron. Humans can be exposed to boron through fruit and vegetables, water, air and consumer products. When exposure to small amounts of boron takes place irritation of the nose, throat or eyes may occur. It takes 5 g of boric acid to make a person ill and 20 grams or more to put its life in danger.\n" +
                        "\n" +
                        "Availability:Waterborne boron may be adsorbed by soils and sediments. Adsorption–desorption reactions are expected to be the only significant mechanism influencing the fate of boron in water. The extent of boron adsorption depends on the pH of the water and the concentration of boron in solution. The greatest adsorption is generally observed at pH 7.5– 9.0\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.5 mg/l and permissible limit is 1 mg/l.\n" +
                        "\n" +
                        " Effects: Osteoporosis, heart trouble, paralysis, diabetes and senility to the person.\n\n" +
                        "Measurements: \n" +
                        "a)Titration method.\n" +
                        "b)Colorimetric curcumin method.\n\n");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.anionic_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "\tDesalination post-treatment.\n" +
                                "\tReverse osmosis.\n");

                        img1.setImageResource(R.drawable.barium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 12) {
                textView.setText("Details:- Over 99% of total body calcium is found in bones and teeth, where it functions as a key structural element. The remaining body calcium functions in metabolism, serving as a signal for vital physiological processes, including vascular contraction, blood clotting, muscle contraction and nerve transmission.\n" +
                        "\n" +
                        "Availability:Purified waters contain a negligible calcium concentration. Mineral waters, on the other hand, were generally found to contain higher calcium concentrations, an average of 208 mg/L of calcium.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 75 mg/l and permissible limit is 200 mg/l.\n" +
                        "\n" +
                        " Measurements: EDTA titrimetric method.\n\nEffects: \n" +
                        "Inadequate levels: Cardiovascular disease, Cancer, Cerebrovascular Mortality, Alzheimer's disease, Diabetes.\n Excessive levels: osteoporosis, nephrolithiasis (kidney stones), colorectal cancer, hypertension and");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.calcium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Reverse Osmosis will remove 95% - 98% of the calcium in the water.\n");

                        img1.setImageResource(R.drawable.calcium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 13) {
                textView.setText("Details:- Chloromine is a disinfectant used to treat drinking water. It is formed by mixing chlorine with ammonia. Although it is a weaker disinfectant than chlorine, it is more stable which extends its disinfectant benefits throughout a water utility's distribution system.\n" +
                        "\n" +
                        "Availability:Typical chloromine concentrations of 0.5–2 mg/litre are found in drinking-water supplies where chloramine is used as a primary disinfectant or to provide a chlorine residual in the distribution system\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 4.0 mg/l and has no permissible limit.\n" +
                        "\n" +
                        " Measurements: The speciation of the individual chloramines can be determined by multistage procedures of the chlorine residual determination.\n\n" +
                        "Effects:- There were no adverse effects on physical condition, urinalysis or clinical chemistry and no serious objections to the taste of monochloramine. Taste and odour changes, rashes and red burning skin, intense itching in high dosage.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chloromines_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Filter carbon does indeed remove chloramine.\n");

                        img1.setImageResource(R.drawable.chloromines_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 14) {
                textView.setText("Details:- Chloride ion is the anion (negatively charged ion) Cl- It is formed when the element chlorine (a halogen) gains an electron or when a compound such as hydrogen chloride is dissolved in water or other polar solvents. Chloride salts such as sodium chloride are often very soluble in water\n" +
                        "\n" +
                        "Availability:Chloride in surface and groundwater from both natural and anthropogenic sources, such as run-off containing road de-icing salts, the use of inorganic fertilizers, landfill leachates, septic 2 tank effluents, animal feeds, industrial effluents, irrigation drainage, and seawater intrusion in coastal areas.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 250 mg/l and permissible limit is 2000 mg/l.\n" +
                        "\n" +
                        " Measurements: A number of suitable analytical techniques are available for chloride in water, including silver nitrate titration with chromate indicator, mercury nitrate titration with diphenylcarbazone indicator, potentiometric titration with silver nitrate, automated iron mercury thiocyanate  colorimetric, chloride ion-selective electrode, silver colorimetric, and ion chromatography.\n" +
                        " Effects: Taste is affected corrosive. High blood pressure\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chlorides_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                ": Reverse Osmosis is one of the best treatment methods.\n");

                        img1.setImageResource(R.drawable.chlorides_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 15) {
                textView.setText("Details:-Copper is a transition metal that is stable in its metallic state and forms monovalent (cuprous) and divalent (cupric) cation.\n" +
                        "\n" +
                        "Availability:Copper is found in surface water, groundwater, seawater and drinking-water, but it is primarily present in complexes or as particulate matter.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.05 mg/l and permissible limit is 1.5 mg/l.\n" +
                        "\n" +
                        " Measurements: The most important analytical methods for the detection of copper in water are atomic absorption spectrometry (AAS) with flame detection, graphite furnace atomic absorption spectroscopy, inductively coupled plasma atomic emission spectroscopy, inductively coupled plasma mass spectrometry and stabilized temperature platform graphite furnace atomic absorption.\n\n" +
                        " Effects: Individuals ingesting large doses of copper present with gastrointestinal bleeding, haematuria, intravascular haemolysis, methaemoglobinaemia, hepatocellular toxicity, acute renal failure and oliguria.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.copper_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Water treatment methods such as reverse osmosis, ultra-filtration, distillation, or ion exchange helps in removing copper in water.\n");

                        img1.setImageResource(R.drawable.copper_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 16) {
                textView.setText("Details:-Fluorine is a common element that does not occur in the elemental state in nature because of its high reactivity. It accounts for about 0.3 g/kg of the Earth’s crust and exists in the form of fluorides in a number of minerals, of which fluorspar, cryolite and fluorapatite are the most common.\n" +
                        "\n" +
                        "Availability:Traces of fluorides are present in many waters; higher concentrations are often associated with underground sources. In areas rich in fluoride-containing minerals, well water may contain up to about 10 mg of fluoride per litre. The highest natural level reported is 2800 mg/litre\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 1.0 mg/l and permissible limit is 1.5 mg/l.\n" +
                        "\n" +
                        " Measurements:Fluoride is usually determined by means of an ion-selective electrode, which makes it possible to measure the total amount of free and complex-bound fluoride dissolved in water. The method can be used for water containing at least 20 µg/litre. For rainwater in which fluoride was present at a concentration of 10 µg/litre.\n\n" +
                        " Effects:Excessively high levels of fluoride intake cause crippling skeletal fluorosis and possibly increased bone fracture risk. Ingestion of excess fluoride during tooth development, particularly at the maturation stage, may also result in dental fluorosis.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.fluoride_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "•\tReverse Osmosis Filtration - This is used to purify several types of bottled water (not all), so some bottled waters are defluoridated. Reverse osmosis systems are generally unaffordable for personal use.\n" +
                                " \n" +
                                "•\tActivated Alumina Defluoridation Filter - These filters are used in locales where fluorosis is prevalent. They are relatively expensive (lowest price I saw was $30/filter) and require frequent replacement, but do offer an option for home water filtration.\n" +
                                " \n" +
                                "•\tDistillation Filtration - There are commercially available distillation filters that can be purchased to remove fluoride from water.\n\n");

                        img1.setImageResource(R.drawable.fluoride_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 17) {
                textView.setText("Details:-The presence of chlorine residual in drinking water indicates that:\n" +
                        " 1) A sufficient amount of chlorine was added initially to the water to inactivate the bacteria and some viruses that cause diarrheal disease.\n" +
                        "2) The water is protected from recontamination during storage. The presence of free residual chlorine in drinking water is correlated with the absence of disease-causing organisms, and thus is a measure of the portability of water.\n" +
                        "\n" +
                        "Availability:Residual chlorine is the amount of chlorine that remains in the water after a certain period or contact time. It is more available in water from treatment plants.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.2 mg/l and permissible limit is 1.0 mg/l.\n" +
                        "\n" +
                        " Measurements:There are three main methods to test free chlorine residual in drinking water in the field in developing countries: 1) Pool test kits, 2) Colour-wheel test kits, and 3) Digital colorimeters.\n" +
                        " Effects:•\t Heart attacks\n" +
                        "•\tTiredness, dizziness or headaches\n" +
                        "•\tEye, sinus and throat irritation\n" +
                        "•\tYour sperm count (men)\n" +
                        "•\tYour risk of a miscarriage (women)\n" +
                        "•\tChildhood asthma\n" +
                        "•\tDamaging hair cuticles and the cause or worsening of dandruff\n" +
                        "•\tSkin rashes, headaches, gastrointestinal difficulties and arthritis\n" +
                        "•\tLiver problems\n\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chlorine_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Chlorination is one of many methods that can be used to disinfect water. This method was first used over a century ago, and is still used today. It is a chemical disinfection method that uses various types of chlorine or chlorine-containing substances for the oxidation and disinfection of what will be the potable water source.\n");

                        img1.setImageResource(R.drawable.chlorine_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 18) {
                textView.setText("Details:-Iron is the second most abundant metal in the earth's crust, of which it accounts for about 5%. Elemental iron is rarely found in nature, as the iron ions Fe2+ and Fe3+ readily combine with oxygen- and sulphur-containing compounds to form oxides, hydroxides, carbonates, and sulphides.\n" +
                        "\n" +
                        "Availability:The median iron concentration in rivers has been reported to be 0.7 mg/litre. In anaerobic groundwater where iron is in the form of iron, concentrations will usually be 0.5–10 mg/litre, but concentrations up to 50 mg/litre can sometimes be found.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.2 mg/l and permissible limit is 1.0 mg/l.\n" +
                        "\n" +
                        " Measurements:Iron in water can be determined by atomic absorption spectrometry (detection limit 1 µg/litre) or by colorimetric methods (detection limit 5 µg/litre).\n" +
                        " Effects:Iron overload can lead to hemochromatosis, which can lead to liver, heart and pancreatic damage, as well as diabetes.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.iron_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "•\tOxidizing Filter\n" +
                                "•\tGreen-sand Mechanical Filter\n");

                        img1.setImageResource(R.drawable.iron_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 19) {
                textView.setText("Details:-Magnesium is the fourth most abundant cation in the body and the second most abundant cation in intracellular fluid. It is a cofactor for some 350 cellular enzymes, many of which are involved in energy metabolism.\n" +
                        "\n" +
                        "Availability:Tap water can be a significant source of both magnesium and calcium.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 30 mg/l and permissible limit is 100 mg/l.\n" +
                        "\n" +
                        " Measurements:•\tComplex metric Titration.\n" +
                        "•\tAtomic Absorption Spectrometric.\n" +
                        " Effects:Inadequate levels: Magnesium is the fourth most abundant cation in the body and the second most abundant cation in intracellular fluid. It is a cofactor for some 350 cellular enzymes, many of which are involved in energy metabolism.\n" +
                        "Excessive levels: several epidemiological investigations have demonstrated the relation between risk for cardiovascular disease, growth retardation, reproductive failure, and other health problems and hardness of drinking water or its content of magnesium.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.magnesium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "•\tGravimetric method as magnesium pyrophosphate\n" +
                                "•\tVolumetric method using edta\n" +
                                "•\tAtomic absorption spectrophotometric method\n");

                        //img1.setImageResource(R.drawable.iron_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 20) {
                textView.setText("Details:-Manganese is one of the most abundant metals in Earth’s crust, usually occurring with iron. It is a component of over 100 minerals but is not found naturally in its pure (elemental) form.\n" +
                        "\n" +
                        "Availability:Manganese occurs naturally in many surface water and groundwater sources and in soils that may erode into these waters. However, human activities are also responsible for much of the manganese contamination in water in some areas.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 30 mg/l and permissible limit is 100 mg/l.\n" +
                        "\n" +
                        " Effects: Manganese deficiency in humans appears to be rare, because manganese is present in many common foods. Excess amount of manganese cause colour, odour or taste change of water.\n\n" +
                        "Measurements: Periodate colorimetric method and Formaldoxime photometric methods are easy way to measure manganese.\n");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.magnesium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText(
                                "Treatment method:- " +
                                        "Ion exchange, Chlorination, Oxidizing Filter, Green-sand mechanical Filter are some of the treatment methods to remove excess manganese.\n");

                        img1.setImageResource(R.drawable.manganese_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 21) {
                textView.setText("Details:-Mineral oil is any of various colourless, odourless, light mixtures of higher alkanes from a mineral source, particularly a distillate of petroleum.\n" +
                        "\n" +
                        "Availability:Household waste water, sewage water. The main sources of producing oily sewage are refineries, metalwork and metal artefact factories and food industries. Oil refineries generate a great amount of oily and emulsified waste water.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.5 mg/l and has no permissible limit\n" +
                        "\n" +
                        "Measurements: Partition Gravimetric method is a method to detect the presence of mineral  oil in water.\n" +
                        " Effects: \n" +
                        "1.\tbreathing problems\n" +
                        "2.\tstress and\n" +
                        "3.\tneurologic\n\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.mineraloil_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment methods:-" +
                                "The API separator is a gravity separation device designed using Stokes' law principles that define the rise velocity of oil droplets based on their density, size and water properties. The design of the separator is based on the specific gravity difference between the oil and the wastewater because that difference is much smaller than the specific gravity difference between the suspended solids and water.\n");

                        img1.setImageResource(R.drawable.mineraloil_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 22) {
                textView.setText("Details:-This reduces the amount of oxygen inside your blood which is dangerous because all of your living cells need oxygen to function. Complications can include seizure or even death. Luckily, methemoglobinemia when caused by too many nitrates and nitrites can be treated when these elements are taken out of the diet.\n" +
                        "\n" +
                        "Availability:Livestock facilities, septic systems, manure lagoons, Household waste water, Fertilizers, Natural Deposits.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 45 mg/l and has no permissible limit\n" +
                        "\n" +
                        "Measurements:Nitrate Ion-Selective Electrode helps in detecting the presence of nitrates in water.\n" +
                        " Effects: \n" +
                        "•\tMetHb levels in adults, although vomiting and diarrhoea occurred\n" +
                        "•\tCyanosis.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.nitrate_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment methods:-" +
                                "The ion exchange process for the removal of nitrates is both simple and effective. It operates in the same manner as a common water softener and easily can remove much more than 90 percent of the nitrates.\n");

                        img1.setImageResource(R.drawable.nitrate_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 23) {
                textView.setText("Details:-The most common anthropogenic sources of phenol in natural water include coal tar and waste water from manufacturing industries such as resins, plastics, fibres, adhesives, iron, steel, aluminium, leather, rubber, and effluents from synthetic fuel manufacturing.\n" +
                        "\n" +
                        "Availability:The existence of phenolic compounds in water can be attributed to natural and anthropogenic activities. Natural sources of phenolic compounds in water pollution include decomposition of dead plants and animals (organic matter) in the water. They are also synthesised by microorganisms and plants in the aquatic environment. Industrial, domestic, agricultural and municipal activities constitute the anthropogenic sources of water pollution with phenolic compounds. This section provides details on various sources of introduction of phenolic compounds in water bodies.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.001 mg/l and permissible limit is 0.002 mg/l.\n" +
                        "\n" +
                        "Measurements:A colorimetric method for determination of phenols in water has been developed. The method, which is a modification of Liebermann's reaction, uses resorcinol as a chromogenic agent. The developed method is more sensitive, and the difficulties encountered in the widely used 4-aminoantipyrine method have been avoided. Application of both the proposed and 4-aminoantipyrine methods to the analysis of natural and tap water samples are presented.\n" +
                        " Effects: \n" +
                        "Inadequate levels:\n" +
                        "1.\tLung edema.\n\nExcessive levels:\n" +
                        "1.\tGastrointestinal tract (Symptoms include diarrhea, vomiting, and abdominal pain.)\n" +
                        "2.\tmuscle tremor with difficulty in walking\n" +
                        "3.\tDNA damage\n" +
                        "4.\tburns on the skin;\n" +
                        "5.\t Heart, kidneys, and liver damage may occur.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.phenolic_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment methods:-" +
                                "•\tOzonation is one of the treatment methods.\n");

                        img1.setImageResource(R.drawable.phenolic_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment


            }
            if (selectedOption == 24) {
                textView.setText("Details:- Selenium (Se) is present in the earth’s crust, often in association with sulphur containing minerals. It is normally found in concentrations of 50–90 µg/kg, but higher concentrations can be associated with some volcanic, sedimentary and carbonate rocks. Selenium concentrations in soils vary widely, from 5 to 1 200 000 µg/kg, being higher in soils of more recent volcanic origin. Selenium occurs in soils in several forms, according to its possible oxidation states: selenides (Se2− ), amorphous or polymeric elemental selenium (Se0 ), selenites (Se4+) and selenates (Se6+).\n" +
                        "\n" +
                        "Availability:-The levels of selenium in groundwater and surface water range from 0.06 µg/l to about 400 µg/l.Levels of selenium in tap water samples from public water supplies around the world are usually much less than 10 µg/l but may exceed 50µg/l.\n " +
                        "\n" +
                        "Limits:- Selenium is an essential element, and therefore various national and international organizations have established recommended daily intakes of selenium.recommended intakes of 6–21 µg of selenium per day for infants and children, according to age, 26 and 30 µg of selenium per day for adolescent females and males, respectively, and 26 and 35 µg of selenium per day for adult females and males, respectively.\n" +
                        "\n" +
                        "Effects :- nadequate levels of intake:Very low selenium status in humans has been associated with a juvenile, multifocal myocarditis called Keshan disease and a chondrodystrophy called Kaschin-Beck disease\n Excessive levels of intake :Symptoms in people with high urinary selenium levels included gastrointestinal disturbances, discoloration of the skin and decayed teeth, pathological nail changes, loss of hair and dermatitis.\n" + "" +
                        "Measurements: Atomic absorption spectrometry with hydride generation is the most convenient method for determining selenium in drinking-water. If 100 ml samples are used for routine analysis, the detection limit is about 0.5 µg/l. Inductively coupled plasma/mass spectrometry is also used, with a similar detection limit.");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.selenium);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "It has been reported that chemical clarification with lime, ferric sulphate or aluminium sulphate and activated carbon adsorption are moderately effective in removing selenite from water and ineffective at removing selenate. Tests have shown that the greatest removal was achieved by clarification with ferric sulphate at a pH below 7\n");


                        //img1.setImageResource(R.drawable.colorteatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });

            }
            //End of Treatment
            if (selectedOption == 25) {
                textView.setText("Details:- : The most important silver compounds from the point of view of drinking-water are silver nitrate (AgNO3) and silver chloride (AgCl).\n" +
                        "\n" +
                        "Availability:-Silver occurs in soil mainly in the form of its insoluble and therefore immobile chloride or sulphide. It has occasionally been found in groundwater, surface water and drinking-water at concentrations above 5mg/litre. Levels in drinking-water treated with silver for disinfection may be above 50mg/litre. Recent estimates of daily intake are about 7mg per person.\n " +
                        "\n" +
                        "Limits:- It was not considered necessary to establish a guideline value for silver in drinking-water. Where silver salts are used to maintain the bacteriological quality of drinking-water, levels of silver up to 0.1 mg/litre can be tolerated without risk to health.\n" +
                        "\n" +
                        "Effects :- The only known clinical picture of chronic silver intoxication is that of argyria, a condition in which silver is deposed on skin and hair, and in various organs following occupational or iatrogenic exposure to metallic silver and its compounds, or the misuse of silver preparations.\n  Measurements: The detection limit of the spectrographic and colorimetric method with dithizone is 10 µg of silver per litre for a 20-ml sample. The detection limit of atomic absorption spectroscopy (graphite furnace) is 2 µg of silver per litre, and of neutron activation analysis, 2 ng of silver per litre.\n");

                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.silver);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "1) Reverse osmosis \n" +
                                "2) Distillation\n" +
                                "3) Strong acid cation exchange (Na+ )\n");


                        img1.setImageResource(R.drawable.silver_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });

            }
            //End of Treatment
            if (selectedOption == 26) {
                textView.setText("Details:- : Sulphates are discharged into water from mines and smelters and from Kraft pulp and paper mills, textile mills and tanneries. Sodium, potassium and magnesium sulphates are all highly soluble in water, whereas calcium and barium sulphates and many heavy metal sulphates are less soluble.\n" +
                        "\n" +
                        "Availability:-Sulphate concentrations in rain water and surface water correlate with emissions of sulphur dioxide from factories\n " +
                        "\n" +
                        "Limits:-  Minimum requirement is 200 mg/l and maximum permissible limit is 400 mg/l..\n" +
                        "\n" +
                        "Effects :- While significant levels of sulfate are found in foods and various sources of drinking water. Ingestion of 8 g of sodium sulphate and 7 g of magnesium sulphate caused catharsis in adult males. Cathartic effects are commonly reported to be experienced by people consuming drinking-water containing sulphate in concentrations exceeding 600 mg/litre.\n" +
                        "Measurements: In the light of the above considerations, no health-based guideline value for sulphate in drinking water is proposed. However, there is an increasing likelihood of complaints arising from a noticeable taste as concentrations in water increase above 500 mg/litre.\n\n");

                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.silver);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "For treating small quantities of water (drinking and cooking only) the typical methods may be distillation or reverse osmosis. The most common method of treating large quantities of water is ion exchange. This process works similar to a water softener.\n");


                        img1.setImageResource(R.drawable.sulphate_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });

            }
            if (selectedOption == 27) {
                //Before Treatment

                textView.setText("Details:- In general form hydrogen sulphide is a gas that may occur in your household water. Common names include stink gas and sewer gas. Hydrogen sulphide is insoluble in water, but underground, this gas remains trapped within the water. When the water is pumped to the surface, the hydrogen sulphide gas escapes and is therefore easy to smell.\n" +
                        "\n" +
                        "Availability: Hydrogen sulphide gas can occur naturally in groundwater in two ways: \n" +
                        "• It may be produced by sulphur-reducing bacteria during the decomposition of organic matter in low-oxygen environments. \n" +
                        "• It may be produced by chemical reduction of dissolved sulphate by sulphate-reducing bacteria in low-oxygen environments.\n" +
                        "\n" +
                        "Limits:There is no minimum limit but the acceptable limit is 0.05 mg/l.\n" +
                        "\n" +
                        "Measurements: It can be easily identified through its rotten egg smell and unpleasant taste.\n Effects: Drinking water with high levels of hydrogen sulphide can cause nausea and stomach pain. However, it is highly unlikely that a person could consume a harmful dose of hydrogen sulphide from drinking water because water becomes unpalatable due to its unpleasant taste and odour long before hydrogen sulphide reaches a harmful level. In well water, it is usually just a nuisance\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.sulphide_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "You can address hydrogen sulphide and sulphate problems in well water through the following ways:\n" +
                                " If the hydrogen sulphide gas is being produced by an active colony of sulphur reducing bacteria, this must be determined and eliminated by shock chlorination. \n" +
                                " If you detect the smell of hydrogen sulphide only from the hot water faucet, your water heater may be causing the problem. In this case, the problem can be eliminated or minimized by replacing the magnesium rod with one made of aluminium or zinc, preferably by a licensed plumber. If water temperature is maintained above 150o F, use only an aluminium rod. \n" +
                                " You can install an appropriate treatment system like aeration system\n" +
                                "\n" +
                                " \n");

                        img1.setImageResource(R.drawable.sulphide_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 28) {
                //Before Treatment

                textView.setText("Details:- Alkalinity is a measure of how much acid can be added to a liquid without causing a large change in pH. However, a temporary loss of buffering capacity can permit pH levels to drop to those harmful to life in the water.\n" +
                        "\n" +
                        "Availability: Much of our drinking water comes from ground water which originates from precipitation that falls in the form of rain or snow and seeps into the ground, filling the open spaces, or pore space, within layers of sand or gravel (formations) beneath the land surface.\n" +
                        "\n" +
                        "Limits:The drinking water and all water should be a pH of 7 meaning that it's neutral. High alkalinity is good to have in our drinking water because it keeps the water safe for us to drink. The amount of Alkalinity that should be in our water is 20-200 mg/L for typical drinking water.\n" +
                        "\n" +
                        "Measurements:They can be detected by their acrid taste and by the fact that they cause red litmus paper to turn blue.\n\nEffects: Highly mineralized alkaline waters also cause excessive drying of the skin due to the fact that they tend to remove normal skin oils. Drinking too much alkaline water, or drinking water with a high pH, may disrupt the body's normal pH. This can lead to a condition called metabolic alkalosis, which may cause confusion, nausea, vomiting, hand tremors, muscle twitching, and tingling in the face, hands or feet.\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.totalalkalinity_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Troublesome amounts of alkalinity can be removed by reverse osmosis, along with other total dissolved solids. Other methods of water treatment also remove total dissolved solids, but they are somewhat less suitable for household use compared to reverse osmosis. These methods are distillation and deionization.  \n");

                        //img1.setImageResource(R.drawable.sulphide_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 29) {
                //Before Treatment

                textView.setText("Details:- Water hardness is the traditional measure of the capacity of water to react with soap, hard water requiring considerably more soap to produce lather. Hard water often produces a noticeable deposit of precipitate.\n" +
                        "\n" +
                        "Availability:The principal natural sources of hardness in water are dissolved polyvalent metallic ions from sedimentary rocks, seepage and runoff from soils. Calcium and magnesium, the two principal ions, are present in many sedimentary rocks, the most common being limestone and chalk.\n" +
                        "\n" +
                        "Limits:Required limit is 200 mg/l and permissible limit is 600 mg/l.\n" +
                        "\n" +
                        "Measurements:Soap solution is used to measure the hardness of rain water and temporarily hard water. The effect of boiling the hard water samples is investigated.\nEffects:\n" +
                        "Inadequate intake: Calcium have been associated with increased risks of osteoporosis, nephrolithiasis (kidney stones), colorectal cancer, hypertension and stroke, coronary artery disease, insulin resistance and obesity.\n" +
                        "Excess intake: When calcium is absorbed in excess of need, the excess is excreted by the kidney in healthy people who do not have renal impairment. Concern for excess calcium intake is directed primarily to those who are prone to milk alkali syndrome and hypercalcaemia. Although calcium can interact with iron, zinc, magnesium and phosphorus within the intestine, thereby reducing the absorption of these minerals, available data do not suggest that these minerals are depleted when humans consume diets containing calcium above the recommended level.\n\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.totalalkalinity_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "These are being determined by “EDTA titrimetric method”. Lime softening also removes hardness.  \n");

                        img1.setImageResource(R.drawable.totalhardness_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 30) {
                //Before Treatment

                textView.setText("Details:- Zinc occurs in small amounts in almost all igneous rocks. The principal zinc ores are sulfides, such as sphalerite and wurzite. The natural zinc content of soils is estimated to be 1–300 mg/kg.\n" +
                        "\n" +
                        "Availability:In natural surface waters, the concentration of zinc is usually below 10 µg / litre, and in ground waters, 10– 40 µg/litre. In tap water, the zinc concentration can be much higher as a result of the leaching of zinc from piping and fittings.\n" +
                        "\n" +
                        "Limits:Required limit is 5 mg/l and permissible limit is 15 mg/l.\n" +
                        "\n" +
                        "Effects: \n" +
                        "Inadequate intake: Zinc deficiency affects the skin and gastrointestinal tract; and the central nervous, immune, skeletal, and reproductive systems.\n" +
                        "Excess intake: Vomiting usually occurs after the consumption of more than 500 mg of zinc sulphate. Mass poisoning has been reported following the drinking of acidic beverages kept in galvanized containers; fever, nausea, vomiting, stomach cramps, and diarrhoea occurred 3–12 h after ingestion. Food poisoning attributable to the use of galvanized zinc containers in food preparation has also been reported; symptoms occurred within 24 h and included nausea, vomiting, and diarrhoea, sometimes accompanied by bleeding and abdominal cramps. \n" +
                        "Measurements: Atomic absorption spectrophotometry is the most widely used method for the determination of zinc. Low concentrations can be measured by chelating zinc with ammonium pyrrolidine dithiocarbamate and extracting it with methyl isobutyl ketone.\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.totalalkalinity_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "1)\tIon Exchange\n" +
                                "2)\tLime Soda Softening\n" +
                                "3)\tAdsorption Processes\n" +
                                "4)\tReverse Osmosis\n" +
                                "5)\tElectrodialysis\n" +
                                "6)\tDistillation\n\n");

                        img1.setImageResource(R.drawable.zinc_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 31) {
                //Before Treatment

                textView.setText("Details:-Cadmium is a metal with an oxidation state of +2. It is chemically similar to zinc and occurs naturally with zinc and lead in sulphide ores.\n" +
                        "\n" +
                        "Availability:Cadmium concentrations in unpolluted natural waters are usually below 1 µg/l. Median concentrations of dissolved cadmium measured at 110 stations around the world.\n" +
                        "\n" +
                        "Limits:There is no minimum limit for cadmium but maximum limit is 0.005 mg/l.\n" +
                        "\n" +
                        "Effects: The kidney appears to be the most sensitive organ. Cadmium affects the resorption function of the proximal tubules, the first symptom being an increase in the urinary excretion of low-molecular-weight proteins, known as tubular proteinuria, kidney dysfunction. \n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.cadmium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "The following treatment methods have been approved by EPA for removing cadmium: Coagulation/Filtration, Ion Exchange, Lime Softening, Reverse Osmosis.\n");

                        img1.setImageResource(R.drawable.cadmium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 32) {
                //Before Treatment

                textView.setText("Details:-Almost all of the recent literature on cyanide has resulted from interest in the root crop cassava, which provides a major part of the diet for between 300 and 500 million people living in developing countries in the tropics and subtropics. If not properly prepared, cassava can contain very high levels of cyanide, and outbreaks of disease have been associated with its consumption.\n" +
                        "\n" +
                        "Availability:Cyanides are occasionally found in drinking-water, primarily as a consequence of industrial contamination.\n" +
                        "\n" +
                        "Limits:An allocation of 20% of the TDI to drinking-water is made because exposure to cyanide from other sources is normally small and because exposure from water is only intermittent. This results in a guideline value of 0.07 mg/litre (rounded figure), which is considered to be protective for both acute and long-term exposure.\n" +
                        "\n" +
                        "Measurements: Cyanide can be determined in water by both titrimetric and photometric techniques.\n Effects: Cyanide may lower vitamin B12 levels and hence exacerbate vitamin B12 deficiency. Chronic effects on the thyroid and particularly on the nervous system were observed in some populations as a consequence of the consumption of inadequately processed cassava containing high levels of cyanide.\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.cyanide_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "The following treatment methods have been approved by EPA for removing cyanide: Ion Exchange, Reverse Osmosis, Chlorine\n");

                        img1.setImageResource(R.drawable.cyanide_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 33) {
                //Before Treatment

                textView.setText("Details:-Lead is the commonest of the heavy elements, accounting for 13 mg/kg of Earth’s crust. Several stable isotopes of lead exist in nature, including, in order of abundance, 208Pb, 206Pb, 207Pb and 204Pb.\n" +
                        "\n" +
                        "Availability:Lead is present in tap water to some extent as a result of its dissolution from natural sources, but primarily from household plumbing systems in which the pipes, solder, fittings or service connections to homes contain lead. Polyvinyl chloride (PVC) pipes also contain lead compounds that can be leached from them and result in high lead concentrations in drinking-water.\n" +
                        "\n" +
                        "Limits:If a concentration of 5 µg/l  in drinking-water is assumed, the total intake of lead from this source can be calculated to range from 3.8 µg/day for an infant to 10 µg/day for an adult.\n" +
                        "\n" +
                        "Measurements:- Atomic absorption spectrometry and anodic stripping voltammetry are the methods most frequently used for determining the levels of lead in environmental and biological materials. Detection limits of less than 1 µg/l can be achieved by means of atomic absorption spectrometry (3). Because corrosion of plumbing systems is an important source of excessive lead in drinking-water, lead levels in water should be measured at the tap, rather than at the drinking-water source, when estimating human exposure.\n\n Effects: Lead is a cumulative general poison, with infants, children up to 6 years of age, the fetus and pregnant women being the most susceptible to adverse health effects. Its effects on the central nervous system can be particularly serious\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.lead_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Lead is exceptional in that most lead in drinking-water arises from plumbing in buildings, and the remedy consists principally of removing plumbing and fittings containing it, which requires both time and money. In the interim, all practical measures to reduce total exposure to lead, including corrosion control should be implemented. It is extremely difficult to achieve a concentration below 10 µg/l by central conditioning, such as phosphate dosing.\n");

                        //img1.setImageResource(R.drawable.cyanide_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 34) {
                //Before Treatment

                textView.setText("Details:-Mercury is a metallic element that occurs naturally in the environment.\n" +
                        "\n" +
                        "Availability:Naturally occurring mercury has been widely distributed by natural processes such as volcanic activity. Levels of mercury in rainwater are in the range 5–100 ng/litre, Naturally occurring levels of mercury in groundwater and surface water are less than 0.5 µg/litre, although local mineral deposits may produce higher levels in groundwater.\n" +
                        "\n" +
                        "Limits:Limits of detection for inorganic mercury is 0.001 mg/l is acceptable limit\n" +
                        "\n" +
                        "Measurements:-It can be checked by using Boris' Mercury Check Strips by Moveing the strip in a back and forth motion for 60 seconds. Remove the strip from thewater sample and shake once to remove the excess water. Wait 30 seconds and then match to the closest color. EPA maximum contaminant level (MCL) in drinking water\n\nEffects: Mercury will cause severe disruption of any tissue with which it comes into contact in sufficient concentration, but the two main effects of mercury poisoning are neurological and renal disturbances."
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.mercury_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Conventional chemical coagulation, sedimentation and filtration can achieve removals of up to 80% for inorganic mercury, Powdered activated carbon is effective for the removal of inorganic and organic mercury and can be used to enhance removal during coagulation.\n");

                        img1.setImageResource(R.drawable.mercury_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 35) {
                //Before Treatment

                textView.setText("Details:-Molybdenum is used in the manufacture of special steels, in electrical contacts, spark plugs, X-ray tubes, filaments, screens and grids for radio valves, and in the production of tungsten, glass-to-metal seals, non-ferrous alloys and pigments.\n" +
                        "\n" +
                        "Availability:Molybdenum disulfide is sparingly soluble in water but is readily oxidized to give more soluble molybdates, which are stable in water in the absence of a reducing agent.\n" +
                        "\n" +
                        "Limits:It’s acceptable limit is 0.07 mg/l and has no permissible limit \n" +
                        "\n" +
                        "Effects: A Crown disease patient receiving total parenteral nutrition developed tachycardia, tachypnoea, severe headaches, night blindness, nausea, vomiting, central scotomas, generalized oedema, lethargy, disorientation and coma; these symptoms were attributed to dietary molybdenum deficiency resulting in impaired function of the two molybdoenzymes."
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.molybdenum_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Molybdenum is not removed from drinking-water by normal treatment processes and appears to require specialist treatment such as Ion exchange, reverse osmosis, and distillation systems have been shown to be effective at removing metallic contaminants like molybdenum.\n");

                        //img1.setImageResource(R.drawable.mercury_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 36) {
                //Before Treatment

                textView.setText("Details:-Nickel is a lustrous white, hard, ferromagnetic metal. It occurs naturally in five isotopic forms.\n" +
                        "\n" +
                        "Availability:The primary source of nickel in drinking-water is leaching from metals in contact with drinking-water, such as pipes and fittings. However, nickel may also be present in some ground waters as a consequence of dissolution from nickel ore-bearing rocks.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.02 mg/l and has no permissible limit. \n" +
                        "\n" +
                        "Effects: Humans developed symptoms like nausea, vomiting, diarrhoea, giddiness, lassitude, headache, and shortness of breath. In most cases, these symptoms lasted for a few hours, but they persisted for 1–2 days in some cases.\n" +
                        "Measurements: The two most commonly used analytical methods for nickel in water are atomic absorption spectrometry and inductively coupled plasma atomic emission spectrometry.\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.molybdenum_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Nickel can be found in drinking-water as a consequence of its presence in alloys used in contact with drinking-water, chromium or nickel plating of fittings, or its presence in water sources, usually as a consequence of dissolution from naturally occurring nickel-bearing strata in groundwater. In the first two cases, control is by appropriate control of materials in contact with drinking-water or, in the second instance, education of consumers to flush chromium- or nickel-plated taps before using the water. Conventional surface water treatment, comprising chemical coagulation, sedimentation, and filtration, can achieve 35–80% removal of nickel.\n");

                        img1.setImageResource(R.drawable.nickel_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 37) {
                //Before Treatment

                textView.setText("Details:-The term \"pesticide\" is a composite term that includes all chemicals that are used to kill or control pests. In agriculture, this includes herbicides (weeds), insecticides (insects), fungicides (fungi), nematocides (nematodes), and rodenticides (vertebrate poisons). \n" +
                        "\n" +
                        "Availability:Drainage: Farmland is often well drained and natural drainage is often enhanced by land drains. Water from excessive rainfall and irrigation cannot always be held within the soil structure. Therefore, pesticides and residues (also nitrates and phosphates) can be quickly transported to contaminate ground water and fresh water supplies over a large geographical area.\n" +
                        "\n" +
                        "Limits:The Environmental Protection Agency has set Maximum Contaminant Level (MCL) for a number of pesticides;\n" +
                        "•\tBenzene: MCL = 0.0005 mg/L, known to cause cancer\n" +
                        "•\tEndrin: MCL = 0.002 mg/L, known to cause liver, kidney, and heart damage\n" +
                        "•\tHexachlorobenzene: MCL = 0.001 mg/L, known to cause cancer\n" +
                        "•\tHexachlorocyclopentadiene: MCL = 0.05 mg/L, known to cause kidney and stomach damage\n" +
                        "\n" +
                        "Effects: The health effects of pesticides depend on the type of pesticide. Some, such as the organophosphates and carbamates, affect the nervous system. Others may irritate the skin or eyes. Some pesticides may be carcinogens (they may cause cancer). Others may affect the hormone or endocrine system in the body.\n" +
                        "Measurements: To find out if your water contains pesticides, you may want to have a sample analysed by a professional laboratory where it can be screened for contaminants. The Department of Public Health can recommend local water testing companies.\n" +
                        "Another option is to purchase a water testing kit to analyse your water at home.  Test Assured’s Pesticide Test allows you to test your water quickly to make sure it does not contain pesticides.\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.molybdenum_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Pesticides can be removed from drinking water by reverse osmosis or granulated activated carbon (GAC) filters. Reverse osmosis systems are usually small systems (called point-of-use systems) located near the kitchen sink.\n");

                        img1.setImageResource(R.drawable.pesticides_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 38) {
                //Before Treatment

                textView.setText("Details:-PCBs are a mixture of individual liquid or solid chemicals that are odourless or mildly scented. PCBs were also added to inks, hydraulic fluids, lubricants, plastics and pesticides. PCBs have been shown to persist in the environment for long periods of time.\n" +
                        "\n" +
                        "Availability:PCBs are a mixture of individual liquid or solid chemicals that are odourless or mildly scented. PCBs were also added to inks, hydraulic fluids, lubricants, plastics and pesticides. PCBs have been shown to persist in the environment for long periods of time.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.0005 mg/l and has no permissible limit.\n" +
                        "\n" +
                        "Effects: PCBs are a health hazard. Children are particularly susceptible to the health effects of PCBs. Consuming water with high levels of PCBs over time can cause health effects such as:\n" +
                        " • Acne and rashes \n" +
                        " • Liver and kidney dysfunction\n" +
                        " • Depression and fatigue \n" +
                        " • Nose and lung irritation \n" +
                        " • Increased risk of cancer\n" +
                        " • Developmental problems in children\n\n"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.pcbs_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "PCBs can be reduced below 500 ppt in drinking water using granular activated carbon filtration.1 Work with a professional engineer to determine the most appropriate treatment for your system. Not all kinds of treatment are effective, and no single treatment method can remove all contaminants from water. Alternatives to treatment include developing a different water source or connecting to another safe water source in the area. Avoid using piping or pump components that may contain PCBs and treating water from industrial discharge sites or runoff from landfills.\n");

                        img1.setImageResource(R.drawable.pcbs_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 39) {
                //Before Treatment

                textView.setText("Details:-PAHs are a class of diverse organic compounds containing two or more fused aromatic rings of carbon and hydrogen atoms. They are ubiquitous pollutants formed from the combustion of fossil fuels and are always found as a mixture of individual compounds.\n" +
                        "\n" +
                        "Availability:PAHs are not usually found in water in notable concentrations. Their presence in surface water or groundwater is an indication of a source of pollution. PAHs are only slowly biodegradable under aerobic conditions and are stable to hydrolysis.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.0001 mg/l and has no permissible limit.\n" +
                        "\n" +
                        "Effects: High lung cancer mortality in Xuan Wei, China, has been linked to PAH exposure from unvented coal combustion. PAHs present in tobacco smoke are implicated as contributing to lung and other cancers and some lung and skin problems.\n" +
                        "Measurements: A pre concentration step for sample enrichment may be necessary for the analysis of PAH levels in uncontaminated aqueous samples.\n\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.pcbs_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "The best technology available for removing these chemicals is activated carbon or AC. For the vast majority of the water contaminants listed by the EPA, filter carbon, often called charcoal, is the preferred treatment\n");

                        img1.setImageResource(R.drawable.pahs_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 40) {
                //Before Treatment

                textView.setText("Details:-Arsenic exists in oxidation states of −3, 0, 3 and 5. It is widely distributed throughout Earth’s crust, most often as arsenic sulphide or as metal arsenates and arsenide. In water, it is most likely to be present as arsenate, with an oxidation state of 5, if the water is oxygenated.\n" +
                        "\n" +
                        "Availability:Arsenic exists in oxidation states of −3, 0, 3 and 5. It is widely distributed throughout Earth’s crust, most often as arsenic sulphide or as metal arsenates and arsenide. In water, it is most likely to be present as arsenate, with an oxidation state of 5, if the water is oxygenated.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.001 mg/l and has permissible limit of 0.05 mg/l.\n" +
                        "\n" +
                        "Measurements: A silver diethyldithiocarbamate spectrophotometric method is available for the determination of arsenic.\nEffects: Early clinical symptoms of acute intoxication include abdominal pain, vomiting, diarrhoea, muscular pain and weakness, with flushing of the skin. These symptoms are often followed by numbness and tingling of the extremities, muscular cramping and the appearance of a popular erythematous rash"
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.arsenic_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Additionally, chlorine (bleach) disinfection will not remove arsenic. You may wish to consider water treatment methods such as reverse osmosis, ultra-filtration, distillation, or ion exchange. Typically these methods are used to treat water at only one faucet.\n");

                        img1.setImageResource(R.drawable.arsenic_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 41) {
                //Before Treatment

                textView.setText("Details:-Chromium is widely distributed in the earth's crust. It can exist in oxidation states of +2 to +6. Soils and rocks may contain small amounts of chromium, almost always in the trivalent state.\n" +
                        "\n" +
                        "Availability:The average concentration of chromium in rainwater is in the range 0.2–1 ¬g/litre. Natural chromium concentrations in seawater of 0.04–0.5 µg/litre have been measured.\n" +
                        "\n" +
                        "Limits:Its acceptable limit is 0.05 mg/l and has no permissible limit\n" +
                        "\n" +
                        "Measurements: Prepare a water sample for testing by placing 10 ml of sample in a test tube. Add 12 drops of 3M sulphuric acid to the sample. Pipet 0.5ml of diphenylcarbazide solution into the test tube and allow 5 minutes for colour development. Determine the amount of Cr present by measuring the absorbance of sample at 540nm of Cr.\nEffects: Ingestion of 1–5 g of \"chromate\" (not further specified) results in severe acute effects such as gastrointestinal disorders, haemorrhagic diathesis, and convulsions. Death may occur following cardiovascular shock."
                );


                img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chromium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "A few of the methods to efficiently remove Chromium in your water is through reverse osmosis and through using a high-end water filtration system.\n");

                        img1.setImageResource(R.drawable.chromium_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 42) {
                //Before Treatment

                textView.setText("Details:-Trihalomethanes (THMs) are halogen-substituted single-carbon compounds with the general formula CHX3, where X represents a halogen, which may be fluorine, chlorine, bromine, or iodine, or combinations thereof. The THMs most commonly present in drinking-water are chloroform (CHCl3), bromodichloromethane or dichlorobromomethane (CHBrCl2) (BDCM), dibromochloromethane or chlorodibromomethane (CHClBr2) (DBCM), and bromoform (CHBr3). Consideration of information relevant to the derivation of drinking-water guidelines for THMs is restricted to these compounds.\n" +
                        "\n" +
                        "Availability:THMs are formed in drinking-water primarily as a result of chlorination of organic matter present in raw water supplies. The rate and degree of THM formation increase as a function of the chlorine and humic acid concentration. In the presence of bromides, brominated THMs are formed preferentially and chloroform concentrations decrease proportionally.\n" +
                        "\n" +
                        "Limits:Bromoform acceptable limit is 0.1 mg/l.\n" +
                        "\n" +
                        "Effects: Harm to central nervous system, liver, kidney and change in blood cells\n" +
                        "Measurements: THMs can be determined by a number of different analytical techniques, including purge-and-trap, liquid–liquid extraction, and direct aqueous injection in combination with a chromatographic system. The chromatographic system will permit concurrent determination of all four THMs\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chromium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Bromoform removal using packed tower aeration depends on the air-to-water ratio, water loading rate, and packing depth; 45% removal from an inlet concentration of approximately 100 µg/litre.\n");

                        img1.setImageResource(R.drawable.bromoform_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 43) {
                //Before Treatment

                textView.setText("Details:-Trihalomethanes (THMs) are halogen-substituted single-carbon compounds with the general formula CHX3, where X represents a halogen, which may be fluorine, chlorine, bromine, or iodine, or combinations thereof. The THMs most commonly present in drinking-water are chloroform (CHCl3), bromodichloromethane or dichlorobromomethane (CHBrCl2) (BDCM), dibromochloromethane or chlorodibromomethane (CHClBr2) (DBCM), and bromoform (CHBr3). Consideration of information relevant to the derivation of drinking-water guidelines for THMs is restricted to these compounds.\n" +
                        "\n" +
                        "Availability:THMs are formed in drinking-water primarily as a result of chlorination of organic matter present in raw water supplies. The rate and degree of THM formation increase as a function of the chlorine and humic acid concentration. In the presence of bromides, brominated THMs are formed preferentially and chloroform concentrations decrease proportionally.\n" +
                        "\n" +
                        "Limits:Dibromochloromethane acceptable limit is 0.1 mg/l.\n" +
                        "\n" +
                        "Effects: Harm to central nervous system, liver, kidney and change in blood cells\n" +
                        "Measurements: THMs can be determined by a number of different analytical techniques, including purge-and-trap, liquid–liquid extraction, and direct aqueous injection in combination with a chromatographic system. The chromatographic system will permit concurrent determination of all four THMs\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chromium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Dibromochloromethan removal using packed tower aeration depends on the air-to-water ratio, water loading rate, and packing depth; 45% removal from an inlet concentration of approximately 100 µg/litre.\n");

                        img1.setImageResource(R.drawable.bromoform_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 44) {
                //Before Treatment

                textView.setText("Details:-Trihalomethanes (THMs) are halogen-substituted single-carbon compounds with the general formula CHX3, where X represents a halogen, which may be fluorine, chlorine, bromine, or iodine, or combinations thereof. The THMs most commonly present in drinking-water are chloroform (CHCl3), bromodichloromethane or dichlorobromomethane (CHBrCl2) (BDCM), dibromochloromethane or chlorodibromomethane (CHClBr2) (DBCM), and bromoform (CHBr3). Consideration of information relevant to the derivation of drinking-water guidelines for THMs is restricted to these compounds.\n" +
                        "\n" +
                        "Availability:THMs are formed in drinking-water primarily as a result of chlorination of organic matter present in raw water supplies. The rate and degree of THM formation increase as a function of the chlorine and humic acid concentration. In the presence of bromides, brominated THMs are formed preferentially and chloroform concentrations decrease proportionally.\n" +
                        "\n" +
                        "Limits:Bromodichloromethane acceptable limit is 0.06 mg/l.\n" +
                        "\n" +
                        "Effects: Harm to central nervous system, liver, kidney and change in blood cells\n" +
                        "Measurements: THMs can be determined by a number of different analytical techniques, including purge-and-trap, liquid–liquid extraction, and direct aqueous injection in combination with a chromatographic system. The chromatographic system will permit concurrent determination of all four THMs\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chromium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "Bromodichloromethane removal using packed tower aeration depends on the air-to-water ratio, water loading rate, and packing depth; 45% removal from an inlet concentration of approximately 100 µg/litre.\n");

                        img1.setImageResource(R.drawable.bromoform_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }
            if (selectedOption == 45) {
                //Before Treatment

                textView.setText("Details:-Chloroform is also known as trichloromethane, methane chloride, or methyltrichloride. It is a colourless liquid with a pleasant, non-irritating odour and slightly sweet taste. Most of the chloroform found in the environment comes from industry. It will only burn when it reaches very high temperatures.\n" +
                        "\n" +
                        "Availability:Human exposure to chloroform may occur through drinking water, where chloroform is formed as a result of the chlorination of naturally occurring organic materials found in raw tap water supplies. Swimming in swimming pools allows chloroform to be absorbed through a person's skin. People who work at or near chemical plants and factories that make or use chloroform can be exposed to higher than normal amounts of chloroform. Higher exposures might occur in workers at drinking water treatment plants, waste water treatment plants, and paper and pulp mills. People who operate waste-burning equipment may also be exposed to higher than normal levels.\n" +
                        "\n" +
                        "Limits:The EPA limit for total trihalomethanes, a class of chemicals that includes chloroform, in drinking water is 100 micrograms per liter (μg/L, 1 μg/L = 1 ppb in water)\n" +
                        "\n" +
                        "Effects: The major effect from acute (short-term) inhalation exposure to chloroform is central nervous system depression.  Chronic (long-term) exposure to chloroform by inhalation in humans has resulted in effects on the liver, including hepatitis and jaundice, and central nervous system effects, such as depression and irritability\n"
                );


                //img.setVisibility(View.VISIBLE);//For image in first page
                img.setImageResource(R.drawable.chromium_effect);//For image in first page
                //For treatment Methods
                treatment.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        textView.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        treatmentlay.setVisibility(View.VISIBLE);
                        treatbuttonlay.setVisibility(View.GONE);
                        textView1.setText("Treatment Method:\n" +
                                "We have proposed a process to remove chloroform from water. The process was tested and found to be adequate by public health standards for water that contains a concentration of chloroform up to 6.7 g/L.\n");

                        img1.setImageResource(R.drawable.chloroform_treatment);//For image in treatment section. comment out the line if no image is needed.
                    }
                });
                //End of Treatment
            }

        }
    }

    public boolean onTouch(View v, MotionEvent event) {
        // TODO Auto-generated method stub
        String TAG = "Hello";

        ImageView view = (ImageView) v;
        dumpEvent(event);

        // Handle touch events here...
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                savedMatrix.set(matrix);
                start.set(event.getX(), event.getY());
                Log.d(TAG, "mode=DRAG");
                mode = DRAG;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                oldDist = spacing(event);
                Log.d(TAG, "oldDist=" + oldDist);
                if (oldDist > 10f) {
                    savedMatrix.set(matrix);
                    midPoint(mid, event);
                    mode = ZOOM;
                    Log.d(TAG, "mode=ZOOM");
                }
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_POINTER_UP:
                mode = NONE;
                Log.d(TAG, "mode=NONE");
                break;
            case MotionEvent.ACTION_MOVE:
                if (mode == DRAG) {
                    // ...
                    matrix.set(savedMatrix);
                    matrix.postTranslate(event.getX() - start.x, event.getY()
                            - start.y);
                } else if (mode == ZOOM) {
                    float newDist = spacing(event);
                    Log.d(TAG, "newDist=" + newDist);
                    if (newDist > 10f) {
                        matrix.set(savedMatrix);
                        float scale = newDist / oldDist;
                        matrix.postScale(scale, scale, mid.x, mid.y);
                    }
                }
                break;
        }

        view.setImageMatrix(matrix);
        return true;
    }

    private void dumpEvent(MotionEvent event) {
        String TAG = "Hello";

        String names[] = { "DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE",
                "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?" };
        StringBuilder sb = new StringBuilder();
        int action = event.getAction();
        int actionCode = action & MotionEvent.ACTION_MASK;
        sb.append("event ACTION_").append(names[actionCode]);
        if (actionCode == MotionEvent.ACTION_POINTER_DOWN
                || actionCode == MotionEvent.ACTION_POINTER_UP) {
            sb.append("(pid ").append(
                    action >> MotionEvent.ACTION_POINTER_ID_SHIFT);
            sb.append(")");
        }
        sb.append("[");
        for (int i = 0; i < event.getPointerCount(); i++) {
            sb.append("#").append(i);
            sb.append("(pid ").append(event.getPointerId(i));
            sb.append(")=").append((int) event.getX(i));
            sb.append(",").append((int) event.getY(i));
            if (i + 1 < event.getPointerCount())
                sb.append(";");
        }
        sb.append("]");
        Log.d(TAG, sb.toString());
    }

    /** Determine the space between the first two fingers */
    private float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float)Math.sqrt(x * x + y * y);
    }

    /** Calculate the mid point of the first two fingers */
    private void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.set(x / 2, y / 2);
    }
}
