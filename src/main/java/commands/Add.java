package commands;

import application.ClientUI;

public class Add extends Command {
    public Add(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {

    }
}
