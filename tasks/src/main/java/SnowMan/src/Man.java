package SnowMan.src;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Man extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        Color colorGrey = new Color(180,180,180);
        Color colorGrey2 = new Color(40,40,40);
        Color white = new Color(235, 235, 235);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(white);
        g2.fill(getBounds());
        g2.setColor(colorGrey2);
        g2.setStroke(new BasicStroke(5));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawOval(getHeight() / 2 - 150, getWidth() / 2 - 55, 300, 300);
        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 112, getWidth() / 2 - 200, 225, 225);
        g2.setColor(colorGrey2);
        
        g2.drawOval(getHeight() / 2 - 112, getWidth() / 2 - 200, 225, 225);
        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 65, getWidth() / 2 - 280, 130, 130);
        g2.setColor(colorGrey2);
        g2.drawOval(getHeight() / 2 - 65, getWidth() / 2 - 280, 130, 130);
        g2.setColor(white);
        g2.fillOval(getHeight() / 2 - 75, getWidth() / 2 - 300, 150, 30);
        g2.fillRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        g2.setColor(colorGrey2);
        g2.drawOval(getHeight() / 2 - 75, getWidth() / 2 - 300, 150, 30);
        g2.setColor(white);
        g2.fillRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        g2.setColor(colorGrey2);
        g2.drawRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        g2.drawLine(330, getWidth() / 2 - 310, 430, getWidth() / 2 - 310);
        //глаза и пуговицы
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(getHeight() / 2 - 5, getWidth() / 2 - 308, 15, 15);
        g2.drawOval(getHeight() / 2 - 30, getWidth() / 2 - 250, 20, 20);
        g2.fillOval(getHeight() / 2 - 22, getWidth() / 2 - 242, 10, 10);
        g2.drawOval(getHeight() / 2 + 30, getWidth() / 2 - 250, 20, 20);
        g2.fillOval(getHeight() / 2 + 38, getWidth() / 2 - 242, 10, 10);
        g2.fillOval(getHeight() / 2 - 20, getWidth() / 2 - 190, 10, 10);
        g2.fillOval(getHeight() / 2 - 5, getWidth() / 2 - 180, 10, 10);
        g2.fillOval(getHeight() / 2 + 10, getWidth() / 2 - 175, 10, 10);
        g2.fillOval(getHeight() / 2 + 25, getWidth() / 2 - 180, 10, 10);
        g2.fillOval(getHeight() / 2 + 40, getWidth() / 2 - 190, 10, 10);
        g2.drawOval(getHeight() / 2 + 30, getWidth() / 2 - 140, 15, 15);
        g2.drawOval(getHeight() / 2 + 45, getWidth() / 2 - 100, 15, 15);
        g2.drawOval(getHeight() / 2 + 44, getWidth() / 2 - 60, 15, 15);


        //морковь
        GeneralPath path = new GeneralPath();
        path.moveTo(getHeight() / 2 + 10, getWidth() / 2 - 215);
        path.lineTo(getHeight() / 2 + 100, getWidth() / 2 - 230);
        path.lineTo(getHeight() / 2 + 15, getWidth() / 2 - 200);
        path.quadTo(getHeight() / 2 + 15, getWidth() / 2 - 200, getHeight() / 2 + 10, getWidth() / 2 - 215);
        g2.setColor(white);
        g2.fill(path);
        g2.setColor(colorGrey2);
        g2.draw(path);

        //правая рука
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(getHeight() / 2 + 115, getWidth() / 2 - 100, getHeight() / 2 + 220, getWidth() / 2 - 130);
        g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 235, getWidth() / 2 - 160);
        g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 265, getWidth() / 2 - 145);
        g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 250, getWidth() / 2 - 110);
        //левая рука
        g2.drawLine(getHeight() / 2 - 115, getWidth() / 2 - 100, getHeight() / 2 - 220, getWidth() / 2 - 130);
        g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 235, getWidth() / 2 - 160);
        g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 265, getWidth() / 2 - 145);
        g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 250, getWidth() / 2 - 110);
    }
}
