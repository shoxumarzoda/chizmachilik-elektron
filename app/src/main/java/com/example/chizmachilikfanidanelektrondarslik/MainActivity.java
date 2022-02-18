package com.example.chizmachilikfanidanelektrondarslik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    ViewPager viewPagerElementarySwimmers;
    ModelAdapterElementarySwimmers modelAdapterElementarySwimmers;

    List<ModelElementarySwimmers> modelElementarySwimmers;

    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        modelElementarySwimmers = new ArrayList<>();
        initialization();

        modelAdapterElementarySwimmers = new ModelAdapterElementarySwimmers(modelElementarySwimmers,this);

        viewPagerElementarySwimmers = findViewById(R.id.viewPager);
        viewPagerElementarySwimmers.setAdapter(modelAdapterElementarySwimmers);
        viewPagerElementarySwimmers.setPadding(130,0,130,0);

        Integer [] colors_tempSwimmers = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),
                getResources().getColor(R.color.color9),
                getResources().getColor(R.color.color10)
        };
        colors = colors_tempSwimmers;

        viewPagerElementarySwimmers.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            int viewPosition;
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                viewPosition = position;
                if (position < (modelAdapterElementarySwimmers.getCount()-1) && position < (colors.length -1)){
                    viewPagerElementarySwimmers.setBackgroundColor((Integer)argbEvaluator.evaluate(positionOffset,
                            colors[position],colors[position+1]));

                }else {
                    viewPagerElementarySwimmers.setBackgroundColor(colors[colors.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });




    }



    private void initialization() {

        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imageone, "Kirisiw","Zamanagóy bilimlendiriw sistemasınıń tiykarın sapalı hám joqarı texnologiyalı ortalıq quraydı.","file:///android_asset/kirish.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.htmlcss, "I bap. HTML5 hám CSS3 járdeminde betlikler jaratıw"," Bul bapta HTML5 dıń tiykarǵı elementleri, formalar, kesteler, kesteler hám semantik web teglerin úyreniw.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.js, "II bap. JavaScript hám JQuery texnologiyası ","Bul bapta javascripttiń  tiykarǵı  túsinikleri:  ózgeshelikler, metodlar, xo-disalar.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.ppp, "III bap. PHP hám onıń imkaniyatları ","Bul bapta PHP sintaksisini úyreniw. PHP programmalastırıw tili járde-minde web - saytlar jaratıwdı úyreniw.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.mysql, "IV bap. MySQL maǵlımatlar ba-zası","Bu bapta MySQL maǵlıwmatlar bazası interfeysi, MySQL maǵlıwmatlar bazası menen islew.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagefive, "V bap. CMS (CONTENT MANAGEMENT SYSTEMS) - KONTENT BASQARÍW SISTEMALARÍ ","Bul bapta CMS haqqında, CMS plotformaları menen tanısıw.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagenine, "VI bap. LMS (LEARNING MANAGEMENT SYSTEMS) - BILIM-LENDIRIWDI BASQARÍW SISTEMALARÍ  ","Bul bapta LMS haqqında, LMS plotformalardıń túrleri hám wazıypalar.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagesevn, "VII bap. WEB-FREELANCE","Bul bapta Web-freelance, Web-freelance saytları.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagetwo, "Paydalanılǵan ádebiyatlar","Paydalanılǵan ádebiyatlar","file:///android_asset/foyda.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.photo, "Muallif:","Turayev Xumoyiddin Abduĝafforovich \n  TerDU","https://t.me/xumoyiddinturayev"));

    }

}