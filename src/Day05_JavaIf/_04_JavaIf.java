package Day05_JavaIf;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde

        Scanner oku= new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        cumle= cumle.toLowerCase(); // bütün büyük harfler küçük oldu

        if ( cumle.contains("a") )
            System.out.println("EVET");

        if ( !cumle.contains("a") ) // !değilse  if ( cumle.contains("a")==false )
            System.out.println("HAYIR");




    }
}
