package com.testinium.java.odev.islem;

import com.testinium.java.odev.Musteri;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CekYatirİslemleri {

    Map<String, Musteri> musteriMapList = new HashMap<String, Musteri>();

    public static float yatir(String aktifMusteriNo, Map<String, Musteri> musteriMap) {

        System.out.println("Yatırılacak tutarı giriniz : ");
        Scanner x = new Scanner(System.in);
        float yatirilacakTutar = x.nextFloat();
        float bakiye = musteriMap.get(aktifMusteriNo).getHesapBakiyesi();

        if (yatirilacakTutar > 0) {
            musteriMap.get(aktifMusteriNo).setHesapBakiyesi(yatirilacakTutar + bakiye);
        } else {
            System.out.println("Lütfen Sıfırdan büyük bir pozitif değer giriniz !");
        }
        System.out.println("Güncel bakiyeniz : " + musteriMap.get(aktifMusteriNo).getHesapBakiyesi());
        return musteriMap.get(aktifMusteriNo).getHesapBakiyesi();
    }

    public static float cek(String aktifMusteriNo, Map<String, Musteri> musteriMap) {

        System.out.println("Çekilecek tutarı giriniz : ");
        Scanner x = new Scanner(System.in);

        float cekilecekTutar = x.nextFloat();
        float bakiye = musteriMap.get(aktifMusteriNo).getHesapBakiyesi();

        if (cekilecekTutar < bakiye && cekilecekTutar > 0) {
            musteriMap.get(aktifMusteriNo).setHesapBakiyesi(bakiye - cekilecekTutar);
        } else if (cekilecekTutar > bakiye) {
            System.out.println("Bakiyeniz yetersiz.");
        } else if (cekilecekTutar <= 0) {
            System.out.println("Lütfen sıfırdan büyük geçerli bir tutar giriniz.");
        }
        System.out.println("Güncel bakiyeniz : " + musteriMap.get(aktifMusteriNo).getHesapBakiyesi());
        return musteriMap.get(aktifMusteriNo).getHesapBakiyesi();
    }

}
