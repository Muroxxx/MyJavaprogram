package Day27_Operation.Exmpl;

public class susi implements menu{

    void boil(){
        System.out.println("enjoy the sea seramoni");
    }

    @Override
    public String name() {
        return "wrapped rice by somon";
    }

    @Override
    public double price() {
        return 9.9;
    }


}
