package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUIAssignment extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel fname;
    private  JTextField tfname;
    private JLabel lname;
    private JTextField tlname;
    private JLabel dob;
    private  JTextField tdob;
    private JLabel date;
    private JLabel email;
    private  JTextField temail;
    private JLabel phone;
    private  JTextField tphone;
    private JLabel company;
    private  JTextField tcompany;
    private JLabel country;
    private  JTextField tcountry;
    private JLabel mailadd;
    private  JTextField tmailadd;
    private JLabel comment;
    private  JTextField tcomment;
    private JLabel currentdate;
    private  JTextField tcurrentdate;
    private JLabel signature;
    private  JTextField tsignature;

    public GUIAssignment() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setSize(300, 30);
        title.setLocation(150, 30);
        c.add(title);


        fname = new JLabel("First Name");
        fname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        fname.setSize(100, 20);
        fname.setLocation(100, 100);
        c.add(fname);

        tfname = new JTextField();
        tfname.setFont(new Font("Calibri", Font.PLAIN, 10));
        tfname.setSize(350, 25);
        tfname.setLocation(250, 100);
        c.add(tfname);

        lname = new JLabel("Last Name");
        lname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lname.setSize(100, 20);
        lname.setLocation(100, 150);
        c.add(lname);

        tlname = new JTextField();
        tlname.setFont(new Font("Calibri", Font.PLAIN, 10));
        tlname.setSize(350, 25);
        tlname.setLocation(250, 150);
        c.add(tlname);

        dob = new JLabel("Birth Date");
        dob.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        dob.setSize(100, 20);
        dob.setLocation(100, 200);
        c.add(dob);

        tdob = new JTextField();
        tdob.setFont(new Font("Calibri", Font.PLAIN, 10));
        tdob.setSize(350, 25);
        tdob.setLocation(250, 200);
        c.add(tdob);

        date = new JLabel("MM/DD/YY");
        date.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        date.setSize(100, 20);
        date.setLocation(250, 220);
        c.add(date);

        email = new JLabel("Email");
        email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        email.setSize(100, 20);
        email.setLocation(100, 250);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Calibri", Font.PLAIN, 10));
        temail.setSize(350, 25);
        temail.setLocation(250, 250);
        c.add(temail);

        phone = new JLabel("Phone");
        phone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        phone.setSize(100, 20);
        phone.setLocation(100, 300);
        c.add(phone);

        tphone = new JTextField();
        tphone.setFont(new Font("Calibri", Font.PLAIN, 10));
        tphone.setSize(350, 25);
        tphone.setLocation(250, 300);
        c.add(tphone);

        company = new JLabel("Company");
        company.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        company.setSize(100, 20);
        company.setLocation(100, 350);
        c.add(company);

        tcompany = new JTextField();
        tcompany.setFont(new Font("Calibri", Font.PLAIN, 10));
        tcompany.setSize(350, 25);
        tcompany.setLocation(250, 350);
        c.add(tcompany);

        country = new JLabel("Country");
        country.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        country.setSize(100, 20);
        country.setLocation(100, 400);
        c.add(country);

        tcountry = new JTextField();
        tcountry.setFont(new Font("Calibri", Font.PLAIN, 10));
        tcountry.setSize(350, 25);
        tcountry.setLocation(250, 400);
        c.add(tcountry);

        mailadd = new JLabel("Mailing Address");
        mailadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        mailadd.setSize(100, 20);
        mailadd.setLocation(100, 450);
        c.add(mailadd);

        tmailadd = new JTextField();
        tmailadd.setFont(new Font("Calibri", Font.PLAIN, 10));
        tmailadd.setSize(350, 75);
        tmailadd.setLocation(250, 450);
        c.add(tmailadd);

        comment = new JLabel("Comment");
        comment.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        comment.setSize(100, 20);
        comment.setLocation(100, 550);
        c.add(comment);

        tcomment = new JTextField();
        tcomment.setFont(new Font("Calibri", Font.PLAIN, 10));
        tcomment.setSize(350, 75);
        tcomment.setLocation(250, 550);
        c.add(tcomment);

        currentdate = new JLabel("Current Date");
        currentdate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        currentdate.setSize(100, 20);
        currentdate.setLocation(100, 650);
        c.add(currentdate);

        tcurrentdate = new JTextField();
        tcurrentdate.setFont(new Font("Calibri", Font.PLAIN, 10));
        tcurrentdate.setSize(350, 25);
        tcurrentdate.setLocation(250, 650);
        c.add(tcurrentdate);

        date = new JLabel("MM/DD/YY");
        date.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        date.setSize(100, 20);
        date.setLocation(250, 670);
        c.add(date);

        signature = new JLabel("Signature");
        signature.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        signature.setSize(100, 20);
        signature.setLocation(100, 700);
        c.add(signature);

        tsignature = new JTextField();
        tsignature.setFont(new Font("Calibri", Font.PLAIN, 10));
        tsignature.setSize(200, 75);
        tsignature.setLocation(250, 700);
        c.add(tsignature);

    }

    public void actionPerformed(ActionEvent e) {

    }
}

class assignment{
    public static void main(String[] args) throws Exception {
        GUIAssignment GUIA = new GUIAssignment();
        GUIA.setVisible(true);

    }
}


