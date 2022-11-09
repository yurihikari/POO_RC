package POO_CR.Controlleur;
import POO_CR.Caesar;
import POO_CR.Caesar2;
import POO_CR.Model.EncryptModel;
import POO_CR.View.EncryptCeasarView;
import POO_CR.View.EncryptView;
import POO_CR.Vigenere;

import javax.swing.text.View;


public class EncryptControlleur {

    private EncryptModel model;
    private EncryptCeasarView view;

    public EncryptControlleur(EncryptModel model) {
        this.model = model;
    }

    public void addView(EncryptCeasarView view) {
        this.view = view;
    }

    public void encodePlain_C(String plain) {
        Caesar caesar = new Caesar();
        caesar.setV_plain(plain);
        caesar.encode();
        model.setV_plain_C(plain);
        model.setV_cipher_C(caesar.getV_cipher());
    }


    public void decodePlain_C(String cypher) {
        Caesar caesar = new Caesar();
        caesar.setV_cipher(cypher);
        caesar.decode();
        model.setV_cipher_C(cypher);
        model.setV_plain_C(caesar.getV_plain());
    }

    public void encodePlain_C2(String plain) {
        Caesar2 caesar = new Caesar2();
        caesar.setV_plain(plain);
        caesar.encode();
        model.setV_plain_C2(plain);
        model.setV_cipher_C2(caesar.getV_cipher());
    }

    public void decodePlain_C2(String cypher) {
        Caesar2 caesar = new Caesar2();
        caesar.setV_cipher(cypher);
        caesar.decode();
        model.setV_cipher_C2(cypher);
        model.setV_plain_C2(caesar.getV_plain());
    }

    /*public void encodePlain_V(String plain) {
        model.setV_plain_V(plain);
        model.setV_cipher_V(Vigenere.encode(plain, model.getV_key()));
    }

    public void decodePlain_V(String plain) {
        model.setV_plain_V(plain);
        model.setV_cipher_V(Vigenere.decode(plain, model.getV_key()));
    }

    public void setKey(int[] key) {
        model.setV_key(key);
    }*/

}
