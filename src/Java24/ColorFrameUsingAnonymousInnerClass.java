package Java24;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFrameUsingAnonymousInnerClass extends JFrame {

    JButton red, green, blue;

    public ColorFrameUsingAnonymousInnerClass() {
        super("ColorFrameUsingAnonymousInnerClass");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);

        // begin anonymous inner class
        ActionListener act = new ActionListener() { //Interface with method actionPerformed
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == red) {
                    getContentPane().setBackground(Color.RED);
                }
                if (event.getSource() == green) {
                    getContentPane().setBackground(Color.GREEN);
                }
                if (event.getSource() == blue) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        }; // end anonymous inner class

        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        new ColorFrameUsingAnonymousInnerClass();
    }
}
