package Day06_IfElse;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.



        Scanner oku=new Scanner(System.in);
        System.out.print("Vize=");
        double vizeNotu=oku.nextDouble();

        System.out.print("Finall=");
        double finallNotu=oku.nextDouble();

        double ort= (vizeNotu+finallNotu)/2;

        if (ort >= 60) {
            System.out.println("tebrikler geçtiniz");
        }
        else {
            System.out.println("Kaldınız");
        }

    }
}
