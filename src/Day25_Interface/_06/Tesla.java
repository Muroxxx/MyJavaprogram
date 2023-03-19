package Day25_Interface._06;
public class Tesla extends Veichle implements Electric {


    public Tesla(double enginecc, String model) {
        super(enginecc, model);
    }

    @Override
    public String drive() {
        return "auto dirve";
    }

    @Override
    public String changebattery() {
        return "every 9 nine years";
    }
}
