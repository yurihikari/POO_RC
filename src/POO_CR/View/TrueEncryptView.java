package POO_CR.View;

import POO_CR.Controller.EncryptController;
import POO_CR.Model.EncryptModel;
import java.util.*;
public class TrueEncryptView extends EncryptView {
    public TrueEncryptView(EncryptModel model, EncryptController controller) {
        super(model, controller);
    }

    @Override
    public void update(Observable o, Object arg) {
        // Set result to view depending on encode or decode
        setDisplay(model.result());

    }
}
