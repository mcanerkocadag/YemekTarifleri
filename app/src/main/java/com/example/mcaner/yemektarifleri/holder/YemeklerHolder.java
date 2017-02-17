package com.example.mcaner.yemektarifleri.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.adapter.YemeklerAdapter;
import com.example.mcaner.yemektarifleri.model.YemekModel;

/**
 * Created by mcaner on 13.02.2017.
 */

public class YemeklerHolder extends RecyclerView.ViewHolder{

    public ImageView yemekFoto;
    public TextView yemekİsmi,yazar;
    public YemeklerHolder(View itemView) {
        super(itemView);
        yemekİsmi= (TextView) itemView.findViewById(R.id.yemekİsmi);
        yazar= (TextView) itemView.findViewById(R.id.yazar);
        yemekFoto= (ImageView) itemView.findViewById(R.id.yemekFoto);

    }



}
