package Day_30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch2 {
    public static void main(String[] args) {

        try {
            Scanner reed = new Scanner(System.in);

            System.out.print("input1 =");
            int sa= reed.nextInt();

            System.out.print("input2 = ");
            int sd= reed.nextInt();

            int dvide=sa/sd;
            System.out.println("divide = " + dvide);


            //istenilen kadar belşirlenmiş hata karşıı oluşturulabilir
        }catch (InputMismatchException eror){  //BELİRLİ HATAYA ÖZEL MESAJ
            System.out.println("enter value before get start");
        }catch (ArithmeticException eror){  //MATEMERAK HATASINA ÖZEL MESAJ
            System.out.println("zero divide eror");
        }catch (Exception eror){  //BELİRLENMİŞ HATALAR DIŞINDA OLUŞAN DURUMLAR İÇİN
            System.out.println("ERROR = " + eror.getMessage());
        }

    }
}
