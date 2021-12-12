package commands;

import application.ClientUI;

public class Find extends Command {
    public Find(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {
        ctx.getUi().println("Not implemented");
    }
}