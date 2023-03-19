package Day20_Variables.StaticVariables.exmp1;

public class student {

    String name;
    static int number=713;  //sadece bir adedi tüm isteyen değişkenleri besliyor

    public student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                "number='" + number + '\'' +
                '}';
    }
}
