package homework.coursework.game;

public class SecondCommand extends Command {

    public SecondCommand(Game game) {
        super(game);
    }

    public SecondCommand() {
    }

    @Override
    public void execute() {
        switch (getGame().getCurrentLocation()) {
            case MENU:
                getGame().setCurrentLocation(Zone.NEAR_FOX_HOME);
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
                getGame().setCurrentLocation(Zone.MENU);
                printText();
                break;
            case DWELLERS:
                getGame().setCurrentLocation(Zone.WOLFHOME);
                break;

        }
    }
}