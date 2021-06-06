package com.testinium.java.odev;

public class KurumsalMusteri extends  Musteri{

    String sirketAdi="";

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, String musteriNo, float hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, musteriNo, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void hesapBilgileri() {
        System.out.println("Musteri No : " + getMusteriNo() + "\n" +
                "Adı ve Soyadı : " + getAdSoyad() + "\n" +
                "TC Kimlik No : " + getTcKimlikNo() + "\n" +
                "Şirket Adı : " + getSirketAdi() + "\n" +
                "Hesap Bakiyesi : " + getHesapBakiyesi());
    }
}
