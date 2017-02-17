package com.example.mcaner.yemektarifleri.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.holder.KategorilerHolder;
import com.example.mcaner.yemektarifleri.model.KategoriModel;

import java.util.ArrayList;

/**
 * Created by mcaner on 13.02.2017.
 */

public class KategorilerAdapter extends RecyclerView.Adapter<KategorilerHolder> {

    ArrayList<KategoriModel> kategoriListesi;
    Context context;

    public KategorilerAdapter(ArrayList<KategoriModel> kategoriListesi, Context context) {
        this.kategoriListesi = kategoriListesi;
        this.context = context;
    }

    @Override
    public KategorilerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.activity_kategori_adapter,parent,false);
        KategorilerHolder kategorilerHolder=new KategorilerHolder(v);

        return kategorilerHolder;
    }

    @Override
    public void onBindViewHolder(KategorilerHolder holder, int position) {
        KategoriModel kategoriModel=kategoriListesi.get(position);
        holder.kategoriAdi.setText(kategoriModel.getKategoriAdi());
        Glide.with(context).load(kategoriModel.getKategoriFoto()).into(holder.kategoriFoto);
    }

    @Override
    public int getItemCount() {
        return kategoriListesi.size();
    }
}
