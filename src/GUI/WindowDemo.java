package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class WindowDemo extends WindowAdapter
{

    JFrame jf;

    public WindowDemo()
    {
        jf = new JFrame("Window Event Demo");
        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        /* Some code to be added */
        jf.addWindowListener(this);

    }

    public void windowClosing(WindowEvent e)
    {
        int n = JOptionPane.showConfirmDialog(jf, "Do you want to close this window?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_OPTION)
        {

            jf.dispose();

        }

    }

    public static void main(String[] args)
    {
        WindowDemo obj = new WindowDemo();

    }
}

