package Day08_Break_Contuniue;

import java.util.Scanner;

public class Continue2 {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        for(int i=0;i<cumle.length();i++)
        {
             if (cumle.charAt(i) == ' ')
                 continue;

            System.out.println(cumle.charAt(i));
        }
    }
}
