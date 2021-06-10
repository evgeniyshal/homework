
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
            out.writeObject(getGame().getSaveGameLocation());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void execute() {
        if (game.getCurrentLocation() != Zone.MENU) {
            game.setSaveGameLocation(game.getCurrentLocation());
            game.setCurrentLocation(Zone.MENU);
            Zone.MENU.setText("1. Начать игру\n2. Загрузить игру\n3. Выйти\n4. Сохранить игру");


        }
    }
}


