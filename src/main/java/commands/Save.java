package commands;

import application.ClientMenu;

import java.io.FileOutputStream;
import java.io.IOException;

public class Save extends Command {
    public Save(Command nextCommand, String command) {
        super(nextCommand, command);
    }

    @Override
    public void run(ClientMenu ctx) {
        String str = ctx.getDb().getJsonOfAll();
        String fileName = System.getProperty("user.dir") + "/save/migration_database.txt";
        try{
            FileOutputStream outputStream = new FileOutputStream(fileName);
            byte[] strToBytes = str.getBytes();
            outputStream.write(strToBytes);

            outputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("Fatal file error");
            e.printStackTrace();
        }
    }
}