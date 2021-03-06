package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUI implements IUserInterface{

    BufferedReader reader;
    public ConsoleUI(){
        reader = new BufferedReader(
                new InputStreamReader(System.in));
    }

    public void print(String msg)
    {
        System.out.print(msg);
    }

    public void println(String msg)
    {
        System.out.println(msg);
    }

    @Override
    public int inputInt() throws Exception {
        String in = reader.readLine();
        int r = Integer.parseInt(in);
        return r;
    }

    @Override
    public double inputDouble() throws Exception {
        String in = reader.readLine();
        double r = Double.parseDouble(in);
        return r;
    }

    @Override
    public String inputString() throws Exception {
        String r = reader.readLine();
        return r;
    }
}
