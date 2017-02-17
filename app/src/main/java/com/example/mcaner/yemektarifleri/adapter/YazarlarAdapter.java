package com.example.mcaner.yemektarifleri.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.activity.ItemClickListener;
import com.example.mcaner.yemektarifleri.model.YazarModel;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by mcaner on 14.02.2017.
 */

public class YazarlarAdapter extends RecyclerView.Adapter<YazarlarAdapter.ViewHolder> {
    ArrayList<YazarModel> yazarListesi;
    private ItemClickListener clickListener;
    //Context context;


    public YazarlarAdapter(ArrayList<YazarModel> yazarListesi/*, Context context*/) {
        this.yazarListesi = yazarListesi;
       // this.context = context;
    }

    @Override
    public YazarlarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_yazar_adapter,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(YazarlarAdapter.ViewHolder holder, int position) {
        YazarModel model=yazarListesi.get(position);
        holder.yazarAdi.setText(model.getYazarAdi());
        holder.yazarYili.setText(model.getYazarYil());
        Glide.with(holder.itemView.getContext()).load(model.getYazarFoto()).into(holder.profilFoto);


    }

    @Override
    public int getItemCount() {
        return yazarListesi.size();
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView profilFoto,social,facebook;
        TextView yazarAdi,yazarYili;



        public ViewHolder(View itemView) {
            super(itemView);
            profilFoto= (ImageView) itemView.findViewById(R.id.profilFoto);
            social= (ImageView) itemView.findViewById(R.id.imgSocial);
            facebook= (ImageView) itemView.findViewById(R.id.imgFace);
            yazarAdi= (TextView) itemView.findViewById(R.id.yazarAdi);
            yazarYili= (TextView) itemView.findViewById(R.id.yazarYil);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getLayoutPosition());
        }
    }
    public interface OnItemClickListener {
        public void onClick(View view, int position);
    }
}

