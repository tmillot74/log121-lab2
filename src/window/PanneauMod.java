package window;

import application.command.Translate;
import application.singleton.UserCommands;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanneauMod extends PanneauDecorateur {
    private PanneauMod panel = this;

    /**
     * Constructor
     * @param p Panneau
     * @param posPanneau Point
     * @param x int
     * @param y int
     */
    public PanneauMod(Panneau p, Point posPanneau, int x, int y) {
        super(p,posPanneau,x,y);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                System.out.println("mouseClicked");
                MouseEvent convertMouseEvent = SwingUtilities.convertMouseEvent(e.getComponent(), e, getParent());
                getParent().dispatchEvent(convertMouseEvent);
            }

//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("mouseReleased");
////                Point coords = new Point(e.getX(), e.getY());
//                MouseEvent convertMouseEvent = SwingUtilities.convertMouseEvent(e.getComponent(), e, getParent());
//                getParent().dispatchEvent(convertMouseEvent);
//                UserCommands.getInstance().addCommand(new Translate(new Point(e.getX(), e.getY())));
//                UserCommands.getInstance().executeCommand();
//                panel.repaint();
//            }

        });
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mouseDragged");
                Point coords = new Point(e.getX(), e.getY());
                MouseEvent convertMouseEvent = SwingUtilities.convertMouseEvent(e.getComponent(), e, getParent());
                getParent().dispatchEvent(convertMouseEvent);
                UserCommands.getInstance().addCommand(new Translate(new Point(coords)));
                UserCommands.getInstance().executeCommand();
                panel.repaint();
            }
        });
    }

    /**
     * Paint
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
