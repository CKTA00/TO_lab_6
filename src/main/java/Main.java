import application.ClientDatabase;
import application.ClientUI;
import ui.ConsoleUI;

public class Main {
    public static void main(String[] args)
    {
        ClientUI client = new ClientUI(new ConsoleUI(), new ClientDatabase());
        client.uiLoop();
    }
}
