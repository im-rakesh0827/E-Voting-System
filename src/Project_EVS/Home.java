package Project_EVS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EVS.ApplyFontStyle.*;
import static Project_EVS.ConfirmChoice.confirmOptionYesNo;

public class Home extends JFrame implements ActionListener {

    JLabel labelCongress, labelAAP, labelJDU, labelRJD, labelShivSena, labelCPI, labelSP, labelBSP, labelBJP;
    JButton buttonCongress, buttonAAP, buttonJDU, buttonRJD, buttonShivSena, buttonCPI, buttonSP, buttonBSP, buttonBJP;
    JTextField tfVoteCongress, tfVoteAAP, tfVoteJDU, tfVoteRJD, tfVoteShivSena, tfVoteCPI, tfVoteTMC, tfVoteSP, tfVoteBSP, tfVoteBJP;

    JLabel[] labelArray;
    JTextField[] fieldArray;
    JButton[] buttonArray;
    static JButton buttonResponse;
    JLabel myLabel;
    int congressVote;

    JButton [] buttonResponseArray;
    JTextField [] tfVoteArray;
    JTextField fieldResponse;

    Home() {
        setLayout(null);
        // getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("E-VOTING SYSTEM");
        heading.setBounds(325, 20, 400, 40);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        add(heading);


        int labelVerticalShift = 230;
        int buttonVerticalShift = 120;
        // First Row :
        // Congress :
        buttonCongress = new JButton(imageToIcon("PartyLogo/CONG.png"));
        buttonCongress.setBounds(50, buttonVerticalShift, 150, 100);
        add(buttonCongress);
        labelCongress = new JLabel("Congress");
        labelCongress.setBounds(75, labelVerticalShift, 110, 40);
        add(labelCongress);
        buttonCongress.addActionListener(this::actionPerformed);


        // AAP :
        buttonAAP = new JButton(imageToIcon("PartyLogo/AAP.png"));
        buttonAAP.setBounds(250, buttonVerticalShift, 150, 100);
        add(buttonAAP);
        labelAAP = new JLabel("AAP");
        labelAAP.setBounds(300, labelVerticalShift, 60, 40);
        add(labelAAP);
        buttonAAP.addActionListener(this::actionPerformed);





        // JDU :
        buttonJDU = new JButton(imageToIcon("PartyLogo/JDU.png"));
        buttonJDU.setBounds(450, buttonVerticalShift, 150, 100);
        add(buttonJDU);
        buttonJDU.addActionListener(this::actionPerformed);
        labelJDU = new JLabel("JDU");
        labelJDU.setBounds(500, labelVerticalShift, 60, 40);
        add(labelJDU);



        // Second Row :
        // RJD
        labelVerticalShift += 225;
        buttonVerticalShift += 225;
        buttonRJD = new JButton(imageToIcon("PartyLogo/RJD.png"));
        buttonRJD.setBounds(50, buttonVerticalShift, 150, 100);
        add(buttonRJD);
        buttonRJD.addActionListener(this::actionPerformed);
        labelRJD = new JLabel("RJD");
        labelRJD.setBounds(95, labelVerticalShift, 60, 40);
        add(labelRJD);



        buttonSP = new JButton(imageToIcon("PartyLogo/SP.png"));
        buttonSP.setBounds(250, buttonVerticalShift, 150, 100);
        add(buttonSP);
        buttonSP.addActionListener(this::actionPerformed);
        labelSP = new JLabel("SP");
        labelSP.setBounds(310, labelVerticalShift, 40, 40);
        add(labelSP);


        buttonBSP = new JButton(imageToIcon("PartyLogo/BSP.png"));
        buttonBSP.setBounds(450, buttonVerticalShift, 150, 100);
        add(buttonBSP);
        buttonBSP.addActionListener(this::actionPerformed);
        labelBSP = new JLabel("BSP");
        labelBSP.setBounds(500, labelVerticalShift, 60, 40);
        add(labelBSP);


        // Third Row :
        labelVerticalShift += 220;
        buttonVerticalShift += 220;
        buttonShivSena = new JButton(imageToIcon("PartyLogo/ShivSena.png"));
        buttonShivSena.setBounds(50, buttonVerticalShift, 150, 100);
        add(buttonShivSena);
        buttonShivSena.addActionListener(this::actionPerformed);
        labelShivSena = new JLabel("S.Sena");
        labelShivSena.setBounds(75, labelVerticalShift, 80, 40);
        add(labelShivSena);


        buttonCPI = new JButton(imageToIcon("PartyLogo/CPI.png"));
        buttonCPI.setBounds(250, buttonVerticalShift, 150, 100);
        add(buttonCPI);
        buttonCPI.addActionListener(this::actionPerformed);
        labelCPI = new JLabel("CPI");
        labelCPI.setBounds(300, labelVerticalShift, 60, 40);
        add(labelCPI);


        buttonBJP = new JButton(imageToIcon("PartyLogo/BJP.png"));
        buttonBJP.setBounds(450, buttonVerticalShift, 150, 100);
        add(buttonBJP);
        buttonBJP.addActionListener(this::actionPerformed);
        labelBJP = new JLabel("BJP");
        labelBJP.setBounds(500, labelVerticalShift, 60, 40);
        add(labelBJP);




        JLabel labelResponse = new JLabel("Response");
        labelResponse.setBounds(750, 120, 200, 40);
        labelResponse.setFont(new Font("serif", Font.BOLD, 30));
        add(labelResponse);

        JLabel labelVote = new JLabel("Vote Count");
        labelVote.setBounds(970, 120, 200, 40);
        labelVote.setFont(new Font("serif", Font.BOLD, 30));
        add(labelVote);




        labelArray = new JLabel[] { labelCongress, labelAAP, labelJDU, labelRJD, labelShivSena, labelCPI, labelSP, labelBSP, labelBJP };
        fieldArray = new JTextField[] {};
        applyFontStyleLabelField(labelArray, fieldArray);

        buttonArray = new JButton[] { buttonCongress, buttonAAP, buttonJDU, buttonRJD, buttonShivSena, buttonCPI, buttonSP, buttonBSP, buttonBJP };
        applyFontStyleButtonBig(buttonArray);
        applyButtonBorder(buttonArray);
//        applyLabelBorder(labelArray);


        setSize(1170, 790);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonCongress)){
            if(confirmOptionYesNo()){
                voteResponse(buttonCongress);
            }else{
//                setVisible(false);
//                new Home();
            }

        }else if(e.getSource().equals(buttonAAP)){
            if(confirmOptionYesNo()){
                voteResponse(buttonAAP);
            }
        }else if(e.getSource().equals(buttonJDU)){
            if(confirmOptionYesNo()){
                voteResponse(buttonJDU);
            }else{
//                setVisible(false);
//                new Home();
            }
        }

    }
    public void voteResponse(JButton response){
        buttonResponse = new JButton();
        buttonResponse.setIcon(response.getIcon());
        buttonResponse.setBounds(750, 180, 150, 100);
        add(buttonResponse);
        applyButtonBorderResponse(buttonResponse);
        JOptionPane.showMessageDialog(
                this,
                "Your Response Has Been Saved",
                "CONGRATULATION !",
                JOptionPane.ERROR_MESSAGE
        );
        setVisible(false);
        new Welcome();
    }


    public static void main(String[] args) {
        new Home();
    }


}
