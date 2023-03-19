package Day07_Switch;

import java.util.Scanner;

public class _01_Switch01 {
    public static void main(String[] args) {

        Scanner reed=new Scanner(System.in);
        System.out.print("DayNo =");
        int dayno=reed.nextInt();


        switch (dayno){
            case 1:
                System.out.println("pazartesi");break;
            case 2:
                System.out.println("salı");break;
            case 3:
                System.out.println("çarşamba");break;
            case 4:
                System.out.println("perşembe");break;
            case  5:
                System.out.println("cuma");break;
            default:
                System.out.println("hatalı");


        }


    }
}
