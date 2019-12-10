import java.io.Serializable;

public class Course  implements Serializable {
    private String[] course = new String[5];
    public Course(int semester,boolean custom){

    }
    public Course(int semester){
        switch (semester){
            case 1:{
                course = new String[]{"AP","CAl","ICT","ENG","ISL"};
                break;
            }
            case 2:{
                course = new String[]{"MT","MC","PF","PS","DS"};
                break;
            }
            case 3:{
                course = new String[]{"DLD","ODE","OOP","CS","ITM"};
                break;
            }
            case 4:{
                course = new String[]{"MAL","LA","DS","RW","FA"};
                break;
            }
            case 5:{
                course = new String[]{"","","","",""};
                break;
            }
            case 6:{
                course = new String[]{"","","","",""};
                break;
            }
            case 7:{
                course = new String[]{"","","","",""};
                break;
            }
            case 8:{
                course = new String[]{"","","","",""};
                break;
            }
        }
    }
    public Course(){}
    public String getCourse(int index){
        return this.course[index];
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public static String[] getCourseData(int sem){
        switch (sem) {
            case 1: {
                return new String[]{"AP", "CAl", "ICT", "ENG", "ISL"};
            }
            case 2: {
                return new String[]{"MT", "MC", "PF", "PS", "DS"};
            }
            case 3: {
                return new String[]{"DLD", "ODE", "OOP", "CS", "ITM"};

            }
            case 4: {
                return new String[]{"MAL", "LA", "DS", "RW", "FA"};

            }
            case 5: {
                return new String[]{"", "", "", "", ""};

            }
            case 6: {
                return new String[]{"", "", "", "", ""};

            }
            case 7: {
                return new String[]{"", "", "", "", ""};

            }
            case 8: {
                return new String[]{"", "", "", "", ""};

            }
        }
        return null;
    }
}
