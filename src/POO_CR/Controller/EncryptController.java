package POO_CR.Controller;

import POO_CR.Model.EncryptModel;
import POO_CR.View.EncryptView;

import java.awt.event.ActionListener;

public class EncryptController {
    // Controller class for all encrypt classes
    private EncryptModel model;
    private EncryptView view;

    // Constructor
    public EncryptController() {

    }

    // Constructor with model and view
    public EncryptController(EncryptModel model) {
        this.model = model;
    }
    // Encode Methods
    public void encodeCaesar2(String plain, int shift) {
        model.encodeCaesar2(plain, shift);
    }

    public void encodeCaesar(String plain, int shift) {
        model.encodeCaesar(plain, shift);
    }

    public void encodeVigenere(String plain, String key) {
        model.encodeVigenere(plain, key);
    }

    // Decode Methods

    public void decodeCaesar2(String cipher, int shift) {
        model.decodeCaesar2(cipher, shift);
    }

    public void decodeCaesar(String cipher, int shift) {
        model.decodeCaesar(cipher, shift);
    }

    public void decodeVigenere(String cipher, String key) {
        model.decodeVigenere(cipher, key);
    }

    // addView Method
    public void addView(EncryptView view) {
        this.view = view;
    }



}
