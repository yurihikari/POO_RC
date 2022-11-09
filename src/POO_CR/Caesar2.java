package POO_CR;

import POO_CR.Exceptions.NegativeShiftException;

public class Caesar2 extends Encrypt{

    private int shift;

    // Constructeur avec paramètre de décalage
    public Caesar2(int shift) {
        this.shift = shift;
    }

    // Constructeur sans paramètre de décalage
    public Caesar2() {
        this.shift = 3;
    }

    @Override
    public void encode() {
        //Prendre v_encrypt.plain() et le décaler de 3 selon la table ASCII
        String plain = this.v_plain;
        String cipher = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < plain.length(); i++) {
                cipher += (char) (plain.charAt(i) + this.shift);
            }
        }
        this.v_cipher = cipher;
        System.out.println(cipher);
    }

    public void encode(int shift) {
        //Prendre v_encrypt.plain() et le décaler de 3 selon la table ASCII
        String plain = this.v_plain;
        String cipher = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < plain.length(); i++) {
                cipher += (char) (plain.charAt(i) + shift);
            }
        }
        this.v_cipher = cipher;
        System.out.println(cipher);
    }

    @Override
    public void decode() {
        String cipher = this.v_cipher;
        String plain = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < cipher.length(); i++) {
                plain += (char) (cipher.charAt(i) - this.shift);
            }
        }
        this.v_plain = plain;
        System.out.println(plain);
    }

    public void decode(int shift) {
        String cipher = this.v_cipher;
        String plain = "";
        if (shift < 0) {
            try {
                throw new NegativeShiftException("Le décalage doit être positif");
            } catch (NegativeShiftException e) {
                throw new RuntimeException(e);
            }
        } else {
            for (int i = 0; i < cipher.length(); i++) {
                plain += (char) (cipher.charAt(i) - shift);
            }
        }
        this.v_plain = plain;
        System.out.println(plain);
    }
}