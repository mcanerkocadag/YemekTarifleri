package com.example.mcaner.yemektarifleri.model;

/**
 * Created by mcaner on 13.02.2017.
 */

public class KategoriModel {
    private String kategoriAdi;
    private int kategoriFoto;

    public KategoriModel(int kategoriFoto, String kategoriAdi) {
        this.kategoriFoto = kategoriFoto;
        this.kategoriAdi = kategoriAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public int getKategoriFoto() {
        return kategoriFoto;
    }
}
