package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Actioneventdemo extends JFrame implements ActionListener
{

    JButton click;
    JPanel panel;
    JLabel message;

    public Actioneventdemo()
    {
        super("Action Event Demo");
        click = new JButton("Click");
        panel = new JPanel();
        message = new JLabel();

        add(panel);
        panel.add(click);
        panel.add(message);

        setSize(300, 300);
        setVisible(true);

        /* Some code to be added */

        click.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e)
    {
        message.setText("Welcome to Event Handling in Java");
    }

    public static void main(String[] args)
    {
        Actioneventdemo obj = new Actioneventdemo();
    }
}


