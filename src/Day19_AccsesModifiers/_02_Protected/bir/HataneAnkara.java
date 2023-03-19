package Day19_AccsesModifiers._02_Protected.bir;

public class HataneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="ismet";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Anakara Hastanesi";
        //dok1.SicilNo ,erişilemiyor

        Doctor dok2=new Doctor("Mehmet");
    }
}
