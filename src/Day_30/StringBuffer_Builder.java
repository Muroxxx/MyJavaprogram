package Day_30;

public class StringBuffer_Builder {
    public static void main(String[] args) {


        //append atama gerektirmeden çalışır

        StringBuilder c=new StringBuilder();
        c.append("today ");
        c.append("is ");
        c.append("very ");
        c.append("hot");

        System.out.println("c = " + c);

        c.deleteCharAt(2); //belirtelen indexdeki karakteri siler
        System.out.println("c = " + c);

        c.replace(3,5,"ww"); //belirtilen indexdeki karakterleri değiştirir
        System.out.println("c = " + c);

        c.reverse();  //stringi tersine çevirir
        System.out.println("c = " + c);

        //------------------String BUFFER------------------------------

        StringBuffer buf=new StringBuffer();
        //String builderla aynı fakat paralarl çalışan yazlılımlarda kullanılıyor



        //hız testleri
        System.out.println("---------Standart-----------");

        long start=System.currentTimeMillis();

        String test1="";
        for (int i = 0; i < 10000; i++)
            test1=test1+"apple";

        long finish=System.currentTimeMillis();

        System.out.println(" Time : " +( finish-start)+"ms");
        //2. yöntem
        // System.out.println(" Ssd " + (System.currentTimeMillis()-start)+"ms");



        System.out.println("-------------Concat--------------");

        start=System.currentTimeMillis();

        String test2="";
        for (int i = 0; i < 10000; i++)
            test1=test1.concat("apple");

        System.out.println(" Time : " +( finish-start)+"ms");



        System.out.println("--------------StringBuilder---------------");

        start=System.currentTimeMillis();

        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append("apple");
        }

        System.out.println(" Time : " +( finish-start)+"ms");

        }
        /*
        3 e kadarki işlemlerde strandart ekleme
        10 a kadarki işlemlerde concat
        10 dan fazla ise builder kullanılır
         */











}

