package Day_30;

public class Checked_UnChecked_Exacption {
    public static void main(String[] args) {

        //Java bazı komutlarda try-catch yapmadan kullanıma izin vermiyor
        // Thread

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
