package POO_CR;

public class EncryptTest {
    public static void main(String[] args) {
        // Test de la classe BasicEncrypt
        BasicEcrypt be = new BasicEcrypt() {
            @Override
            public void encode() {
                v_cipher = v_plain;
            }

            @Override
            public void decode() {
                v_plain = v_cipher;
            }
        };
        be.v_plain = "Hello World";
        // We encode plain
        be.encode();
        // We show cipher value
        System.out.println(be.v_cipher);
        // We decode cipher
        be.decode();
        // We show plain value
        System.out.println(be.v_plain);


        // Tester la classe Caesar avec le message " les sanglots longs." et un décalage de 3
        Caesar caesar = new Caesar(3);
        caesar.v_plain = "les sanglots longs.";
        // We encode plain
        caesar.encode();
        // We show cipher value
        System.out.println(caesar.v_cipher);
        // We decode cipher
        caesar.decode();
        // We show plain value
        System.out.println(caesar.v_plain);

        // Tester la classe Caesar2 avec le message " les sanglots longs." et un décalage de 3
        Caesar2 caesar3 = new Caesar2(3);
        caesar3.v_plain = "Les sanglots longs.";
        // We encode plain
        caesar3.encode();
        // We show cipher value
        System.out.println(caesar3.v_cipher);
        // We decode cipher
        caesar3.decode();
        // We show plain value
        System.out.println(caesar3.v_plain);

        System.out.println("Test de la classe Vigenere");

        Vigenere vigenere = new Vigenere("bbb");
        vigenere.v_plain = "les sanglots longs.";

        // We encode plain
        vigenere.encode();
        // We show cipher value
        System.out.println(vigenere.v_cipher);
        // We decode cipher
        vigenere.decode();
        // We show plain value
        System.out.println(vigenere.v_plain);

        /*// Tester la classe Caesar2 avec une exception
        Caesar2 caesar4 = new Caesar2(-3);
        caesar4.v_plain = "les sanglots longs.";
        // We encode plain
        caesar4.encode();
        // We show cipher value
        System.out.println(caesar4.v_cipher);
        // We decode cipher
        caesar4.decode();
        // We show plain value
        System.out.println(caesar4.v_plain);

        // Tester la classe Caesar avec un exception
        Caesar caesar2 = new Caesar(-3);
        caesar2.v_plain = "les sanglots longs.";
        // We encode plain
        caesar2.encode();
        // We show cipher value
        System.out.println(caesar2.v_cipher);
        // We decode cipher
        caesar2.decode();
        // We show plain value
        System.out.println(caesar2.v_plain);*/



    }


}
