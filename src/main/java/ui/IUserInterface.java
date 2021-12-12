package ui;

import java.io.IOException;

public interface IUserInterface {

    public void print(String msg);

    public void println(String msg);

    public int inputInt() throws Exception;

    public double inputDouble() throws Exception;

    public String inputString() throws Exception;

}
