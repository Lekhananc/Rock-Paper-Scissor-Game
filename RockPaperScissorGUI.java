import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorGUI extends JFrame {

    RockPaperScissor rockPaperScissor;

    JButton rockBtn, paperBtn, scissorBtn;
    JLabel computerChoice;
    public RockPaperScissorGUI(){
        super("Rock Paper Scissor Game");
        setSize(450,547);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addGUI();
    }

    public void addGUI(){
        JLabel computerScore = new JLabel("Computer Score: 0");
        computerScore.setBounds(0,43,450,30);
        computerScore.setFont(new Font("Dialog",Font.BOLD,26));
        computerScore.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerScore);

        computerChoice = new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog",Font.PLAIN,18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        JLabel playerScore = new JLabel("Player Score: 0");
        playerScore.setBounds(0,317,450,30);
        playerScore.setFont(new Font("Dialog",Font.BOLD,26));
        playerScore.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScore);

        rockBtn = new JButton("Rock");
        rockBtn.setBounds(40,387,105,81);
        rockBtn.setFont(new Font("Dialog",Font.PLAIN,18));
        add(rockBtn);

        rockBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissor.playMoves("Rock");
            }
        });

        paperBtn = new JButton("Paper");
        paperBtn.setBounds(165,387,105,81);
        paperBtn.setFont(new Font("Dialog",Font.PLAIN,18));
        add(paperBtn);

        paperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissor.playMoves("Paper");
            }
        });

        scissorBtn = new JButton("Scissor");
        scissorBtn.setBounds(290,387,105,81);
        scissorBtn.setFont(new Font("Dialog",Font.PLAIN,18));
        add(scissorBtn);

        scissorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissor.playMoves("Scissor");
            }
        });
    }

    public void showMessage(String message){
        JDialog resultDialog = new JDialog(this,"Result",true);
        resultDialog.setSize(227,124);
        resultDialog.setResizable(false);
        resultDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel resultLabel = new JLabel(message);
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        JButton tryAgain = new JButton("Try Again??");
        tryAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computerChoice.setText("?");
                resultDialog.dispose();
            }
        });
        resultDialog.add(tryAgain,BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(null);
        resultDialog.setVisible(true);
    }
}