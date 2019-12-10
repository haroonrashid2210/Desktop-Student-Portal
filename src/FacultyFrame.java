import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class FacultyFrame {

    // Heading
    private static JLabel heading = new JLabel("F A C U L T Y");

    // Sliding panel
    private static JPanel sliding_panel = new JPanel();
    private static JPanel sliding_button = new JPanel();

    private static JButton home_button = new JButton("H O M E");
    private static JButton classes_button = new JButton("C L A S S");
    private static JButton profile_button = new JButton("P R O F I L E");
    private static JButton ask_button = new JButton("A S K");
    private static JButton report_button = new JButton("R E P O R T");
    private static JButton logout_button = new JButton("L O G O U T");

    // Boolean page clicks
    private static boolean page_home = true;
    private static boolean page_classes = false;
    private static boolean page_profile = false;
    private static boolean page_ask = false;
    private static boolean page_report = false;

    // Home Panel
    private static JPanel home_panel = new JPanel();
    private static JButton home_addMarks_button = new JButton("Add Marks");
    private static JRadioButton quiz_radio = new JRadioButton("Quiz");
    private static JRadioButton assignment_radio = new JRadioButton("Assignment");
    private static JRadioButton sessional1_radio = new JRadioButton("Sessional1");
    private static JRadioButton sessional2_radio = new JRadioButton("Sessional2");
    private static JRadioButton terminal_radio = new JRadioButton("Terminal");
    private static ButtonGroup buttonGroup = new ButtonGroup();

    private static JLabel[] label = new JLabel[10];
    private static JTextField[] textField = new JTextField[10];

    // classes Panel
    private static JPanel classes_panel = new JPanel();
    private static JTable classes_table = new JTable(11, 7);

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

        classes_button.setForeground(Color.white);
        classes_button.setFocusPainted(false);
        classes_button.setBorderPainted(false);
        classes_button.setBackground(new Color(0, 0, 0, 0));
        classes_button.setBounds(1, 150, 120, 25);

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
        sliding_panel.add(classes_button);
        sliding_panel.add(profile_button);
        sliding_panel.add(ask_button);
        sliding_panel.add(report_button);
        sliding_panel.add(logout_button);

        // adding components
        Runner.Faculty_Panel.add(sliding_panel);
        Runner.Faculty_Panel.add(sliding_button);
    }

    private static void createHomePanel() {
        // panel
        home_panel.setBounds(137, 110, 700, 300);
        home_panel.setBackground(Runner.panel_color);
        home_panel.setLayout(null);

        // add marks button
        home_addMarks_button.setBounds(400, 250, 100, 25);
        home_addMarks_button.setBackground(Color.white);
        home_addMarks_button.setForeground(Color.black);

        // creating textfield array
        for (int i = 0; i < label.length; i++) {
            textField[i] = new JTextField();
        }

        // setting textfield bounds and other features
        int k = 0;
        for (int i = 0; i < textField.length; i++) {
            k = k + 25;
            textField[i].setBounds(150, k, 100, 25);
            textField[i].setForeground(Color.white);
            textField[i].setForeground(Color.black);
        }

        // creating label array
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel();
        }

        // setting labels bounds and other features
        k = 0;
        for (int i = 0; i < label.length; i++) {
            k = k + 25;
            label[i].setBounds(60, k, 100, 25);
            label[i].setForeground(Color.white);
        }

        // Radio button
        quiz_radio.setBounds(400,100,100,25);
        quiz_radio.setBackground(Color.white);
        assignment_radio.setBounds(400,125,100,25);
        assignment_radio.setBackground(Color.white);
        sessional1_radio.setBounds(400,150,100,25);
        sessional1_radio.setBackground(Color.white);
        sessional2_radio.setBounds(400,175,100,25);
        sessional2_radio.setBackground(Color.white);
        terminal_radio.setBounds(400,200,100,25);
        terminal_radio.setBackground(Color.white);

        buttonGroup.add(quiz_radio);
        buttonGroup.add(assignment_radio);
        buttonGroup.add(sessional1_radio);
        buttonGroup.add(sessional2_radio);
        buttonGroup.add(terminal_radio);

        // adding to home panel
        home_panel.add(quiz_radio);
        home_panel.add(assignment_radio);
        home_panel.add(sessional1_radio);
        home_panel.add(sessional2_radio);
        home_panel.add(terminal_radio);
        home_panel.add(home_addMarks_button);

        for (int i = 0; i < label.length; i++) {
            home_panel.add(label[i]);
        }

        for (int i = 0; i < textField.length; i++) {
            home_panel.add(textField[i]);
        }

        // adding components
        Runner.Faculty_Panel.add(home_panel);
    }

    private static void createclassesPanel() {
        // panel
        classes_panel.setBounds(137, 110, 700, 300);
        classes_panel.setBackground(Runner.panel_color);
        classes_panel.setLayout(null);
        classes_panel.setVisible(false);

        // table
        classes_table.setBounds(50, 15, 600, 350);
        classes_table.setBackground(new Color(0, 0, 0, 0));
        classes_table.setEnabled(false);
        classes_table.setForeground(Color.white);
        classes_table.setRowHeight(25);

        classes_table.setValueAt("Quiz", 0, 1);
        classes_table.setValueAt("Assignment", 0, 2);
        classes_table.setValueAt("Sessional 1", 0, 3);
        classes_table.setValueAt("Sessional 2", 0, 4);
        classes_table.setValueAt("Terminal", 0, 5);
        classes_table.setValueAt("<html><b>Total</b><html>", 0, 6);

        // adding table to panel
        classes_panel.add(classes_table);

        // adding components
        Runner.Faculty_Panel.add(classes_panel);
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
        profile_table.setValueAt("Faculty ID", 1, 0);
        profile_table.setValueAt("Subject", 2, 0);
        profile_table.setValueAt("Contact", 3, 0);
        profile_table.setValueAt("CNIC", 4, 0);

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
        Runner.Faculty_Panel.add(profile_panel);
    }

    private static void createHeading() {
        heading.setBounds(334, 35, 350, 50);
        heading.setFont(new Font("Calibri", Font.BOLD, 30));
        heading.setForeground(Color.white);
        Runner.Faculty_Panel.add(heading);
    }

    public static void createFrame() {
        createProfilePanel();
        createclassesPanel();
        createHeading();
        createSlidingPanel();
        createHomePanel();
        Runner.frame.add(Runner.Faculty_Panel);
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

        // classes button
        classes_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                classes_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_classes) classes_button.setForeground(Color.yellow);
                else classes_button.setForeground(Color.white);
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
                page_classes = false;
                page_profile = false;
                page_ask = false;
                page_report = false;
                pageReseter();

                for (int i = 0; i < label.length; i++) {
                    if (Runner.professor.getStudent()[i] == null)
                        continue;
                    label[i].setText(Runner.professor.getStudent()[i].getRegistrationNumber());
                }
            }
        });

        // classes Button
        classes_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_classes = true;
                page_profile = false;
                page_ask = false;
                page_report = false;
                pageReseter();

                // setting
                int n = check.getCourseNo(Runner.professor.getSubject());
                for (int i = 0; i < 10; i++) {
                    if (Runner.professor.getStudent()[i] == null) break;
                    classes_table.setValueAt(Runner.professor.getStudent()[i].getRegistrationNumber(), i + 1, 0);

                    double c1 = Runner.professor.getStudent()[i].getCourse_marks()[n][0];
                    double c2 = Runner.professor.getStudent()[i].getCourse_marks()[n][1];
                    double c3 = Runner.professor.getStudent()[i].getCourse_marks()[n][2];
                    double c4 = Runner.professor.getStudent()[i].getCourse_marks()[n][3];
                    double c5 = Runner.professor.getStudent()[i].getCourse_marks()[n][4];
                    double total = c1 + c2 + c3 + c4 + c5;

                    classes_table.setValueAt(c1, i + 1, 1);
                    classes_table.setValueAt(c2, i + 1, 2);
                    classes_table.setValueAt(c3, i + 1, 3);
                    classes_table.setValueAt(c4, i + 1, 4);
                    classes_table.setValueAt(c5, i + 1, 5);
                    classes_table.setValueAt(total, i + 1, 6);
                }
            }
        });

        // profile Button
        profile_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_classes = false;
                page_profile = true;
                page_ask = false;
                page_report = false;
                pageReseter();

                // setting profile table
                profile_table.setValueAt(Runner.professor.getName(), 0, 1);
                profile_table.setValueAt(Runner.professor.getId(), 1, 1);
                profile_table.setValueAt(Runner.professor.getSubject(), 2, 1);
                profile_table.setValueAt(Runner.professor.getPhone_no(), 3, 1);
                profile_table.setValueAt(Runner.professor.getCnic(), 4, 1);
            }
        });

        // ask Button
        ask_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_classes = false;
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
                page_classes = false;
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
                Runner.Faculty_Panel.setVisible(false);
                Runner.Login_Panel.setVisible(true);
            }
        });

        // add marks button in home
        home_addMarks_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean correct = true;
                // whether all fields are empty or not
                for (int k = 0; k < textField.length; k++) {
                    if (textField[k].getText().equals("")) {
                        correct = false;
                    }
                    else {
                        correct = true;
                        break;
                    }
                }

                // if all fields are not empty
                if (correct) {
                    int i = 0;
                    if (quiz_radio.isSelected()) {
                        i = 0;
                    } else if (assignment_radio.isSelected()) {
                        i = 1;
                    } else if (sessional1_radio.isSelected()) {
                        i = 2;
                    } else if (sessional2_radio.isSelected()) {
                        i = 3;
                    } else if (terminal_radio.isSelected()) {
                        i = 4;
                    }

                    FilingStudent filingStudent = new FilingStudent();
                    ArrayList<Student> arrayS = filingStudent.readAll();
                    FilingProfessor filingProfessor = new FilingProfessor();
                    ArrayList<Professor> arrayP = filingProfessor.readAll();

                    // now the algo to input marks
                    int sub = check.getCourseNo(Runner.professor.getSubject());

                    for (int k = 0; k < 10; k++) {
                        if (Runner.professor.getStudent()[k] == null){
                            continue;
                        }
                        Runner.professor.getStudent()[k].setCourse_marks(sub, i, Integer.parseInt(textField[k].getText()));

                        // changing professor
                        for (int j = 0 ; j < arrayP.size() ; j ++){
                            if (arrayP.get(j).getUsername().equals(Runner.professor.getUsername())){
                                arrayP.get(j).getStudent()[k].setCourse_marks(sub, i, Integer.parseInt(textField[k].getText()));
                                filingProfessor.writeAll(arrayP);
                                break;
                            }
                        }

                        // inputting student marks
                        for (int j = 0; j < arrayS.size(); j++) {
                            if (arrayS.get(j).getUsername().equals(Runner.professor.getStudent()[k].getUsername())) {
                                Runner.professor.getStudent()[k].setCourse_marks(sub, i, Integer.parseInt(textField[k].getText()));
                                arrayS.get(j).setCourse_marks(sub, i, Integer.parseInt(textField[k].getText()));
                                filingStudent.writeAll(arrayS);
                                break;
                            }
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null," Empty fields","Error !",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // change button in profile
        profile_change_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (profile_old_pass_TF.getText().equals("") || profile_new_pass_TF.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " Please enter password");
                } else if (!profile_old_pass_TF.getText().equals(Runner.professor.getPassword())) {
                    JOptionPane.showMessageDialog(null, " wrong password");
                } else {
                    FilingProfessor filingProfessor = new FilingProfessor();
                    ArrayList<Professor> arrayList = filingProfessor.readAll();

                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i).getUsername().equals(Runner.professor.getUsername())) {
                            arrayList.get(i).setPassword(profile_new_pass_TF.getText());
                            Runner.professor.setPassword(profile_new_pass_TF.getText());

                            filingProfessor.writeAll(arrayList);
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, " Successful");

                    profile_new_pass_TF.setText("");
                    profile_old_pass_TF.setText("");
                }
            }
        });
    }

    // TextField actions
    private static void actionsTextField() {
        // Home panel --------------------------------------------------------------------------------------------------
        // textfields
        textField[0].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[1].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[2].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[3].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[4].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[5].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[6].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[7].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[8].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });
        textField[9].addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar())) e.consume();
            }
        });


        // Profile panel -----------------------------------------------------------------------------------------------
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
            classes_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(true);
            classes_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_classes) {
            home_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            classes_panel.setVisible(true);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_profile) {
            classes_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            classes_panel.setVisible(false);
            profile_panel.setVisible(true);
            ask_panel.setVisible(false);
            report_panel.setVisible(false);
        } else if (page_ask) {
            classes_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            report_button.setForeground(Color.white);

            home_panel.setVisible(false);
            classes_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(true);
            report_panel.setVisible(false);
        } else if (page_report) {
            classes_button.setForeground(Color.white);
            profile_button.setForeground(Color.white);
            ask_button.setForeground(Color.white);
            home_button.setForeground(Color.white);

            home_panel.setVisible(false);
            classes_panel.setVisible(false);
            profile_panel.setVisible(false);
            ask_panel.setVisible(false);
            report_panel.setVisible(true);
        }
    }
}
