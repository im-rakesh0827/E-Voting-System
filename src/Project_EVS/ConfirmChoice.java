package Project_EVS;

import javax.swing.*;

public class ConfirmChoice extends JFrame {
    static JFrame frame;

    public static boolean confirmOptionYesNo(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame, "Press Yes/No To Continue", "Confirm Your Choice", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION;
    }
}
