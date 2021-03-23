package com.example.covid19;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    private List<Provinsi> provinsiku;
    private List<Jenkel> jenkelnya;
    private List<Umur> umurnya;

    public Data(List<Provinsi> provinsiku, List<Jenkel> jenkelnya, List<Umur> umurnya) {
        this.provinsiku = provinsiku;
        this.jenkelnya = jenkelnya;
        this.umurnya = umurnya;
    }

    public List<Provinsi> getProvinsiku() {
        return provinsiku;
    }

    public void setProvinsiku(List<Provinsi> provinsiku) {
        this.provinsiku = provinsiku;
    }

    public List<Jenkel> getJenkelnya() {
        return jenkelnya;
    }

    public void setJenkelnya(List<Jenkel> jenkelnya) {
        this.jenkelnya = jenkelnya;
    }

    public List<Umur> getUmurnya() {
        return umurnya;
    }

    public void setUmurnya(List<Umur> umurnya) {
        this.umurnya = umurnya;
    }


}
