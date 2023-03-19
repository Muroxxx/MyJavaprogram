package Day_30;

import java.util.Scanner;

public class JavaExceptionError {
    public static void main(String[] args) {


        /*
        Programın kod çalışma aşamasından önceki hatalara  "COMPOLİE ERROR, EXCEPTİON"
        Program çalışma kodu başladıkdan sonraki hatalara  "RUNTİME ERROR, EXCEPTİON"
         */

        try {
            Scanner reed=new Scanner(System.in);

            System.out.print("input1 =");
            int sa= reed.nextInt();

            System.out.print("input2 = ");
            int sd= reed.nextInt();

            int dvide=sa/sd;
            System.out.println("dvide = " + dvide);


        }catch (Exception error)
        {
            System.out.println("wrong process with =" + error.getMessage());
            System.out.println("try again");

        }

        System.out.println("ended");













    }
}
