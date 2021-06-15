package homework.coursework.game;

public class ThirdCommand extends Command {
    public ThirdCommand(Game game) {
        super(game);
    }

    @Override
    void execute() {
        if (!getGame().getCurrentLocation().equals(Zone.START_MENU)|| getGame().getCurrentLocation().equals(Zone.GAME_MENU)){
            getGame().setCurrentLocation(Zone.GAME_MENU);
            printText();
        } else if (getGame().getCurrentLocation() == Zone.START_MENU
                ||getGame().getCurrentLocation() == Zone.GAME_MENU ){
            getGame().setGameOver(true);
        }
    }
}