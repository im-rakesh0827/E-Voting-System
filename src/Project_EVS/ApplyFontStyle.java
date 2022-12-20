package Project_EVS;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ApplyFontStyle extends JFrame {
    public static void applyFontStyleLabelField(JLabel [] labelArray, JTextField [] fieldArray){
        for(JLabel label:labelArray){
            label.setFont(new Font("serif", Font.BOLD, 25));
        }
        for(JTextField field:fieldArray){
            field.setFont(new Font("serif", Font.PLAIN, 18));
        }
    }


    public static void applyFontStyleButtonBig(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("serif", Font.BOLD, 25));
        }
    }

    public static void applyFontStyleButtonSmall(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("serif", Font.BOLD, 20));
        }
    }


    public static void applyButtonBorderResponse(JButton buttonResponse){
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        buttonResponse.setBorder(border);
    }


    public static void applyButtonBorder(JButton [] buttonArray){
        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
        for(JButton button:buttonArray){
            button.setBorder(border);
        }
    }

    public static void applyLabelBorder(JLabel [] labelArray){
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3, true);
        for(JLabel label:labelArray){
            label.setBorder(border);
        }
    }

    public static Icon imageToIcon(String str){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource(str));
        Image image = imageIcon.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        return icon;
    }
}
