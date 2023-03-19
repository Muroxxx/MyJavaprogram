package Day02_Basics2;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız= ");
        String ad=oku.next();

        System.out.print("Soyadınız= ");
        String soyad=oku.next();

        System.out.println("Adınız ve soyadınız= "+ad+" "+soyad);
        /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü oku

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okuma için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için

          okuyucu.nextBoolean();-> true veya false girişi için
        */


    }
}
