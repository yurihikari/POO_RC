package POO_CR;
import java.util.*;

public abstract class BasicEcrypt {
    //  créer une classe BasicEncrypt dont les
    //méthodes encode et decode ne font que recopier le message v_plain dans v_cypher pour
    //encode et v_cypher dans v_plain pour decode.

    protected String v_plain;
    protected String v_cipher;

    public String plain() {
        return v_plain;
    }

    public String cipher() {
        return v_cipher;
    }

    public void encode() {
        v_cipher = v_plain;
    }

    public void decode() {
        v_plain = v_cipher;
    }


}
