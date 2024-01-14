package Cars.src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JButton jButton = new JButton("Button");
        JLabel j1 = new JLabel(getImage("1", 200, 100));
        JLabel j2 = new JLabel(getImage("2", 200, 100));
        JLabel j3 = new JLabel(getImage("3", 200, 100));
        JLabel j4 = new JLabel(getImage("4", 200, 100));
        JLabel j5 = new JLabel(getImage("6", 200, 100));
        JLabel win = new JLabel(getImage("9", 1000, 400));
        JLabel winner = new JLabel(getImage("6", 200, 100));
        JLabel[] all = {
                new JLabel(getImage("1", 1000, 500)),
                new JLabel(getImage("2", 1000, 500)),
                new JLabel(getImage("3", 1000, 500)),
                new JLabel(getImage("4", 1000, 500)),
                new JLabel(getImage("6", 1000, 500)),
                new JLabel(getImage("9", 715, 371))
        };
        jPanel.setBackground(Color.WHITE);

        jPanel.add(j1);
        jPanel.add(j2);
        jPanel.add(j3);
        jPanel.add(j4);
        jPanel.add(j5);

        jFrame.add(jButton);
        jFrame.add(jPanel);
        // ActionListener actionListener = new ActionListener() {
        // double count = 0;
        // double s1 = 0;
        // double s2 = 0;
        // double s3 = 0;
        // double s4 = 0;
        // double s5 = 0;
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // jButton.setVisible(false);
        // j1.setLocation((int) s1, 0);
        // j2.setLocation((int) s2, 200);
        // j3.setLocation((int) s3, 400);
        // j4.setLocation((int) s4, 600);
        // j5.setLocation((int) s5, 800);
        // s1 += runCar(count);
        // s2 += runCar(count);
        // s3 += runCar(count);
        // s4 += runCar(count);
        // s5 += runCar(count);
        // count += 0.01;
        // }
        // };

        Timer timer = new Timer(0, new ActionListener() {
            double[] s = { 0, 0, 0, 0, 0 };
            Random r = new Random();
            double count = 0;
            JThread thread1 = new JThread("0", j1);
            JThread thread2 = new JThread("1", j2);
            JThread thread3 = new JThread("2", j3);
            JThread thread4 = new JThread("3", j4);
            JThread thread5 = new JThread("4", j5);

            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setVisible(false);
                // j1.setLocation((int) s[0], 0);
                // j2.setLocation((int) s[1], 200);
                // j3.setLocation((int) s[2], 400);
                // j4.setLocation((int) s[3], 600);
                // j5.setLocation((int) s[4], 800);
                if (!thread1.isF() && !thread2.isF() && !thread3.isF() && !thread4.isF() && !thread5.isF()) {
                    thread1.run();
                    thread2.run();
                    thread3.run();
                    thread4.run();
                    thread5.run();
                } else {
                    if (thread1.isF()) {
                        JLabel j = new JLabel(getImage("1", 1000, 500));
                        jPanel.add(j);
                        win.setLocation(150, 100);
                        jFrame.add(win);
                        jFrame.setTitle("Победила машина номер 1");
                        jPanel.add(win);
                        jFrame.add(jPanel);
                        j2.setEnabled(false);
                        j3.setEnabled(false);
                        j4.setEnabled(false);
                        j5.setEnabled(false);
                        
                        thread1.interrupt();
                        thread2.interrupt();
                        thread3.interrupt();
                        thread4.interrupt();
                        thread5.interrupt();
                        return;
                    }
                    if (thread2.isF()) {
                        JLabel j = new JLabel(getImage("2", 1000, 500));
                        jPanel.add(j);
                        win.setLocation(150, 100);
                        jFrame.add(win);
                        jFrame.setTitle("Победила машина номер 2");
                        jPanel.add(win);
                        jFrame.add(jPanel);
                        j1.setEnabled(false);
                        j3.setEnabled(false);
                        j4.setEnabled(false);
                        j5.setEnabled(false);
                        thread1.interrupt();
                        thread2.interrupt();
                        thread3.interrupt();
                        thread4.interrupt();
                        thread5.interrupt();
                        return;
                    }
                    if (thread3.isF()) {
                        JLabel j = new JLabel(getImage("3", 1000, 500));
                        jPanel.add(j);
                        win.setLocation(150, 100);
                        jFrame.setTitle("Победила машина номер 3");
                        jPanel.add(win);
                        jFrame.add(jPanel);
                        j1.setEnabled(false);
                        j2.setEnabled(false);
                        j4.setEnabled(false);
                        j5.setEnabled(false);
                        
                        thread1.interrupt();
                        thread2.interrupt();
                        thread3.interrupt();
                        thread4.interrupt();
                        thread5.interrupt();
                        return;
                    }
                    if (thread4.isF()) {
                        JLabel j = new JLabel(getImage("4", 1000, 500));
                        jPanel.add(j);
                        win.setLocation(150, 100);
                        jFrame.add(win);
                        jFrame.setTitle("Победила машина номер 4");
                        jPanel.add(win);
                        jFrame.add(jPanel);
                        j1.setEnabled(false);
                        j2.setEnabled(false);
                        j3.setEnabled(false);
                        j5.setEnabled(false);
                        
                        thread1.interrupt();
                        thread2.interrupt();
                        thread3.interrupt();
                        thread4.interrupt();
                        thread5.interrupt();
                        return;
                    }
                    if (thread5.isF()) {
                        JLabel j = new JLabel(getImage("5", 1000, 500));
                        jPanel.add(j);
                        win.setLocation(150, 100);
                        jFrame.add(jPanel);
                        jFrame.setTitle("Победила машина номер 5");
                        jPanel.add(win);
                        j1.setEnabled(false);
                        j2.setEnabled(false);
                        j3.setEnabled(false);
                        j4.setEnabled(false);
                        
                        thread1.interrupt();
                        thread2.interrupt();
                        thread3.interrupt();
                        thread4.interrupt();
                        thread5.interrupt();
                        return;
                    }
                }

                // if (thread1.isF() == false && thread2.isF() == false && thread3.isF() ==
                // false && thread4.isF() == false && thread5.isF() == false) {

                // } else {
                // jButton.setText("Победила машина номер: " + (i + 1));
                // jPanel.add(thread1.j);

                // if(count == 0){
                // jPanel.add(all[i]);
                // jPanel.add(win);
                // win.setLocation(150, 500);
                // System.out.println("Победила машина номер: " + (i + 1));
                // count += 0.01;
                // }
                // }

            }

        });
        // timer.
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

    public static ImageIcon getImage(String s, int resolutionX, int resolutionY) {
        try {

            Image image = ImageIO.read(new File(
                    "C:\\Projects\\Java [Stepik]\\JavaSwing\\Cars\\src\\Images\\" + s + ".png"));
            image = image.getScaledInstance(resolutionX, resolutionY, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            return icon;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int runCar(double speed) {
        Random r = new Random();
        double baseSpeed = Math.PI / 16;
        double totalSpeed = speed - r.nextDouble(0.01, 2) + r.nextDouble(0.1, 1) / r.nextDouble(0, 2);
        if (totalSpeed < 0 || totalSpeed > 20) {
            totalSpeed = 5;
        }
        return (int) totalSpeed;
    }
}

class JThread extends Thread {
    Random r = new Random();
    double s = 0;
    JLabel winner;
    ImageIcon icon;
    Image image;
    boolean f = false;

    public boolean isF() {
        return f;
    }

    public double getS() {
        return s;
    }

    JLabel j;

    JThread(String name, JLabel j) {
        super(name);
        this.j = j;
    }

    public void run() {
        try {
            if (s > 870) {
                f = true;
                interrupt();
                return;
            } else {
                s += r.nextDouble(25, 40) / r.nextDouble(1, 5);
                j.setLocation((int) s, 0 + Integer.parseInt(this.getName().substring(0)) * 200);
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
        }

    }
}
