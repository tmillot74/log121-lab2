package application.command;

import application.mvc.model.ImageModel;

import java.awt.*;

public class Translate implements ICommand {
    private final ImageModel imageModel = ImageModel.getInstance();

    private final Point point;

    /**
     * Constructor
     * @param point Point
     */
    public Translate(Point point) {
        this.point = point;
    }

    /**
     * Execute the command
     */
    public void execute() {
        this.imageModel.translate(this.point);
    }

    /**
     * Undo the command
     */
    public void undo() {
        this.imageModel.translate(new Point(-this.point.x, -this.point.y));
    }
}
