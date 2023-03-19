package Day12_Methods;

import java.util.Arrays;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz.

        int[] dizi=new int[20]; // int dizi[]=new int[20];

        diziDoldurYazdir(dizi);
    }

    public static void diziDoldurYazdir(int[] sayilar){

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*100);
        }

        System.out.println("Sayilar = " + Arrays.toString(sayilar));

    }



}
