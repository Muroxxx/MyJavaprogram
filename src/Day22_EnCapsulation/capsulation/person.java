package Day22_EnCapsulation.capsulation;

public class person {

    private String name;

    private int age;

    void addage(int age){

        if (age>0  &&  age<150)
            this.age=age;
        else
            System.out.println("this age not accepteaple");
    }
    int showage(){
        return this.age;
    }

    void addname(String name){
        if (name.length()<25)
            this.name=name;
        else
            System.out.println("yhis name not accepteaple");
    }

    String showname(){
        return this.name;
    }


    @Override
    public String toString() {
        return "exmp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
