import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class DrawPanel extends JPanel {
    private ArrayList<Point> points = new ArrayList<>();
    private Color currentColor = Color.BLACK;

    public DrawPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }
    
    public void setColor(Color color) {
        currentColor = color;
    }

    public void clear() {
        points.clear();
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        for (Point p : points) {
            g.fillOval(p.x, p.y, 5, 5);
        }
    }
}