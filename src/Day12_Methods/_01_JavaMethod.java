package Day12_Methods;

public class _01_JavaMethod {

    // buraya metodlar yazılabilir

    public static void main(String[] args) { // ana metod, diğer metodları buradan çağıaracağız
        Math.max(5,6);  // bi şeyler verilmiş, geriye değer alınıyor
        Math.random();  // veri almıyor, sadece veri verir.


        merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.
        merhabaYaz();// fonksiyonu çağırma şekli
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

    // buraya metodlar yazılabilir
}
