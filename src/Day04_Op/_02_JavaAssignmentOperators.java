package Day04_Op;

public class _02_JavaAssignmentOperators {
    public static void main(String[] args) {

         int a=10;

        a+=5;
        // a nın artış miktarı 5 dir .
        System.out.println("a = " + a);

        int b=10;
        b-=5;
        // b nin azaliş miktarı 5 dir.
        System.out.println("b = " + b);

        int c=10;

        c/=5;
        // c nin bölen değer 5 dir.
        System.out.println("c = " + c);

        int d=10;
        //d=d*5;   // 50
        d*=5;
        System.out.println("d = " + d);
    }
}
