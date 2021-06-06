package com.testinium.java.odev;

public class Musteri {

    String tcKimlikNo="";
    String adSoyad="";
    String musteriNo="";
    float hesapBakiyesi;

    public Musteri() {
    }

    public Musteri(String tcKimlikNo, String adSoyad, String musteriNo, float hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }


    public void hesapBilgileri(){
        System.out.println(
                "Musteri No : "+getMusteriNo()+"\n"+
                "Adı ve Soyadı :"+getAdSoyad()+"\n"+
                "TC Kimlik No: " +getTcKimlikNo() +"\n"+
                "Hesap Bakiyesi "+getHesapBakiyesi());
    }

}
