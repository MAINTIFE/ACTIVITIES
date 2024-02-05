package GUI;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionDemo extends JFrame implements MouseMotionListener
{

    int x, y;
    JLabel position;

    public MouseMotionDemo()
    {
        super("Mouse Motion Event Demo");
        position = new JLabel();

        setLayout(new FlowLayout());

        add(position);

        setSize(320, 300);
        setVisible(true);

        /* Some code to be added */
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent me)
    {
        x = me.getX();
        y = me.getY();
        position.setText("Mouse cursor is at " + x + " " + y);
    }

    public void mouseDragged(MouseEvent me)
    {
        x = me.getX();
        y = me.getY();
        position.setText("Mouse is dragged at " + x + " " + y);
    }

    public static void main(String[] args)
    {
        MouseMotionDemo obj = new MouseMotionDemo();
    }
}


