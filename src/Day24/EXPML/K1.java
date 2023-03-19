package Day24.EXPML;

public class K1 extends C1{


    public K1(String name, String department) {
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
}
