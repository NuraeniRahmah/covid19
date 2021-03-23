package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.List;

public class Provinsi implements Serializable {
    private String key;
    private int doc_count;
    private int jumlah_kasus;
    private int jumlah_sembuh;
    private int jumlah_meninggal;
    private int jumlah_dirawat;
    private List<Jenkel> jenkelnya;

    public Provinsi(String key, int doc_count, int jumlah_kasus, int jumlah_sembuh, int jumlah_meninggal, int jumlah_dirawat, List<Jenkel> jenkelnya) {
        this.key = key;
        this.doc_count = doc_count;
        this.jumlah_kasus = jumlah_kasus;
        this.jumlah_sembuh = jumlah_sembuh;
        this.jumlah_meninggal = jumlah_meninggal;
        this.jumlah_dirawat = jumlah_dirawat;
        this.jenkelnya = jenkelnya;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(int doc_count) {
        this.doc_count = doc_count;
    }

    public int getJumlah_kasus() {
        return jumlah_kasus;
    }

    public void setJumlah_kasus(int jumlah_kasus) {
        this.jumlah_kasus = jumlah_kasus;
    }

    public int getJumlah_sembuh() {
        return jumlah_sembuh;
    }

    public void setJumlah_sembuh(int jumlah_sembuh) {
        this.jumlah_sembuh = jumlah_sembuh;
    }

    public int getJumlah_meninggal() {
        return jumlah_meninggal;
    }

    public void setJumlah_meninggal(int jumlah_meninggal) {
        this.jumlah_meninggal = jumlah_meninggal;
    }

    public int getJumlah_dirawat() {
        return jumlah_dirawat;
    }

    public void setJumlah_dirawat(int jumlah_dirawat) {
        this.jumlah_dirawat = jumlah_dirawat;
    }

    public List<Jenkel> getJenkelnya() {
        return jenkelnya;
    }

    public void setJenkelnya(List<Jenkel> jenkelnya) {
        this.jenkelnya = jenkelnya;
    }
}
