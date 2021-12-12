package commands;

import application.ClientUI;

public class Save extends Command {
    public Save(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {
        ctx.getUi().println("Not implemented");
    }
}