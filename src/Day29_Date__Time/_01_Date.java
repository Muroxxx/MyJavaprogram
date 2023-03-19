package Day29_Date__Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_Date {
    public static void main(String[] args) {

        System.out.println("--------Pc based dates--------");

        LocalDate date=LocalDate.now();
        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());

        System.out.println("\n-------Ready to use formats --------");



        System.out.println("long ="+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("medium ="+ date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("short= "+ date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("FULL = " +date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n---------SPECİFİED LOCALS--------");

        System.out.println("china = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)));
        System.out.println("america = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US)));
        System.out.println("taiwan = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE)));
        System.out.println("korea = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.KOREA)));
        System.out.println("german = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        System.out.println("japan = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.JAPAN)));
        System.out.println("ıtaly = "+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY)));

        System.out.println("\n---------CUSTOMİZED LOCALS DATE--------");

        System.out.println("date = " + date);

        DateTimeFormatter w=DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("date = " + date.format(w));


        DateTimeFormatter w2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date = " + date.format(w2));

        DateTimeFormatter w3=DateTimeFormatter.ofPattern("m-h-d");
        System.out.println("date = " + date.format(w2.withLocale(Locale.UK)));

        System.out.println("\n--------setded date---------");

        LocalDate v1=LocalDate.of(1998,10,5);
        System.out.println("birth date= " + v1);
















        }





}
