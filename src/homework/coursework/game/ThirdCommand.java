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
        getGame().setSaveGameLocation(Zone.HOME);
        if (!getGame().getCurrentLocation().equals(Zone.MENU)){

            getGame().setCurrentLocation(Zone.GAME_MENU);
            printText();
        }
    }
}