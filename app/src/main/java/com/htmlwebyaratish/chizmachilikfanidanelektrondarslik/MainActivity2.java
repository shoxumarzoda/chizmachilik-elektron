package com.htmlwebyaratish.chizmachilikfanidanelektrondarslik;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapter.SelectedUser {


    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;

   ConstraintLayout constraintLayout;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
        toolbar = findViewById(R.id.toolBAr);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");

        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);


        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);


        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I bap. HTML5 hám CSS3 járdeminde betlikler jaratıw");

                modelRcyclers.add(new ModelRcycler("1.1. HTML5 járdeminde betlikler jaratıw ","file:///android_asset/1-1.htm"));
                modelRcyclers.add(new ModelRcycler("1.2. CSS3(Cascading Style Sheets) tiykarları ","file:///android_asset/1-2.htm"));
                modelRcyclers.add(new ModelRcycler("1.3.\tCSS Sin-taksisi","file:///android_asset/1-3.htm"));
                modelRcyclers.add(new ModelRcycler("1.4.\tCSSda selektorlar","file:///android_asset/1-4.htm"));
                modelRcyclers.add(new ModelRcycler("1.5.\tCSSda reńler","file:///android_asset/1-5.htm"));
                modelRcyclers.add(new ModelRcycler("1.6.\tMiyras alıw","file:///android_asset/1-6.htm"));
                modelRcyclers.add(new ModelRcycler("1.7.\tBootstrap framework","file:///android_asset/1-7.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color2));


            }break;

            case 2:{

                textViewSelectedChapterName.setText("II bap. JavaScript hám JQuery texnologiyası ");

                modelRcyclers.add(new ModelRcycler("2.1. JavaScript texnologiyası haqqında qısqasha maǵlıwmat","file:///android_asset/2-1.htm"));
                modelRcyclers.add(new ModelRcycler("2.2. JavaScript dástúrlew tili operatorları ","file:///android_asset/2-2.htm"));
                modelRcyclers.add(new ModelRcycler("2.3. JavaScript dástúrleww tilinde Array - Massiv (tártip, qatar) haqqında ","file:///android_asset/2-3.htm"));
                modelRcyclers.add(new ModelRcycler("2.4. Random – tosınnan ","file:///android_asset/2-4.htm"));
                modelRcyclers.add(new ModelRcycler("2.5. JQuery kitapxanası tiykarları ","file:///android_asset/2-5.htm"));
                modelRcyclers.add(new ModelRcycler("2.6. JQuerydiń wazıypaları ","file:///android_asset/2-6.htm"));
                modelRcyclers.add(new ModelRcycler("2.7. Plaginler(úskeneler)dan payda-lanıw","file:///android_asset/2-7.htm"));
                modelRcyclers.add(new ModelRcycler("2.8. JQuerydi kóshiriw","file:///android_asset/2-8.htm"));
                modelRcyclers.add(new ModelRcycler("2.9. JQuery kutubxonasına baylanısıw ","file:///android_asset/2-9.htm"));
                modelRcyclers.add(new ModelRcycler("2.10. JQUERYDA SELEKTORLAR","file:///android_asset/2-10.htm"));
                modelRcyclers.add(new ModelRcycler("2.11. JQueryda effektler (Hide hám Show)","file:///android_asset/2-11.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color3));
            }break;

             case 3:{

                textViewSelectedChapterName.setText("III bap. PHP hám onıń imkaniyatları");

                modelRcyclers.add(new ModelRcycler("3.1. PHP járdeminde dinamikalıq web – saytlar islep shıǵıw ","file:///android_asset/3-1.htm"));
                modelRcyclers.add(new ModelRcycler("3.2. PHP dástúrlew tilindegi tiykarǵı sintaksisler","file:///android_asset/3-2.htm"));
                modelRcyclers.add(new ModelRcycler("3.3. PHPde operatorlar","file:///android_asset/3-3.htm"));
                modelRcyclers.add(new ModelRcycler("3.4. Yii2 framework","file:///android_asset/3-4.htm"));
                modelRcyclers.add(new ModelRcycler("3.5. Yii2 di ornatıw","file:///android_asset/3-5.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color4));
            }break;

            case 4:{

                textViewSelectedChapterName.setText("IV bap. MySQL maǵlımatlar ba-zası");

                modelRcyclers.add(new ModelRcycler("4.1. MySQL maǵlıwmatlar bazası haqqında túsinik ","file:///android_asset/4-1.htm"));
                modelRcyclers.add(new ModelRcycler("4.2. MySQL maǵlıwmatlar bazası menen islew","file:///android_asset/4-2.htm"));
                modelRcyclers.add(new ModelRcycler("4.3. MySQL maǵlıwmatlar bazasın jaratıw (CREATE DATA- BASE)","file:///android_asset/4-3.htm"));
                modelRcyclers.add(new ModelRcycler("4.4. MySQL maǵlıwmatlar bazasında tablica jaratıw (CREATE TABLE)","file:///android_asset/4-4.htm"));
                modelRcyclers.add(new ModelRcycler("4.5. PHP va MySQL integrasiyası","file:///android_asset/4-5.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color5));

            }break;

            case 5:{

                textViewSelectedChapterName.setText("V bap. CMS (CONTENT MANAGEMENT SYSTEMS) - KONTENT BASQARÍW SISTEMALARÍ ");

                modelRcyclers.add(new ModelRcycler("5.1. CMS plotformalarında islew ","file:///android_asset/5-1.htm"));
                modelRcyclers.add(new ModelRcycler("5.2. Joomla CMS plotforması ","file:///android_asset/5-2.htm"));
                modelRcyclers.add(new ModelRcycler("5.3. Drupal CMS plotfor-ması","file:///android_asset/5-3.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color6));
            }break;

            case 6:{

                textViewSelectedChapterName.setText("VI bap. LMS (LEARNING MANAGEMENT SYSTEMS) - BILIM-LENDIRIWDI BASQARÍW SISTEMALARÍ");

                modelRcyclers.add(new ModelRcycler("6.1. LMS plotformalarınıń túrleri hám wazıypaları","file:///android_asset/6-1.htm"));
                modelRcyclers.add(new ModelRcycler("6.2. Moodle (Modular Object-Oriented Dynamic Learning Environment)","file:///android_asset/6-2.htm"));
                modelRcyclers.add(new ModelRcycler("6.3. Google Classroom platforması ","file:///android_asset/6-3.htm"));
                modelRcyclers.add(new ModelRcycler("6.4. MOOC platforması","file:///android_asset/6-4.htm"));


                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color7));
            }break;

            case 7:{

                textViewSelectedChapterName.setText("VII bap. WEB-FREELANCE");

                modelRcyclers.add(new ModelRcycler("7.1. Web-freelance","file:///android_asset/7-1.htm"));
                modelRcyclers.add(new ModelRcycler("7.2. Freelance web – say-tlar","file:///android_asset/7-2.htm"));

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color8));
            }break;




        }

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }




    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}

