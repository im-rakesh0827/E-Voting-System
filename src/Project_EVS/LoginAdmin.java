package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class LoginAdmin extends JFrame implements ActionListener {

    JLabel labelEmail, labelPassword;
    JTextField tfEmail, tfConfirmPassword;
    JPasswordField pfPassword;
    JButton buttonLogin, buttonRegister, buttonCancel;

    LoginAdmin(){
        setLayout(null);
//        getContentPane().setBackground(Color.pink);
        getContentPane().setBackground(Color.getHSBColor(120,258,150));

        JLabel heading  = new JLabel("Admin Login Form");
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

    public void authenticateAdmin(){
        try {
            String email = tfEmail.getText();
            String password = String.valueOf(pfPassword.getPassword());
            Conn connection = new Conn();
            String query = "select * from admin where email='"+email+"' and password='"+password+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            if(resultSet.next()){
                JOptionPane.showMessageDialog(
                        this,
                        "You Have Logged In Successfully",
                        "Login Successful",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Login Credential",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonLogin)){
            authenticateAdmin();
        }else if(e.getSource().equals(buttonRegister)){
            setVisible(false);
            new RegisterAdmin();
        }else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){
                JOptionPane.showMessageDialog(
                        this,
                        "Press Ok To Continue.",
                        "Registration Cancelled !",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Welcome();
            }
        }


    }

    public static void main(String[] args) {
        new LoginAdmin();
    }


}
