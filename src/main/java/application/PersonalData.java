package application;

import myutil.IStringFlyweight;

public class PersonalData{

    IStringFlyweight name;
    String surname;

    // Location of the capture:
    double altitude;
    double longitude;

    public PersonalData(IStringFlyweight name, String surname, double altitude, double longitude) {
        this.name = name;
        this.surname = surname;
        this.altitude = altitude;
        this.longitude = longitude;
    }

    public String getSurname() {
        return surname;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public IStringFlyweight getNameFlyweight() {
        return name;
    }
}
