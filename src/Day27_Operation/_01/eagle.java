package Day27_Operation._01;

public class eagle extends ZOO{


    public eagle(boolean wild, String name) {
        super(wild, name);
    }

    @Override
    void food() {
        System.out.println("rice and legumes");

    }

    @Override
    void foodquanity() {
        System.out.println("570g daily");

    }

    @Override
    void sleeptime() {
        System.out.println("4 hours at noon");

    }

    @Override
    void voice() {
        System.out.println("gaaaaaaaa");

    }
}
