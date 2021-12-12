package commands;

import application.ClientUI;

public class Exit extends Command {
    public Exit(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {

    }
}