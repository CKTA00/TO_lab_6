package application;

import myutil.IStringFlyweight;

public class PersonalData{

    IStringFlyweight name;
    String surname;

    // Location of the capture:
    double latitude;
    double longitude;

    public PersonalData(IStringFlyweight name, String surname, double latitude, double longitude) {
        this.name = name;
        this.surname = surname;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getSurname() {
        return surname;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public IStringFlyweight getNameFlyweight() {
        return name;
    }

    public String getName()
    {
        return name.getString();
    }

    @Override
    public String toString() {
        return  name.getString() +
                " " + surname +
                " latitude=" + latitude +
                " longitude=" + longitude ;
    }
}
