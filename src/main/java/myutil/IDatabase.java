package myutil;

import application.PersonalData;

import java.util.List;

public interface IDatabase {
    public void addPerson(String name, String surname, double latitude, double longitude);
    public String showAll();
    public String getJsonOfAll();
}
