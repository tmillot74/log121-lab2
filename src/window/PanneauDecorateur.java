package window;

import application.mvc.model.ImageModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanneauDecorateur  extends JPanel {
    static int c=0;
    String name= "Panel ";
    protected Panneau panel;
    private ImageModel imageModel;
    protected Point position = new Point(0, 0);
    int tailleX;
    int tailleY;
    public PanneauDecorateur(Panneau p,Point posPanneau,int x,int y)
    {
        name=name+c;
        panel=p;
        position=posPanneau;
        tailleX=x;
        tailleY=y;
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Inner was clicked at : " + name);
                MouseEvent convertMouseEvent = SwingUtilities.convertMouseEvent(e.getComponent(), e, getParent());
                getParent().dispatchEvent(convertMouseEvent);
            }
        });
        c++;
    }

    @Override
    public void paint(Graphics g) {
        this.panel.paint(g);
        imageModel = ImageModel.getInstance();
        Image i = new ImageIcon(imageModel.getPath()).getImage();
        g.drawImage(i, this.position.x, this.position.y, this.tailleX, this.tailleY, this);
    }

}
