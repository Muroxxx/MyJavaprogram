package Day22_EnCapsulation.exmpl;

import java.util.Scanner;

public class OKULmain {
    public static void main(String[] args) {

        Scanner reedInt = new Scanner(System.in);
        Scanner reedStr = new Scanner(System.in);


        okul bir=new okul("tevfik ileri",38);

        do {
            System.out.println("name =");
            String name= reedInt.nextLine();
            System.out.println("ID =");
            int ID=reedInt.nextInt();
            System.out.println("age =");
            int age=reedInt.nextInt();

            if (age<10){
                student zero=new student(713,"daff",23);
                bir.getStudents().add(zero);

            }else {
                System.out.println("age doesn't acceptable");
            }




        }while (bir.getStudents().size()<bir.getQuota());


    }
}
















