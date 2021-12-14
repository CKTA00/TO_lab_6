package commands;

import application.ClientMenu;

public class Exit extends Command {
    public Exit(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
        ctx.getUi().println("Not implemented");
    }

}