package commands;

import application.ClientUI;

public class Read extends Command {
    public Read(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {

    }
}