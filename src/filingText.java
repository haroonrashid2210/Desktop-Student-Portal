import java.io.*;

public class filingText {

    // add text to file ------------------------------------------------------------------------------------------------
    public static void addText(String string, String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            printWriter.println(string);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // remove text from file -------------------------------------------------------------------------------------------
    public static void removeText(String string, String filename) {

        try {
            File data = new File(filename);
            File temp = new File("temp.txt");
            if (!data.exists()) data.createNewFile();
            if (!temp.exists()) temp.createNewFile();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(data));
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(temp)));

            String line = bufferedReader.readLine();

            // Writing on temp
            while (line != null) {
                if (!line.equals(string)) {
                    printWriter.println(line);
                    line = bufferedReader.readLine();
                } else line = bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.close();

            // Writing back
            bufferedReader = new BufferedReader(new FileReader(temp));
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(data)));

            line = bufferedReader.readLine();
            while (line != null) {
                printWriter.println(line);
                line = bufferedReader.readLine();
            }

            printWriter.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
