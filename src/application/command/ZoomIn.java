package application.command;

import application.mvc.model.Image;

public class ZoomIn implements ICommand {
    private Image image;
    private double zoomFactor;

    public ZoomIn(Image image, double zoomFactor) {
        this.image = image;
        this.zoomFactor = zoomFactor;
    }

    public void execute() {
        this.image.zoomIn(this.zoomFactor);
    }

    public void undo() {
        this.image.zoomOut(this.zoomFactor);
    }
}
