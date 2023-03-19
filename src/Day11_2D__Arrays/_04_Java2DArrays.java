package Day11_2D__Arrays;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[2][3];

        // burasu okuma işlemi
        for (int satir = 0; satir <2 ; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("Sayı giriniz=");
                tablo[satir][sutun]=oku.nextInt();
            }
        }

        //burası yazma işlemi
        for (int satir = 0; satir <2 ; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun]+"\t");
            }
            System.out.println();
        }


    }
}
