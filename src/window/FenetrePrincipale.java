package window;


import application.observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FenetrePrincipale extends JFrame implements PropertyChangeListener, Observer {

    private static final long serialVersionUID = 1L;
    private static final String TITRE_FENETRE = "Laboratoire 2 : LOG121 - Hiver 2023";
    private static final Dimension DIMENSION = new Dimension(700, 700);

    PanneauPrincipal panneauPrincipal = new PanneauPrincipal();
    MenuFenetre menuFenetre = new MenuFenetre();

    public FenetrePrincipale() {
        add(panneauPrincipal);
        add(menuFenetre, BorderLayout.NORTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(TITRE_FENETRE);
        setSize(DIMENSION);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("TEST")) {
            repaint();
            System.out.println(evt.getNewValue());
        }
    }

    @Override
    public void update() {

    }
}


