import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String registrationNumber;
    private String username, password;
    private int semester;
    private Course courses;
    private double cgpa;
    private double[] gpa = new double[8];
    private double[][] course_marks = new double[5][5];

    public Student(String name, String phone_no, String cnic, String registrationNumber, String username, String password, int semester) {
        super(name, phone_no, cnic);
        this.registrationNumber = registrationNumber;
        this.username = username;
        this.password = password;
        this.semester = semester;
        this.courses = new Course(semester);
    }

    public double[][] getCourse_marks() {
        return course_marks;
    }

    public void setCourse_marks(double[][] course_marks) {
        this.course_marks = course_marks;
    }

    public void setCourse_marks(int sub, int type, double marks) {
        if (this.course_marks[sub][type] == 0) this.course_marks[sub][type] = marks;
        else this.course_marks[sub][type] = (this.course_marks[sub][type] + marks) / 2;
    }

    public Student(Student student) {
        this.registrationNumber = student.getRegistrationNumber();
        this.username = student.getUsername();
        this.password = student.getPassword();
        this.semester = student.getSemester();
        this.courses = student.getCourses();
        this.name = student.getName();
        this.phone_no = student.getPhone_no();
        this.cnic = student.getCnic();
        this.cgpa = student.getCgpa();
        this.gpa = student.getGpa();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double[] getGpa() {
        return gpa;
    }

    public void setGpa(double[] gpa) {
        this.gpa = gpa;
    }

    public void calculateGPA() {
        // calculating
        double d = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                d += this.course_marks[i][j];
            }
            this.gpa[i] = generateGPA(d);
            d = 0;
        }
    }

    public void calculateCGPA() {
        for (int i = 0; i < this.gpa.length; i++) {
            this.cgpa += this.gpa[i];
        }
    }

    public double generateGPA(double d) {
        if (d >= 90) return 4;
        else if (d >= 85) return 3.7;
        else if (d >= 80) return 3.3;
        else if (d >= 75) return 3;
        else if (d >= 70) return 2.7;
        else if (d >= 65) return 2.3;
        else if (d >= 60) return 2;
        else return 0;
    }
}
