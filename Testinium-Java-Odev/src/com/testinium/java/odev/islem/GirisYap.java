package com.testinium.java.odev.islem;

import com.testinium.java.odev.Musteri;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GirisYap {

    Map<String, Musteri> musteriMap = new HashMap<String, Musteri>();

    static String aktifMusteriNo = "";


    public void girisYap(Map<String, Musteri> musteriMapList) {

        this.musteriMap=musteriMapList;

        System.out.println("Bankamıza Hoş Geldiniz....");

        Scanner x = new Scanner(System.in);
        String musteriNumarasi = "";

        while (true) {
            System.out.println("Lütfen müşteri numarası ile giriş yapınız : ");
            musteriNumarasi = x.nextLine();

            if (musteriMap.containsKey(musteriNumarasi)) {
                System.out.println("********Giriş İşlemi Başarılı********");
                aktifMusteriNo = musteriNumarasi;
                musteriMap.get(musteriNumarasi).hesapBilgileri();
                musteriMap.get(musteriNumarasi).setMusteriNo(musteriNumarasi);
                islemYap();
            } else {
                System.out.println("Eksik yada hatalı bir Müşteri Numarası girdiniz." + "\n" + "Lütfen Tekrar Giriniz....");
            }

        }
    }

    private void islemYap() {
        boolean exit = false;

        while (exit != true) {
            islemMenusuGoster();
            System.out.println("Lütfen yapmak istediğiniz işlem numarasını giriniz :");
            Scanner y = new Scanner(System.in);
            int islemNo = y.nextInt();

            switch (islemNo) {
                case 1:
                    musteriMap.get(aktifMusteriNo).setHesapBakiyesi(CekYatirİslemleri.yatir(aktifMusteriNo,musteriMap));
                    break;
                case 2:
                    musteriMap.get(aktifMusteriNo).setHesapBakiyesi(CekYatirİslemleri.cek(aktifMusteriNo,musteriMap));
                    break;
                case 3:
                    exit = true;
                    System.out.println("Başarılı Bir Şekilde Çıkış Yapıldı");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem numarası giriniz !");
                    break;
            }

        }
    }

    private static void islemMenusuGoster() {
        System.out.println("-----------Menü-----------");
        System.out.println("1 --> Para Yatırma İşlemi \n" +
                "2 --> Para Çekme İşlemi \n" +
                "3 --> Çıkış Yap \n");
    }

}
