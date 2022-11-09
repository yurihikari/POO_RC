package POO_CR.Model;
import POO_CR.Exceptions.NegativeShiftException;
import POO_CR.Caesar;
import POO_CR.Vigenere;
import POO_CR.Caesar2;
import java.util.*;
public class EncryptModel extends Observable{
    // Model class for all encrypt classes
    protected String v_plain;
    protected String v_cipher;

    protected String result;

    public String result() {
        return result;
    }

    public String plain() {
        return v_plain;
    }

    public String cipher() {
        return v_cipher;
    }

    // Constructor
    public EncryptModel() {
        this.v_plain = "";
        this.v_cipher = "";
    }

    // encode using caesar
    public void encodeCaesar(String plain, int shift) {
        Caesar caesar = new Caesar(shift);
        caesar.setPlain(plain);
        caesar.encode();
        this.v_plain = plain;
        this.v_cipher = caesar.cipher();
        this.result = caesar.cipher();
        setChanged();
        notifyObservers();
    }

    // decode using caesar
    public void decodeCaesar(String cipher, int shift) {
        Caesar caesar = new Caesar(shift);
        caesar.setCipher(cipher);
        caesar.decode();
        this.v_plain = caesar.plain();
        this.v_cipher = cipher;
        this.result = caesar.plain();
        setChanged();
        notifyObservers();
    }

    // encode using caesar2
    public void encodeCaesar2(String plain, int shift) {
        Caesar2 caesar2 = new Caesar2(shift);
        caesar2.setPlain(plain);
        caesar2.encode();
        this.v_plain = plain;
        this.v_cipher = caesar2.cipher();
        this.result = caesar2.cipher();
        setChanged();
        notifyObservers();
    }

    // decode using caesar2
    public void decodeCaesar2(String cipher, int shift) {
        Caesar2 caesar2 = new Caesar2(shift);
        caesar2.setCipher(cipher);
        caesar2.decode();
        this.v_plain = caesar2.plain();
        this.v_cipher = cipher;
        this.result = caesar2.plain();
        setChanged();
        notifyObservers();
    }

    // Encode Using Caesar2
    /* public void encodeCaesar2(String plain, int shift) {
        v_plain = plain;
        v_cipher = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < plain.length(); i++) {
                v_cipher += (char) (plain.charAt(i) + shift);
            }
        }
        result = v_cipher;
        setChanged();
        notifyObservers();
    }*/

    // Decode Using Caesar2
    /*public void decodeCaesar2(String cipher, int shift) {
        v_cipher = cipher;
        v_plain = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < cipher.length(); i++) {
                v_plain += (char) (cipher.charAt(i) - shift);
            }
        }
        result = v_plain;
        setChanged();
        notifyObservers();
    }*/

    // Encode Using Vigenere
    /*public void encodeVigenere(String plain, String key) {
        v_plain = plain;
        v_cipher = "";
        int j = 0;
        for (int i = 0; i < plain.length(); i++) {
            if (j == key.length()) {
                j = 0;
            }
            v_cipher += (char) (plain.charAt(i) + key.charAt(j));
            j++;
        }
        result = v_cipher;
        setChanged();
        notifyObservers();
    }

    // Decode Using Vigenere
    public void decodeVigenere(String cipher, String key) {
        v_cipher = cipher;
        v_plain = "";
        int j = 0;
        for (int i = 0; i < cipher.length(); i++) {
            if (j == key.length()) {
                j = 0;
            }
            v_plain += (char) (cipher.charAt(i) - key.charAt(j));
            j++;
        }
        result = v_plain;
        setChanged();
        notifyObservers();
    }*/

    // encode using vigenere
    public void encodeVigenere(String plain, String key) {
        Vigenere vigenere = new Vigenere(key);
        vigenere.setPlain(plain);
        vigenere.encode();
        this.v_plain = plain;
        this.v_cipher = vigenere.cipher();
        this.result = vigenere.cipher();
        setChanged();
        notifyObservers();
    }

    // decode using vigenere

    public void decodeVigenere(String cipher, String key) {
        Vigenere vigenere = new Vigenere(key);
        vigenere.setCipher(cipher);
        vigenere.decode();
        this.v_plain = vigenere.plain();
        this.v_cipher = cipher;
        this.result = vigenere.plain();
        setChanged();
        notifyObservers();
    }

    public void setPlain(String plain) {
        v_plain = plain;
        setChanged();
        notifyObservers();
    }

    public void setCipher(String cipher) {
        v_cipher = cipher;
        setChanged();
        notifyObservers();
    }

    public void setResult(String result) {
        this.result = result;
        setChanged();
        notifyObservers();
    }
}
