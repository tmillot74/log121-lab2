package application.command;

import application.mvc.model.Image;

public class ZoomOut implements ICommand {
    private Image image;
    private double zoomFactor;

    public ZoomOut(Image image, double zoomFactor) {
        this.image = image;
        this.zoomFactor = zoomFactor;
    }

    public void execute() {
        this.image.zoomOut(this.zoomFactor);
    }

    public void undo() {
        this.image.zoomIn(this.zoomFactor);
    }
}
