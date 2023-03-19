package Day27_Operation.Exmpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        List<menu>orders=new ArrayList<>();
        Scanner reed=new Scanner(System.in);

        int choise=0;

        do {
             menu();
            choise= reed.nextInt();


            switch (choise){

            case 1:menu speacial=new kebab();
            orders.add(speacial);
            break;

            case 2:menu fastfood=new shawurma();
            orders.add(fastfood);
            break;

            case 3:menu vegetable=new susi();
            orders.add(vegetable);
            break;

        }

        }while (choise<4);

         System.out.println("active orders");
        for (menu m:orders){
            System.out.println(m.getClass().getSimpleName());
        }

        System.out.println("prepering....\n");

        double totalbill=0;
        for (menu m2:orders) {
            deciption.Deciption(m2);
            totalbill+=m2.price();

        }
        System.out.println("totalbill = " + totalbill);





    }
    public static void menu(){
        System.out.println("\n********MENU*********" +
                "\n1-- kebap  (29.20$)" +
                "\n2-- shawurma  (29.20$)" +
                "\n3-- susi  (29.20$)"+
                "\n4 done");


    }
}
