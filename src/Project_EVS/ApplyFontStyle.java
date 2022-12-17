package Project_EVS;

import javax.swing.*;
import java.awt.*;

public class ApplyFontStyle extends JFrame {
    public static void applyFontStyleLabelField(JLabel [] labelArray, JTextField [] fieldArray){
        for(JLabel label:labelArray){
            label.setFont(new Font("serif", Font.BOLD, 20));
        }
        for(JTextField field:fieldArray){
            field.setFont(new Font("serif", Font.PLAIN, 18));
        }
    }


    public static void applyFontStyleButtonBig(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("serif", Font.BOLD, 20));
        }
    }

    public static void applyFontStyleButtonSmall(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("serif", Font.BOLD, 20));
        }
    }
}
