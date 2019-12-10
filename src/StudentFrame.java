import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class StudentFrame {

    // Heading
    private static JLabel heading = new JLabel("S T U D E N T");

    // Sliding panel
    private static JPanel sliding_panel = new JPanel();
    private static JPanel sliding_button = new JPanel();

    private static JButton home_button = new JButton("H O M E");
    private static JButton history_button = new JButton("H I S T O R Y");
    private static JButton profile_button = new JButton("P R O F I L E");
    private static JButton ask_button = new JButton("A S K");
    private static JButton report_button = new JButton("R E P O R T");
    private static JButton logout_button = new JButton("L O G O U T");

    // Boolean page clicks
    private static boolean page_home = true;
    private static boolean page_history = false;
    private static boolean page_profile = false;
    private static boolean page_ask = false;
    private static boolean page_report = false;

    // Home Panel
    private static JPanel home_panel = new JPanel();
    private static JTable home_table = new JTable(6, 6);

    // History Panel
    private static JPanel history_panel = new JPanel();
    private static JTable history_table = new JTable(9, 2);

    // Profile pane
    private static JPanel profile_panel = new JPanel();
    private static JTable profile_table = new JTable(5, 2);
    private static JTextField profile_old_pass_TF = new JTextField(20);
    private static JTextField profile_new_pass_TF = new JTextField(20);
    private static JButton profile_change_button = new JButton("Change");

    // ask panel
    private static JPanel ask_panel = new JPanel();

    // report panel
    private static JPanel report_panel = new JPanel();

    private static void createSlidingPanel() {
        // panel
        sliding_panel.setBounds(1, 0, 125, 470);
        sliding_panel.setLayout(null);
        sliding_panel.setBackground(Runner.panel_color);
        sliding_panel.setVisible(false);

        sliding_button.setBounds(0, 0, 15, 470);
        sliding_button.setBackground(Runner.panel_color);
        sliding_button.setVisible(true);

        // setting up button labels
        home_button.setForeground(Color.yellow);
        home_button.setFocusPainted(false);
        home_button.setBorderPainted(false);
        home_button.setBackground(new Color(0, 0, 0, 0));
        home_button.setBounds(1, 100, 120, 25);

        history_button.setForeground(Color.white);
        history_button.setFocusPainted(false);
        history_button.setBorderPainted(false);
        history_button.setBackground(new Color(0, 0, 0, 0));
        history_button.setBounds(1, 150, 120, 25);

        profile_button.setForeground(Color.white);
        profile_button.setFocusPainted(false);
        profile_button.setBorderPainted(false);
        profile_button.setBackground(new Color(0, 0, 0, 0));
        profile_button.setBounds(1, 200, 120, 25);

        ask_button.setForeground(Color.white);
        ask_button.setFocusPainted(false);
        ask_button.setBorderPainted(false);
        ask_button.setBackground(new Color(0, 0, 0, 0));
        ask_button.setBounds(1, 250, 120, 25);

        report_button.setForeground(Color.white);
        report_button.setFocusPainted(false);
        report_button.setBorderPainted(false);
        report_button.setBackground(new Color(0, 0, 0, 0));
        report_button.setBounds(1, 300, 120, 25);

        logout_button.setForeground(Color.white);
        logout_button.setFocusPainted(false);
        logout_button.setBorderPainted(false);
        logout_button.setBackground(new Color(0, 0, 0, 0));
        logout_button.setBounds(1, 350, 120, 25);

        // adding buttons to sliding panels
        sliding_panel.add(home_button);
        sliding_panel.add(history_button);
        sliding_panel.add(profile_button);
        sliding_panel.add(ask_button);
        sliding_panel.add(report_button);
        sliding_panel.add(logout_button);

        // adding components
        Runner.Student_Panel.add(sliding_panel);
        Runner.Student_Panel.add(sliding_button);
    }

    private static void createHomePanel() {
        // panel
        home_panel.setBounds(137, 110, 700, 300);
        home_panel.setBackground(Runner.panel_color);
        home_panel.setLayout(null);

        // table
        home_table.setBounds(100, 50, 500, 350);
        home_table.setBackground(new Color(0, 0, 0, 0));
        home_table.setEnabled(false);
        home_table.setForeground(Color.white);
        home_table.setRowHeight(30);

        home_table.setValueAt("Quiz", 0, 1);
        home_table.setValueAt("Assignment", 0, 2);
        home_table.setValueAt("Sessional 1", 0, 3);
        home_table.setValueAt("Sessional 2", 0, 4);
        home_table.setValueAt("Total", 0, 5);

        // adding table to panel
        home_panel.add(home_table);

        // adding components
        Runner.Student_Panel.add(home_panel);
    }

    private static void createHistoryPanel() {
        // panel
        history_panel.setBounds(137, 110, 700, 300);
        history_panel.setBackground(Runner.panel_color);
        history_panel.setLayout(null);
        history_panel.setVisible(false);

        // table
        history_table.setBounds(50, 15, 600, 350);
        history_table.setBackground(new Color(0, 0, 0, 0));
        history_table.setEnabled(false);
        history_table.setForeground(Color.white);
        history_table.setRowHeight(30);

        history_table.setValueAt("Semester 1", 1, 0);
        history_table.setValueAt("Semester 2", 2, 0);
        history_table.setValueAt("Semester 3", 3, 0);
        history_table.setValueAt("Semester 4", 4, 0);
        history_table.setValueAt("Semester 5", 5, 0);
        history_table.setValueAt("Semester 6", 6, 0);
        history_table.setValueAt("Semester 7", 7, 0);
        history_table.setValueAt("Semester 8", 8, 0);

        history_table.setValueAt("GPA", 0, 1);

        // adding table to panel
        history_panel.add(history_table);

        // adding components
        Runner.Student_Panel.add(history_panel);
    }

    public static void createProfilePanel() {
        // panel
        profile_panel.setBounds(137, 110, 700, 300);
        profile_panel.setBackground(Runner.panel_color);
        profile_panel.setLayout(null);

        // table
        profile_table.setBounds(75, 75, 300, 350);
        profile_table.setBackground(new Color(0, 0, 0, 0));
        profile_table.setEnabled(false);
        profile_table.setForeground(Color.white);
        profile_table.setRowHeight(30);

        profile_table.setValueAt("Name", 0, 0);
        profile_table.setValueAt("Reg no", 1, 0);
        profile_table.setValueAt("CGPA", 2, 0);
        profile_table.setValueAt("Contact", 3, 0);
        profile_table.setValueAt("Semester", 4, 0);

        //  Password change side
        profile_old_pass_TF.setUI(new HintTextFieldUI(" Enter old password", false));
        profile_old_pass_TF.setBounds(435, 100, 200, 25);

        profile_new_pass_TF.setUI(new HintTextFieldUI(" Enter new password", false));
        profile_new_pass_TF.setBounds(435, 135, 200, 25);

        profile_change_button.setForeground(Color.black);
        profile_change_button.setFocusPainted(false);
        profile_change_button.setBorderPainted(false);
        profile_change_button.setBackground(Color.white);
        profile_change_button.setBounds(435, 180, 80, 25);

        // adding to panel
        profile_panel.add(profile_change_button);
        profile_panel.add(profile_table);
        profile_panel.add(profile_old_pass_TF);
        profile_panel.add(profile_new_pass_TF);
        profile_panel.add(profile_table);
        profile_panel.setVisible(false);

        // adding components
        Runner.Student_Panel.add(profile_panel);
    }

    private static void createHeading() {
        heading.setBounds(334, 35, 350, 50);
        heading.setFont(new Font("Calibri", Font.BOLD, 30));
        heading.setForeground(Color.white);
        Runner.Student_Panel.add(heading);
    }

    public static void createFrame() {
        createProfilePanel();
        createHistoryPanel();
        createHeading();
        createSlidingPanel();
        createHomePanel();
        Runner.frame.add(Runner.Student_Panel);
        Runner.frame.setVisible(false);

        actionsHover();
        actionsClicked();
        actionsTextField();
    }

    // Hover actions
    private static void actionsHover() {
        // sliding button actions
        sliding_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
            }
        });

        // sliding panel actions
        sliding_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
            }
        });

        // Side panel button hover actios
        // Home button
        home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                home_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_home) home_button.setForeground(Color.yellow);
                else home_button.setForeground(Color.white);
            }
        });

        // history button
        history_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                history_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_history) history_button.setForeground(Color.yellow);
                else history_button.setForeground(Color.white);
            }
        });

        // profile button
        profile_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                profile_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_profile) profile_button.setForeground(Color.yellow);
                else profile_button.setForeground(Color.white);
            }
        });

        // ask button
        ask_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                ask_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_ask) ask_button.setForeground(Color.yellow);
                else ask_button.setForeground(Color.white);
            }
        });

        // report button
        report_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                report_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_report) report_button.setForeground(Color.yellow);
                else report_button.setForeground(Color.white);
            }
        });

        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                logout_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                logout_button.setForeground(Color.white);
            }
        });

        // profile change pass button
        profile_change_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                profile_change_button.setForeground(Color.cyan);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                profile_change_button.setForeground(Color.black);
            }
        });
    }

    // Click actions
    private static void actionsClicked() {
        // Home button
        home_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = true;
                page_history = false;
                page_profile = false;
                page_ask = false;
                page_report = false;
                pageReseter();

                home_table.setValueAt(Runner.student.getCourses().getCourse(0), 1, 0);
                home_table.setValueAt(Runner.student.getCourses().getCourse(1), 2, 0);
                home_table.setValueAt(Runner.student.getCourses().getCourse(2), 3, 0);
                home_table.setValueAt(Runner.student.getCourses().getCourse(3), 4, 0);
                home_table.setValueAt(Runner.student.getCourses().getCourse(4), 5, 0);

                // setting marks
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        home_table.setValueAt(Runner.student.getCourse_marks()[i][j], i + 1, j + 1);
                    }
                }
                ////////////////////////////
                // studemt marks are not shown properly

                double marks;
                for (int i = 0; i < 5; i++) {
                    marks = 0;
                    for (int j = 0; j < 4; j++) {
                        marks += Runner.student.getCourse_marks()[i][j];
                    }
                    home_table.setValueAt(marks, i + 1, 5);
                    marks = 0;
                }
            }
        });

        // History Button
        history_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_history = true;
                page_profile = false;
                page_ask = false;
                page_report = false;
                pageReseter();

                // setting history table
                for (int r = 0; r < 8; r++) {
                    history_table.setValueAt(Runner.student.getGpa()[r], r + 1, 1);
                }
            }
        });

        // profile Button
        profile_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_history = false;
                page_profile = true;
                page_ask = false;
                page_report = false;
                pageReseter();

                profile_table.setValueAt(Runner.student.getName(), 0, 1);
                profile_table.setValueAt(Runner.student.getRegistrationNumber(), 1, 1);
                profile_table.setValueAt(Runner.student.getCgpa(), 2, 1);
                profile_table.setValueAt(Runner.student.getPhone_no(), 3, 1);
                profile_table.setValueAt(Runner.student.getSemester(), 4, 1);
            }
        });

        // ask Button
        ask_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_history = false;
                page_profile = false;
                page_ask = true;
                page_report = false;
                pageReseter();
            }
        });

        // report Button
        report_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_history = false;
                page_profile = false;
                page_ask = false;
                page_report = true;
                pageReseter();
            }
        });

        // logout Button
        logout_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runner.Student_Panel.setVisible(false);
                Runner.Login_Panel.setVisible(true);
            }
        });

        //change pass button in profile frame
        profile_change_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (profile_old_pass_TF.getText().equals("") || profile_new_pass_TF.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " Please enter password");
                } else if (!profile_old_pass_TF.getText().equals(Runner.student.getPassword())) {
                    JOptionPane.showMessageDialog(null, " Invalid password");
                } else {
                    FilingStudent filingStudent = new FilingStudent();
                    ArrayList<Student> arrayList = filingStudent.readAll();

                    for (int i = 0; i < arrayList.size(); i++) {
                        if (Runner.student.getUsername().equals(arrayList.get(i).getUsername())) {
                            arrayList.get(i).setPassword(profile_new_pass_TF.getText());
                            Runner.student = new Student(arrayList.get(i));

                            filingStudent.writeAll(arrayList);
                            break;
                        }
                    }

                    JOptionPane.showMessageDialog(null, " Password changed");
                    profile_old_pass_TF.setText("");
                    profile_new_pass_TF.setText("");
                }
            }
        });
    }

    // TextField actions
    private static void actionsTextField() {
        // old pass text field
        profile_old_pass_TF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    e.consume();
                }
            }
        });

        // new pass text field
        profile_new_pass_TF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    e.consume();
                }
            }
        });
    }

    // Color hover reseter
    private static void pageReseter() {
        if (page_home) {
            history_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(true);
            history_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_history) {
            home_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            history_panel.setVisible(true);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_profile) {
            history_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            history_panel.setVisible(false);
            profile_panel.setVisible(true);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_ask) {
            history_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            history_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(true);
            report_panel.setVisible(false);
        } else if (page_report) {
            history_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            home_button.setForeground(Color.white);

            home_panel.setVisible(false);
            history_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(true);
        }
    }
}
