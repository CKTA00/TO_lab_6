package commands;

import application.ClientMenu;

import java.io.FileInputStream;
import java.io.IOException;

public class Read extends Command {
    public Read(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
        String str ="";
        String fileName = System.getProperty("user.dir") + "/save/migration_database.txt";
        try{
            FileInputStream inputStream = new FileInputStream(fileName);
            int ch;

            while ((ch = inputStream.read()) != -1)
                str += (char)ch;

            inputStream.close();

        }
        catch (IOException e)
        {
            System.out.println("Fatal file error");
            e.printStackTrace();
        }
        ctx.getDb().readJson(str,false);
    }
}