package window;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.awt.event.MouseMotionListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanneauPrincipal extends JPanel {
    PanneauMod p1 = new PanneauMod(new Panneau(new Point(233, 0), 233, 700, Color.GRAY), new Point(233, 0), 225, 700);
    PanneauMod p2 = new PanneauMod(new Panneau(new Point(466, 0), 233, 700, Color.GRAY), new Point(466, 0), 233, 700);
    PanneauDecorateur p3 = new PanneauDecorateur(new Panneau(new Point(0, 0), 233, 700, Color.GRAY), new Point(0, 0), 233, 700);

    /**
     * Constructor
     */
    public PanneauPrincipal() {
        setLayout(new GridLayout(1, 3, 4, 4));
        add(p3);
        add(p2);
        add(p1);
    }

    /**
     * Paint
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        p1.paint(g);
        p2.paint(g);
        p3.paint(g);
    }
}