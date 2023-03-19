package Day01_Basics;

public class _EscapeCharacters {
    public static void main(String[] args) {
       // Escape Characters
       //  \n  | yeni satır açıyor, alt satıra geçiyor
       //  \t  | sanki tab tuşuna basılmış gibi boşluk veriyor
       //  \"  | " tırnak yazmak için kullanılıyor
       //  \\  |  ekrana / yazar
        


        System.out.println("Merhaba\nDünya");  // Merhaba alt satıra geçer Dünya
        System.out.println("Merhaba\tDünya");  // Merhaba   Dünya
        System.out.println("Merhaba\"Dünya");  // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");  // Merhaba\Dünya

    }
}
