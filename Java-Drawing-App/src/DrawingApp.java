import javax.swing.*;
import java.awt.*;

public class DrawingApp {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Java Drawing App");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel panel = new DrawPanel();

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> panel.clear());

        JButton redButton = new JButton("Red");
        redButton.addActionListener(e -> panel.setColor(Color.RED));

        JButton blueButton = new JButton("Blue");
        blueButton.addActionListener(e -> panel.setColor(Color.BLUE));

        JButton blackButton = new JButton("Black");
        blackButton.addActionListener(e -> panel.setColor(Color.BLACK));

        JPanel controls = new JPanel();
        controls.add(redButton);
        controls.add(blueButton);
        controls.add(blackButton);
        controls.add(clearButton);

        frame.add(controls, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}