package Day25_Interface._06;

public class bus extends Veichle implements Diesel {
    public bus(double enginecc, String model) {
        super(enginecc, model);
    }

    @Override
    public String adblue() {
        return "every 30km";
    }

    @Override
    public String drive() {
        return "max 90 km per hour speed limited";
    }
}
