package Day16_ObjectAndClass;

public class ObjectorientedClass {
    public static void main(String[] args) {

    araba mycar=new araba();
    mycar.brand="bmw";
    mycar.clour="red";
    mycar.model=3;
    mycar.enginecc=3200;

        System.out.println("mycar.brand = " + mycar.brand);
        System.out.println("mycar.clour = " + mycar.clour);
        System.out.println("mycar.model = " + mycar.model);
        System.out.println("mycar.enginecc = " + mycar.enginecc);


    }
}
class araba{
String clour;
int model;
String brand;
int enginecc;

}
