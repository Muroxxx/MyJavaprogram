package Day23_Inheritance_Extends.exmpl;

public class animal2 extends animalfunctions{

    public animal2(String clour, int weight, String genus) {
        super(clour, weight, genus);
    }

    @Override
    public void voice() {
        System.out.println("miavvvvvv");
    }
}
