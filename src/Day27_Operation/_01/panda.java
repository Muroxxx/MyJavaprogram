package Day27_Operation._01;

public class panda extends ZOO{

    public panda(boolean wild, String name) {
        super(wild, name);
    }

    @Override
    void food() {
        System.out.println("vegetables");


    }

    @Override
    void foodquanity() {
        System.out.println("3kg per day");

    }

    @Override
    void sleeptime() {
        System.out.println("13 hour");

    }

    @Override
    void voice() {
        System.out.println("uuugggghhhhh");

    }
}
