package Day27_Operation.Exmpl;

public class kebab implements menu{


    @Override
    public String name() {
        return "grilled steak with butter";
    }

    @Override
    public double price() {
        return 29.25;
    }


    void cooktime(){
        System.out.println("needs to cook at least 35 minutes");
    }

    void addmeat(){
        System.out.println("minced meet added");
    }







}
