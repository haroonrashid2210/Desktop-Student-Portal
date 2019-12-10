import java.util.ArrayList;

public class Section {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Section(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student){
        if (students.size()==10){
            return false;
        }
        else {
            students.add(student);
            return true;
        }
    }
}
