package Day27_Operation.Exmpl;

public class shawurma implements menu{

    void addpateto(){
        System.out.println("boiled mashed potatoes added");
    }

    void barbeque(){
        System.out.println("preperad for ideal heat ");
    }


    @Override
    public String name() {
        return "hot doner";
    }

    @Override
    public double price() {
        return 16.00;
    }


}
