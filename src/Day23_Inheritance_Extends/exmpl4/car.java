package Day23_Inheritance_Extends.exmpl4;

public class car {
    private String clour;
    private String brand;
    private int HP;

    public car(String clour, String brand, int HP) {
        setBrand(brand);
        setClour(clour);
        setHP(HP);
    }

    public String getClour() {
        return clour;
    }

    public void setClour(String clour) {
        this.clour = clour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "car{" +
                "clour='" + clour + '\'' +
                ", brand='" + brand + '\'' +
                ", HP=" + HP +
                '}';
    }
}
