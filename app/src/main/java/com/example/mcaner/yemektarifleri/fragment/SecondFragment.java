package com.example.mcaner.yemektarifleri.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mcaner.yemektarifleri.R;
import com.example.mcaner.yemektarifleri.model.YemekModel;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    TextView randYemekIsmi;
    ImageView randImage;
    Random r=new Random();
    ArrayList<YemekModel> yemekListesi=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_second,container,false);
        randImage= (ImageView) v.findViewById(R.id.randImage);
        randYemekIsmi= (TextView) v.findViewById(R.id.randYemekIsmi);
        yemekleriGetir();
        int randSayi=(r.nextInt(10-1)+0);
        randYemekIsmi.setText(yemekListesi.get(randSayi).getYemekİsmi());
        Glide.with(getContext()).load(yemekListesi.get(randSayi).getYemekFoto()).into(randImage);
        //randYemekIsmi.setText(""+randSayi);
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
