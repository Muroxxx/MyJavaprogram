package Day12_Methods;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayı=");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayı=");
        int sayi2 = oku.nextInt();

        int enb = enbBul(sayi1, sayi2);
        System.out.println("enb = " + enb);
    }

    public static int enbBul(int s1, int s2) {

        /*2.yöntem
                     return s1 > s2 ? s1 : s2;
         */


        //3.Yöntem
        if (s1 > s2)
            return s1;
        else
            return s2;
    }


}
