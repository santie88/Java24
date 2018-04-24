package Java24;

import javax.swing.*;
import java.awt.*;

import static com.sun.deploy.util.DeployUIManager.setLookAndFeel;

public class SwingComponents extends JFrame {

    public SwingComponents() {
        super("Swing Components");
        setLookAndFeel();
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);


        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        add(play);
        add(stop);
        add(pause);

        JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        add(pageLabel);
        add(pageAddress);

        JCheckBox jumboSize = new JCheckBox("Jumbo Size");
        JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
        JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
        JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
        ButtonGroup meals = new ButtonGroup(); //Can select only one
        meals.add(frogLegs);
        meals.add(fishTacos);
        meals.add(emuNuggets);
        add(jumboSize);
        add(frogLegs);
        add(fishTacos);
        add(emuNuggets);

        JComboBox profession = new JComboBox();
        profession.addItem("Butcher");
        profession.addItem("Baker");
        profession.addItem("Candlestick maker");
        profession.addItem("Fletcher");
        profession.addItem("Fighter");
        profession.addItem("Technical writer");
        add(profession);

        JTextArea comments = new JTextArea(4, 25);
        add(comments);

        JTextArea comments2 = new JTextArea("I should have been a pair\n"
                + "of ragged claws.", 4, 25);
        add(comments2);

        JTextArea comments3 = new JTextArea(4, 25);
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(comments3,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);


        setVisible(true);
    }

    public static void main(String[] arguments) {
        SwingComponents frame = new SwingComponents();
    }
}
