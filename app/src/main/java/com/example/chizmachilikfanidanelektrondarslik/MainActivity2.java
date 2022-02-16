package com.example.chizmachilikfanidanelektrondarslik;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapter.SelectedUser {


    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

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
        this.getSupportActionBar().setTitle(intent.getStringExtra("swimmers"));

        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);



        textViewSelectedChapterName.setText(intent.getStringExtra("swimmers"));

        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);


        switch (textViewSelectedChapterName.getText().toString()){
            case "Ma'ruza": {
                modelRcyclers.add(new ModelRcycler("1-Ma'ruza: Proyeksion chizmachilik bo'limining nazariy mashg'ulotlari","file:///android_asset/birproyeksion.htm"));
                modelRcyclers.add(new ModelRcycler("2-Ma'ruza: Narsani o'zaro perpendikulyar ikkita va uchta tekislikka proyeksiyalash","file:///android_asset/ikkimaruza.htm"));
                modelRcyclers.add(new ModelRcycler("3-Ma'ruza: Qo'shimcha va mahalliy ko'rinishlar","file:///android_asset/uchmaruza.htm"));
                modelRcyclers.add(new ModelRcycler("4-Ma'ruza: Qirqim va kesimlar haqida umumiy tushuncha","file:///android_asset/turtmaruza.htm"));
                modelRcyclers.add(new ModelRcycler("5-Ma'ruza: Aksonometrik proyeksiyalar haqida tushuncha","file:///android_asset/beshmaruza.htm"));
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color1));

            }break;

            case "Amaliy":{
                modelRcyclers.add(new ModelRcycler("1-Amaliy mavzu. Buyumning oltita ko'rinishini bajarish","file:///android_asset/bir.htm"));
                modelRcyclers.add(new ModelRcycler("2-Amaliy mavzu. Buyumning uchta ko'rinishini bajarish","file:///android_asset/ikki.htm"));
                modelRcyclers.add(new ModelRcycler("3-Amaliy mavzu. Oddiy qirqim bajarish","file:///android_asset/uch.htm"));
                modelRcyclers.add(new ModelRcycler("4-Amaliy mavzu. Murakkab qirqim bajarish","file:///android_asset/turt.htm"));
                modelRcyclers.add(new ModelRcycler("5-Amaliy mavzu. Modelning berilgan ikki proyeksiyasi bo'yicha uning yetishmovchi ","file:///android_asset/besh.htm"));
                modelRcyclers.add(new ModelRcycler("6-Amaliy mavzu. Buyumning to'g'ri va qiyshiq burchakli dimetrik  ","file:///android_asset/olti.htm"));
                modelRcyclers.add(new ModelRcycler("7-Amaliy mavzu. Tavsif bo'yicha buyumning ortogonal va aksonometrik proyeksiyasini bajarish","file:///android_asset/yetti.htm"));
                modelRcyclers.add(new ModelRcycler("8-Amaliy mavzu. Detal sirtlarini aksonometrik proyeksiyada ajratib chizish","file:///android_asset/sakkiz.htm"));
                modelRcyclers.add(new ModelRcycler("9-Amaliy mavzu. Detalda og'ma qirqim bajarish, kesim yuzasining haqiqiy kattaligini aniqlash","file:///android_asset/tuqqiz.htm"));
                modelRcyclers.add(new ModelRcycler("10-Amaliy mavzu. Tekis kesimga ega bo'lgan detalning ortogonal va aksonometrik proyeksiyasini bajarish","file:///android_asset/un.htm"));
                modelRcyclers.add(new ModelRcycler("11-Amaliy mavzu. Sirtlarning o'zaro kesishuv chizig'ining ortogonal","file:///android_asset/unbir.htm"));
                modelRcyclers.add(new ModelRcycler("12-Amaliy mavzu. Detalning fazoviy holatini o'zgartirib chizish","file:///android_asset/unikki.htm"));
                modelRcyclers.add(new ModelRcycler("13-Amaliy mavzu. Shartga binoan o'yib olish orqali detal hosil qilish","file:///android_asset/unuch.htm"));
                modelRcyclers.add(new ModelRcycler("14-Amaliy mavzu. Ikki proyeksiyasi berilgan detalning yoyilmasini va modelini yasash","file:///android_asset/unturt.htm"));
                modelRcyclers.add(new ModelRcycler("15-Amaliy mavzu. Eskiz va texnik rasm bajarish","file:///android_asset/unbesh.htm"));
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color2));
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

