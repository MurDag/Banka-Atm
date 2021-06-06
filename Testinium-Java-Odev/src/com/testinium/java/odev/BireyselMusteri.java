package com.testinium.java.odev;

public class BireyselMusteri extends Musteri {
    String evAdresi="";

    public BireyselMusteri(String tcKimlikNo, String adSoyad, String musteriNo, float hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, musteriNo, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void hesapBilgileri() {
        System.out.println("Musteri No : " + getMusteriNo() + "\n" +
                "Adı ve Soyadı : " + getAdSoyad() + "\n" +
                "TC Kimlik No : " + getTcKimlikNo() + "\n" +
                "Ev Adresi : " + getEvAdresi() + "\n" +
                "Hesap Bakiyesi : " + getHesapBakiyesi());
    }
}
