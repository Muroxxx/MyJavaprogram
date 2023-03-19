package Day23_Inheritance_Extends.exmpl3;

public class HR extends worker {

    private double compensation;

    public HR(String name, double salary, double compensation) {
        super(name, salary);
        setCompensation(compensation);
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+compensation;
    }

    public HR(String name, double salary) {
        super(name, salary);
    }







}
