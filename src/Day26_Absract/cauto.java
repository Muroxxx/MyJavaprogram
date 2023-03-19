package Day26_Absract;

public abstract class  cauto {
    //interface ve class abstract yapılarak aynı çatı altında kullanılabilir
    //yani bu kalasördeki ınterface e gerek kalmadı

    private String model;
    private int manufactureryear;

    private String clour;


    public cauto(String model, int manufactureryear, String clour) {
        setClour(clour);
        setModel(model);
        setManufactureryear(manufactureryear);

    }

    abstract int acceleration();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureryear() {
        return manufactureryear;
    }

    public void setManufactureryear(int manufactureryear) {
        this.manufactureryear = manufactureryear;
    }

    public String getClour() {
        return clour;
    }

    public void setClour(String clour) {
        this.clour = clour;
    }


    @Override
    public String toString() {
        return "cauto{" +
                "model='" + model + '\'' +
                ", manufactureryear=" + manufactureryear +
                ", clour='" + clour + '\'' +
                '}';
    }
}
