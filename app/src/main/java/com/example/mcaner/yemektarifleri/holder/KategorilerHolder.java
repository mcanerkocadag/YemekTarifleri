package com.example.mcaner.yemektarifleri.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mcaner.yemektarifleri.R;

/**
 * Created by mcaner on 13.02.2017.
 */

public class KategorilerHolder extends RecyclerView.ViewHolder {
    public ImageView kategoriFoto;
    public TextView kategoriAdi;

    public KategorilerHolder(View itemView) {

        super(itemView);
        kategoriAdi= (TextView) itemView.findViewById(R.id.kategoriAdi);
        kategoriFoto= (ImageView) itemView.findViewById(R.id.kategoriFoto);

    }

}
