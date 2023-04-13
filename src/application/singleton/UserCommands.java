package application.singleton;

import application.command.ICommand;

import java.util.LinkedList;

public class UserCommands {
    private static UserCommands instance = null;
    private LinkedList<ICommand> commands;
    private int currentCommand = -1;

    /**
     * Constructor
     */
    private UserCommands() {
        this.commands = new LinkedList<ICommand>();
    }

    /**
     * Add command
     * @param command ICommand
     */
    public void addCommand(ICommand command) {
        this.commands.add(command);
        this.currentCommand++;
    }

    /**
     * Get instance
     * @return instance
     */
    public static UserCommands getInstance() {
        if (instance == null) {
            instance = new UserCommands();
        }
        return instance;
    }

    /**
     * Execute command
     */
    public void executeCommand() {
        ICommand cmd;
        try {
            cmd = this.commands.get(this.currentCommand);
        } catch (IndexOutOfBoundsException e) {
            cmd = null;
        }
        if (cmd != null) {
            cmd.execute();
            this.currentCommand++;
        }
    }

    /**
     * Undo command
     */
    public void undoCommand() {
        ICommand cmd;
        try {
            cmd = this.commands.get(this.currentCommand);
        } catch (IndexOutOfBoundsException e) {
            cmd = null;
        }
        if (cmd != null) {
            cmd.undo();
            this.currentCommand--;
        }
    }

}
