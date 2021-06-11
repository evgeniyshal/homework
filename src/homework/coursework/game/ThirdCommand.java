package homework.coursework.game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ThirdCommand extends Command {
    public ThirdCommand(Game game) {
        super(game);
    }

    @Override
    void execute() {
        if (!getGame().getCurrentLocation().equals(Zone.MENU)){
            getGame().setCurrentLocation(Zone.GAME_MENU);
            printText();
        }
    }
}