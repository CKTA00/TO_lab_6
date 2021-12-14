package application;

import commands.*;
import myutil.IDatabase;
import ui.IUserInterface;

import java.io.IOException;


public class ClientMenu {

    IUserInterface ui;
    Command commandChain;
    IDatabase db;

    public IUserInterface getUi() {
        return ui;
    }

    public IDatabase getDb() {
        return db;
    }

    public ClientMenu(IUserInterface ui, ClientDatabase db)
    {
        this.ui = ui;
        this.db = db;
        commandChain = new Exit(null, "exit");
        commandChain = new Save(commandChain, "save");
        commandChain = new Readd(commandChain, "readd");
        commandChain = new Read(commandChain, "read");
        commandChain = new Show(commandChain, "show");
        commandChain = new Find(commandChain, "find");
        commandChain = new Add(commandChain, "add");
    }

    public void uiLoop()
    {
        String option = "none";
        while(!option.equals("exit"))
        {
            option = menu();
        }
    }

    private String menu() {
        ui.println("Wpisz jedną z poniższych komend:");
        ui.println("\tadd - Dodaj nową osobę");
        ui.println("\tfind - Znajdź osoby po imieniu");
        ui.println("\tshow - Pokaż całą bazę danych");
        ui.println("----------------------------------------------------------");
        ui.println("\tread - Wczytaj plik z danymi i zastąp istniejącą bazę");
        ui.println("\treadd - Wczytaj plik z danymi i dodaj do istniejącej bazy");
        ui.println("\tsave - Zapisz plik z danymi");
        ui.println("----------------------------------------------------------");
        ui.println("\texit - Wyjdź");

        String r = null;
        try {
            r = ui.inputString();
        } catch (Exception e) {
            r = "none";
        }

        if(!(r.equals("none")||r.equals("exit")))
        {
            commandChain.tryRun(r,this);
        }
        return r;
    }
}
