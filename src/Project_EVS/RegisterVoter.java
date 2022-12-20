package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class RegisterVoter extends JFrame implements ActionListener {

    JLabel labelName, labelEmail, labelPhone, labelAge, labelAadhar, labelVoterId, labelUserId, labelVoted, labelPassword, labelConfirmPassword;
    JTextField tfName, tfEmail, tfPhone, tfAge, tfAadhar, tfVoterId, tfUserId, tfVoted, tfPassword;
    JButton buttonBack, buttonSubmit, buttonCancel;
    JPasswordField pfConfirmPassword;

    JLabel [] labelArray;
    JTextField [] fieldArray;
    JButton [] buttonArray;


    RegisterVoter(){
        setLayout(null);
//        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel heading  = new JLabel("Voter Registration Form");
        heading.setBounds(370, 50, 650, 50);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);



        int verticalShift = 180;
        labelName = new JLabel("Name : ");
        labelName.setBounds(50, verticalShift, 100, 30);
        labelName.setFont(new Font("serif", Font.BOLD, 20));
        add(labelName);
        tfName = new JTextField();
        tfName.setBounds(150, verticalShift, 350, 30);
        tfName.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfName);


        int gapDown = 60;
        verticalShift+= gapDown;
        labelPhone = new JLabel("Phone : ");
        labelPhone.setBounds(50, verticalShift, 100, 30);
        labelPhone.setFont(new Font("serif", Font.BOLD, 20));
        add(labelPhone);
        tfPhone = new JTextField();
        tfPhone.setBounds(150, verticalShift, 350, 30);
        tfPhone.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfPhone);


        verticalShift+= gapDown;
        labelAge = new JLabel("Age : ");
        labelAge.setBounds(50, verticalShift, 100, 30);
        labelAge.setFont(new Font("serif", Font.BOLD, 20));
        add(labelAge);
        tfAge = new JTextField();
        tfAge.setBounds(150, verticalShift, 350, 30);
        tfAge.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfAge);


        verticalShift+= gapDown;
        labelUserId = new JLabel("UserId : ");
        labelUserId.setBounds(50, verticalShift, 100, 30);
        labelUserId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelUserId);
        tfUserId = new JTextField();
        tfUserId.setBounds(150, verticalShift, 350, 30);
        tfUserId.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfUserId);


        verticalShift+= gapDown;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(50, verticalShift, 100, 30);
        labelPassword.setFont(new Font("serif", Font.BOLD, 20));
        add(labelPassword);
        tfPassword = new JTextField();
        tfPassword.setBounds(150, verticalShift, 350, 30);
        tfPassword.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfPassword);



//        Second Level :
        verticalShift = 180;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(620, verticalShift, 100, 30);
        labelEmail.setFont(new Font("serif", Font.BOLD, 20));
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(720, verticalShift, 350, 30);
        tfEmail.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfEmail);


        gapDown = 60;
        verticalShift += gapDown;
        labelAadhar = new JLabel("Aadhar : ");
        labelAadhar.setBounds(620, verticalShift, 100, 30);
        labelAadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(labelAadhar);
        tfAadhar = new JTextField();
        tfAadhar.setBounds(720, verticalShift, 350, 30);
        tfAadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfAadhar);


        verticalShift += gapDown;
        labelVoterId = new JLabel("VoterId : ");
        labelVoterId.setBounds(620, verticalShift, 100, 30);
        labelVoterId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelVoterId);
        tfVoterId = new JTextField();
        tfVoterId.setBounds(720, verticalShift, 350, 30);
        tfVoterId.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfVoterId);


        verticalShift += gapDown;
        labelVoted = new JLabel("Voted : ");
        labelVoted.setBounds(620, verticalShift, 100, 30);
        labelVoted.setFont(new Font("serif", Font.BOLD, 20));
        add(labelVoted);
        tfVoted = new JTextField();
        tfVoted.setBounds(720, verticalShift, 350, 30);
        tfVoted.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfVoted);


        verticalShift += gapDown;
        labelConfirmPassword = new JLabel("Confirm : ");
        labelConfirmPassword.setBounds(620, verticalShift, 200, 30);
        labelConfirmPassword.setFont(new Font("serif", Font.BOLD, 20));
        add(labelConfirmPassword);
        pfConfirmPassword = new JPasswordField();
        pfConfirmPassword.setBounds(720, verticalShift, 350, 30);
        pfConfirmPassword.setFont(new Font("serif", Font.PLAIN, 20));
        add(pfConfirmPassword);


        int verticalShiftButton = 550;
        int horizontalShiftButton = 190;
        int gap = 290;
        int buttonWidth = 220;
        int buttonHeight = 50;
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(horizontalShiftButton, verticalShiftButton, buttonWidth, buttonHeight);
        buttonSubmit.setFont(new Font("serif", Font.BOLD, 25));
        add(buttonSubmit);
        buttonSubmit.addActionListener(this::actionPerformed);

        horizontalShiftButton+=gap;
        buttonBack = new JButton("Back");
        buttonBack.setBounds(horizontalShiftButton, verticalShiftButton, buttonWidth, buttonHeight);
        buttonBack.setFont(new Font("serif", Font.BOLD, 25));
        add(buttonBack);
        buttonBack.addActionListener(this::actionPerformed);



        horizontalShiftButton+=gap;
        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(horizontalShiftButton, verticalShiftButton, buttonWidth, buttonHeight);
        buttonCancel.setFont(new Font("serif", Font.BOLD, 25));
        add(buttonCancel);
        buttonCancel.addActionListener(this::actionPerformed);




        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonSubmit)){
            if(confirmOptionYesNo()){
                System.out.println("Your Information Has Been Saved Successfully");
                System.exit(0);
            }
        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new LoginVoter();
            }
        }else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){
                JOptionPane.showMessageDialog(
                        this,
                        "Press Ok To Continue !",
                        "Registration Cancelled",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Welcome();
            }
        }

    }

    public static void main(String[] args) {

        new RegisterVoter();
    }


}
