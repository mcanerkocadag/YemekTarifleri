package com.example.mcaner.yemektarifleri.model;

import java.io.Serializable;

/**
 * Created by mcaner on 14.02.2017.
 */

public class YazarModel implements Serializable {
    String yazarAdi;
    int yazarFoto;
    String yazarYil;

    public YazarModel(String yazarAdi, int yazarFoto, String yazarYil) {
        this.yazarAdi = yazarAdi;
        this.yazarFoto = yazarFoto;
        this.yazarYil = yazarYil;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public int getYazarFoto() {
        return yazarFoto;
    }

    public String getYazarYil() {
        return yazarYil;
    }
}
