package game.src.Hangman_GUI;

import Hangman_GUI.GameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Validated extends JFrame implements ActionListener {
    JButton option1;
    JButton option2;
    JButton option3;
    JLabel name;

    public Menu_Validated(){
        option1 = new JButton("Play game");
        option2 = new JButton("View instructions");
        option3 = new JButton("Hangman");
        name = new JLabel("HANGMAN");
        name.setFont(new Font("Serif", Font.PLAIN, 24));

        setTitle("Hangman game");
        setSize(300, 200);
        setResizable(false);
        setVisible(true);

        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == option1){
            GameWindow gw = new GameWindow();
            gw.startGame();
            this.dispose();
        }else if(e.getSource() == option2){
            JOptionPane.showMessageDialog(this, "1. You can guess the word by clicking the character from the virtual keypad"
            + "\n 2. You can select a maximum of 5 incorrect letters" + "\n 3. The incorrect guess will be highlighted with red colour and the correct one will be highlighted in green",
                    "Instructions", JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getSource() == option3){
            System.exit(0);
        }
    }

    public void addComponent() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name, c);

        c.gridx = 0;
        c.gridy = 1;
        c.fill = c.HORIZONTAL;
        add(option1, c);

        c.gridx = 0;
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(option2, c);

        c.gridx = 0;
        c.gridy = 3;
        c.fill = c.HORIZONTAL;
        add(option3, c);
    }
}