import javax.swing.*;
import java.awt.*;

public class Runner {

    // Total globalization
    public static JFrame frame;
    public static Color panel_color = new Color(0, 0, 0, 125);

    // Super Panels
    public static JLabel Login_Panel = new JLabel();
    public static JLabel Student_Panel = new JLabel();
    public static JLabel Faculty_Panel = new JLabel();
    public static JLabel Admin_Panel = new JLabel();

    // Logged in Objects
    public static Admin admin = new Admin("Haroon Rashid","033********","","","");
    public static Student student = new Student("","","","","","",1);
    public static Professor professor;

    public static void main(String[] args) {

        // Creating frame
        frame = new JFrame("Desktop Portal");
        frame.setSize(1000, 500);
        frame.setResizable(false);
        frame.setLocation(180, 130);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon img = new ImageIcon((new ImageIcon("images/background.jpg")).getImage().getScaledInstance(1000, 500, Image.SCALE_SMOOTH));

        // Panel Layouts to null

        // Login
        Login_Panel = new JLabel("", img, JLabel.CENTER);
        Login_Panel.setBounds(0, 0, 1000, 500);

        Student_Panel = new JLabel("", img, JLabel.CENTER);
        Student_Panel.setBounds(0, 0, 1000, 500);
        Student_Panel.setVisible(false);

        Faculty_Panel = new JLabel("", img, JLabel.CENTER);
        Faculty_Panel.setBounds(0, 0, 1000, 500);
        Faculty_Panel.setVisible(false);

        Admin_Panel = new JLabel("", img, JLabel.CENTER);
        Admin_Panel.setBounds(0, 0, 1000, 500);
        Admin_Panel.setVisible(false);

        // Create frames
        LoginFrame.createFrame();
        StudentFrame.createFrame();
        FacultyFrame.createFrame();
        AdminFrame.createFrame();

        frame.add(Login_Panel);
        frame.setVisible(true);
    }
}
