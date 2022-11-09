package POO_CR;

import POO_CR.Controlleur.EncryptControlleur;
import POO_CR.Model.EncryptModel;
import POO_CR.View.EncryptCeasarView;

public class EncryptMVC {

    public EncryptMVC(){
        EncryptModel model = new EncryptModel();
        EncryptControlleur controller = new EncryptControlleur(model);
        EncryptCeasarView view = new EncryptCeasarView("Ceasar", model, controller, 0, 0);
        controller.addView(view);
    }

    public static void main(String args[]) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {new EncryptMVC();

            }

        });

    }

}
