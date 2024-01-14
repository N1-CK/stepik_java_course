package Grass.src;


import java.awt.*;
import javax.swing.*;

class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame();
        MyComponent component = new MyComponent();
        JButton jButton = new JButton("Button");
        jFrame.add(jButton);
        jFrame.add(component);
        jButton.setVisible(false);
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 400, 800, 800);
        return jFrame;
    }
}
