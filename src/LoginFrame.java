import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class LoginFrame {
    // Heading
    private static JLabel heading = new JLabel("D E S K T O P   P O R T A L");

    // admin
    private static JPanel admin_panel = new JPanel();
    private static JLabel admin_heading = new JLabel("ADMIN");
    private static JButton admin_login_button = new JButton("login");
    private static JTextField admin_username_field = new JTextField(20);
    private static JPasswordField admin_password_field = new JPasswordField(20);

    // student
    private static JPanel student_panel = new JPanel();
    private static JLabel student_heading = new JLabel("STUDENT");
    private static JButton student_login_button = new JButton("login");
    private static JTextField student_username_field = new JTextField(20);
    private static JPasswordField student_password_field = new JPasswordField(20);

    // faculty
    private static JPanel faculty_panel = new JPanel();
    private static JLabel faculty_heading = new JLabel("FACULTY");
    private static JButton faculty_login_button = new JButton("login");
    private static JTextField faculty_username_field = new JTextField(20);
    private static JPasswordField faculty_password_field = new JPasswordField(20);

    // about
    private static JPanel about_panel = new JPanel();
    private static JLabel about_label = new JLabel("ABOUT");
    private static JPanel about_extend_panel = new JPanel();
    private static JLabel about_extend_label = new JLabel("<html>Developed by<br><br>Haroon Rashid<br>GitHub: haroonrashid2210</html>");

    private static void createAdminPanel() {
        // panel
        admin_panel.setBounds(80, 110, 250, 300);
        admin_panel.setLayout(null);
        admin_panel.setBackground(new Color(0, 0, 0, 125));

        // heading
        admin_heading.setFont(new Font("Arial", Font.BOLD, 18));
        admin_heading.setForeground(Color.WHITE);
        admin_heading.setBounds(95, 30, 70, 25);

        // email field
        admin_username_field.setBounds(24, 110, 200, 25);
        admin_username_field.setUI(new HintTextFieldUI(" email", false));

        // password field
        admin_password_field.setBounds(24, 150, 200, 25);

        // button
        admin_login_button.setBounds(75, 230, 100, 25);
        admin_login_button.setBackground(Color.white);

        // adding components
        admin_panel.add(admin_login_button);
        admin_panel.add(admin_heading);
        admin_panel.add(admin_username_field);
        admin_panel.add(admin_password_field);
        Runner.Login_Panel.add(admin_panel);
    }

    private static void createStudentPanel() {
        // panel
        student_panel.setBounds(365, 110, 250, 300);
        student_panel.setLayout(null);
        student_panel.setBackground(new Color(0, 0, 0, 125));

        // heading
        student_heading.setFont(new Font("Arial", Font.BOLD, 18));
        student_heading.setForeground(Color.WHITE);
        student_heading.setBounds(85, 30, 100, 25);

        // email field
        student_username_field.setBounds(24, 110, 200, 25);
        student_username_field.setUI(new HintTextFieldUI(" email", false));

        // password field
        student_password_field.setBounds(24, 150, 200, 25);

        // button
        student_login_button.setBounds(75, 230, 100, 25);
        student_login_button.setBackground(Color.white);

        // adding components
        student_panel.add(student_login_button);
        student_panel.add(student_heading);
        student_panel.add(student_username_field);
        student_panel.add(student_password_field);
        Runner.Login_Panel.add(student_panel);
    }

    private static void createFacultyPanel() {
        // panel
        faculty_panel.setBounds(650, 110, 250, 300);
        faculty_panel.setLayout(null);
        faculty_panel.setBackground(new Color(0, 0, 0, 125));

        // heading
        faculty_heading.setFont(new Font("Arial", Font.BOLD, 18));
        faculty_heading.setForeground(Color.WHITE);
        faculty_heading.setBounds(87, 30, 100, 25);

        // email field
        faculty_username_field.setBounds(24, 110, 200, 25);
        faculty_username_field.setUI(new HintTextFieldUI(" email", false));

        // password field
        faculty_password_field.setBounds(24, 150, 200, 25);

        // button
        faculty_login_button.setBounds(75, 230, 100, 25);
        faculty_login_button.setBackground(Color.white);

        // adding components
        faculty_panel.add(faculty_login_button);
        faculty_panel.add(faculty_heading);
        faculty_panel.add(faculty_username_field);
        faculty_panel.add(faculty_password_field);
        Runner.Login_Panel.add(faculty_panel);
    }

    private static void createAboutPanel() {
        // panel
        about_panel.setBounds(453, 437, 75, 25);
        about_panel.setLayout(null);
        about_panel.setBackground(new Color(0, 0, 0, 125));

        // label
        about_label.setForeground(Color.white);
        about_label.setBounds(15, 0, 50, 25);

        // adding components
        about_panel.add(about_label);
        Runner.Login_Panel.add(about_panel);
    }

    private static void createExtendedAboutPanel() {
        // panel
        about_extend_panel.setBounds(330, 110, 320, 300);
        about_extend_panel.setLayout(null);
        about_extend_panel.setBackground(new Color(0, 0, 0, 125));

        // label
        about_extend_label.setBounds(30, 50, 200, 200);
        about_extend_label.setForeground(Color.white);
        about_extend_label.setFont(new Font("Arial", Font.PLAIN, 20));

        // adding components
        about_extend_panel.setVisible(false);
        about_extend_panel.add(about_extend_label);
        Runner.Login_Panel.add(about_extend_panel);
    }

    private static void createHeading() {
        heading.setBounds(275, 35, 500, 50);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setForeground(Color.white);
        Runner.Login_Panel.add(heading);
    }

    public static void createFrame() {

        createAdminPanel();
        createHeading();
        createStudentPanel();
        createFacultyPanel();
        createAboutPanel();
        createExtendedAboutPanel();

        actionsHover();
        actionsClicked();
    }

    // actions hover
    private static void actionsHover() {
        // about panel actions
        about_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                about_panel.setBackground(new Color(0, 0, 0, 200));

                about_extend_panel.setVisible(true);
                admin_panel.setVisible(false);
                student_panel.setVisible(false);
                faculty_panel.setVisible(false);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                about_panel.setBackground(new Color(0, 0, 0, 125));

                about_extend_panel.setVisible(false);
                admin_panel.setVisible(true);
                student_panel.setVisible(true);
                faculty_panel.setVisible(true);
            }
        });


    }

    // Click actions
    private static void actionsClicked() {
        admin_login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (admin_username_field.getText().equals(Runner.admin.getUsername()) && check.isPasswordEqual(admin_password_field.getPassword(), Runner.admin.getPassword())) {
                    Runner.Login_Panel.setVisible(false);
                    Runner.Student_Panel.setVisible(false);
                    Runner.Admin_Panel.setVisible(true);
                } else JOptionPane.showMessageDialog(null, " invalid password or username");
            }
        });

        student_login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilingStudent filingStudent = new FilingStudent();
                ArrayList<Student> arrayList = filingStudent.readAll();

                boolean b = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if ((student_username_field.getText().equals(arrayList.get(i).getUsername()) && check.isPasswordEqual(student_password_field.getPassword(), arrayList.get(i).getPassword()))) {
                        Runner.student = arrayList.get(i);

                        Runner.Admin_Panel.setVisible(false);
                        Runner.Login_Panel.setVisible(false);
                        Runner.Student_Panel.setVisible(true);

                        b = false;
                    }
                }
                if (b) JOptionPane.showMessageDialog(null, " invalid password or username");
            }
        });

        faculty_login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilingProfessor filingProfessor = new FilingProfessor();
                ArrayList<Professor> arrayList = filingProfessor.readAll();

                boolean b = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (faculty_username_field.getText().equals(arrayList.get(i).getUsername()) && check.isPasswordEqual(faculty_password_field.getPassword(), arrayList.get(i).getPassword())) {
                        Runner.professor = new Professor(arrayList.get(i));

                        Runner.Admin_Panel.setVisible(false);
                        Runner.Login_Panel.setVisible(false);
                        Runner.Faculty_Panel.setVisible(true);

                        b = false;
                    }
                }
                if (b) JOptionPane.showMessageDialog(null, " invalid password or username");
            }
        });
    }

    // Text field actions
    private static void actionsTextfield() {
        // username student
        student_username_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()))
                    e.consume();
            }
        });

        // username faculty
        faculty_username_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()))
                    e.consume();
            }
        });

        // username admin
        admin_username_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()))
                    e.consume();
            }
        });

        // password student
        student_password_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') e.consume();
            }
        });

        // password admin
        admin_password_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') e.consume();
            }
        });

        // password faculty
        faculty_password_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') e.consume();
            }
        });
    }
}