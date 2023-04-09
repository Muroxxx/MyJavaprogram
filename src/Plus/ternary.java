package Plus;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner reed=new Scanner(System.in);
        System.out.println("sayı girin");
        int value = reed.nextInt();
// ilkel yöntem
        if (value>=0){
            System.out.println("sayı pozitif");

        } else
            System.out.println("sayı negatif");

//ternary yöntemi
        System.out.println(value>=0 ?"sayı pozitif" : "sayı negatif");









    }
}
