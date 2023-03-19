package Day29_Date__Time;

import java.time.LocalDate;
import java.time.Period;

public class _04_Period {
    public static void main(String[] args) {


        //period iki tarih arası farkı belirtir

        LocalDate birth=LocalDate.of(1998,5,10);
        LocalDate n=LocalDate.now();

        Period GAP=Period.between(birth,n);


        System.out.println("Years = " + GAP.getYears());
        System.out.println("Months = " + GAP.getMonths());
        System.out.println("Days = " + GAP.getDays());

        System.out.println(GAP.getYears() + " years old");

     //bir sayaç olarak da kullanılabilir

        LocalDate coursebegin=LocalDate.of(2022,10,31);
        Period course=Period.ofMonths(6);
        LocalDate courseend=coursebegin.plus(course);

        System.out.println("courseend = " + courseend);
        System.out.println("courseend DayOfWeek = " + courseend.getDayOfWeek());

        Period left=Period.between(LocalDate.now(),courseend);
        System.out.println("left = " + left);

























    }
}
