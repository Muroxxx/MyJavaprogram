package Day26_Absract;

public class ford extends cauto implements auto {


    public ford(String model, int manufactureryear, String clour) {
        super(model, manufactureryear, clour);
    }


    @Override
    public int acceleration() {
        return 0;
    }


}
