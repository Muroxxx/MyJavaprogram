package Day06_IfElse;

import java.util.Scanner;

public class _00_ifelse {
    public static void main(String[] args) {

        //  &&  ve
        //  ||  veya

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

       // hem tek hem pozitif  -> sayi%2==1 && sayi > 0

       if ( sayi%2==1 && sayi>0  ) {
           System.out.println("uygun sayı girildi");
       }
       else {
           System.out.println("uygun sayı GİRİLMEDİ");
       }


    }
}
