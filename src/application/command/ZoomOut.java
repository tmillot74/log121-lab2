package application.command;

import application.mvc.model.ImageModel;

public class ZoomOut implements ICommand {
    private ImageModel image;
    private double zoomFactor;

    /**
     * Constructor
     * @param image ImageModel
     * @param zoomFactor double
     */
    public ZoomOut(ImageModel image, double zoomFactor) {
        this.image = image;
        this.zoomFactor = zoomFactor;
    }

    /**
     * Execute the command
     */
    public void execute() {
        this.image.zoomOut(this.zoomFactor);
    }

    /**
     * Undo the command
     */
    public void undo() {
        this.image.zoomIn(this.zoomFactor);
    }
}
