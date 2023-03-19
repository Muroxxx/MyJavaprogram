package Day20_Variables.FinalVariables;

public class Person {

    String name;

    final int ssc;  //final değişkenleri bir kere atanır daha sonradan değiştirlemez

    static int ssccounter=1;

    public Person(String name) {
        this.name = name;
        this.ssc = ssccounter++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssc=" + ssc +
                '}';

}
}



