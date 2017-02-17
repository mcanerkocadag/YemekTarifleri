package com.example.mcaner.yemektarifleri.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.adapter.YemeklerAdapter;
import com.example.mcaner.yemektarifleri.model.YemekModel;

import java.util.ArrayList;

/**
 * Created by mcaner on 13.02.2017.
 */

public class Yemekler extends BaseActivity {
    ArrayList<YemekModel> yemekListesi;
    YemeklerAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekler);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        yemekleriGetir();
        adapter=new YemeklerAdapter(yemekListesi);

        recyclerView.setAdapter(adapter);
        setTitle("Yemekler");


    }

    private void yemekleriGetir() {
        yemekListesi=new ArrayList<YemekModel>();
        yemekListesi.add(new YemekModel(R.drawable.yayla,"Yayla Çorbası","Özen Hızlısoy Tombak")); // 0.indis
        yemekListesi.add(new YemekModel(R.drawable.mantarcorbasi,"Mantar Çorbası","Lale Koyun Çoksever")); //1.indis
        yemekListesi.add(new YemekModel(R.drawable.brokolicorbasi,"Brokoli Çorbası","Miray Yıldız"));
        yemekListesi.add(new YemekModel(R.drawable.yayla,"Yayla Çorbası","Özen Hızlısoy Tombak"));
        yemekListesi.add(new YemekModel(R.drawable.mantarcorbasi,"Mantar Çorbası","Lale Koyun Çoksever"));
        yemekListesi.add(new YemekModel(R.drawable.brokolicorbasi,"Brokoli Çorbası","Miray Yıldız"));
        yemekListesi.add(new YemekModel(R.drawable.yayla,"Yayla Çorbası","Özen Hızlısoy Tombak"));
        yemekListesi.add(new YemekModel(R.drawable.mantarcorbasi,"Mantar Çorbası","Lale Koyun Çoksever"));
        yemekListesi.add(new YemekModel(R.drawable.brokolicorbasi,"Brokoli Çorbası","Miray Yıldız"));

    }


}
