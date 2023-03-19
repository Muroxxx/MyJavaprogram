package Day12_Methods;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;

        int sonuc1=topla(s1,s2);
        int sonuc2=topla(s1,s2,s3);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);

        String ad="mf";
        String soyad="e";
        String sonuc3=topla(ad,soyad);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

    }

    public static int topla(int s1,int s2){
        return s1+s2;
    }


    public static int topla(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static String topla(String ad, String soyad){
        return ad+" "+soyad;
    }

}
