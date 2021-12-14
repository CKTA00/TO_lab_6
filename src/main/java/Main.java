import application.ClientDatabase;
import application.ClientMenu;
import ui.ConsoleUI;

public class Main {
    public static void main(String[] args)
    {
        ClientMenu client = new ClientMenu(new ConsoleUI(), new ClientDatabase());
        client.uiLoop();
    }
}
