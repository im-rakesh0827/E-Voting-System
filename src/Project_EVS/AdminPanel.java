package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EVS.ApplyFontStyle.applyFontStyleButtonSmall;

public class AdminPanel extends JFrame implements ActionListener{
    JButton buttonAdd, buttonUpdate, buttonView, buttonDelete;
    JButton [] buttonArray;

    AdminPanel(){

        setLayout(null);
//        getContentPane().setBackground(Color.getHSBColor(120,258,150));


        int widthButton = 180;
        int heightButton = 50;
        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(600, 80, widthButton, heightButton);
        add(buttonAdd);
        buttonAdd.addActionListener(this::actionPerformed);


        buttonView = new JButton("View");
        buttonView.setBounds(900, 220, widthButton, heightButton);
        add(buttonView);
        buttonView.addActionListener(this::actionPerformed);

        buttonUpdate = new JButton("Update");
        buttonUpdate.setBounds(600, 220, widthButton, heightButton);
        add(buttonUpdate);
        buttonUpdate.addActionListener(this::actionPerformed);

        buttonDelete = new JButton("Delete");
        buttonDelete.setBounds(900, 80, widthButton, heightButton);
        add(buttonDelete);
        buttonDelete.addActionListener(this::actionPerformed);


        buttonArray = new JButton[]{buttonAdd, buttonView, buttonUpdate, buttonDelete};
        applyFontStyleButtonSmall(buttonArray);













        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(buttonAdd)){

        }
    }



    public static void main(String[] args) {
        new AdminPanel();

    }



}
