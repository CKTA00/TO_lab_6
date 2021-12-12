package application;

import myutil.IDatabase;

import java.util.List;

public class ClientDatabase implements IDatabase {

    Database db;

    public ClientDatabase()
    {
        db = new Database();
    }

    @Override
    public void addPerson(String name, String surname, double latitude, double longitude) {
        db.addPerson(
                capitalize(name),
                capitalize(surname),
                latitude,
                longitude
        );
    }

    @Override
    public String showAll() {
        return db.getAllPeople();
    }

    @Override
    public String getJsonOfAll() {
        return db.getJsonOfAll();
    }

    private String capitalize(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
