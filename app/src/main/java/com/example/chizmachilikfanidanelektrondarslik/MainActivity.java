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
                getResources().getColor(R.color.color7)
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

        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imageone, "Ma'ruza","Dars ta’lim jarayonining yaxlitligi nuqtai nazaridan ta’limning asosiy tashkiliy usuli hisoblanadi.",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagetwo, "Amaliy","O‘tilgan mavzular yuzasidan savol-javob o‘tkazish ...",""));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagethree, "Joriy","Grafik vazifalar ishi, Mustaqil vazifalar...","file:///android_asset/joriy.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagesevn, "Oraliq nazorat","Oraliq nazorat topshiriqlari...","file:///android_asset/on.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagenine, "Yakuniy nazorat","Yakuniy nazorat topshiriqlari...","file:///android_asset/yn.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.imagefive, "Fotdalanilgan adabiyotlar","Elektron dasrslikni yaratishda foydalanilgan adabiyotlar","file:///android_asset/fa.htm"));
        modelElementarySwimmers.add(new ModelElementarySwimmers(R.drawable.photo, "Muallif:","Turayev Xumoyiddin Abduĝafforovich \n  TerDU","https://t.me/xumoyiddinturayev"));

    }

}