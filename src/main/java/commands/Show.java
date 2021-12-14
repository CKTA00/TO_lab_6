package commands;

import application.ClientMenu;

public class Show extends Command {
    public Show(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
        ctx.getUi().print(ctx.getDb().showAll());
    }
}