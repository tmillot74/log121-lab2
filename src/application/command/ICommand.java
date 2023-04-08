package application.command;

public interface ICommand {
    /**
     * Execute the command
     */
    public void execute();
    /**
     * Undo the command
     */
    public void undo();
}
