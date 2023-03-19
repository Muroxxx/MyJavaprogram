package Day08_Break_Contuniue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        //    BREAK ve CONTINUE
//        Döngüleri etkiler
//        if şartı ile çalışır
//        Break döngüyü kırar.
//        Continue ise sadece o adımı
//        pass geçirir.döngü devam eder


        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Bir sayı giriniz = ");
            int sayi=oku.nextInt();

            if (sayi>=6 && sayi<=10)
                continue; // çalıştığı anda kendinden sonra gelen komutları
            // pas geçirir

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }

    }
}

