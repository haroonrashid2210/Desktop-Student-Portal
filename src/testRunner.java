import java.util.ArrayList;

public class testRunner {
    public static void main(String[] args) {
        FilingProfessor filingProfessor= new FilingProfessor();
        FilingStudent filingStudent = new FilingStudent();

        ArrayList<Professor> arrayp = filingProfessor.readAll();
        ArrayList<Student> arrays = filingStudent.readAll();

        arrayp.get(0).setStudent(arrays.get(0));
        arrayp.get(0).setStudent(arrays.get(1));
        arrayp.get(0).setStudent(arrays.get(2));

        filingProfessor.writeAll(arrayp);
    }
}
