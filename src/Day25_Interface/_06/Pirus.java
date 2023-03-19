package Day25_Interface._06;

public class Pirus extends Veichle implements Electric,Gas{

    public Pirus(double enginecc, String model) {
        super(enginecc, model);
    }

    @Override
    public String drive() {
        return "3km hybrid driving";
    }

    @Override
    public String changebattery() {
        return "lifeline";
    }


    @Override
    public String changeOIL() {
        return "every 50km";
    }
}
