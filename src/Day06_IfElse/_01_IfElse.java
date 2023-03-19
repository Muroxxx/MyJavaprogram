package Day06_IfElse;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot= oku.nextInt();


        if (ogrNot >= 50) { // herzaman tek bir kontrol yapar
            System.out.println("Geçtiniz");  // evet
            System.out.println("tebrikler");
        }
        else {  // değilse yapılacaklar
            System.out.println("Kaldınız");  //hayır
        }

    }
}
