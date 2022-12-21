package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class LoginVoter extends JFrame  implements ActionListener {

    JLabel labelVoterID, labelPassword;
    JTextField tfVoterID, tfConfirmPassword;
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


        labelVoterID = new JLabel("Voter ID : ");
        labelVoterID.setBounds(120, 170, 120, 30);
        labelVoterID.setFont(new Font("serif", Font.BOLD, 25));
        add(labelVoterID);
        tfVoterID = new JTextField();
        tfVoterID.setBounds(300, 170, 460, 30);
        tfVoterID.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfVoterID);


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


    public void voterLogin() throws ClassNotFoundException, SQLException {
        String vId = tfVoterID.getText();
        String password = String.valueOf(pfPassword.getPassword());
        if(vId.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Enter Your Details Carefully...",
                    "Missing Details",
                    JOptionPane.ERROR_MESSAGE
            );
        }else{
            final String DBURL = "jdbc:mysql://localhost:3306/votingsystem";
            final String USERNAME = "root";
            final String PASSWORD = "Apple@0827";
            final String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            String query = "select * from voter where voterId= '"+vId+"'+and password='"+password+"'";
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                JOptionPane.showMessageDialog(
                        this,
                        "You Have Logged In Successfully.",
                        "Login Successful",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(
                        this,
                        "Your Credential Is Invalid",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new LoginVoter();
            }

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonLogin)){
            try {
                voterLogin();
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
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
