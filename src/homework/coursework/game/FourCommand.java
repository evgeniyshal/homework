
package homework.coursework.game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FourCommand extends Command {
    public FourCommand(Game game) {
        super(game);
    }
    private void saveGame() {
        File file = new File("SaveGame/save");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(game.getSaveGameLocation());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void execute() {
         switch (game.getCurrentLocation()) {
            case MENU:
                saveGame();

        }
    }
}


