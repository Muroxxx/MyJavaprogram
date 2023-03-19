package Day23_Inheritance_Extends.exmpl;

public class animalfunctions { //base class burası super yada parent da isimleridir

    private String clour;
    private int weight;
    private String genus;


    public animalfunctions(String clour, int weight, String genus) {
        setClour(clour);
        setGenus(genus);
        setWeight(weight);

    }


    public String getClour() {
        return clour;
    }

    public void setClour(String clour) {
        this.clour = clour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
    public void voice(){
        System.out.println("animal making sound");
    }
}
