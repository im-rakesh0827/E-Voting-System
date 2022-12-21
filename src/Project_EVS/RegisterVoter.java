package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class RegisterVoter extends JFrame implements ActionListener {

    JLabel labelName, labelEmail, labelPhone, labelAge, labelAadhar, labelVoterId, labelUserId,labelUID, labelVoted, labelVotedOrNo, labelPassword, labelConfirmPassword;
    JTextField tfName, tfEmail, tfPhone, tfAge, tfAadhar, tfVoterId, tfVoted, tfPassword;
    JButton buttonBack, buttonSubmit, buttonCancel;
    JPasswordField pfConfirmPassword;


    JLabel [] labelArray;
    JTextField [] fieldArray;
    JButton [] buttonArray;


    Random random = new Random();
    int uniqueId = random.nextInt(99999);



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
        labelUID = new JLabel(""+uniqueId);
        labelUID.setBounds(150, verticalShift, 350, 30);
        labelUID.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelUID);


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
        labelVotedOrNo = new JLabel("No");
        labelVotedOrNo.setBounds(720, verticalShift, 350, 30);
        labelVotedOrNo.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelVotedOrNo);


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
            registerVoter();
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

    public Voter voter;
    public void registerVoter(){
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String age = tfAge.getText();
        String aadhar = tfAadhar.getText();
        String voterId = tfVoterId.getText();
        String userId = labelUID.getText();
        String voted = labelVotedOrNo.getText();
        String password = tfPassword.getText();
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

        voter = addVoterToDatabase(name, email, phone, age, aadhar, voterId, userId, voted, password);
        if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || age.isEmpty() || aadhar.isEmpty() ||voterId.isEmpty() || userId.isEmpty() || voted.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Enter details carefully !",
                    "Details missing!",
                    JOptionPane.ERROR_MESSAGE
            );

        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(
                    this,
                    "Re-enter your password !",
                    "Password mismatch",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        else if(voter!=null){
            if(confirmOptionYesNo()){
                JOptionPane.showMessageDialog(
                        this,
                        "Voter Registered Successfully",
                        "Registration Successful",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            setVisible(false);
            new Home();
        }

    }
    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;
    String query;

    private Voter addVoterToDatabase(String name, String email, String phone, String age, String aadhar, String voterId, String userId, String voted, String password) {
        final String DBURL = "jdbc:mysql://localhost:3306/votingsystem";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        final String driver = "com.mysql.cj.jdbc.Driver";

        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            query = "insert into voter (name, email, phone, age, aadhar, voterId, userId, voted, password)"+"values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, age);
            preparedStatement.setString(5, aadhar);
            preparedStatement.setString(6, voterId);
            preparedStatement.setString(7, userId);
            preparedStatement.setString(8, voted);
            preparedStatement.setString(9, password);
            int row = preparedStatement.executeUpdate();
            if(row>0){
                voter = new Voter();
                voter.name = name;
                voter.email = email;
                voter.phone = phone;
                voter.age = age;
                voter.aadhar = aadhar;
                voter.voterId = voterId;
                voter.voted = voted;
                voter.password = password;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return voter;
    }
    public static void main(String[] args) {
        new Voter();
        new RegisterVoter();
    }

}
