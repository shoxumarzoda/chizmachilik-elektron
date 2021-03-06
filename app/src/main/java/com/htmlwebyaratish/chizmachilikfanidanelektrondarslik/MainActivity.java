package com.htmlwebyaratish.chizmachilikfanidanelektrondarslik;

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

        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imageone, "Kirisiw","Zamanag??y bilimlendiriw sistemas??n???? tiykar??n sapal?? h??m joqar?? texnologiyal?? ortal??q qurayd??.","file:///android_asset/kirish.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.htmlcss, "I bap. HTML5 h??m CSS3 j??rdeminde betlikler jarat??w"," Bul bapta HTML5 d???? tiykar???? elementleri, formalar, kesteler, kesteler h??m semantik web teglerin ??yreniw.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.js, "II bap. JavaScript h??m JQuery texnologiyas?? ","Bul bapta javascriptti??  tiykar????  t??sinikleri:  ??zgeshelikler, metodlar, xo-disalar.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.ppp, "III bap. PHP h??m on???? imkaniyatlar?? ","Bul bapta PHP sintaksisini ??yreniw. PHP programmalast??r??w tili j??rde-minde web - saytlar jarat??wd?? ??yreniw.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.mysql, "IV bap. MySQL ma??l??matlar ba-zas??","Bu bapta MySQL ma??l??wmatlar bazas?? interfeysi, MySQL ma??l??wmatlar bazas?? menen islew.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagefive, "V bap. CMS (CONTENT MANAGEMENT SYSTEMS) - KONTENT BASQAR??W SISTEMALAR?? ","Bul bapta CMS haqq??nda, CMS plotformalar?? menen tan??s??w.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagenine, "VI bap. LMS (LEARNING MANAGEMENT SYSTEMS) - BILIM-LENDIRIWDI BASQAR??W SISTEMALAR??  ","Bul bapta LMS haqq??nda, LMS plotformalard???? t??rleri h??m waz??ypalar.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagesevn, "VII bap. WEB-FREELANCE","Bul bapta Web-freelance, Web-freelance saytlar??.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagetwo, "Paydalan??l??an ??debiyatlar","Paydalan??l??an ??debiyatlar","file:///android_asset/foyda.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.photo,
                "Muallif:","Mambetniyazov Maksetbay Torebekovich \n  Nukus Davlat Pedagogika Instituti",
                "http://t.me/MaksetbayTorebekovich"));

    }

}