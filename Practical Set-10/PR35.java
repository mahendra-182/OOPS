import javax.swing.*;
import java.awt.*;

public class PR35 extends JFrame {

    private static final String[] LABELS  = {"Projects\n20%", "Quizzes\n10%", "Midterm\n30%", "Final\n40%"};
    private static final int[]    HEIGHTS = {100, 50, 150, 200};
    private static final Color[]  COLORS  = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

    public PR35() {
        setTitle("PR35 - Grade Bar Chart");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chartPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x = 60;
                int barWidth = 70;
                int baseY = 260;

                for (int i = 0; i < HEIGHTS.length; i++) {
                    g.setColor(COLORS[i]);
                    g.fillRect(x, baseY - HEIGHTS[i], barWidth, HEIGHTS[i]);

                    g.setColor(Color.BLACK);
                    g.drawRect(x, baseY - HEIGHTS[i], barWidth, HEIGHTS[i]);

                    // Draw label below bar
                    String[] parts = LABELS[i].split("\n");
                    g.drawString(parts[0], x + 5, baseY + 18);
                    g.drawString(parts[1], x + 18, baseY + 33);

                    x += barWidth + 30;
                }

                // Draw baseline
                g.setColor(Color.DARK_GRAY);
                g.drawLine(40, baseY, 440, baseY);

                // Title
                g.setFont(new Font("Arial", Font.BOLD, 14));
                g.drawString("Grade Distribution Chart", 140, 30);
            }
        };

        add(chartPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PR35();
    }
}