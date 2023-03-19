package Day24.EXPML;

public class W1 extends C1{
    public W1(String name, String department) {
        super(name, department);
        setSector(sector);
    }


    private String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "W1{" +
                "sector='" + sector + '\'' +
                '}';
    }



}
