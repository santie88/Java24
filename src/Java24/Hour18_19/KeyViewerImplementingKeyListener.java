package Java24.Hour18_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.javafx.fxml.expression.Expression.add;

public class KeyViewerImplementingKeyListener extends JFrame implements KeyListener {

    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");

    public KeyViewerImplementingKeyListener() {
        super("Key Viewer");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Do nothing
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Do nothing
    }

    public static void main(String[] arguments) {
        new KeyViewerImplementingKeyListener();
    }

}
