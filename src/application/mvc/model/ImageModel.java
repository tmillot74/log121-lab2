package application.mvc.model;

import java.awt.*;

public class ImageModel {
    private static ImageModel instance = new ImageModel();
    private String path;
    private Point position =  new Point(0, 0);
    ;

    /**
     * Constructor`
     * @return instance
     */
    public static ImageModel getInstance() {
        if (instance == null) {
            instance = new ImageModel();
        }
        return instance;
    }

    /**
     * Get path
     * @return String
     */
    public String getPath() {
        return path;
    }

    /**
     * Set path
     * @param path String
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Get position
     * @return Point
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Set position
     * @param position Point
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Translate in
     * @param point Point
     */
    public void translate(Point point) {
        this.setPosition(point);
    }


    public void zoomIn(double factor) {

    }

    public void zoomOut(double factor) {

    }
}
