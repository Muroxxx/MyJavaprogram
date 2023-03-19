package Day25_Interface._06;

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {

        Tesla MODELS = new Tesla(0, "2021");
        Pirus x = new Pirus(1.800, "2021");
        bus volvo = new bus(6000, "2017");

        ArrayList<Veichle> cars = new ArrayList<>();

        cars.add(x);
        cars.add(volvo);
        cars.add(MODELS);


        for (Veichle v : cars) {
            System.out.println("-------------------------");
            System.out.println(v.getClass().getSimpleName());

            System.out.println("-------------------------");
            System.out.println("v.getModel() = " + v.getModel());

            System.out.println("v.getEnginecc() = " + v.getEnginecc());



            if (v instanceof Tesla) {
                System.out.println(((Tesla) v).drive());
                System.out.println(((Tesla) v).changebattery());

            } else if (v instanceof Pirus) {
                System.out.println(((Pirus) v).drive());
                System.out.println(((Pirus) v).changebattery());
                System.out.println(((Pirus) v).changeOIL());
            } else if (v instanceof bus) {
                System.out.println(((bus) v).drive());
                System.out.println(((bus) v).adblue());
            }

        }

    }
}
