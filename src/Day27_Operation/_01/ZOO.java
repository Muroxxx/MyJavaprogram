package Day27_Operation._01;

public abstract class ZOO {

    private boolean wild;
    private String name;

    final private int ID;

    abstract void food();
    abstract void foodquanity();
    abstract void sleeptime();
    abstract void voice();



    private static int IDcounter=1;

    public ZOO(boolean wild, String name) {
        setName(name);
        setWild(wild);
        this.ID=IDcounter++;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getIDcounter() {
        return IDcounter;
    }

    public static void setIDcounter(int IDcounter) {
        ZOO.IDcounter = IDcounter;
    }

    @Override
    public String toString() {

        System.out.println("foodquanity= ");foodquanity();
        System.out.println("sleeptime= ");sleeptime();
        System.out.println("voice = ");voice();
        System.out.println("food = ");food();

        return "ZOO{" +
                "wild=" + wild +
                ", name='" + name + '\'' +
                "}\n";
    }
}
