package Project_EVS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RollOverButtonTest extends JFrame {
    private JButton button;



    public RollOverButtonTest() {
        setTitle("RollOverButton Test");
        button = new JButton("Rollover Button");
        button.setBounds(50, 50, 150, 50);
        button.addMouseListener(new MouseAdapter() {
            Color color = button.getForeground();

            public void mouseEntered(MouseEvent me) {
                color = button.getForeground();
                button.setForeground(Color.green); // change the color to green when mouse over a button
            }
            public void mouseExited(MouseEvent me) {
                button.setBounds(50, 50, 150, 50);
                button.setForeground(color);

            }
        });



        add(button, BorderLayout.NORTH);
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RollOverButtonTest();
    }

}