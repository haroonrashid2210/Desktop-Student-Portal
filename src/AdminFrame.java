import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class AdminFrame {

    // Heading
    private static JLabel heading = new JLabel("A D M I N");

    // Sliding panel
    private static JPanel sliding_panel = new JPanel();
    private static JPanel sliding_button = new JPanel();

    private static JButton home_button = new JButton("H O M E");
    private static JButton profile_button = new JButton("P R O F I L E");
    private static JButton student_button = new JButton("S T U D E N T");
    private static JButton faculty_button = new JButton("F A C U L T Y");
    private static JButton reports_button = new JButton("R E P O R T S");
    private static JButton logout_button = new JButton("L O G O U T");

    // Boolean page clicks
    private static boolean page_home = true;
    private static boolean page_profile = false;
    private static boolean page_student = false;
    private static boolean page_faculty = false;
    private static boolean page_reports = false;

    // Home Panel
    private static JPanel home_panel = new JPanel();

    private static JScrollPane home_faculty_scroll_pane = new JScrollPane();
    private static DefaultTableModel home_faculty_model = new DefaultTableModel();
    private static JTable home_faculty_table = new JTable(home_faculty_model);
    private static JScrollPane home_student_scroll_pane = new JScrollPane();
    private static DefaultTableModel home_student_model = new DefaultTableModel();
    private static JTable home_student_table = new JTable(home_student_model);

    private static JButton end_semester = new JButton("End Semester");

    // profile Panel
    private static JPanel profile_panel = new JPanel();
    private static JTable profile_table = new JTable(3, 2);
    private static JTextField profile_old_pass_TF = new JTextField(20);
    private static JTextField profile_new_pass_TF = new JTextField(20);
    private static JButton profile_change_button = new JButton("Change");

    // student pane
    private static JPanel student_panel = new JPanel();

    private static JTextField student_name = new JTextField();
    private static JTextField student_username = new JTextField();
    private static JTextField student_phoneNo = new JTextField();
    private static JTextField student_cnic = new JTextField();
    private static JTextField student_regNo = new JTextField();
    private static JTextField student_semester = new JTextField();

    private static JTextField student_remove_registrationNo = new JTextField();

    private static JButton student_addButton = new JButton("A D D");
    private static JButton student_removeButton = new JButton("REMOVE");

    // faculty panel
    private static JPanel faculty_panel = new JPanel();

    private static JTextField faculty_name = new JTextField();
    private static JTextField faculty_username = new JTextField();
    private static JTextField faculty_phoneNo = new JTextField();
    private static JTextField faculty_cnic = new JTextField();
    private static JTextField faculty_id = new JTextField();
    private static JTextField faculty_subject = new JTextField();

    private static JTextField faculty_remove_facultyID = new JTextField();

    private static JButton faculty_addButton = new JButton("A D D");
    private static JButton faculty_removeButton = new JButton("REMOVE");


    // reports panel
    private static JPanel reports_panel = new JPanel();

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

        profile_button.setForeground(Color.white);
        profile_button.setFocusPainted(false);
        profile_button.setBorderPainted(false);
        profile_button.setBackground(new Color(0, 0, 0, 0));
        profile_button.setBounds(1, 150, 120, 25);

        student_button.setForeground(Color.white);
        student_button.setFocusPainted(false);
        student_button.setBorderPainted(false);
        student_button.setBackground(new Color(0, 0, 0, 0));
        student_button.setBounds(1, 200, 120, 25);

        faculty_button.setForeground(Color.white);
        faculty_button.setFocusPainted(false);
        faculty_button.setBorderPainted(false);
        faculty_button.setBackground(new Color(0, 0, 0, 0));
        faculty_button.setBounds(1, 250, 120, 25);

        reports_button.setForeground(Color.white);
        reports_button.setFocusPainted(false);
        reports_button.setBorderPainted(false);
        reports_button.setBackground(new Color(0, 0, 0, 0));
        reports_button.setBounds(1, 300, 120, 25);

        logout_button.setForeground(Color.white);
        logout_button.setFocusPainted(false);
        logout_button.setBorderPainted(false);
        logout_button.setBackground(new Color(0, 0, 0, 0));
        logout_button.setBounds(1, 350, 120, 25);

        // adding buttons to sliding panels
        sliding_panel.add(home_button);
        sliding_panel.add(profile_button);
        sliding_panel.add(student_button);
        sliding_panel.add(faculty_button);
        sliding_panel.add(reports_button);
        sliding_panel.add(logout_button);

        // adding components
        Runner.Admin_Panel.add(sliding_panel);
        Runner.Admin_Panel.add(sliding_button);
    }

    private static void createHomePanel() {
        // panel
        home_panel.setBounds(137, 110, 700, 300);
        home_panel.setBackground(Runner.panel_color);
        home_panel.setLayout(null);

        // student table
        home_student_model.addColumn("Name");
        home_student_model.addColumn("Reg No");
        home_student_model.addColumn("Semester");

        home_student_table.setPreferredScrollableViewportSize(new Dimension(300, 80));
        home_student_table.setBackground(Color.white);
        home_student_table.setFillsViewportHeight(true);

        home_student_scroll_pane.setBackground(Color.white);
        home_student_table.setEnabled(false);
        home_student_scroll_pane.getViewport().add(home_student_table);
        home_student_scroll_pane.setBounds(30, 50, 300, 200);

        // End sem button
        end_semester.setForeground(Color.black);
        end_semester.setBackground(Color.white);
        end_semester.setBounds(290, 0, 120, 25);

        // faculty table
        home_faculty_model.addColumn("Name");
        home_faculty_model.addColumn("ID");
        home_faculty_model.addColumn("Subject");

        home_faculty_table.setPreferredScrollableViewportSize(new Dimension(300, 80));
        home_faculty_table.setBackground(Color.white);
        home_faculty_table.setFillsViewportHeight(true);

        home_faculty_scroll_pane.setBackground(Color.white);
        home_faculty_table.setEnabled(false);
        home_faculty_scroll_pane.getViewport().add(home_faculty_table);
        home_faculty_scroll_pane.setBounds(370, 50, 300, 200);

        // setting home panel table with elements
        FilingProfessor filingProfessor = new FilingProfessor();
        FilingStudent filingStudent = new FilingStudent();

        ArrayList<Professor> professors = filingProfessor.readAll();
        ArrayList<Student> students = filingStudent.readAll();

        for (int i = 0; i < professors.size(); i++) {
            home_faculty_model.addRow(new Object[]{professors.get(i).getName(), professors.get(i).getId(), professors.get(i).getSubject()});
        }
        for (int i = 0; i < students.size(); i++) {
            home_student_model.addRow(new Object[]{students.get(i).getName(), students.get(i).getRegistrationNumber(), students.get(i).getSemester()});
        }

        // adding to home panel
        home_panel.add(home_student_scroll_pane);
        home_panel.add(home_faculty_scroll_pane);
        home_panel.add(end_semester);

        // adding components
        Runner.Admin_Panel.add(home_panel);
    }

    private static void createProfilePanel() {
        // panel
        profile_panel.setBounds(137, 110, 700, 300);
        profile_panel.setBackground(Runner.panel_color);
        profile_panel.setLayout(null);

        // table
        profile_table.setBounds(75, 100, 300, 350);
        profile_table.setBackground(new Color(0, 0, 0, 0));
        profile_table.setEnabled(false);
        profile_table.setForeground(Color.white);
        profile_table.setRowHeight(30);

        profile_table.setValueAt("Name", 0, 0);
        profile_table.setValueAt("Contact", 1, 0);
        profile_table.setValueAt("Username", 2, 0);

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
        Runner.Admin_Panel.add(profile_panel);
    }

    public static void createFacultyPanel() {
        // panel
        faculty_panel.setBounds(137, 110, 700, 300);
        faculty_panel.setBackground(Runner.panel_color);
        faculty_panel.setLayout(null);

        // textfiels
        faculty_name.setUI(new HintTextFieldUI("Name", false));
        faculty_name.setBounds(50, 40, 150, 25);
        faculty_username.setUI(new HintTextFieldUI("Username", false));
        faculty_username.setBounds(50, 80, 150, 25);
        faculty_phoneNo.setUI(new HintTextFieldUI("Phone", false));
        faculty_phoneNo.setBounds(50, 120, 150, 25);
        faculty_cnic.setUI(new HintTextFieldUI("CNIC", false));
        faculty_cnic.setBounds(50, 160, 150, 25);
        faculty_id.setUI(new HintTextFieldUI("Faculty ID", false));
        faculty_id.setBounds(50, 200, 150, 25);
        faculty_subject.setUI(new HintTextFieldUI("Subject", false));
        faculty_subject.setBounds(50, 240, 150, 25);

        faculty_remove_facultyID.setUI(new HintTextFieldUI("Faculty ID"));
        faculty_remove_facultyID.setBounds(450, 90, 150, 25);

        // buttons
        faculty_addButton.setBackground(Color.white);
        faculty_addButton.setForeground(Color.black);
        faculty_addButton.setBounds(230, 140, 75, 25);

        faculty_removeButton.setBackground(Color.white);
        faculty_removeButton.setForeground(Color.black);
        faculty_removeButton.setBounds(477, 130, 100, 25);

        // adding to faculty panel
        faculty_panel.add(faculty_name);
        faculty_panel.add(faculty_username);
        faculty_panel.add(faculty_phoneNo);
        faculty_panel.add(faculty_cnic);
        faculty_panel.add(faculty_id);
        faculty_panel.add(faculty_subject);

        faculty_panel.add(faculty_remove_facultyID);

        faculty_panel.add(faculty_addButton);
        faculty_panel.add(faculty_removeButton);

        faculty_panel.setVisible(false);

        // adding components
        Runner.Admin_Panel.add(faculty_panel);
    }

    private static void createStudentPanel() {
        // panel
        student_panel.setBounds(137, 110, 700, 300);
        student_panel.setBackground(Runner.panel_color);
        student_panel.setLayout(null);

        // textfiels
        student_name.setUI(new HintTextFieldUI("Name", false));
        student_name.setBounds(50, 40, 150, 25);
        student_username.setUI(new HintTextFieldUI("Username", false));
        student_username.setBounds(50, 80, 150, 25);
        student_phoneNo.setUI(new HintTextFieldUI("Phone", false));
        student_phoneNo.setBounds(50, 120, 150, 25);
        student_cnic.setUI(new HintTextFieldUI("CNIC", false));
        student_cnic.setBounds(50, 160, 150, 25);
        student_regNo.setUI(new HintTextFieldUI("Registration No", false));
        student_regNo.setBounds(50, 200, 150, 25);
        student_semester.setUI(new HintTextFieldUI("Semester", false));
        student_semester.setBounds(50, 240, 150, 25);

        student_remove_registrationNo.setUI(new HintTextFieldUI("Registration No"));
        student_remove_registrationNo.setBounds(450, 90, 150, 25);

        // buttons
        student_addButton.setBackground(Color.white);
        student_addButton.setForeground(Color.black);
        student_addButton.setBounds(230, 140, 75, 25);

        student_removeButton.setBackground(Color.white);
        student_removeButton.setForeground(Color.black);
        student_removeButton.setBounds(477, 130, 100, 25);

        // adding to student panel
        student_panel.add(student_name);
        student_panel.add(student_username);
        student_panel.add(student_phoneNo);
        student_panel.add(student_cnic);
        student_panel.add(student_regNo);
        student_panel.add(student_semester);

        student_panel.add(student_remove_registrationNo);

        student_panel.add(student_addButton);
        student_panel.add(student_removeButton);

        student_panel.setVisible(false);

        // adding components
        Runner.Admin_Panel.add(student_panel);
    }

    private static void createHeading() {
        heading.setBounds(334, 35, 350, 50);
        heading.setFont(new Font("Calibri", Font.BOLD, 30));
        heading.setForeground(Color.white);
        Runner.Admin_Panel.add(heading);
    }

    public static void createFrame() {
        createStudentPanel();
        createFacultyPanel();
        createProfilePanel();
        createHeading();
        createSlidingPanel();
        createHomePanel();
        Runner.frame.add(Runner.Admin_Panel);
        Runner.frame.setVisible(false);

        actionsHover();
        actionsClicked();
        actionsTextfield();
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

        // student button
        student_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                student_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_student) student_button.setForeground(Color.yellow);
                else student_button.setForeground(Color.white);
            }
        });

        // faculty button
        faculty_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                faculty_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_faculty) faculty_button.setForeground(Color.yellow);
                else faculty_button.setForeground(Color.white);
            }
        });

        // reports button
        reports_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sliding_button.setVisible(false);
                sliding_panel.setVisible(true);
                reports_button.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sliding_panel.setVisible(false);
                sliding_button.setVisible(true);
                if (page_reports) reports_button.setForeground(Color.yellow);
                else reports_button.setForeground(Color.white);
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

        // home panel end sem
        end_semester.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // setting CGPA and GPA

                FilingStudent filingStudent = new FilingStudent();
                ArrayList<Student> students = filingStudent.readAll();

                for (int i = 0; i < students.size(); i++) {
                    students.get(i).calculateGPA();
                    students.get(i).calculateCGPA();

                    // Sending to next semester

                    if (students.get(i).getCgpa() >= 2) {
                        students.get(i).setSemester(students.get(i).getSemester() + 1);
                        students.get(i).setCourses(new Course(students.get(i).getSemester()));
                        students.get(i).setCourse_marks(null);
                    }

                }

                filingStudent.writeAll(students);

                // Removing students from previous professors class

                FilingProfessor filingProfessor = new FilingProfessor();
                ArrayList<Professor> professors = filingProfessor.readAll();

                for (int i = 0; i < professors.size(); i++) {
                    professors.get(i).setStudent(new Student[10]);
                }

                filingProfessor.writeAll(professors);

                // Adding new professors

                for (int i = 0; i < students.size(); i++) {
                    String[] courseT = students.get(i).getCourses().getCourse();

                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < professors.size(); k++) {
                            if (professors.get(k).getSubject().equals(courseT[j])) {
                                if (professors.get(k).getStudent().length <= 10) {
                                    professors.get(k).setStudent(students.get(i));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        });

        // profile change password button
        profile_change_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (profile_old_pass_TF.getText().equals(Runner.admin.getPassword())) {
                    Runner.admin.setPassword(profile_new_pass_TF.getText());
                    JOptionPane.showMessageDialog(null, " Successful !");
                } else JOptionPane.showMessageDialog(null, " wrong password !");
            }
        });

        // Addbutton in student panel
        student_addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = student_name.getText();
                String username = student_username.getText();
                String phone = student_phoneNo.getText();
                String cnic = student_cnic.getText();
                String regno = student_regNo.getText();
                String semester = student_semester.getText();

                if (name.equals("") || username.equals("") || phone.equals("") || cnic.equals("") || regno.equals("") || semester.equals("") || !check.phoneNumber(phone) || !check.cnic(cnic)) {
                    JOptionPane.showMessageDialog(null, " invalid input !");
                } else if (check.usernameMatches(username)) {
                    JOptionPane.showMessageDialog(null, " username alredy taken !");
                } else {
                    // Adding Students
                    filingText.addText(username, "username.txt");
                    FilingStudent filing = new FilingStudent();
                    Student student = new Student(name, phone, cnic, regno, username, "00000", Integer.parseInt(semester));
                    filing.add(student, "Student.ser");
                    JOptionPane.showMessageDialog(null, "Successful ✓");

                    // Finding professors
                    FilingProfessor filingProfessor = new FilingProfessor();
                    ArrayList<Professor> professors = filingProfessor.readAll();
                    String[] courseT = student.getCourses().getCourse();

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < professors.size(); j++) {
                            if (professors.get(j).getSubject().equals(courseT[i])) {
                                if (professors.get(j).getStudent().length <= 10) {
                                    professors.get(j).setStudent(student);
                                    break;
                                }
                            }
                        }
                    }

                    filingProfessor.writeAll(professors);

                    home_student_model.addRow(new Object[]{name, regno, semester});

                    student_semester.setText("");
                    student_regNo.setText("");
                    student_cnic.setText("");
                    student_name.setText("");
                    student_phoneNo.setText("");
                    student_username.setText("");
                }
            }
        });

        //remove button in student panel
        student_removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilingStudent filingObject = new FilingStudent();
                if (filingObject.remove(student_remove_registrationNo.getText())) {
                    JOptionPane.showMessageDialog(null, " Successfully removed !");
                    student_remove_registrationNo.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, " Student not found !");
                }
            }
        });

        // Faculty -----------------------------------------------------------------------------------------------------
        // Add_button
        faculty_addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = faculty_name.getText();
                String username = faculty_username.getText();
                String phone = faculty_phoneNo.getText();
                String cnic = faculty_cnic.getText();
                String id = faculty_id.getText();
                String subject = faculty_subject.getText();

                if (name.equals("") || username.equals("") || phone.equals("") || cnic.equals("") || id.equals("") || subject.equals("") || !check.phoneNumber(phone) || !check.cnic(cnic)) {
                    JOptionPane.showMessageDialog(null, " invalid input !");
                } else if (check.usernameMatches(username)) {
                    JOptionPane.showMessageDialog(null, " username already taken !");
                } else {
                    if (check.subjectIsValid(subject)) {
                        filingText.addText(username, "username.txt");
                        FilingProfessor filing = new FilingProfessor();
                        filing.add(new Professor(name, phone, cnic, username, "00000", subject, id), "Professor.ser");
                        JOptionPane.showMessageDialog(null, "Successful ✓");

                        home_faculty_model.addRow(new Object[]{name, id, subject});

                        faculty_subject.setText("");
                        faculty_id.setText("");
                        faculty_cnic.setText("");
                        faculty_name.setText("");
                        faculty_phoneNo.setText("");
                        faculty_username.setText("");
                    } else JOptionPane.showMessageDialog(null, "Invalid Subject", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // remove Button
        faculty_removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilingProfessor filingObject = new FilingProfessor();
                if (filingObject.remove(faculty_remove_facultyID.getText())) {
                    JOptionPane.showMessageDialog(null, " Successful ✓");
                    faculty_remove_facultyID.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, " faculty not found !");
                }
            }
        });


        // Home button
        home_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = true;
                page_profile = false;
                page_student = false;
                page_faculty = false;
                page_reports = false;
                pageReseter();
            }
        });

        // profile Button
        profile_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_profile = true;
                page_student = false;
                page_faculty = false;
                page_reports = false;
                pageReseter();

                // setting table content
                profile_table.setValueAt(Runner.admin.getName(), 0, 1);
                profile_table.setValueAt(Runner.admin.getPhone_no(), 1, 1);
                profile_table.setValueAt(Runner.admin.getUsername(), 2, 1);
            }
        });

        // student Button
        student_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_profile = false;
                page_student = true;
                page_faculty = false;
                page_reports = false;
                pageReseter();
            }
        });

        // faculty Button
        faculty_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_profile = false;
                page_student = false;
                page_faculty = true;
                page_reports = false;
                pageReseter();
            }
        });

        // reports Button
        reports_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page_home = false;
                page_profile = false;
                page_student = false;
                page_faculty = false;
                page_reports = true;
                pageReseter();
            }
        });

        // logout Button
        logout_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runner.Admin_Panel.setVisible(false);
                Runner.Login_Panel.setVisible(true);
            }
        });
    }

    // text field actions
    private static void actionsTextfield() {

        //Student --------------
        //student name
        student_name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (check.isInteger(e.getKeyChar()))
                    e.consume();
            }
        });

        //username
        student_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()))
                    e.consume();
            }
        });

        //phone no
        student_phoneNo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) || student_phoneNo.getText().length() > 10)
                    e.consume();
            }
        });

        //cnic
        student_cnic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) || student_cnic.getText().length() > 12)
                    e.consume();
            }
        });

        //Registration number
        student_regNo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if ((check.isInteger(e.getKeyChar()) || check.isUpperCase(e.getKeyChar()) || e.getKeyChar() == '-') && student_regNo.getText().length() < 8) {
                } else
                    e.consume();
            }
        });

        //Semester
        student_semester.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) || student_semester.getText().length() > 0 || e.getKeyChar() == '0' || e.getKeyChar() == '9')
                    e.consume();
            }
        });

        //remove student Registration number
        student_remove_registrationNo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if ((check.isInteger(e.getKeyChar()) || check.isUpperCase(e.getKeyChar()) || e.getKeyChar() == '-') && student_remove_registrationNo.getText().length() < 8) {
                } else
                    e.consume();
            }
        });

        //faculty ---------------------------------------------------------------------------------------------------

        //faculty name
        faculty_name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (check.isInteger(e.getKeyChar()))
                    e.consume();
            }
        });

        //username
        faculty_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()))
                    e.consume();
            }
        });

        //phone no
        faculty_phoneNo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) || faculty_phoneNo.getText().length() > 10)
                    e.consume();
            }
        });

        //cnic
        faculty_cnic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!check.isInteger(e.getKeyChar()) || faculty_cnic.getText().length() > 12)
                    e.consume();
            }
        });

        //ID
        faculty_id.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if ((check.isInteger(e.getKeyChar()) || check.isUpperCase(e.getKeyChar()) || check.isLowerCase(e.getKeyChar())) && faculty_id.getText().length() < 8) {
                } else
                    e.consume();
            }
        });

        //Subject
        faculty_subject.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if ((!check.isUpperCase(e.getKeyChar()) && !check.isLowerCase(e.getKeyChar()) && e.getKeyChar() != ' ') || check.isInteger(e.getKeyChar()))
                    e.consume();
            }
        });

        //remove student Registration number
        faculty_remove_facultyID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if ((check.isInteger(e.getKeyChar()) || check.isLowerCase(e.getKeyChar())) && faculty_remove_facultyID.getText().length() < 8) {
                } else
                    e.consume();
            }
        });

        // old pass text field in profile
        profile_old_pass_TF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == ' ') e.consume();
            }
        });

        // new pass text field in profile
        profile_new_pass_TF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == ' ') e.consume();
            }
        });
    }

    // Color hover reseter
    private static void pageReseter() {
        if (page_home) {
            profile_button.setForeground(Color.white);
            student_button.setForeground(Color.white);
            faculty_button.setForeground(Color.white);
            reports_button.setForeground(Color.white);

            home_panel.setVisible(true);
            profile_panel.setVisible(false);
            student_panel.setVisible(false);
            faculty_panel.setVisible(false);
            reports_panel.setVisible(false);
        } else if (page_profile) {
            home_button.setForeground(Color.white);
            student_button.setForeground(Color.white);
            faculty_button.setForeground(Color.white);
            reports_button.setForeground(Color.white);

            home_panel.setVisible(false);
            profile_panel.setVisible(true);
            student_panel.setVisible(false);
            faculty_panel.setVisible(false);
            reports_panel.setVisible(false);
        } else if (page_student) {
            profile_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            faculty_button.setForeground(Color.white);
            reports_button.setForeground(Color.white);

            home_panel.setVisible(false);
            profile_panel.setVisible(false);
            student_panel.setVisible(true);
            faculty_panel.setVisible(false);
            reports_panel.setVisible(false);
        } else if (page_faculty) {
            profile_button.setForeground(Color.white);
            student_button.setForeground(Color.white);
            home_button.setForeground(Color.white);
            reports_button.setForeground(Color.white);

            home_panel.setVisible(false);
            profile_panel.setVisible(false);
            student_panel.setVisible(false);
            faculty_panel.setVisible(true);
            reports_panel.setVisible(false);
        } else if (page_reports) {
            profile_button.setForeground(Color.white);
            student_button.setForeground(Color.white);
            faculty_button.setForeground(Color.white);
            home_button.setForeground(Color.white);

            home_panel.setVisible(false);
            profile_panel.setVisible(false);
            student_panel.setVisible(false);
            faculty_panel.setVisible(false);
            reports_panel.setVisible(true);
        }
    }
}
