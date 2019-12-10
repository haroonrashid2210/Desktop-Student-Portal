import java.io.Serializable;

public class Professor extends Person implements Serializable {
    private String username,password,subject,id;
    private Student[] student = new Student[10];

    public Professor(String name, String phone_no, String cnic, String username, String password, String subject,String id) {
        super(name, phone_no, cnic);
        this.username = username;
        this.password = password;
        this.subject = subject;
        this.id = id;
    }

    public Professor(Professor professor){
        this.username = professor.getUsername();
        this.password = professor.getPassword();
        this.subject = professor.getSubject();
        this.id = professor.getId();
        this.name = professor.getName();
        this.phone_no = professor.getPhone_no();
        this.cnic = professor.getCnic();
        this.student = professor.getStudent();
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        for (int i = 0 ; i < this.student.length ; i++){
            if (this.student[i]==null){
                this.student[i] = student;
                break;
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
