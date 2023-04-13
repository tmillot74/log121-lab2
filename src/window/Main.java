package window;

public class Main {

    /**
     * Main
     * @param args String[]
     */
    public static void main(String[] args){
        Environnement environnement = new Environnement();
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale();

        environnement.addPropertyChangeListener(fenetrePrincipale);
        environnement.execute();
    }
}
