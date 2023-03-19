package Day14_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // hafızada 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklar : sabit boyutlu
        int[][] tablo=new int[3][20]; //hafızada 60 sayı saklıyor, 3x20 şeklinde : sabit boyutlu

        // dizi lazım, ama boyutu ekledikçe artsın, sildikçe azalsın
        ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken
        ArrayList< ArrayList<Integer> > listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken


        // Hem ArrayList gibi çalışır fakat tekrar eden değerleri almaz.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada değerleri tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> herzaman içinde SIRALI şekilde tutar, kendinden sortlu
        // tüm setlerin ortak özelliği hiç TEKRAR değer bulundurmaz.


        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(32);
        hs1.add(1); // önceden eklendiği için aynısı bir daha yazmadı
        hs1.add(22); //önceden var olduğu için aynısını bir daha yazmadı
        hs1.add(-54);


        System.out.println("hs1 = " + hs1);
    }
}
