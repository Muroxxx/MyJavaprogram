package Day01_Basics;

import java.util.Scanner;

public class JavaSplit {
    public static void main(String[] args) {



        Scanner oku=new Scanner(System.in);
        System.out.print("cümle = ");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

    }
}
