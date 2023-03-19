package Day13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_EXMP {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
        // yazdırınız.

        Scanner oku = new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı=");
            dizi[i]=oku.nextInt();
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]  %2 !=0)
                tekler.add(  dizi[i]  );
        }

        System.out.println("tekler = " + tekler);



    }
}
