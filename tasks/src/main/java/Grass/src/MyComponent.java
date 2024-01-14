package Grass.src;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class MyComponent extends JComponent {
    Image frame;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                try {
                    frame = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing2\\Grass\\src\\1.jpg"));
                    frame = frame.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
                    g2.drawImage(frame, j * 50, i * 50, getFocusCycleRootAncestor());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}