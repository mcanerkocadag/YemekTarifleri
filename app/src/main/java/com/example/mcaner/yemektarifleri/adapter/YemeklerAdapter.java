package com.example.mcaner.yemektarifleri.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.holder.YemeklerHolder;
import com.example.mcaner.yemektarifleri.model.YemekModel;

import java.util.ArrayList;

/**
 * Created by mcaner on 13.02.2017.
 */

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerHolder> {
    ArrayList<YemekModel> yemekListesi;

    public YemeklerAdapter(ArrayList<YemekModel> yemekListesi) {
        this.yemekListesi = yemekListesi;

    }

    @Override
    public YemeklerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_yemekler_adapter,parent,false);
        YemeklerHolder yemeklerHolder=new YemeklerHolder(v);

        return yemeklerHolder;
    }

    @Override
    public void onBindViewHolder(YemeklerHolder holder, int position) {
        YemekModel yemekModel=yemekListesi.get(position);
        holder.yemekİsmi.setText(yemekModel.getYemekİsmi());
        holder.yazar.setText(yemekModel.getYazar());
        Glide.with(holder.itemView.getContext()).load(yemekModel.getYemekFoto()).into(holder.yemekFoto);

    }

    @Override
    public int getItemCount() {
        return yemekListesi.size();
    }


}


