package TrafficLight_;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Times New Roman", Font.ITALIC, 22);
        Color colorRed = new Color(255,4,4);
        Color colorYellow = new Color(255,255,0);
        Color colorGreen = new Color(17,255,0);
        Color colorGrey = new Color(180,180,180);
        Color colorGrey2 = new Color(40,40,40);
        Color white = new Color(235, 235, 235);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(colorGrey);
        g2.fill(getBounds());
        g2.setColor(colorGrey2);
        g2.fillRoundRect(getHeight() / 2 - 100 / 2, getWidth() / 2 - 336 / 2, 100, 306, 20, 20);
        
        g2.fillArc(getHeight() / 2 - 45, getWidth() / 2 - 193, 90, 35, 0, 180);
        
        g2.fillRoundRect(getHeight() / 2 - 205, getWidth() / 2 - 150, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 - 212, getWidth() / 2 - 155, 160, 160);
        g2.setColor(colorGrey2);////
        g2.fillRoundRect(getHeight() / 2 - 205, getWidth() / 2 - 50, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 - 212, getWidth() / 2 - 55, 160, 160);
        g2.setColor(colorGrey2);
        g2.fillRoundRect(getHeight() / 2 - 205, getWidth() / 2 + 50, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 - 212, getWidth() / 2 + 45, 160, 160);
        g2.setColor(colorGrey2);


        g2.fillRoundRect(getHeight() / 2 + 55, getWidth() / 2 - 150, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 + 50, getWidth() / 2 - 155, 160, 160);
        g2.setColor(colorGrey2);////
        g2.fillRoundRect(getHeight() / 2 + 55, getWidth() / 2 - 50, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 + 50, getWidth() / 2 - 55, 160, 160);
        g2.setColor(colorGrey2);
        g2.fillRoundRect(getHeight() / 2 + 55, getWidth() / 2 + 50, 150, 150, 20, 20);
        g2.setColor(colorGrey);
        g2.fillOval(getHeight() / 2 + 50, getWidth() / 2 + 45, 160, 160);
        g2.setColor(colorGrey);


        g2.fillRoundRect(getHeight() / 2 - 263, getWidth() / 2 - 336 / 2, 150, 500, 20, 20);
        g2.fillRoundRect(getHeight() / 2 + 115, getWidth() / 2 - 336 / 2, 150, 500, 20, 20);
        g2.setColor(colorGrey);
        g2.fillRoundRect(getHeight() / 2  - 350, getWidth() / 2 + 140, 500, 100, 20, 20);
        g2.setColor(colorGrey2);
        g2.fillRoundRect(getHeight() / 2 - 50 / 2, getWidth() - 135, 50, 60, 20, 20);




        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 - 162, 90, 90);
        g2.setColor(colorGrey2);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 - 154, 90, 90);
        g2.setColor(colorRed);
        g2.fillOval(getHeight() / 2 - 75 / 2, getWidth() / 2 - 150, 75, 75);
        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 - 62, 90, 90);
        g2.setColor(colorGrey2);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 - 54, 90, 90);
        g2.setColor(colorYellow);
        g2.fillOval(getHeight() / 2 - 75 / 2, getWidth() / 2 - 50, 75, 75);
        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 + 38, 90, 90);
        g2.setColor(colorGrey2);
        g2.fillOval(getHeight() / 2 - 90 / 2, getWidth() / 2 + 46, 90, 90);
        g2.setColor(colorGreen);
        g2.fillOval(getHeight() / 2 - 75 / 2, getWidth() / 2 + 50, 75, 75);
        // GeneralPath path = new GeneralPath();
        // path.moveTo(50, 50);
        // path.lineTo(146, 50);
        // path.quadTo(146, 50, 150, 60);
        // path.lineTo(150, 140);
        // path.quadTo(150, 140, 150, 140);
        
        // path.closePath();
        // g2.draw(path);

        // path.quadTo();
    }
}
