package application.command;

import application.mvc.model.ImageModel;

import java.awt.*;

public class Translate implements ICommand {
    private final ImageModel imageModel = ImageModel.getInstance();

    private final Point point;

    public Translate(Point point) {
        this.point = point;
    }

    public void execute() {
        this.imageModel.translate(this.point);
    }

    public void undo() {
        this.imageModel.translate(new Point(-this.point.x, -this.point.y));
    }
}
