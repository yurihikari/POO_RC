package POO_CR.View;
import POO_CR.Controlleur.EncryptControlleur;
import POO_CR.Model.EncryptModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observer;

public abstract class EncryptView implements Observer{

    private  EncryptModel model;
    private EncryptControlleur controller;
    //JFrame permettant de créer la fenêtre où l'on peux encoder et décoder des messages
    private JFrame encryptJFrame;

    //JPanel permettant de créer un espace où l'on peux encoder et décoder des messages
    private JPanel encryptJPanel;

    //JLabel permettant de créer un espace où l'on peux encoder et décoder des messages
    private JLabel encryptJLabel;

    private JButton encryptJButton;

    //JTextField permettant de créer un espace où l'on peux encoder et décoder des messages
    private JTextField encryptJTextField;
    private JTextField encryptJTextFieldDecode;


    //Constructeur de la classe EncryptView
    public EncryptView(String label, EncryptModel model, EncryptControlleur controller, int posX, int posY) {

        this.controller = controller;
        this.model = model;

        //Création de la fenêtre
        encryptJFrame = new JFrame(label);

        //Création du JPanel
        encryptJPanel = new JPanel();
        //changer le taille du panael
        encryptJPanel.setPreferredSize(new Dimension(400, 200));

        //Jbutton permettant de coder un message
        encryptJButton = new JButton("Encode");


        //Création du JLabel
        encryptJLabel = new JLabel(label);

        //Création du JTextField
        encryptJTextField = new JTextField();
        encryptJTextFieldDecode = new JTextField();

        //Ajout du JLabel au JPanel
        encryptJPanel.add(encryptJLabel);

        //Ajout du JTextField au JPanel
        encryptJPanel.add(encryptJTextField);
        //changer le taille du textfield
        encryptJTextField.setPreferredSize(new Dimension(200, 30));
        encryptJTextFieldDecode.setPreferredSize(new Dimension(200, 30));
        encryptJPanel.add(encryptJTextFieldDecode);
        encryptJPanel.add(encryptJButton);


        //Ajout du JPanel à la fenêtre
        encryptJFrame.add(encryptJPanel);

        //Ajout de la fenêtre
        encryptJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model.addObserver(this);

        encryptJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajout de la taille de la fenêtre
        encryptJFrame.setSize(500,200);

        //Ajout de la position de la fenêtre
        encryptJFrame.setLocation(posX,posY);

        //Ajout de la visibilité de la fenêtre
        encryptJFrame.setVisible(true);

    }

    //méthode pour modifier le texte du JTextField
    public void setDisplay(String s){
        encryptJTextField.setText(s);
    }

    public void setDisplayDecode(String s){
        encryptJTextFieldDecode.setText(s);
    }

    //méthode pour récupérer le texte du JTextField
    public String getDisplay() {
        return encryptJTextField.getText();
    }

    public String getDisplayDecode() {
        return encryptJTextFieldDecode.getText();
    }

    public void addDisplayListener(ActionListener a)
    {
        encryptJTextField.addActionListener(a);

    }

    public void addDisplayListenerDecode(ActionListener a)
    {
        encryptJTextFieldDecode.addActionListener(a);

    }

    public void addVEncodeListener(ActionListener a)
    {
        encryptJButton.addActionListener(a);

    }

    protected EncryptModel getModel() {
        return model;
    }


}
