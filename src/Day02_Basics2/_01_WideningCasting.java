package Day02_Basics2;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        //seçilen değer büyüjk bir değerle eşitlenebilir

        int    a = 9;
        long   b = 6700;
        double c = 3.2;

        c = a; // oran=9 , kayıp yok.
        System.out.println("c = " + c);

        b = a;  // kayıp yok, toplam=9
        System.out.println("b = " + b);


    }
}
