package com.moonlight.DunkLocate;

public class SahaVerileri {
    String SahaAdi;
    String SahaIlcesi;
    int Gorsel;
    Double SahaEnlem;
    Double SahaBoylam;

    public SahaVerileri(String sahaAdi, Double sahaEnlem, Double sahaBoylam, String sahaIlcesi, int gorsel) {
        SahaAdi = sahaAdi;
        SahaIlcesi = sahaIlcesi;
        SahaEnlem = sahaEnlem;
        SahaBoylam = sahaBoylam;
        Gorsel = gorsel;
    }

    public String getSahaAdi() {
        return SahaAdi;
    }

    public void setSahaAdi(String sahaAdi) {
        SahaAdi = sahaAdi;
    }

    public String getSahaIlcesi() {
        return SahaIlcesi;
    }

    public void setSahaIlcesi(String sahaIlcesi) {
        SahaIlcesi = sahaIlcesi;
    }

    public int getGorsel(){
        return Gorsel;
    }
    public void setGorsel(int gorsel){
        Gorsel = gorsel;
    }

    public Double getSahaEnlem() {
        return SahaEnlem;
    }

    public void setSahaEnlem(Double sahaEnlem) {
        SahaEnlem = sahaEnlem;
    }

    public Double getSahaBoylam() {
        return SahaBoylam;
    }

    public void setSahaBoylam(Double sahaBoylam) {
        SahaBoylam = sahaBoylam;
    }

}


