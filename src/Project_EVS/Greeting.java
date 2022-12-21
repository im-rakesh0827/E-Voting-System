package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class Greeting extends JFrame implements ActionListener {

    JCheckBox box;
    JButton buttonSubmit, buttonBack;
    JTextField tfFeedback;
    Greeting(){
        setLayout(null);
//        getContentPane().setBackground(Color.LIGHT_GRAY);



        JLabel labelGreet = new JLabel("Congratulation");
        labelGreet.setBounds(270, 100, 350, 60);
        labelGreet.setFont(new Font("serif", Font.BOLD, 50));
        add(labelGreet);

//        JLabel labelFeedBack = new JLabel("Feedback : ");
//        labelFeedBack.setBounds(270, 250, 150, 30);
//        labelFeedBack.setFont(new Font("serif", Font.BOLD, 20));
//        add(labelFeedBack);

        tfFeedback = new JTextField();
        tfFeedback.setBounds(180, 250, 520, 30);
        tfFeedback.setFont(new Font("serif", Font.BOLD, 20));
        getContentPane().add(tfFeedback);


//        box = new JCheckBox();
//        box.setBounds(230, 250, 150, 50);
//        box.setFont(new Font("serif", Font.BOLD, 20));
//        add(box);
//        box.addActionListener(this::actionPerformed);



        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(180, 390, 150, 50);
        buttonSubmit.setFont(new Font("serif", Font.BOLD, 25 ));
        add(buttonSubmit);
        buttonSubmit.setForeground(Color.BLUE);
        buttonSubmit.addActionListener(this::actionPerformed);


        buttonBack = new JButton("Home");
        buttonBack.setBounds(550, 390, 150, 50);
        buttonBack.setFont(new Font("serif", Font.BOLD, 25 ));
        add(buttonBack);
        buttonBack.setForeground(Color.BLUE);
        buttonBack.addActionListener(this::actionPerformed);




        setSize(900, 600);
        setLocation(270, 120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonSubmit)){
            if(!tfFeedback.getText().isEmpty()){
                if(confirmOptionYesNo()){
                    JOptionPane.showMessageDialog(
                            this,
                            "Press Ok To Continue.",
                            "Feedback Saved Successfully",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                setVisible(false);
                new Welcome();
            }else{
                JOptionPane.showMessageDialog(
                        this,
                        "Fill The Feedback First",
                        "Feedback Is Empty !",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new Welcome();
            }

        }
    }





    public static void main(String[] args) {
        new Greeting();
    }


}
