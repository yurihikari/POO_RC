package POO_CR.Model;
import POO_CR.Vigenere;

import java.util.Observable;

public class EncryptModel extends Observable{
    private String v_plain_C;
    private String v_cipher_C;
    private String v_plain_C2;
    private String v_cipher_C2;
    private String v_plain_V;
    private String v_cipher_V;
    private int[] v_key;

    public EncryptModel() {
        this.v_plain_C = "";
        this.v_cipher_C = "";
        this.v_plain_C2 = "";
        this.v_cipher_C2 = "";
        this.v_plain_V = "";
        this.v_cipher_V = "";
        this.v_key = new int[0];
    }

    public String getV_plain_C() {
        return v_plain_C;
    }

    public void setV_plain_C(String v_plain_C) {
        this.v_plain_C = v_plain_C;
        setChanged();
        notifyObservers();
    }

    public String getV_cipher_C() {
        return v_cipher_C;
    }

    public void setV_cipher_C(String v_cipher_C) {
        this.v_cipher_C = v_cipher_C;
        setChanged();
        notifyObservers();
    }

    public String getV_plain_C2() {
        return v_plain_C2;
    }

    public void setV_plain_C2(String v_plain_C2) {
        this.v_plain_C2 = v_plain_C2;
        setChanged();
        notifyObservers();
    }

    public String getV_cipher_C2() {
        return v_cipher_C2;
    }

    public void setV_cipher_C2(String v_cipher_C2) {
        this.v_cipher_C2 = v_cipher_C2;
        setChanged();
        notifyObservers();
    }

    public String getV_plain_V() {
        return v_plain_V;
    }

    public void setV_plain_V(String v_plain_V) {
        this.v_plain_V = v_plain_V;
        setChanged();
        notifyObservers();
    }

    public String getV_cipher_V() {
        return v_cipher_V;
    }

    public void setV_cipher_V(String v_cipher_V) {
        this.v_cipher_V = v_cipher_V;
        setChanged();
        notifyObservers();
    }

    public int[] getV_key() {
        return v_key;
    }

    public void setV_key(String v_key) {
        this.v_key = Vigenere.initTab(v_key);
        setChanged();
        notifyObservers();
    }

    public void setV_key(int v_key) {
        this.v_key = Vigenere.initTab(v_key);
        setChanged();
        notifyObservers();
    }


}
