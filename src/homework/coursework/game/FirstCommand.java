package homework.coursework.game;

public class FirstCommand extends Command{

    public FirstCommand(Game game) {
        super(game);
    }

    public FirstCommand() {
        super();
    }

    @Override
    public void execute() {
        switch (getGame().getCurrentLocation()) {
            case MENU:
                getGame().setCurrentLocation(Zone.NEAR_FOX_HOME);
                printText();
                break;
            case NEAR_FOX_HOME:
                getGame().setCurrentLocation(Zone.HOME);
                printText();
                break;
        }
    }
}
