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
        if(this.command.equals(command))
            run(ctx);
        else if(nextCommand!=null)
            nextCommand.tryRun(command,ctx);
        else
            ctx.getUi().println("Nie ma takiej komendy.");//TODO: (X)
    }

    public abstract void run(ClientUI ctx);
}
