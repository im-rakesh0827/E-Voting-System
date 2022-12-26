package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Random;

import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class RegisterAdmin extends JFrame implements ActionListener {

    JLabel labelName, labelEmail, labelPhone, labelAge, labelAadhar, labelUserId, labelUID, labelPassword, labelConfirmPassword;
    JTextField tfName, tfEmail, tfPhone, tfAge, tfAadhar, tfPassword;
    JButton buttonSubmit, buttonBack, buttonCancel;
    JPasswordField pfConfirmPassword;


    Random random = new Random();
    int UId = random.nextInt(999999);

    JLabel [] labelArray;
    JTextField [] fieldArray;
    JButton [] buttonArray;


    RegisterAdmin(){
        setLayout(null);
//        getContentPane().setBackground(Color.pink);
        getContentPane().setBackground(Color.getHSBColor(120,258,150));


        JLabel heading  = new JLabel("Admin Registration Form");
        heading.setBounds(370, 50, 650, 50);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);



        int verticalShift = 200;
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
        labelUserId = new JLabel("UserId : ");
        labelUserId.setBounds(50, verticalShift, 100, 30);
        labelUserId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelUserId);
        labelUID = new JLabel(""+ UId);
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
        verticalShift = 200;
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
        labelAge = new JLabel("Age : ");
        labelAge.setBounds(620, verticalShift, 100, 30);
        labelAge.setFont(new Font("serif", Font.BOLD, 20));
        add(labelAge);
        tfAge = new JTextField();
        tfAge.setBounds(720, verticalShift, 350, 30);
        tfAge.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfAge);


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


    public void registerAdmin(){
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String aadhar = tfAadhar.getText();
        String userId = String.valueOf(UId);
        String age = tfAge.getText();
        String password = tfPassword.getText();
        String confPassword = String.valueOf(pfConfirmPassword.getPassword());

        String dataArray[] = {name, email, phone, aadhar, userId, age, password, confPassword};
        if(checkEmpty(dataArray)){
            JOptionPane.showMessageDialog(
                    this,
                    "Enter Details Carefully!",
                    "Details Missing!",
                    JOptionPane.ERROR_MESSAGE
            );
        }else{
            if(!password.equals(confPassword)){
                JOptionPane.showMessageDialog(
                        this,
                        "Re-Enter Confirm Password",
                        "Password Mismatch",
                        JOptionPane.ERROR_MESSAGE
                );

            }else{
                admin = addAdminToDatabase(name, email, phone, aadhar, userId, age, password);
                if(admin!=null){
                    JOptionPane.showMessageDialog(
                            this,
                            admin.name+" Registered Successfully",
                            "Registration Successful",
                            JOptionPane.ERROR_MESSAGE
                    );
                    System.out.println("Registration Successful : "+admin.name);
                    setVisible(false);
                    new LoginAdmin();
                }else{
                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Failed",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE
                    );
                    setVisible(false);
                    new Welcome();
                }
            }
        }

    }

    Admin admin;
    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;
    String query;
    private Admin addAdminToDatabase(String name, String email, String phone, String aadhar, String userId, String age, String password) {
        final String DBURL = "jdbc:mysql://localhost:3306/votingsystem";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        final String driver = "com.mysql.cj.jdbc.Driver";
        try {
            connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            query = "insert into admin(name, email, phone, aadhar, userId, age, password)"+"values(?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, aadhar);
            preparedStatement.setString(5, userId);
            preparedStatement.setString(6, age);
            preparedStatement.setString(7, password);
            int rowData = preparedStatement.executeUpdate();
            if(rowData>0){
                admin = new Admin();
                admin.name = name;
                admin.email = email;
                admin.phone = phone;
                admin.aadhar = aadhar;
                admin.userId = userId;
                admin.age = age;
                admin.password = password;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return admin;
    }

    private boolean checkEmpty(String[] dataArray) {
        for(String s:dataArray){
            if(s.isEmpty()) return true;
        }
        return false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonSubmit)){
            if(confirmOptionYesNo()){
                registerAdmin();
            }
        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new LoginAdmin();
            }
        }else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new Welcome();
            }
        }

    }

    public static void main(String[] args) {

        new RegisterAdmin();
    }
}
