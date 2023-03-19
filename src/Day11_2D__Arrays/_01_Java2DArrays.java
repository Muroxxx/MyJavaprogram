package Day11_2D__Arrays;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi=0;  // 1 tane sayı
        int[] dizi=new int[100];  // 100 sayı
        int[][] tumDersNotlari=new int[3][50]; // 3 satır 50 sütun

        tumDersNotlari[0][0] =80; // 2 boyutlu dizide 0.Satırın, 0.Sütununa 80 değeri atandı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]  );

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]=oku.nextInt();
    }
}
