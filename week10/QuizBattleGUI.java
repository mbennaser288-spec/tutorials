import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizBattleGUI extends JFrame implements ActionListener {
    private final JLabel lblQuestion = new JLabel();
    private final JLabel lblResult = new JLabel("Answer the question");
    private final JLabel lblScore = new JLabel("Score: 0");
    private final JButton btn1 = new JButton();
    private final JButton btn2 = new JButton();

    private final Questions[] quiz = {
        new Questions("Which keyword creates an object?", "new", "class", "new"),
        new Questions("Which keyword inherits a class?", "extends", "import", "extends"),
        new Questions("Which method starts a Java program?", "main", "start", "main"),
        new Questions("Which modifier hides a field?", "private", "public", "private")
    };

    private int currentQuestion = 0;
    private int score = 0;

    public QuizBattleGUI() {
        setTitle("Programming Quiz Battle");
        setSize(540, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(245, 248, 252));
        setContentPane(panel);

        lblQuestion.setBounds(45, 35, 430, 35);
        lblQuestion.setFont(new Font("SansSerif", Font.BOLD, 17));
        btn1.setBounds(75, 100, 160, 48);
        btn2.setBounds(295, 100, 160, 48);
        lblResult.setBounds(45, 180, 350, 30);
        lblResult.setFont(new Font("SansSerif", Font.PLAIN, 15));
        lblScore.setBounds(410, 180, 90, 30);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        panel.add(lblQuestion);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(lblResult);
        panel.add(lblScore);

        showQuestion();
        setVisible(true);
    }

    private void showQuestion() {
        Questions question = quiz[currentQuestion];
        lblQuestion.setText(question.getQuestion());
        btn1.setText(question.getOption1());
        btn2.setText(question.getOption2());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Questions question = quiz[currentQuestion];

        if (question.isCorrect(button.getText())) {
            score++;
            lblResult.setText("Correct! You defeated the Code Boss!");
            lblScore.setText("Score: " + score);
            currentQuestion++;

            if (currentQuestion == quiz.length) {
                JOptionPane.showMessageDialog(this,
                        "Challenge complete! Final score: " + score + "/" + quiz.length,
                        "Java Champion", JOptionPane.INFORMATION_MESSAGE);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                lblQuestion.setText("You completed the Programming Quiz Battle!");
            } else {
                showQuestion();
            }
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizBattleGUI::new);
    }
}

