package Day24.EXPML;

public class C1 {

    private String name;
    private String department;

    public C1(String name, String department) {
        setDepartment(department);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
