package commands;

import application.ClientUI;
import application.Database;
import myutil.IDatabase;
import ui.IUserInterface;

import java.io.IOException;

public class Add extends Command {
    public Add(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientUI ctx) {
        IUserInterface ui = ctx.getUi();
        IDatabase db = ctx.getDb();

        String name;
        String surname;
        double latitude;
        double longitude;

        try {
            ui.println("Podaj imie:");
            name = ui.inputString();
            ui.println("Podaj nazwisko:");
            surname = ui.inputString();
            ui.println("Podaj szerokość geograficzną:");
            latitude = ui.inputDouble();
            ui.println("Podaj wysokość geograficzną:");
            longitude = ui.inputDouble();
        } catch (IOException e) {
            ui.println("Nieprawidłowy input");
            //TODO: Dodaj do IUserInterface funkcje printError, która doda "(X) " na początku.
            return;
        }

        db.addPerson(name,surname,latitude,longitude);
        ui.println("Sukces.");
    }
}
