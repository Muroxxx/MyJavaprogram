package Day03_String;

public class _03_StringIndexOf {
    public static void main(String[] args) {

        String cumle = "Merhaba Dünya";

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok

        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5)  ); //6
                        // a yı aramaya 5(dahil) nolu index ten sonra başla

    }
}
