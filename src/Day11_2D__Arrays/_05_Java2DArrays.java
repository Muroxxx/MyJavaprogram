package Day11_2D__Arrays;

public class _05_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo= {             // 5 satır:  0,1,2,3,4
                {4,55},              // 0.Satır
                {45,6,77},           // 1.Satır
                {4,2,999,45,56,66},  // 2.Satır
                {42,12,9},           // 3.Satır
                {4}                  // 4.Satır
             };

        System.out.println("Satır miktarı="+tablo.length);
        System.out.println("0.Satırdaki sutun sayısı="+tablo[0].length);
        System.out.println("1.Satırdaki sutun sayısı="+tablo[1].length);
        System.out.println("2.Satırdaki sutun sayısı="+tablo[2].length);
        System.out.println("3.Satırdaki sutun sayısı="+tablo[3].length);
        System.out.println("4.Satırdaki sutun sayısı="+tablo[4].length);



    }
}
