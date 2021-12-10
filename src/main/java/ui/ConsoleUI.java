package ui;

public class ConsoleUI implements IUserInterface{
    public void print(String msg)
    {
        System.out.print(msg);
    }

    public void println(String msg)
    {
        System.out.println(msg);
    }

    @Override
    public int inputInt() {
        return 0;
    }

    @Override
    public double inputDouble() {
        return 0;
    }

    @Override
    public String inputString() {
        return null;
    }
}
