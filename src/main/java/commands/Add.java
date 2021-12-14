package commands;

import application.ClientMenu;
import myutil.IDatabase;
import ui.IUserInterface;

public class Add extends Command {
    public Add(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
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
            ui.println(""+latitude);
            ui.println("Podaj wysokość geograficzną:");
            longitude = ui.inputDouble();
        } catch (Exception e) {
            ui.println("Nieprawidłowy input");
            //TODO: Dodaj do IUserInterface funkcje printError, która doda "(X) " na początku.
            return;
        }

        db.addPerson(name,surname,latitude,longitude);
        ui.println("Sukces.");
    }
}
