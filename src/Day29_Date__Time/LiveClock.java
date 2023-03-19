package Day29_Date__Time;

import Utility.Func;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LiveClock {
    public static void main(String[] args) {


        DateTimeFormatter d=DateTimeFormatter.ofPattern("hh:mm:ss");

        while (true) {
            LocalTime t = LocalTime.now();
            System.out.print("\r" + t.format(d));
            Func.waittime(1);

        }






    }
}
