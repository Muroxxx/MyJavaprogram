package Day_30;

import java.util.Scanner;

public class ThrowEXAMPL {
    public static void main(String[] args) {

        Scanner reed=new Scanner(System.in);

        System.out.println("password you created = ");
        String newpassword= reed.nextLine();

        try {
            if (newpassword.length()>5)
                throw new Exception("must be below at 5");


        }catch (Exception eror)
        {
            System.out.println("enter different value");
            System.out.println(" " + eror.getMessage());
        }















    }
}
