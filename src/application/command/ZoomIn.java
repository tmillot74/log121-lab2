package application.command;

import application.mvc.model.ImageModel;

public class ZoomIn implements ICommand {
    private ImageModel image;
    private double zoomFactor;

    public ZoomIn(ImageModel image, double zoomFactor) {
        this.image = image;
        this.zoomFactor = zoomFactor;
    }

    /**
     * Execute the command
     */
    public void execute() {
        this.image.zoomIn(this.zoomFactor);
    }

    /**
     * Undo the command
     */
    public void undo() {
        this.image.zoomOut(this.zoomFactor);
    }
}
