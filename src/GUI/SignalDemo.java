package GUI;
import javax.swing.*;
import java.awt.*;

public class SignalDemo extends JFrame implements Runnable {
    JPanel red, yellow, green;
    JLabel time, show;

    public void run() {
        try {
            while(true) {
                // Code for the red light
                red.setBackground(Color.red);
                yellow.setBackground(Color.GRAY);
                green.setBackground(Color.GRAY);
                for (int i = 3; i > 0; i--) {
                    String s = Integer.toString(i);
                    show.setText(s);
                    Thread.sleep(1000);
                }

                // Code for the green light
                yellow.setBackground(Color.GRAY);
                green.setBackground(Color.GREEN);
                red.setBackground(Color.GRAY);
                for (int i = 5; i > 0; i--) {
                    String s = Integer.toString(i);
                    show.setText(s);
                    Thread.sleep(1000);
                }

                // Code for the yellow light
                yellow.setBackground(Color.YELLOW);
                green.setBackground(Color.GRAY);
                red.setBackground(Color.GRAY);
                for (int i = 2; i > 0; i--) {
                    String s = Integer.toString(i);
                    show.setText(s);
                    Thread.sleep(1000);
                }
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public SignalDemo() {
        // JFrame setup
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(100, 260);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // Initialize components
        red = new JPanel();
        red.setBackground(Color.red);
        yellow = new JPanel();
        yellow.setBackground(Color.YELLOW);
        green = new JPanel();
        green.setBackground(Color.GREEN);

        // Set layout to null for manual component placement
        setLayout(null);

        // Add traffic light panels to the JFrame
        red.setBounds(40, 20, 40, 40);
        add(red);
        yellow.setBounds(40, 70, 40, 40);
        add(yellow);
        green.setBounds(40, 120, 40, 40);
        add(green);

        // Labels for time remaining and countdown
        time = new JLabel("Time remaining");
        time.setForeground(Color.WHITE);
        time.setBounds(20, 160, 100, 40);
        add(time);

        show = new JLabel("");
        show.setBounds(55, 178, 80, 40);
        show.setForeground(Color.CYAN);
        add(show);
    }

    public static void main(String[] args) {
        // Create an instance of SignalDemo
        SignalDemo signal = new SignalDemo();

        // Create a new thread and start it
        Thread task = new Thread(signal);
        task.start();
    }
}

