package application;

import myutil.IDatabase;

public class ClientDatabase implements IDatabase {

    Database db;

    public ClientDatabase()
    {
        db = new Database();
    }

    @Override
    public void addPerson(String name, String surname, double altitude, double longitude) {
        db.addPerson(
                capitalize(name),
                capitalize(surname),
                altitude,
                longitude
        );
    }

    private String capitalize(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
