package Day05_JavaIf;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Şifreniz = ");
        String sifre=oku.nextLine();

        System.out.print("Şifreniz tekrar = ");
        String sifreTekrar=oku.nextLine();

        boolean ayniMi= sifre.equals(sifreTekrar);

        if (ayniMi == true)
            System.out.println("AYNI");

        if (ayniMi == false)
            System.out.println("DEĞİL");

        //2.yöntem
        if (sifre.equals(sifreTekrar) == true)
            System.out.println("AYNI");

        if (sifre.equals(sifreTekrar) == false)
            System.out.println("DEĞİL");

    }
}
