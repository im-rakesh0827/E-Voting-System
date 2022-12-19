package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Feedback extends JFrame implements ActionListener {

    JButton buttonBack;
    Feedback(){
        setLayout(null);
//        getContentPane().setBackground(Color.LIGHT_GRAY);



        JLabel labelGreet = new JLabel("Congratulation");
        labelGreet.setBounds(400, 150, 350, 60);
        labelGreet.setFont(new Font("serif", Font.BOLD, 50));
        add(labelGreet);


        buttonBack = new JButton("Back");
        buttonBack.setBounds(500, 300, 150, 50);
        buttonBack.setFont(new Font("serif", Font.BOLD, 20 ));
        add(buttonBack);
        buttonBack.addActionListener(this::actionPerformed);


//        JTextField tfFeedback = new JTextField();
//        tfFeedback.setBounds(200, 250, 400, 80);
//        tfFeedback.setFont(new Font("serif", Font.BOLD, 50));
//        getContentPane().add(tfFeedback);




        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonBack)){
            setVisible(false);
            new Home();
        }
    }


    public static void main(String[] args) {
        new Feedback();
    }


}
