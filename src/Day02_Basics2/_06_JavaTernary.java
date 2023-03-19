package Day02_Basics2;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        /*   eski yöntem
        if (sayi % 2  == 0)
            System.out.println("çift");
        else
            System.out.println("tek");
         */
// birinci ternary yöntemi

        String sonuc= (sayi % 2  == 0) ? "çift" : "tek";// ? -> if    : -> else
        System.out.println("sonuc = " + sonuc);

// ikinci ternary yöntemi
        System.out.println( ((sayi % 2  == 0) ? "çift" : "tek")  );

    }
}
