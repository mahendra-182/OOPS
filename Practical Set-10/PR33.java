import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PR33 extends JFrame {

    public PR33() {
        setTitle("PR33 - Colored Text");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            JLabel label = new JLabel("Text " + i, SwingConstants.CENTER);
            label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
            Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            label.setForeground(color);
            add(label);
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PR33();
    }
}