package Day03_String;

public class _02_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir
        // karakterlerin sırası 0 dan başlar ve buna index denir.


        String cumle = "Merhaba Dünya";

        char ilkHarf = cumle.charAt(0); // 0 index deki karakteri ver
        System.out.println("ilkHarf = " + ilkHarf);



        //sondaki char gösterme
        int uzunluk=cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1);

        System.out.println("Son Harf = " + sonHarf);
    }
}
