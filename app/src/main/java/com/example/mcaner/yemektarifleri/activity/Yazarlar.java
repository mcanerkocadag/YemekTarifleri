package com.example.mcaner.yemektarifleri.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.adapter.YazarlarAdapter;
import com.example.mcaner.yemektarifleri.model.YazarModel;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcaner on 14.02.2017.
 */

public class Yazarlar extends BaseActivity implements ItemClickListener{
    ArrayList<YazarModel> yazarListesi;
    RecyclerView recyclerView;
    YazarlarAdapter adapter;
    Bundle bundle;
    YazarModel model;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__yazarlar);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        yazarleriGetir();
        adapter=new YazarlarAdapter(yazarListesi);

        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);
        setTitle("Yazarlarımız");
    }
    @Override
    public void onClick(View view, int position) {

        Intent i = new Intent(this, Yazar.class);
        //bundle = new Bundle();
       // bundle.putInt("position",position);
       // List<String> l= (List<String>) yazarListesi.get(position);
       model=yazarListesi.get(position);
        i.putExtra("yazar", model);

      // i.putExtras(bundle);
        //i.putExtra("yazarListesi",yazarListesi);
        startActivity(i);

    }
    private void yazarleriGetir() {
        yazarListesi=new ArrayList<YazarModel>();
        yazarListesi.add(new YazarModel("Lale Koyun",R.drawable.lale,"211 Tarif"));

        yazarListesi.add(new YazarModel("M Caner",R.drawable.profil,"211 Tarif"));

        yazarListesi.add(new YazarModel("Lale Koyun",R.drawable.profil,"211 Tarif"));

        yazarListesi.add(new YazarModel("Lale Koyun",R.drawable.profil,"211 Tarif"));
    }


}
