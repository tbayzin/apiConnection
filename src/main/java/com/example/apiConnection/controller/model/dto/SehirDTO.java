package com.example.apiConnection.controller.model.dto;

public class SehirDTO {

   private String sehirAdi;
    private String belediyeBaskani;
    private String sehirBolgesi;
    Integer sehirKodu;
    Integer sehirNufusu;









    public String getSehirBolgesi() {
        return sehirBolgesi;
    }

    public void setSehirBolgesi(String sehirBolgesi) {
        this.sehirBolgesi = sehirBolgesi;
    }

    public Integer getSehirNufusu() {
        return sehirNufusu;
    }

    public void setSehirNufusu(Integer sehirNufusu) {
        this.sehirNufusu = sehirNufusu;
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
