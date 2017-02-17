package com.example.mcaner.yemektarifleri.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.model.YazarModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mcaner on 17.02.2017.
 */

public class Yazar extends AppCompatActivity {
    TextView textView;
    YazarModel model;
    ImageView yazarFoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yazar);
        textView= (TextView) findViewById(R.id.yazarAdi);
        yazarFoto= (ImageView) findViewById(R.id.yazarFotosu);
        //Bundle datas = getIntent().getExtras();
        //Bundle yemek=getIntent().getExtras();
       // yemek.getP
      // int i=datas.getInt("position");
       // model= (YazarModel) getIntent().
        model = (YazarModel) getIntent().getSerializableExtra("yazar");
        Glide.with(this).load(model.getYazarFoto()).into(yazarFoto);

        textView.setText(model.getYazarAdi());
       // textView.setText(yazarListesi.get(i).getYazarAdi());
    }
}
