package Day09_Loop;

public class _08_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        // döngünü kaç kere döneceği belli olmayan durumlarda kullanacağız
        int i=1;
        while (i<=5)
        {
            System.out.println("while_i = " + i);
            i++;
        }

        System.out.println();

        for(i=1; i<=5; i++) {
            System.out.println("for_i = " + i);
        }

    }
}
