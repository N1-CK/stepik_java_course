package YourNameDIalogWindow.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Win {

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 150, dimension.height / 2 - 150, 300, 300);
        JTextField nameTextField = new JTextField(20);
        JButton okButton = new JButton("ОК");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Введите ваше имя");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                JOptionPane.showMessageDialog( panel , "Ваше имя: " + name);
            }
        });
        panel.add(label);
        panel.add(nameTextField);
        panel.add(okButton);
        jFrame.add(panel);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame frame = getFrame();
    }
}
