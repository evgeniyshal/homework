package homework.coursework.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SecondCommand extends Command {
    public SecondCommand(Game game) {
        super(game);
    }
    @Override
    public void execute() {
        switch (getGame().getCurrentLocation()) {
            case START_MENU:
                loadGame();
                printText();
                break;
            case NEAR_FOX_HOME:
                getGame().setCurrentLocation(Zone.IN_SEARCH);
                printText();
                break;
            case IN_SEARCH:
                getGame().setCurrentLocation(Zone.SINGLESEARCH);
                printText();
                break;
            case SINGLESEARCH:
                getGame().setCurrentLocation(Zone.START_MENU);
                printText();
                break;
            case DWELLERS:
                getGame().setCurrentLocation(Zone.WOLFHOME);
                printText();
                break;
            case WOLFHOME:
                getGame().setCurrentLocation(Zone.SINGLESEARCH);
                printText();
                break;
            case FORREST:
                getGame().setCurrentLocation(Zone.HONEY);
                printText();
                break;
            case HONEY:
                getGame().setCurrentLocation(Zone.STOLENHONEY);
                printText();
                break;
            case BEERETREAT:
                getGame().setCurrentLocation(Zone.HONEYFORBEAR);
                printText();
                break;
            case HONEYFORBEAR:
                getGame().setCurrentLocation(Zone.HOME);
                printText();
                break;
        }
    }
    public void loadGame(){
        File file = new File("SaveGame/save.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            game.setCurrentLocation((Zone) in.readObject());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}