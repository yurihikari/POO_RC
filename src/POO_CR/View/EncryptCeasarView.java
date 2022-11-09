package POO_CR.View;

import POO_CR.Controlleur.EncryptControlleur;
import POO_CR.Model.EncryptModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class EncryptCeasarView implements Observer {

    private  EncryptModel model;
    private EncryptControlleur controller;

    //JFrame permettant de créer la fenêtre où l'on peux encoder et décoder des messages
    private JFrame encryptJFrame;

    //JPanel permettant de créer un espace où l'on peux encoder et décoder des messages
    private JPanel encryptJPanel;
    private JPanel encryptJPanelCeasar2;

    //JLabel permettant de créer un espace où l'on peux encoder et décoder des messages
    private JLabel encryptJLabel;
    private JLabel encryptJLabelCeasar2;

    private JButton encryptJButton_ForCeasar;
    private JButton decryptJButton_ForCeasar;

    private JButton encryptJButton_ForCeasar2;
    private JButton decryptJButton_ForCeasar2;

    //JTextField permettant de créer un espace où l'on peux encoder et décoder des messages
    private JTextField encryptJTextField;
    private JTextField encryptJTextFieldDecode;

    private JTextField encryptJTextFieldCeasar2;
    private JTextField encryptJTextFieldDecodeCeasar2;

    public EncryptCeasarView(String label, EncryptModel model, EncryptControlleur controller, int posX, int posY) {

        this.controller = controller;
        this.model = model;



        //Création de la fenêtre
        encryptJFrame = new JFrame(label);

        //Création du JPanel
        encryptJPanel = new JPanel();
        encryptJPanelCeasar2 = new JPanel();
        //changer le taille du panael
        encryptJPanel.setPreferredSize(new Dimension(400, 200));
        encryptJPanelCeasar2.setPreferredSize(new Dimension(400, 200));

        //Jbutton permettant de coder un message
        encryptJButton_ForCeasar = new JButton("Encode");
        decryptJButton_ForCeasar = new JButton("Decode");
        encryptJButton_ForCeasar2 = new JButton("Encode");
        decryptJButton_ForCeasar2 = new JButton("Decode");

        addVEncodeListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.encodePlain_C(getDisplay());
            }
        });
        addVDecodeListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.decodePlain_C(getDisplayDecode());
            }
        });
        addEncodeListenerCeasar2(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.encodePlain_C2(getDisplayCeasar2());
            }
        });
        addDecodeListenerCeasar2(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.decodePlain_C2(getDisplayDecodeCeasar2());
            }
        });

        //Création du JLabel
        encryptJLabel = new JLabel(label);
        encryptJLabelCeasar2 = new JLabel("Ceasar2");

        //Création du JTextField
        encryptJTextField = new JTextField();
        encryptJTextFieldDecode = new JTextField();
        encryptJTextFieldCeasar2 = new JTextField();
        encryptJTextFieldDecodeCeasar2 = new JTextField();

        //Ajout du JLabel au JPanel
        encryptJPanel.add(encryptJLabel);
        encryptJPanelCeasar2.add(encryptJLabelCeasar2);

        //Ajout du JTextField au JPanel
        encryptJPanel.add(encryptJTextField);
        encryptJPanel.add(encryptJTextFieldDecode);
        encryptJPanelCeasar2.add(encryptJTextFieldCeasar2);
        encryptJPanelCeasar2.add(encryptJTextFieldDecodeCeasar2);
        //changer le taille du textfield
        encryptJTextField.setPreferredSize(new Dimension(200, 30));
        encryptJTextFieldDecode.setPreferredSize(new Dimension(200, 30));
        encryptJTextFieldCeasar2.setPreferredSize(new Dimension(200, 30));
        encryptJTextFieldDecodeCeasar2.setPreferredSize(new Dimension(200, 30));

        encryptJPanel.add(encryptJButton_ForCeasar);
        encryptJPanel.add(decryptJButton_ForCeasar);
        encryptJPanelCeasar2.add(encryptJButton_ForCeasar2);
        encryptJPanelCeasar2.add(decryptJButton_ForCeasar2);

        //Ajout du JPanel à la fenêtre
        encryptJFrame.add(encryptJPanel,BorderLayout.NORTH);
        encryptJFrame.add(encryptJPanelCeasar2,BorderLayout.CENTER);

        //Ajout de la fenêtre
        encryptJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model.addObserver(this);

        encryptJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajout de la taille de la fenêtre
        encryptJFrame.setSize(500,500);

        //Ajout de la position de la fenêtre
        encryptJFrame.setLocation(posX,posY);

        //Ajout de la visibilité de la fenêtre
        encryptJFrame.setVisible(true);

    }

    //méthode pour modifier le texte du JTextField
    public void setDisplay(String s){
        encryptJTextField.setText(s);
    }

    public void setDisplayCeasar2(String s){
        encryptJTextFieldCeasar2.setText(s);
    }

    public void setDisplayDecode(String s){
        encryptJTextFieldDecode.setText(s);
    }

    public void setDisplayDecodeCeasar2(String s){
        encryptJTextFieldDecodeCeasar2.setText(s);
    }

    //méthode pour récupérer le texte du JTextField
    public String getDisplay() {
        return encryptJTextField.getText();
    }

    public String getDisplayCeasar2() {
        return encryptJTextFieldCeasar2.getText();
    }

    public String getDisplayDecode() {
        return encryptJTextFieldDecode.getText();
    }

    public String getDisplayDecodeCeasar2() {
        return encryptJTextFieldDecodeCeasar2.getText();
    }

    /*public void addDisplayListener(ActionListener a)
    {
        encryptJTextField.addActionListener(a);

    }

    public void addDisplayListenerDecode(ActionListener a)
    {
        encryptJTextFieldDecode.addActionListener(a);

    }*/

    public void addEncodeListenerCeasar2(ActionListener a)
    {
        encryptJButton_ForCeasar2.addActionListener(a);

    }

    public void addDecodeListenerCeasar2(ActionListener a)
    {
        decryptJButton_ForCeasar2.addActionListener(a);

    }

    public void addVEncodeListener(ActionListener a)
    {
        encryptJButton_ForCeasar.addActionListener(a);

    }

    public void addVDecodeListener(ActionListener a)
    {
        decryptJButton_ForCeasar.addActionListener(a);
    }

    protected EncryptModel getModel() {
        return model;
    }


    @Override
    public void update(Observable o, Object arg) {

        setDisplay(model.getV_plain_C());
        setDisplayDecode(model.getV_cipher_C());
        setDisplayCeasar2(model.getV_plain_C2());
        setDisplayDecodeCeasar2(model.getV_cipher_C2());
    }
}
