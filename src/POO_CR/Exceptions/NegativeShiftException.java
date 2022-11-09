package POO_CR.Exceptions;

public class NegativeShiftException extends Exception {
    public NegativeShiftException(String message) {
        super(message);
    }

    public NegativeShiftException() {
        super("Le décalage doit être positif");
    }

}
