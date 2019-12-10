import java.io.*;
import java.util.ArrayList;

public class FilingProfessor {

    // adding a professor to file --------------------------------------------------------------------------------------
    public void add(Professor professor, String filename) {
        try {
            boolean exits = new File(filename).exists();
            FileOutputStream fileOutputStream = new FileOutputStream(filename, true);
            ObjectOutputStream outputStream = exits ? new ObjectOutputStream(fileOutputStream) {
                @Override
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(professor);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read all professor ----------------------------------------------------------------------------------------------
    public ArrayList<Professor> readAll() {
        ArrayList<Professor> ProfessorList = new ArrayList<Professor>();
        File f = new File("Professor.ser");
        if (f.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream("Professor.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                while (fileInputStream.available() > 0) {
                    try {
                        ProfessorList.add((Professor) objectInputStream.readObject());
                    } catch (EOFException e) {
                        objectInputStream.close();
                        break;
                    }
                }
                objectInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return ProfessorList;
        } else
            return ProfessorList;
    }

    // remove a professor ----------------------------------------------------------------------------------------------
    public boolean remove(String id) {
        ArrayList<Professor> ProfessorList = readAll();
        ArrayList<Professor> UpdatedList = new ArrayList<Professor>();
        boolean found = false;
        for (int i = 0; i < ProfessorList.size(); i++) {
            if (ProfessorList.get(i).getId().equals(id)) {
                filingText.removeText(ProfessorList.get(i).getUsername(), "username.txt");
                found = true;
            } else {
                UpdatedList.add(ProfessorList.get(i));
            }
        }
        if (found) {
            writeAll(UpdatedList);
            return true;
        } else {
            return false;
        }
    }

    // write all professor list ----------------------------------------------------------------------------------------
    public void writeAll(ArrayList<Professor> ProfessorList) {
        File file = new File("Professor.ser");
        file.delete();
        try {
            boolean exits = file.exists();
            FileOutputStream fileOutputStream = new FileOutputStream("Professor.ser", true);
            ObjectOutputStream outputStream = exits ? new ObjectOutputStream(fileOutputStream) {
                @Override
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fileOutputStream);
            for (int i = 0; i < ProfessorList.size(); i++) {
                outputStream.writeObject(ProfessorList.get(i));
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
