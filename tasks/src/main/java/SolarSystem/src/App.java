package SolarSystem.src;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Button");
        JLabel j1 = new JLabel(getImage("Sun", 130));
        JLabel j2 = new JLabel(getImage("Mercury", 20));
        JLabel j3 = new JLabel(getImage("Venus", 30));
        JLabel j4 = new JLabel(getImage("Earth", 40));
        JLabel j5 = new JLabel(getImage("Mars", 30));
        JLabel j6 = new JLabel(getImage("Jupiter", 60));
        JLabel j7 = new JLabel(getImage("Saturn", 80));
        JLabel j8 = new JLabel(getImage("Uranus", 55));
        JLabel j9 = new JLabel(getImage("Neptune", 30));
        

        jPanel.setBackground(Color.BLACK);

        jPanel.add(j1);
        jPanel.add(j2);
        jPanel.add(j3);
        jPanel.add(j4);
        jPanel.add(j5);
        jPanel.add(j6);
        jPanel.add(j7);
        jPanel.add(j8);
        jPanel.add(j9);

        jFrame.add(jButton);
        jFrame.add(jPanel);

        ActionListener actionListener = new ActionListener() {
            double count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setVisible(false);
                j1.setLocation(475, 475);
                drawOrbitingSphere(count, j2, jFrame.getSize().getWidth() / 2 - (int) j2.getHeight() / 2, 75);
                drawOrbitingSphere(count * 0.9, j3, jFrame.getSize().getWidth() / 2 - (int) j3.getHeight() / 2, 105);
                drawOrbitingSphere(count * 0.8, j4, jFrame.getSize().getWidth() / 2 - (int) j4.getHeight() / 2, 145);
                drawOrbitingSphere(count * 0.7, j5, jFrame.getSize().getWidth() / 2 - (int) j5.getHeight() / 2, 185);
                drawOrbitingSphere(count * 0.6, j6, jFrame.getSize().getWidth() / 2 - (int) j6.getHeight() / 2, 235);
                drawOrbitingSphere(count * 0.4, j7, jFrame.getSize().getWidth() / 2 - (int) j7.getHeight() / 2, 310);
                drawOrbitingSphere(count * 0.3, j8, jFrame.getSize().getWidth() / 2 - (int) j8.getHeight() / 2, 390);
                drawOrbitingSphere(count * 0.2, j9, jFrame.getSize().getWidth() / 2 - (int) j9.getHeight() / 2, 440);
                count += 0.1;
            }
        };
        Timer timer = new Timer(0, actionListener);
        timer.start();
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 540, dimension.height / 2 - 540, 1080, 1080);
        return jFrame;
    }

    public static ImageIcon getImage(String s, int resolution) {
        try {

            Image image = ImageIO.read(new File(
                    "C:\\Projects\\Java [Stepik]\\JavaSwing\\SolarSystem\\src\\" + s + ".png"));
            image = image.getScaledInstance(resolution, resolution, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            return icon;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void drawOrbitingSphere(double timeInterval, JLabel j, double orbit, double orbitR) {

        // let's just choose a bunch of values that we'll need
        double orbitX = orbit; /* x-coordinate in orbit's center */
        double orbitY = orbit; /* y-coordinate in orbit's center */
        double orbitRadius = orbitR;
        double orbitSpeed = Math.PI / 16;
    
        /*
         * based on the current time interval, we'll calculate where the sphere
         * is at on its orbit
         */
        double radian = orbitSpeed * timeInterval;
        double drawX = orbitX + orbitRadius * Math.cos(radian);
        double drawY = orbitY + orbitRadius * Math.sin(radian);
    
        // use whichever Draw method is provided by your API
        j.setLocation((int)drawX,(int) drawY);
    }
}
