package Project_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame implements ActionListener {

    JButton buttonVoter, buttonAdmin;
    Welcome(){
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel heading = new JLabel("Welcome To New Era Of Voting System");
        heading.setBounds(150, 80, 950, 60);
        heading.setFont(new Font("serif", Font.BOLD, 50));
        add(heading);


        buttonVoter  = new JButton("Voter");
        buttonVoter.setBounds(200, 350, 300, 70);
        buttonVoter.setFont(new Font("serif", Font.BOLD, 30));
        add(buttonVoter);
        buttonVoter.addActionListener(this::actionPerformed);


        buttonAdmin = new JButton("Admin");
        buttonAdmin.setBounds(670, 350, 300, 70);
        buttonAdmin.setFont(new Font("serif", Font.BOLD, 30));
        add(buttonAdmin);
        buttonAdmin.addActionListener(this::actionPerformed);



        setSize(1170, 750);
        setLocation(150, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonVoter)){
            setVisible(false);
            new LoginVoter();
        }else if(e.getSource().equals(buttonAdmin)){
            setVisible(false);
            new LoginAdmin();
        }
    }

    public static void main(String[] args) {
        new Welcome();
    }


}
