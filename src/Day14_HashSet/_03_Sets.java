package Day14_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        //Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek  yazdırma  --for each
        for (String eleman : renkler) { // sıra garanti değil
            System.out.println("eleman = " + eleman);
        }

        // set in kendi sırası nasıl ise onun aynısını verir
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()) // sıradaki eleman var ise
        {
            System.out.println("gosterdiği eleman = " + gosterge.next());
            // .Next gostergenin gösterdiği elemanı temsil ediyor
        }



        }
    }

