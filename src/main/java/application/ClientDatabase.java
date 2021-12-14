package application;

import myutil.IDatabase;

public class ClientDatabase implements IDatabase {

    IDatabase db;

    public ClientDatabase(IDatabase db)
    {
        this.db = db;
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
        return db.showAll();
    }

    @Override
    public String getJsonOfAll() {
        return db.getJsonOfAll();
    }

    public void readJson(String json,boolean append)
    {
        db.readJson(json,append);
    }

    private String capitalize(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
