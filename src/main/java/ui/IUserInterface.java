package ui;

import java.io.IOException;

public interface IUserInterface {

    public void print(String msg);

    public void println(String msg);

    public int inputInt() throws IOException;

    public double inputDouble() throws IOException;

    public String inputString() throws IOException;

}
