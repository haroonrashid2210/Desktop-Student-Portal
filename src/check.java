import java.io.*;

public class check {

    //check for string
    public static boolean isString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < '9' && string.charAt(i) > '0')
                return false;
        }
        return true;
    }

    //check for integer
    public static boolean isInteger(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > '9' || string.charAt(i) < '0')
                return false;
        }
        return true;
    }

    //check for integer char
    public static boolean isInteger(char c) {
        if (c > '9' || c < '0')
            return false;
        return true;
    }

    //check for date
    public static boolean date(String day, String month, String year) {
        if (check.isInteger(day) && check.isInteger(month) && check.isInteger(year)) {
            int d = Integer.parseInt(day);
            int m = Integer.parseInt(month);
            int y = Integer.parseInt(year);

            //check whether the year is leap year
            boolean leap = false;
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0) leap = true;
                    else leap = false;
                } else leap = true;
            } else leap = false;

            //if months are correct
            if (m > 0 && m < 13) {

                //months having 31 days
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                    if (d <= 31 && d >= 1) return true;
                    else return false;
                }

                //for feburary
                else if (m == 2) {
                    if (leap) {
                        if (d <= 29 && d >= 1)
                            return true;
                        else return false;
                    } else {
                        if (d <= 28 && d >= 1)
                            return true;
                        else return false;
                    }
                }

                //for moths having 30 days
                else {
                    if (d <= 30 && d >= 1) return true;
                    else return false;
                }
            } else return false;
        } else return false;
    }

    //check for phone number
    public static boolean phoneNumber(String string) {
        if (check.isInteger(string)) {
            if (string.length() == 11) return true;
            else return false;
        } else return false;
    }

    //check for cnic
    public static boolean cnic(String string) {
        if (check.isInteger(string)) {
            if (string.length() == 13) return true;
            else return false;
        } else return false;
    }

    //check for time12
    public static boolean time12(String sec, String min, String hour) {
        if (check.isInteger(sec) && check.isInteger(min) && check.isInteger(hour)) {
            int s = Integer.parseInt(sec);
            int m = Integer.parseInt(min);
            int h = Integer.parseInt(hour);

            //checking hour
            if (h >= 1 && h <= 12) {
                if (m >= 0 && m < 60) {
                    if (s >= 0 && s < 60) return true;
                    else return false;
                } else return false;
            } else return false;
        } else return false;
    }

    //check for time24
    public static boolean time24(String sec, String min, String hour) {
        if (check.isInteger(sec) && check.isInteger(min) && check.isInteger(hour)) {
            int s = Integer.parseInt(sec);
            int m = Integer.parseInt(min);
            int h = Integer.parseInt(hour);

            //checking hour
            if (h >= 1 && h <= 24) {
                if (m >= 0 && m < 60) {
                    if (s >= 0 && s < 60) return true;
                    else return false;
                } else return false;
            } else return false;
        } else return false;
    }

    //sort int
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    int temp = min;
                    min = array[j];
                    array[i] = min;
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //sort double
    public static double[] sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    double temp = min;
                    min = array[j];
                    array[i] = min;
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //check for space in string
    public static boolean isSpace(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                return false;
        }
        return true;
    }

    //check for space in char
    public static boolean isSpace(char c) {

        if (c == ' ')
            return false;

        return true;
    }

    //check for username equality
    public static boolean usernameMatches(String string) {
        try {
            File file = new File("username.txt");
            if (!file.exists()) file.createNewFile();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();

            while (line != null) {
                if (line.equals(string)) {
                    return true;
                }
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //check for lower case
    public static boolean isLowerCase(char c) {
        if (c >= 'a' && c <= 'z')
            return true;
        return false;
    }

    //check for Upper case
    public static boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z')
            return true;
        return false;
    }

    //char array to string
    public static boolean isPasswordEqual(char[] c, String s) {
        char[] c1 = s.toCharArray();

        if (c.length == s.length()) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] != c1[i]) {
                    return false;
                }
            }
            return true;
        } else return false;
    }

    //check for course in course array
    public static int getCourseNo(String string) {
        string = string.toUpperCase();
        if (string.equals("AP") || string.equals("DLD") || string.equals("MT")) {
            return 0;
        } else if (string.equals("CAL") || string.equals("MC") || string.equals("ODE")) {
            return 1;
        } else if (string.equals("ICT") || string.equals("PF") || string.equals("OOP")) {
            return 2;
        } else if (string.equals("ENG") || string.equals("PS") || string.equals("CS")) {
            return 3;
        } else return 4;
    }

    // check if the entered subject of professor is valid
    public static boolean subjectIsValid(String sub) {
        for (int i = 1 ; i <= 8 ; i++){
            String[] s = Course.getCourseData(i);

            for (int j = 0 ; j < s.length ; j++){
                if (s[j].equals(sub)){
                    return true;
                }
            }
        }
        return false;
    }
}