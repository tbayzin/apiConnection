package com.example.apiConnection.controller.model.dto;

public class SehirDTO {

    String sehirAdi;
    Integer sehirKodu;

    @Override
    public String toString() {
        return "SehirDTO{" +
                "sehirAdi='" + sehirAdi + '\'' +
                ", sehirKodu=" + sehirKodu +
                '}';
    }

    public String getSehirAdi() {
        return sehirAdi;
    }

    public void setSehirAdi(String sehirAdi) {
        this.sehirAdi = sehirAdi;
    }

    public Integer getSehirKodu() {
        return sehirKodu;
    }

    public void setSehirKodu(Integer sehirKodu) {
        this.sehirKodu = sehirKodu;
    }


}
