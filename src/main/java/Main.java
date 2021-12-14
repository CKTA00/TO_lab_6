import application.ClientDatabase;
import application.ClientMenu;
import application.Database;
import ui.ConsoleUI;

public class Main {
    public static void main(String[] args)
    {
        ClientMenu client = new ClientMenu(new ConsoleUI(), new ClientDatabase(new Database()));
        client.uiLoop();
    }
}
