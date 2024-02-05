package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class GUIAssignment2 extends JFrame {
    private Container c;
    private JLabel title;
    private JTextField firstname;
    private JTextField  secondname;
    private JTextField  Email;
    private JTextField  Password;
    private JTextField  ConfirmPassword;
    private JPanel B;
    private JRadioButton rbutton;
    private JLabel termsandconditions;

    public GUIAssignment2() {
        setTitle("SignUp Form");
        setBounds(100, 100, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#AAAADD"));

        c = getContentPane();
        c.setLayout(null);

        B = new JPanel();
        B.setLayout(null);
        B.setBackground(Color.decode("#6F6AB2"));
        B.setBounds(40, 30, 800, 600);

        title = new JLabel("Sign Up");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setSize(300, 40);
        title.setLocation(350, 30);
        title.setForeground(Color.white);
        B.add(title);

        firstname = new JTextField();
        firstname.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        firstname.setSize(300, 40);
        firstname.setLocation(50, 100);
        firstname.setText("First Name");
        firstname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstname.getText().equals("First Name")){
                    firstname.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(firstname.getText().equals("")){
                    firstname.setText("First Name");
                }
            }
        });
        B.add(firstname);

        secondname = new JTextField();
        secondname.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        secondname.setSize(300, 40);
        secondname.setLocation(450, 100);
        secondname.setText("Second Name");
        secondname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (secondname.getText().equals("Second Name")){
                    secondname.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(secondname.getText().equals("")){
                    secondname.setText("Second Name");
                }
            }
        });
        B.add(secondname);

        Email = new JTextField();
        Email.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        Email.setSize(700, 40);
        Email.setLocation(50, 200);
        Email.setText("Email");
        Email.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (Email.getText().equals("Email")){
                    Email.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(Email.getText().equals("")){
                    Email.setText("Email");
                }
            }
        });
        B.add(Email);

        Password = new JTextField();
        Password.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        Password.setSize(700, 40);
        Password.setLocation(50, 300);
        Password.setText("Password");
        Password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (Password.getText().equals("Password")){
                    Password.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(Password.getText().equals("")){
                    Password.setText("Password");
                }
            }
        });
        B.add(Password);

        ConfirmPassword = new JTextField();
        ConfirmPassword.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        ConfirmPassword.setSize(700, 40);
        ConfirmPassword.setLocation(50, 400);
        ConfirmPassword.setText("Confirm Password");
        ConfirmPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ConfirmPassword.getText().equals("Confirm Password")){
                    ConfirmPassword.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(ConfirmPassword.getText().equals("")){
                    ConfirmPassword.setText("Confirm Password");
                }
            }
        });
        B.add(ConfirmPassword);
        c.add(B);

//    rbutton = new JRadioButton();
//    rbutton.setSize();
//    rbutton.setLocation();

    }



}

class assignment2 {
    public static void main(String[] args) {
        GUIAssignment2 GUIA2 = new GUIAssignment2();
        GUIA2.setVisible(true);
    }
}