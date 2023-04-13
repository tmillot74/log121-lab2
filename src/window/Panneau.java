package window;

import application.mvc.model.ImageModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panneau extends JPanel{
    private Point position = new Point(0, 0);
    private int tailleX = 0;
    private int tailleY = 0;
    private Color couleur;
    private ImageModel imageModel;

    private JLabel label;

    public ImageModel getImageModel() {
        return imageModel;
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    /**
     * Constructor
     * @param p Point
     * @param x int
     * @param y int
     * @param c Color
     */
    public Panneau(Point p, int x, int y, Color c) {
        setPosition(p);
        setTailleX(x);
        setTailleY(y);
        couleur = c;
    }

    /*
     * Accesseur de la position
     */
    public Point getPosition() {
        return position;
    }

    /*
     * Mutateur de la position
     */
    public void setPosition(Point p) {
        position = p;
    }

    /*
     * Accesseur de la Taille en X
     */
    public void setTailleX(int x) {
        tailleX = x;
    }

    /*
     * Mutateur de la Taille en X
     */
    public int getTailleX() {
        return tailleX;
    }

    /*
     * mutateur de la taille en Y
     */
    public void setTailleY(int y) {
        tailleY = y;
    }

    /*
     * Accesseur de la taille en Y
     */
    public int getTailleY() {
        return tailleY;
    }

    /*
     * Override de la super méthode paint pour afficher quelque chose
     * sur le canvas.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // On ajoute à la position le delta x et y de la vitesse
        g.setColor(couleur);
        g.fillRect(position.x, position.y, tailleX, tailleY);

        imageModel = ImageModel.getInstance();
        this.setImageModel(imageModel);
        Image i = new ImageIcon(this.getImageModel().getPath()).getImage();
        g.drawImage(i, this.position.x, this.position.y, this.tailleX, this.tailleY, this);



    }
}
