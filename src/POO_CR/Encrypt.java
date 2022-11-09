package POO_CR;
import POO_CR.Exceptions.NegativeShiftException;

import java.util.*;

public abstract class Encrypt {
    //Deux variables « protected » de type String contenant respectivement le message non
    //chiffré (v_plain) et le message chiffré (v_cipher). Le choix de « protected » est
    //nécessaire pour que ces variables soient accessibles par les classes héritées.

    // Constructor
    protected String v_plain;
    protected String v_cipher;

    // Deux méthodes « public » de type getters permettant de lire le message déchiffré
    //(plain()) et le message chiffré (cipher()).
    public String plain() {
        return v_plain;
    }

    public String cipher() {
        return v_cipher;
    }

    // Une méthode « public » encode qui réalisera l'encodage du message non chiffré et une
    //méthode « public » decode (réciproque de la précédente) qui réalisera le décodage du
    //message chiffré. L'algorithme de cryptographie utilisé permettra de spécialiser la
    //classe.
    public abstract void encode();

    public abstract void decode();

}
