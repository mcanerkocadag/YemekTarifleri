package com.example.mcaner.yemektarifleri.model;

/**
 * Created by mcaner on 13.02.2017.
 */

public class YemekModel {
    private int yemekFoto;
    private String yemekİsmi;
    private String yazar;

    public YemekModel(int yemekFoto, String yemekİsmi, String yazar) {
        this.yemekFoto = yemekFoto;
        this.yemekİsmi = yemekİsmi;
        this.yazar = yazar;
    }

    public int getYemekFoto() {
        return yemekFoto;
    }

    public String getYazar() {
        return yazar;
    }

    public String getYemekİsmi() {
        return yemekİsmi;
    }
}
