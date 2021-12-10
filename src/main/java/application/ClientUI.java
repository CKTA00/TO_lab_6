package application;

import ui.IUserInterface;

public class ClientUI {

    IUserInterface ui;
    public ClientUI(IUserInterface ui)
    {
        this.ui = ui;
    }

    public void menu()
    {
        ui.println("Wybierz jedną z poniższych opcji:");
        ui.println("\t[1] - Dodaj nową osobę");
        ui.println("----------------------------------------------------------");
        ui.println("\t[5] - Wczytaj plik z danymi i zastąp istniejącą bazę");
        ui.println("\t[6] - Wczytaj plik z danymi i dodaj do istniejącej bazy");
        ui.println("\t[7] - Zapisz plik z danymi");
        ui.println("----------------------------------------------------------");
        ui.println("\t[0] - Wyjdź");
    }
}
