package com.example.mcaner.yemektarifleri.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.mcaner.yemektarifleri.DividerItemDecoration;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.adapter.KategorilerAdapter;
import com.example.mcaner.yemektarifleri.model.KategoriModel;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;

/**
 * Created by mcaner on 13.02.2017.
 */

public class Kategoriler extends BaseActivity{
    RecyclerView recyclerView;
    KategorilerAdapter adapter;
    ArrayList<KategoriModel> kategoriListesi;
    //Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);
        kategoriKayit();
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        adapter=new KategorilerAdapter(kategoriListesi,this);
        //recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,R.drawable.divider));
        //recyclerView.setAdapter(adapter);
        //animasyon başlangıç
        SlideInRightAnimationAdapter slideInRightAnimationAdapter=new SlideInRightAnimationAdapter(adapter);
        slideInRightAnimationAdapter.setFirstOnly(false);
        //animasyon bitiş
        recyclerView.setAdapter(slideInRightAnimationAdapter);
        /*toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Yemek Çeşitleri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        setTitle("Yemek Çeşitlerim");
    }

    private void kategoriKayit() {
        kategoriListesi=new ArrayList<KategoriModel>();
        kategoriListesi.add(new KategoriModel(R.drawable.corba,"Çorba Tarifleri"));
        kategoriListesi.add(new KategoriModel(R.drawable.et,"Et Tarifleri"));
        kategoriListesi.add(new KategoriModel(R.drawable.kahvaltilik,"Kahvaltılıklar"));
        kategoriListesi.add(new KategoriModel(R.drawable.makarna,"Makarna Tarifleri"));


    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }*/
}
