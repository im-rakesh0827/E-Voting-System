package Project_EVS;

import javax.swing.*;
import java.awt.*;

public class Welcome extends JFrame {

    Welcome(){
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel heading = new JLabel("Welcome To New Era Of Voting System");
        heading.setBounds(150, 80, 950, 60);
        heading.setFont(new Font("serif", Font.BOLD, 50));
        add(heading);


        setSize(1170, 750);
        setLocation(150, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Welcome();
    }

}
