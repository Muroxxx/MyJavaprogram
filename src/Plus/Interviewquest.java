package Plus;

import java.util.Scanner;

public class Interviewquest {
    public static void main(String[] args) {

        //email uygunluk koşullarrı
        // "@" işareti bulundurmalı
        // "@" işareti öncesinde en az 2 karakter olmalı
        // "@" ile .com arasında en az bir karakter olmalı

        Scanner reed=new Scanner(System.in);
        System.out.println("enter mail adaress");
        String email= reed.next();

        if (email.endsWith(".com")&& email.contains("@")&& email.substring(0,email.indexOf("@")).length()>0)
            System.out.println("e mail adress confirmed");


        else
            System.out.println("your mail address does not contain specific requirements");

















    }
}
