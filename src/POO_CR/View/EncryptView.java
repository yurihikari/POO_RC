package POO_CR.View;
import POO_CR.Controller.EncryptController;
import POO_CR.Model.EncryptModel;

import java.awt.event.ActionEvent;
import java.util.Observer;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
public abstract class EncryptView implements Observer{

    protected EncryptController controller;
    // Model
    protected EncryptModel model;
    // View
    protected JFrame frame;
    protected JPanel panel;
    protected JTabbedPane tabbedPane;
    protected JPanel caesarPanel;
    protected JPanel caesar1Panel;
    protected JPanel vigenerePanel;
    protected JPanel resultPanel;
    protected JLabel shiftLabel;
    protected JSlider shiftSlider;
    protected JLabel shiftLabel1;
    protected JSlider shiftSlider1;
    protected JLabel keyLabel;
    protected JTextField keyField;
    protected JLabel messageLabel;
    protected JTextField messageField;
    protected JLabel messageLabelCaesar1;
    protected JTextField messageFieldCaesar1;
    protected JLabel messageLabelCaesar;
    protected JTextField messageFieldCaesar;
    protected JButton encodeButton;
    protected JButton decodeButton;

    protected JButton encodeButtonCaesar;
    protected JButton decodeButtonCaesar;
    protected JButton encodeButtonCaesar1;
    protected JButton decodeButtonCaesar1;
    protected JLabel resultLabel;
    protected JTextField resultField;
    protected int shift;
    protected String key;
    protected String message;
    protected String result;

    // Constructor
    public EncryptView(EncryptModel model, EncryptController controller) {
        this.model = model;
        this.controller = controller;
        // Create View
        frame = new JFrame("Encrypt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();

        caesarPanel = new JPanel();
        caesarPanel.setLayout(new GridLayout(4, 2));

        caesar1Panel = new JPanel();
        caesar1Panel.setLayout(new GridLayout(4, 2));

        vigenerePanel = new JPanel();
        vigenerePanel.setLayout(new GridLayout(4, 2));

        resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(2, 2));

        shiftLabel = new JLabel("Shift: ");
        shiftSlider = new JSlider(0, 26, 0);
        shiftSlider.setMajorTickSpacing(1);
        shiftSlider.setPaintTicks(true);
        shiftSlider.setPaintLabels(true);
        shiftSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                shift = shiftSlider.getValue();
            }
        });

        shiftLabel1 = new JLabel("Shift: ");
        shiftSlider1 = new JSlider(0, 26, 0);
        shiftSlider1.setMajorTickSpacing(1);
        shiftSlider1.setPaintTicks(true);
        shiftSlider1.setPaintLabels(true);
        shiftSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                shift = shiftSlider1.getValue();
            }
        });

        keyLabel = new JLabel("Key: ");
        keyField = new JTextField();
        messageLabel = new JLabel("Message: ");
        messageField = new JTextField();

        messageLabelCaesar1 = new JLabel("Message: ");
        messageFieldCaesar1 = new JTextField();

        messageLabelCaesar = new JLabel("Message: ");
        messageFieldCaesar = new JTextField();

        encodeButton = new JButton("Encode");
        encodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageField.getText();
                key = keyField.getText();
                controller.encodeVigenere(message, key);
            }
        });
        decodeButton = new JButton("Decode");
        decodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageField.getText();
                key = keyField.getText();
                controller.decodeVigenere(message, key);
            }
        });

        encodeButtonCaesar = new JButton("Encode");
        encodeButtonCaesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageFieldCaesar.getText();
                controller.encodeCaesar2(message, shift);
            }
        });
        decodeButtonCaesar = new JButton("Decode");
        decodeButtonCaesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageFieldCaesar.getText();
                controller.decodeCaesar2(message, shift);
            }
        });

        encodeButtonCaesar1 = new JButton("Encode");
        encodeButtonCaesar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageFieldCaesar1.getText();
                controller.encodeCaesar(message, shift);
            }
        });
        decodeButtonCaesar1 = new JButton("Decode");
        decodeButtonCaesar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = messageFieldCaesar1.getText();
                controller.decodeCaesar(message, shift);
            }
        });

        resultLabel = new JLabel("Result: ");
        resultField = new JTextField();
        // Add components to panels
        caesarPanel.add(shiftLabel);
        caesarPanel.add(shiftSlider);
        caesarPanel.add(messageLabelCaesar);
        caesarPanel.add(messageFieldCaesar);
        caesarPanel.add(encodeButtonCaesar);
        caesarPanel.add(decodeButtonCaesar);

        caesar1Panel.add(shiftLabel1);
        caesar1Panel.add(shiftSlider1);
        caesar1Panel.add(messageLabelCaesar1);
        caesar1Panel.add(messageFieldCaesar1);
        caesar1Panel.add(encodeButtonCaesar1);
        caesar1Panel.add(decodeButtonCaesar1);

        vigenerePanel.add(keyLabel);
        vigenerePanel.add(keyField);
        vigenerePanel.add(messageLabel);
        vigenerePanel.add(messageField);
        vigenerePanel.add(encodeButton);
        vigenerePanel.add(decodeButton);

        resultPanel.add(resultLabel);
        resultPanel.add(resultField);
        // Add panels to tabbed
        tabbedPane.addTab("Caesar1", caesar1Panel);
        tabbedPane.addTab("Caesar", caesarPanel);
        tabbedPane.addTab("Vigenere", vigenerePanel);
        // Add tabbed pane to panel
        panel.add(tabbedPane, BorderLayout.CENTER);
        panel.add(resultPanel, BorderLayout.SOUTH);
        // Add panel to frame
        frame.add(panel);
        // Set default values
        shift = 0;
        key = "";
        message = "";
        result = "";
        // Set frame visible
        frame.setVisible(true);
    }

    public void setDisplay(String s) {
        resultField.setText(s);
    }

}
