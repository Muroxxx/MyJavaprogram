package Day16_ObjectAndClass.EXMP04;

public class Ornek {


    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Hatice";
        cal1.surName ="Demir";
        cal1.age=30;

        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surName ="Gürdal";
        cal2.age=35;


        //2.Yöntem metodu ait olduğu class dan çağırıyoruz
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();


    }






}
