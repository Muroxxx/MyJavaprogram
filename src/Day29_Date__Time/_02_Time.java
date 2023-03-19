package Day29_Date__Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Time {
    public static void main(String[] args) {


        LocalTime time=LocalTime.now();
        System.out.println("time = " + time);

        System.out.println("time.getSecond() = " + time.getSecond());
        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());

        DateTimeFormatter w=DateTimeFormatter.ofPattern("HH:m a");
        System.out.println("time = " + time.format(w));


        LocalTime v=LocalTime.of(14,30,20);
        System.out.println("mytime = " + v.format(w));













    }
}
