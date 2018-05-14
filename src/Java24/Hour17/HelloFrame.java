package Java24.Hour17;

import javax.swing.*;

import static com.sun.deploy.util.DeployUIManager.setLookAndFeel;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        super("Hello Frame!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        HelloFrame frame = new HelloFrame();
    }
}
