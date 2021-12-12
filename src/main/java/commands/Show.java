package commands;

import application.ClientUI;

public class Show extends Command {
    public Show(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {
        ctx.getUi().print(ctx.getDb().showAll());
    }
}