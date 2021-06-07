package homework.coursework.game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ThirdCommand extends Command {
    public ThirdCommand(Game game) {
        super(game);
    }

    private void saveGame() {
        File file = new File("SaveGame/save");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void execute() {
        if (!getGame().getCurrentLocation().equals(Zone.MENU)){ // Выход в меню из всех зон которые не являются меню
            getGame().setCurrentLocation(Zone.MENU);
            printText();
        }
    }
}