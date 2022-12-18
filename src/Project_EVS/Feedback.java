package Project_EVS;

import javax.swing.*;
import java.awt.*;

public class Feedback extends JFrame {

    Feedback(){
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        JLabel labelGreet = new JLabel("Congratulation Your Response Has Been Saved.");

    }


    public static void main(String[] args) {
        new Feedback();
    }
}
