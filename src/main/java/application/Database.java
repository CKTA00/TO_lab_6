package application;

import myutil.IStringFlyweight;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private List<PersonalData> data;
    private List<IStringFlyweight> commonNames;

    public Database()
    {
        data = new LinkedList<>();
        commonNames = new LinkedList<>();
    }

    public void addPerson(String name, String surname, double altitude, double longitude)
    {
        PersonalData person = new PersonalData(
                getOrCreateName(name),
                surname,
                altitude,
                longitude
        );
    }

    IStringFlyweight getOrCreateName(String name)
    {
        for (var nameObj:
             commonNames) {
            if(nameObj.getString().equals(name))
            {
                return nameObj;
            }
        }
        IStringFlyweight newNameObj = new NameFlyweight(name);
        commonNames.add(newNameObj);
        return newNameObj;
    }
}
