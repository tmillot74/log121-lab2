package application.singleton;

import application.command.ICommand;

import java.util.LinkedList;

public class UserCommands {
    private static UserCommands instance = null;
    private LinkedList<ICommand> commands;
    private int currentCommand = -1;

    private UserCommands() {
        this.commands = new LinkedList<ICommand>();
    }

    public static UserCommands getInstance() {
        if (instance == null) {
            instance = new UserCommands();
        }
        return instance;
    }

    public void executeCommand(ICommand command) {
        ICommand cmd;
        try {
            cmd = this.commands.get(this.currentCommand + 1);
        } catch (IndexOutOfBoundsException e) {
            cmd = null;
        }
        if (cmd != null) {
            cmd.execute();
            this.currentCommand++;
        }
    }

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
