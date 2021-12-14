package commands;

import application.ClientMenu;

public class Find extends Command {
    public Find(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
        ctx.getUi().println("Not implemented");
    }
}