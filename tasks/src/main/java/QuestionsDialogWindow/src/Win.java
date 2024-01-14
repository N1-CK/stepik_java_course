package QuestionsDialogWindow.src;

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
        JButton okButton = new JButton("ОК");
        JPanel panel = new JPanel();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer1 = JOptionPane.showConfirmDialog(null, "Вы действительно хотите выполнить первое действие?",
                        "Вопрос", JOptionPane.YES_NO_OPTION);
                int answer2 = JOptionPane.showConfirmDialog(null, "Вы действительно хотите выполнить второе действие?",
                        "Вопрос", JOptionPane.YES_NO_OPTION);
                String answers = answer1 + "" + answer2;
                switch (answers) {
                    case "00":
                        JOptionPane.showMessageDialog(panel, "Вы ответили да на оба вопроса");
                        break;
                    case "01":
                    JOptionPane.showMessageDialog(panel, "Вы ответили да на первый вопрос и нет на второй");
                        break;
                    case "10":
                    JOptionPane.showMessageDialog(panel, "Вы ответили нет на первый вопрос и да на второй");
                        break;
                    case "11":
                    JOptionPane.showMessageDialog(panel, "Вы ответили нет на оба вопроса");
                        break;
                    default:
                        break;
                }
                
            }
        });
        panel.add(okButton);
        jFrame.add(panel);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame frame = getFrame();
    }
}
