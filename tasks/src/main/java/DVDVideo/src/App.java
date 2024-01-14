package DVDVideo.src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.Random;

class Chomper {
    public static void main(String[] args) throws Exception { 
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Button");
        
        Image frame = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\1.png"));
        Image frame2 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\2.png"));
        Image frame3 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\3.png"));
        Image frame4 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\4.png"));
        Image frame5 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\5.png"));
        Image frame6 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\6.png"));
        Image frame7 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\7.png"));
        
        frame = frame.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        frame2 = frame2.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        JLabel jlabel = new JLabel(getImage());
        jPanel.add(jButton);
        jPanel.setBackground(Color.BLACK);
        jPanel.add(jlabel);
        //jPanel.add(jLabel2);
        jFrame.add(jPanel);
        
        ActionListener actionListener = new ActionListener() {
            int count1 = 0;
            int count2 = 200;
            int x = 5;
            int y = 3;
            @Override
            public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    jlabel.setLocation(count1, count2);
                    count1 += x;
                    count2 += y;
                    if(count1 > 1700){
                        x = -5;
                        try {
                            jlabel.setIcon(getImage());
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    if(count1 < 0){
                        x = 5;
                        try {
                            jlabel.setIcon(getImage());
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    if(count2 > 880){
                        y = - 3;
                        try {
                            jlabel.setIcon(getImage());
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    if(count2 < -20){
                        y = 3;
                        try {
                            jlabel.setIcon(getImage());
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    
            }
        };
        // jButton.addActionListener(actionListener);
        Timer timer = new Timer(0, actionListener);
        timer.start();
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 960, dimension.height / 2 - 540 , 1920, 1080);
        return jFrame;
    }
    public static ImageIcon getImage() throws IOException{
        Random r = new Random();
        Image image;
        ImageIcon icon;

        try {
            image = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\" + String.valueOf(r.nextInt(1,7))  + ".png"));
            image = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            icon = new ImageIcon(image);
            return icon;
        } catch (IOException e) {
            e.printStackTrace();
        }
        image = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\DVDVideo\\src\\1.png"));
        image = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        icon = new ImageIcon(image);
        return icon;
    }
    

    // public static void main(String[] args) throws Exception {
    //     final Image frame = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\Two\\Youtube\\src\\Action\\Action\\src\\png-clipart-butterfly-insect-butterfly-leaf-brush-footed-butterfly.png"));
    //     Runnable r = new Runnable() {

    //         @Override
    //         public void run() {
    //             JPanel gui = new JPanel(new BorderLayout());

    //             final JLabel animation = new JLabel(new ImageIcon(frame));
    //             gui.add(animation, BorderLayout.CENTER);

    //             ActionListener animate = new ActionListener() {

    //                 private int index = 0;

    //                 @Override
    //                 public void actionPerformed(ActionEvent e) {
    //                     if (index<3) {
    //                         index++;
    //                     } else {
    //                         index = 0;
    //                     }
    //                     animation.setIcon(new ImageIcon(frame));
    //                 }
    //             };
    //             final Timer timer = new Timer(200,animate);

    //             final JToggleButton b = new JToggleButton("Start/Stop");
    //             ActionListener startStop = new ActionListener() {

    //                 @Override
    //                 public void actionPerformed(ActionEvent e) {
    //                     if (b.isSelected()) {
    //                         timer.start();
    //                     } else {
    //                         timer.stop();
    //                     }
    //                 }
    //             };
    //             b.addActionListener(startStop);
    //             gui.add(b, BorderLayout.PAGE_END);

    //             JOptionPane.showMessageDialog(null, gui);
    //         }
    //     };
    //     // Swing GUIs should be created and updated on the EDT
    //     // http://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
    //     SwingUtilities.invokeLater(r);
    // }
}