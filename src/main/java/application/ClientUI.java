package application;

import commands.*;
import myutil.IDatabase;
import ui.IUserInterface;

import java.io.IOException;


public class ClientUI {

    IUserInterface ui;
    Command commandChain;
    IDatabase db;

    public IUserInterface getUi() {
        return ui;
    }

    public IDatabase getDb() {
        return db;
    }

    public ClientUI(IUserInterface ui)
    {
        this.ui = ui;
        commandChain = new Exit(null, "exit");
        commandChain = new Save(commandChain, "save");
        commandChain = new Readd(commandChain, "readd");
        commandChain = new Read(commandChain, "read");
        commandChain = new Add(commandChain, "add");
        db = new ClientDatabase();
    }

    public void uiLoop()
    {
        String option = "none";
        while(!option.equals("exit"))
        {
            option = menu();
        }
    }

    public String menu() {
        ui.println("Wpisz jedną z poniższych komend:");
        ui.println("\tadd - Dodaj nową osobę");
        ui.println("----------------------------------------------------------");
        ui.println("\tread - Wczytaj plik z danymi i zastąp istniejącą bazę");
        ui.println("\treadd - Wczytaj plik z danymi i dodaj do istniejącej bazy");
        ui.println("\tsave - Zapisz plik z danymi");
        ui.println("----------------------------------------------------------");
        ui.println("\texit - Wyjdź");

        String r = null;
        try {
            r = ui.inputString();
        } catch (IOException e) {
            r = "none";
        }

        if(!(r.equals("none")||r.equals("exit")))
        {
            commandChain.tryRun(r,this);
        }
        return r;
    }
}
