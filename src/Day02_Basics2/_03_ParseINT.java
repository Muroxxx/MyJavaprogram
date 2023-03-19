package Day02_Basics2;

public class _03_ParseINT {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.

        String donate1="500";
        String donate2="1500";

        System.out.println(donate1+donate2); // 5001500 STRİNG OLDUĞU İÇİN TOPLAMA YAPMAZ

        int sayiBagis1= Integer.parseInt(donate1);  //İNT e çevrildi
        int sayiBagis2= Integer.parseInt(donate2);

        int totaldonate=sayiBagis1+sayiBagis2;
        System.out.println("totaldonate = " + totaldonate);
    }
}
