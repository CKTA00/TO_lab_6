package application;

import myutil.IStringFlyweight;

public class NameFlyweight implements IStringFlyweight {

    private String name;

    public NameFlyweight(String name)
    {
        this.name = name;
    }

    @Override
    public String getString() {
        return name;
    }
}
