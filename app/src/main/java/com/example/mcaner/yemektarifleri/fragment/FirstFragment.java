package com.example.mcaner.yemektarifleri.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.adapter.YemeklerAdapter;
import com.example.mcaner.yemektarifleri.model.YemekModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    ArrayList<YemekModel> yemekListesi;
    YemeklerAdapter adapter;
    RecyclerView recyclerView;

//Normal recyclerView kullanımındaki ana main gibi düşünelecek

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_first,container,false);
        recyclerView= (RecyclerView) v.findViewById(R.id.recyclerView);
        yemekleriGetir();
        adapter=new YemeklerAdapter(yemekListesi);
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return v;
    }

    private void yemekleriGetir() {
        yemekListesi=new ArrayList<YemekModel>();
        yemekListesi.add(new YemekModel(R.drawable.yayla,"Sevgililer Günü","Özen Hızlısoy Tombak")); // 0.indis
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
