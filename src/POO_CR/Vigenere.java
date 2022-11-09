package POO_CR;

public class Vigenere extends Encrypt{

    private int[] v_key;

    public Vigenere(String size) {
        this.v_key = initTab(size);
    }



    //Initialisation du tableau de clé
    public int[] initTab(int size) {
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 26);
        }
        return tab;
    }

    public int[] initTab(String key) {
        int[] tab = new int[key.length()];
        for (int i = 0; i < tab.length; i++) {
            //Dans tab[i] on met la valeur en int de la place de la lettre de key[i] dans l'alphabet

            tab[i] = key.charAt(i) - 'a';

        }
        return tab;
    }

    @Override
    public void encode() {
        //Prendre v_encrypt.plain() et l'encoder selon le methode de Vigenere
        String plain = this.v_plain;
        String cipher = "";
        int keyIndex = 0;
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) >= 'a' && plain.charAt(i) <= 'z') {
                cipher += (char) ((plain.charAt(i) - 'a' + v_key[keyIndex]) % 26 + 'a');
                keyIndex++;
                if (keyIndex >= v_key.length) {
                    keyIndex = 0;
                }
            } else {
                cipher += plain.charAt(i);
            }
        }
        this.v_cipher = cipher;
        System.out.println(cipher);

    }

    @Override
    public void decode() {
        //Prendre v_encrypt.cipher() et le decoder selon le methode de Vigenere
        String cipher = this.v_cipher;
        String plain = "";
        int keyIndex = 0;
        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) >= 'a' && cipher.charAt(i) <= 'z') {
                plain += (char) ((cipher.charAt(i) - 'a' - v_key[keyIndex] + 26) % 26 + 'a');
                keyIndex++;
                if (keyIndex >= v_key.length) {
                    keyIndex = 0;
                }
            } else {
                plain += cipher.charAt(i);
            }
        }
        this.v_plain = plain;
        System.out.println(plain);
    }
}
