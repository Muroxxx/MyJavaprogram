package Day05_JavaIf;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        if (sayi > 0) {
            System.out.println("pozitif");
        }

        if (sayi < 0)
            System.out.println("negatif");

        if (sayi == 0)
            System.out.println("sıfır");

    }
}
