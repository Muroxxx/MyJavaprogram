package Day22_EnCapsulation.capsulation2;

public class car {
    private double cc;

    private int modelyear;

    private String clour;



    public car() {

    }

    public car(double cc, int modelyear, String clour) {
        this.cc = cc;
        this.modelyear = modelyear;
        this.clour = clour;

    }

    @Override
    public String toString() {
        return "car{" +
                "cc=" + cc +
                ", modelyear=" + modelyear +
                ", clour='" + clour + '\'' +
                '}';
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        if (modelyear<2023 && modelyear>1945)
        this.modelyear = modelyear;
        else System.out.println("you can only specify 2023 -1945 models");
    }

    public String getClour() {
        return clour;
    }

    public void setClour(String clour) {
        this.clour = clour;
    }
}
