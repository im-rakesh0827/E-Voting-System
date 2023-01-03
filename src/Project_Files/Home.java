package Project_Files;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_Files.ApplyFontStyle.*;
import static Project_Files.ConfirmChoice.confirmOptionYesNo;

public class Home extends JFrame implements ActionListener {

    JLabel labelCongress, labelAAP, labelJDU, labelRJD, labelShivSena, labelCPI, labelSP, labelBSP, labelBJP;
    JButton buttonCongress, buttonAAP, buttonJDU, buttonRJD, buttonShivSena, buttonCPI, buttonSP, buttonBSP, buttonBJP;
    JTextField tfVoteCongress, tfVoteAAP, tfVoteJDU, tfVoteRJD, tfVoteShivSena, tfVoteCPI, tfVoteTMC, tfVoteSP, tfVoteBSP, tfVoteBJP;

    JLabel[] labelArray;
    JTextField[] fieldArray;
    JButton[] buttonArray;
    JLabel labelVote;
    JLabel labelResponse;
    static JButton buttonResponse;
    static JButton buttonVote;

    JButton [] buttonResponseArray;
    JTextField [] tfVoteArray;
    JTextField fieldResponse;


    Home() {
        setLayout(null);
        // getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("E-VOTING SYSTEM");
        heading.setBounds(375, 20, 400, 40);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.DARK_GRAY);
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




        labelResponse = new JLabel("Response");
        labelResponse.setBounds(750, 120, 200, 40);
        labelResponse.setFont(new Font("serif", Font.BOLD, 30));
        add(labelResponse);

        labelVote = new JLabel("Vote Count");
        labelVote.setBounds(970, 120, 200, 40);
        labelVote.setFont(new Font("serif", Font.BOLD, 30));
        add(labelVote);




//        buttonVote = new JButton();
//        buttonVote.setBounds(970, 180, 150, 100);
//        buttonVote.setFont(new Font("serif", Font.BOLD, 90));
//        add(buttonVote);




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
        JButton button = (JButton) e.getSource();
        if(e.getSource().equals(buttonCongress)){
            applyButtonClickResponse(buttonCongress);
            if(confirmOptionYesNo())voteResponse(buttonCongress);
            else applyButtonClickResponseReset(buttonCongress);

        }else if(e.getSource().equals(buttonAAP)){
            applyButtonClickResponse(buttonAAP);
            if(confirmOptionYesNo())  voteResponse(buttonAAP);
            else applyButtonClickResponseReset(buttonAAP);

        }else if(e.getSource().equals(buttonJDU)){
            applyButtonClickResponse(buttonJDU);
            if(confirmOptionYesNo()) voteResponse(buttonJDU);
            else applyButtonClickResponseReset(buttonJDU);

        }else if(e.getSource().equals(buttonRJD)){
            applyButtonClickResponse(buttonRJD);
            if(confirmOptionYesNo())voteResponse(buttonRJD);
            else applyButtonClickResponseReset(buttonRJD);

        }else if(e.getSource().equals(buttonSP)){
            applyButtonClickResponse(buttonSP);
            if(confirmOptionYesNo()) voteResponse(buttonSP);
            else applyButtonClickResponseReset(buttonSP);

        }else if(e.getSource().equals(buttonBSP)){
            applyButtonClickResponse(buttonBSP);
            if(confirmOptionYesNo()) voteResponse(buttonBSP);
            else applyButtonClickResponseReset(buttonBSP);


        }else if(e.getSource().equals(buttonShivSena)){
            applyButtonClickResponse(buttonShivSena);
            if(confirmOptionYesNo())voteResponse(buttonShivSena);
            else applyButtonClickResponseReset(buttonShivSena);

        }else if(e.getSource().equals(buttonCPI)){
            applyButtonClickResponse(buttonCPI);
            if(confirmOptionYesNo()) voteResponse(buttonCPI);
            else applyButtonClickResponseReset(buttonCPI);

        }else if(e.getSource().equals(buttonBJP)){
            applyButtonClickResponse(buttonBJP);
            if(confirmOptionYesNo()) voteResponse(buttonBJP);
            else applyButtonClickResponseReset(buttonBJP);

        }

    }
    public void voteResponse(JButton response){
        buttonResponse = new JButton();
        buttonResponse.setIcon(response.getIcon());
        buttonResponse.setBounds(740, 180, 150, 100);
        add(buttonResponse);
        applyButtonBorderResponse(buttonResponse);
        buttonVote = new JButton("+1");
        buttonVote.setBounds(970, 180, 150, 100);
        buttonVote.setFont(new Font("serif", Font.BOLD, 90));
        buttonVote.setForeground(Color.GREEN);
        add(buttonVote);
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 3);
        buttonVote.setBorder(border);
        JOptionPane.showMessageDialog(
                this,
                "You Have Voted Successfully",
                "Congratulation !",
                JOptionPane.ERROR_MESSAGE
        );
        int cong = 0, aap = 0, jdu = 0, rjd = 0, sp = 0, bsp = 0, shivsena = 0, cpi = 0, bjp = 0;
        if(response.equals(buttonCongress)) cong+=1;
        else if(response.equals(buttonJDU)) jdu+=1;
        else if(response.equals(buttonRJD)) rjd+=1;
        else if(response.equals(buttonSP)) sp+=1;
        else if(response.equals(buttonBSP)) bsp+=1;
        else if(response.equals(buttonShivSena)) shivsena+=1;
        else if(response.equals(buttonCPI)) cpi+=1;
        else if(response.equals(buttonBJP)) bjp+=1;
        updateWinnerTable(cong, aap, jdu, rjd, sp, bsp, shivsena, cpi, bjp);
        setVisible(false);
        new Greeting();
    }

    private void updateWinnerTable(int cong, int aap, int jdu, int rjd, int sp, int bsp, int shivsena, int cpi, int bjp) {
        Voter voter = new Voter();
        String vId = voter.voterId;
        String vName = voter.name;
        System.out.println(vId+" "+vName);
//        String sql = "insert into winner(voterId, voterName, cong, aap, jdu, rjd, sp, bsp, shivsena, cpi, bjp)"+"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    }




    public static void main(String[] args) {
        new Home();
    }


}
