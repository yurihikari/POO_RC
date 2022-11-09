package POO_CR;

import POO_CR.Controller.EncryptController;
import POO_CR.Model.EncryptModel;
import POO_CR.View.TrueEncryptView;
import POO_CR.*;

public class EncryptMVC {
    // Create Model
    static EncryptModel model = new EncryptModel();
    // Create Controller
    static EncryptController controller = new EncryptController(model);
    // Create View
    static TrueEncryptView view = new TrueEncryptView(model, controller);

    public static void main(String[] args) {


        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {new EncryptMVC();
                // Add View to Model
                model.addObserver(view);

                // Add View to Controller
                controller.addView(view);
            }

        });

    }

}
