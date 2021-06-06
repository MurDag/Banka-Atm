import com.testinium.java.odev.BireyselMusteri;
import com.testinium.java.odev.KurumsalMusteri;
import com.testinium.java.odev.Musteri;
import com.testinium.java.odev.islem.GirisYap;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        BireyselMusteri bireyselMusteri1 = new BireyselMusteri("46382963765", "Murat DAĞ", "1005", 62783.67f, "Merkez/UŞAK");
        BireyselMusteri bireyselMusteri2 = new BireyselMusteri("78293876453", "Salih YILDIZ", "1004", 9832.98f, "Nizip/Gaziantep");

        KurumsalMusteri kurumsalMusteri1 = new KurumsalMusteri("78998765434", "Serap ARSLAN", "1003", 15670.00f, "Microsoft");
        KurumsalMusteri kurumsalMusteri2 = new KurumsalMusteri("65489709876", "Merve KAPLAN", "1001", 5067.45f, "Google");
        KurumsalMusteri kurumsalMusteri3 = new KurumsalMusteri("12345678901", "Adil AYDINER", "1002", 34000.5f, "Facebook");

        Map<String, Musteri> musteriMapList = new HashMap<String, Musteri>();

        musteriMapList.put(kurumsalMusteri1.getMusteriNo(), kurumsalMusteri1);
        musteriMapList.put(kurumsalMusteri2.getMusteriNo(), kurumsalMusteri2);
        musteriMapList.put(kurumsalMusteri3.getMusteriNo(), kurumsalMusteri3);

        musteriMapList.put(bireyselMusteri1.getMusteriNo(), bireyselMusteri1);
        musteriMapList.put(bireyselMusteri2.getMusteriNo(), bireyselMusteri2);

        GirisYap giris = new GirisYap();
        giris.girisYap(musteriMapList);

    }

}
