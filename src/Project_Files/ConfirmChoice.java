package Project_Files;

import javax.swing.*;

public class ConfirmChoice extends JFrame {
    static JFrame frame;

    public static boolean confirmOptionYesNo(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame, "Press Yes / No.", "Confirm Your Choice !", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION;
    }


}
