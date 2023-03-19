package Day25_Interface._06;

public class Veichle {

    private double enginecc;
    private String model;

    public Veichle(double enginecc, String model) {
        setEnginecc(enginecc);
        setModel(model);
    }

    public double getEnginecc() {
        return enginecc;
    }

    public void setEnginecc(double enginecc) {
        this.enginecc = enginecc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Veichle{" +
                "enginecc=" + enginecc +
                ", model='" + model + '\'' +
                '}';
    }
}
