package Day29_Date__Time;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class _05_Compering_Date_Time {
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();
        LocalDate yesterday=today.minusDays(1);
        System.out.println("yerterday.getDayOfWeek() = " + yesterday.getDayOfWeek());

        LocalDate nextday=today.plusDays(1);
        System.out.println("nextday.getDayOfWeek() = " + nextday.getDayOfWeek());




    }













}
