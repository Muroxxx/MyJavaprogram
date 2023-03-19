package Day29_Date__Time;

import java.util.Scanner;

public class _06_timemills {
    public static void main(String[] args) {
      //  kodun çalışma süresini başlatır
        long start=System.currentTimeMillis();
        Scanner reed=new Scanner(System.in);
        System.out.println("enter date");
        String date= reed.nextLine();



        System.out.println("date = " + date);

        long finish=System.currentTimeMillis();
        System.out.println("finish = " + (finish-start)+"sn");


    }
}
