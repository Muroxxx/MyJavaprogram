package Day19_AccsesModifiers._01_ClassErisimleri.Package_2;

import Day19_AccsesModifiers._01_ClassErisimleri.Package_1.Public;

public class OtherPackage {
    public static void main(String[] args) {
        Public pe=new Public();
        //DefaultErisim de=new DefaultErisim();
        // diger paketlerden default belirtecli class a
        // erişilemez.yanlızca kendi paketindekiler erişebilir
    }
}
