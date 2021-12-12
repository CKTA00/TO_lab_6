package commands;

import application.ClientUI;

public abstract class Command {

    private Command nextCommand;
    private String command;

    public Command(Command nextCommand, String command)
    {
        this.nextCommand = nextCommand;
        this.command = command;
    }

    public Command next()
    {
        return nextCommand;
    }

    public void tryRun(String command, ClientUI ctx){
        if(command==this.command)
            run(ctx);
        else
            nextCommand.tryRun(command,ctx);
    }

    public abstract void run(ClientUI ctx);
}
