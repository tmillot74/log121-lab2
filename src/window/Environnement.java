package window;

import javax.swing.*;

public class Environnement extends SwingWorker<Object,String> {
    private boolean actif = true;
    private static final int DELAI = 1000;

    /**
     * Constructor
     */
    @Override
    protected Object doInBackground() throws Exception {
        while(actif){
            Thread.sleep(DELAI);
            firePropertyChange("TEST",null," ");
        }
        return null;
    }
}
