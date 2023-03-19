package Day22_EnCapsulation.exmpl;

public class student {

    private int ID;
    private String name;
    private int age;

    static int counterID=1;

    public student(int ID, String name, int age) {
        setAge(age);
        setName(name);
        setID(counterID++);

    }


    public int getID() {
        return ID;
    }

    public void setID(int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age ) {
    }

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

