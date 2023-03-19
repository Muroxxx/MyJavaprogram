package Day14_HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class _05_EXPM {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] dizi=new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11);
        }

        System.out.println("dizi = " + Arrays.toString(dizi));


        HashSet<Integer> hs2=new HashSet<>( Arrays.asList(dizi) );
        System.out.println("hs2 = " + hs2);


    }
}
