import java.util.ArrayList;

public class Faculty {
    private static ArrayList<Professor> professorArrayList = new ArrayList<>();

    public static void add(Professor professor){
        professorArrayList.add(professor);
    }

    public static void remove(Professor professor){
        for (int i=0 ; i < professorArrayList.size() ; i++){
            if (professorArrayList.get(i).getName().toLowerCase().equals(professor.getName().toLowerCase())){
                professorArrayList.remove(i);
                break;
            }
        }
    }
}
