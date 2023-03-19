package Day20_Variables.StaticVariables.exmp2;

public class student {

    int id;

    String name;

    static int counter=1;

    public student(String name) {
        this.id = counter++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
