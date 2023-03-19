package Day23_Inheritance_Extends.exmpl3;

public class worker {

    private String name;
    private double salary;

    public worker(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
