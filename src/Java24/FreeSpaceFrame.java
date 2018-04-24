package Java24;

import javax.swing.*;

import java.awt.*;

import static com.sun.deploy.util.DeployUIManager.setLookAndFeel;

public class FreeSpaceFrame extends JFrame {

    public FreeSpaceFrame() {
        super("Disk Free Space");
        setLookAndFeel();
        setSize(500, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel freePanel = new FreeSpacePanel();
        add(freePanel);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        FreeSpaceFrame frame = new FreeSpaceFrame();
    }
}
