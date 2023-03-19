package Day23_Inheritance_Extends.exmpl;

public class animal3 extends animalfunctions {

    //burada base harici bir consruction ekledik sadece bu class a özel oldu.


    private String wingangle;


    public animal3(String clour, int weight, String genus, String wingangle ) {
        super(clour, weight, genus);
        setWingangle(wingangle);
    }

    public String getWingangle() {
        return wingangle;
    }

    public void setWingangle(String wingangle) {
        this.wingangle = wingangle;
    }

    @Override
    public void voice() {
        System.out.println("vak vak");
    }
}
