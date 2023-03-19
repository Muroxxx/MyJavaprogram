package Day03_String;

import java.util.Scanner;

public class _01_StringLength {
    public static void main(String[] args) {

        Scanner reed=new Scanner(System.in);
        System.out.print("cümle= ");
        String cumle= reed.next();

        int uzunluk=cumle.length(); // cumle nin uzunluğu : karakter sayısı

        System.out.println("cümle uzunluğu =  " + uzunluk);

    }
}
