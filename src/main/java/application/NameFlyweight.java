package application;

import myutil.IStringFlyweight;

public class NameFlyweight implements IStringFlyweight {

    private String name;
    //private int id;
    //static int nextId = 0;


    public NameFlyweight(String name)
    {
        this.name = name;
        //id = nextId;
        //nextId++;
    }

//    public void setNextId(int nextId)
//    {
//        NameFlyweight.nextId = nextId;
//    }

    @Override
    public String getString() {
        return name;
    }
}
