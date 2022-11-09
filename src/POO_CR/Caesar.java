package POO_CR;
import POO_CR.Exceptions.NegativeShiftException;

import java.util.*;
public class Caesar extends Encrypt {
    // Attribut de décalage
    private int shift;

    // Constructeur avec paramètre de décalage
    public Caesar(int shift) {
        this.shift = shift;
    }

    // Constructeur sans paramètre de décalage
    public Caesar() {
        this.shift = 3;
    }

    // Méthode Encode avec chiffrement avec le décalage et ne prenant que les caractères en minuscule entre a et z
    public void encode() {
        v_cipher = "";
        // Exception si le décalage est négatif
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            // Encode algorithm
            for (int i = 0; i < v_plain.length(); i++) {
                char c = v_plain.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c += shift;
                    if (c > 'z') {
                        c -= 26;
                    }
                    if (c < 'a') {
                        c += 26;
                    }
                }
                v_cipher += c;
            }
        }
    }

    // Méthode Decode avec chiffrement avec le décalage et ne prenant que les caractères en minuscule entre a et z
    public void decode() {
        v_plain = "";
        // Exception si le décalage est négatif
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            // Decode algorithm
            for (int i = 0; i < v_cipher.length(); i++) {
                char c = v_cipher.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c -= shift;
                    if (c > 'z') {
                        c -= 26;
                    }
                    if (c < 'a') {
                        c += 26;
                    }
                }
                v_plain += c;
            }
        }

    }


}
