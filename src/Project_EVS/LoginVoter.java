package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class LoginVoter extends JFrame  implements ActionListener {

    JLabel labelEmail, labelPassword;
    JTextField tfEmail, tfConfirmPassword;
    JPasswordField pfPassword;
    JButton buttonLogin, buttonRegister, buttonCancel;

    JLabel [] labelArray;
    JTextField [] fieldArray;
    JButton [] buttonArray;

    LoginVoter(){
        setLayout(null);
        JLabel heading  = new JLabel("Voter Login Form");
        heading.setBounds(320, 40, 500, 50);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);


        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(120, 170, 120, 30);
        labelEmail.setFont(new Font("serif", Font.BOLD, 25));
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(300, 170, 460, 30);
        tfEmail.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfEmail);


        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(120, 240, 150, 30);
        labelPassword.setFont(new Font("serif", Font.BOLD, 25));
        add(labelPassword);
        pfPassword = new JPasswordField();
        pfPassword.setBounds(300, 240, 460, 30);
        pfPassword.setFont(new Font("serif", Font.PLAIN, 20));
        add(pfPassword);



        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(100, 370, 160, 50);
        buttonLogin.setFont(new Font("serif", Font.BOLD, 20));
        add(buttonLogin);
        buttonLogin.addActionListener(this::actionPerformed);


        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(350, 370, 160, 50);
        buttonRegister.setFont(new Font("serif", Font.BOLD, 20));
        add(buttonRegister);
        buttonRegister.addActionListener(this::actionPerformed);


        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(610, 370, 160, 50);
        buttonCancel.setFont(new Font("serif", Font.BOLD, 20));
        add(buttonCancel);
        buttonCancel.addActionListener(this::actionPerformed);



        setSize(870, 500);
        setLocation(250, 130);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void authenticateVoter(){
        System.out.println("Your Profile Is Under Process ");
        System.exit(0);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonLogin)){
            try {
                if(tfEmail.getText().isEmpty() || tfEmail.getText().isEmpty()){
                    JOptionPane.showMessageDialog(
                            this,
                            "Fill the details carefully...",
                            "Missing Details",
                            JOptionPane.ERROR_MESSAGE
                    );
                }else{
                    if(!pfPassword.equals(tfConfirmPassword)){
                        JOptionPane.showMessageDialog(
                                this,
                                "Re-Enter Confirm Password.",
                                "Password Mismatch",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }else{
                        String URL = "";
                        String USERNAME = "root";
                        String PASSWORD = "Apple@0827";
                    }

                }
            }catch (Exception E){
                E.printStackTrace();
            }

        }else if(e.getSource().equals(buttonRegister)){
            setVisible(false);
            new RegisterVoter();
        }else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){

                JOptionPane.showMessageDialog(
                        this,
                        "Press Ok To Continue !",
                        "Login Cancelled !",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Welcome();
            }
        }

    }

    public static void main(String[] args) {
        new LoginVoter();

    }


}
