package commands;

import application.ClientUI;

public class Readd extends Command {
    public Readd(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {
        ctx.getUi().println("Not implemented");
    }
}