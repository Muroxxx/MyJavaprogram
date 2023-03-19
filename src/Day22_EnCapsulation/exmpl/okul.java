package Day22_EnCapsulation.exmpl;

import java.util.ArrayList;

public class okul {

    private  String school;
    private  int quota;

    private ArrayList<student>students=new ArrayList<>();


    public okul(String school, int quota) {
        this.school = school;
        this.quota = quota;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public ArrayList<student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "okul{" +
                "school='" + school + '\'' +
                ", quota=" + quota +
                ", students=" + students +
                '}';
    }
}
