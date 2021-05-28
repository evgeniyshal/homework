package homework.coursework.game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame extends Command{
    public SaveGame(Menu menu) {
        super(menu);
    }
    private void saveGame() {
        File file = new File("SaveGame/save");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(menu.getSaveGameLocation());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    void execute() {

    }
}
