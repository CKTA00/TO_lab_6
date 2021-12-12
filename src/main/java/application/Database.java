package application;

import com.google.gson.reflect.TypeToken;
//import instance_creators.NameFlyweightInstanceCreator;
//import instance_creators.PersonalDataInstanceCreator;
import myutil.IStringFlyweight;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myutil.TemporaryPersonalData;

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
        data.add(person);
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

    public String getAllPeople() {
        String result = "Database:\n";
        for (var p: data) {
            result += p.toString() + "\n";
        }
        return result;
    }

    public String getJsonOfAll()
    {
        Gson gson = new Gson();

        String str = gson.toJson(data);
        return str;
    }

    public void readJson(String json, boolean append)
    {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(PersonalData.class, new PersonalDataInstanceCreator());
//        gsonBuilder.registerTypeAdapter(IStringFlyweight.class, new NameFlyweightInstanceCreator(this));
//        Gson gson = gsonBuilder.create();
        Gson gson = new Gson();

        List<TemporaryPersonalData> list = gson.fromJson(json, new TypeToken<List<TemporaryPersonalData>>(){}.getType());
        if(!append){
            data.clear();
            commonNames.clear();
        }

        for (var p: list) {
            addPerson(p.name.getString(),p.surname,p.latitude,p.longitude);
        }
    }
}
