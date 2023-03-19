package Day19_AccsesModifiers._02_Protected.bir;

public class Doctor {
    protected String adi; // default ile aynı
    String bolumu; // default
    private String SicilNo;
    public String hastaneAd;

    Doctor(){ // default constructor

    }

    public Doctor(String adi)
    {
        this.adi=adi;
    }

}
