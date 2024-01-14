package TrafficLight_;
import javax.swing.JFrame;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150 , 576, 576);
        return jFrame;
    }
}
