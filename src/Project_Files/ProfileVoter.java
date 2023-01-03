package Project_Files;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static Project_Files.ConfirmChoice.confirmOptionYesNo;

public class ProfileVoter extends JFrame implements ActionListener {

    JTable table;
    JScrollPane scrollPane;
    JButton buttonVote, buttonCancel;

    JLabel labelHeading;

    ProfileVoter(){

    }


    ProfileVoter(String voterId)  {
        setLayout(null);
//        getContentPane().setBackground(Color.LIGHT_GRAY);
        getContentPane().setBackground(Color.getHSBColor(120,278,150));

        labelHeading = new JLabel("Your Profile");
        labelHeading.setBounds(290, 30, 300, 60);
        labelHeading.setFont(new Font("serif", Font.BOLD, 50));
        add(labelHeading);


        buttonVote = new JButton("Vote Now");
        buttonVote.setBounds(150, 140, 150, 40);
        buttonVote.setFont(new Font("serif", Font.BOLD, 20));
        add(buttonVote);
        buttonVote.addActionListener(this::actionPerformed);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(550, 140, 150, 40);
        buttonCancel.setFont(new Font("serif", Font.BOLD, 20));
        buttonCancel.setBackground(Color.BLUE);
        add(buttonCancel);
        buttonCancel.addActionListener(this::actionPerformed);



        table = new JTable();
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 275, 870, 300);
        scrollPane.setFont(new Font("serif", Font.PLAIN, 28));
        table.setBounds(0, 150, 1170, 80);
        add(scrollPane);


        try {
//            table = new JTable();
            Conn connection = new Conn();
            String query = "select * from voter where voterId='"+voterId+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            table.setFont(new Font("serif", Font.BOLD, 16));
        }catch (Exception e){
            e.printStackTrace();
        }



        setSize(870, 500);
        setLocation(250, 130);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        new ProfileVoter(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonVote)){
            setVisible(false);
            new Home();
        }else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new Welcome();
            }
        }
    }
}



