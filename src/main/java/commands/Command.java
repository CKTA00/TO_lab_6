package commands;

import application.ClientMenu;

public abstract class Command {

    private Command nextCommand;
    private String command;

    public Command(Command nextCommand, String command)
    {
        this.nextCommand = nextCommand;
        this.command = command;
    }

    final public Command next()
    {
        return nextCommand;
    }

    final public void tryRun(String command, ClientMenu ctx){
        if(this.command.equals(command))
            run(ctx);
        else if(nextCommand!=null)
            nextCommand.tryRun(command,ctx);
        else
            ctx.getUi().println("Nie ma takiej komendy.");//TODO: (X)
    }

    protected abstract void run(ClientMenu ctx);
}
