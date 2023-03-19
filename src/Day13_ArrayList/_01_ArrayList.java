package Day13_ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe arta, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Metin");
        isimler.add("Hacer");
        isimler.add("Aynur");


        isimler.add(1,"Muhammed");// verılen ındex e ekliyor
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexdeki elemanı değiştirir
        System.out.println("isimler = " + isimler);


        isimler.remove("Metin"); // seçilen değeri kaldırır
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler = " + isimler);

        int indexOfAynur= isimler.indexOf("Aynur");  //istenilen değerin indexini verir
        System.out.println("indexOfAynur = " + indexOfAynur);

        String ilkEleman=isimler.get(0); // verilen indexdeki değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her şeyi temizliyor
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Metin");
        System.out.println("varMi = " + varMi);

    }


}
