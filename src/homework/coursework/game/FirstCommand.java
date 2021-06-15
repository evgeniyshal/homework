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
            case START_MENU:
                getGame().setCurrentLocation(Zone.NEAR_FOX_HOME);

                printText();
                break;
            case NEAR_FOX_HOME:
                getGame().setCurrentLocation(Zone.HOME);
                printText();
                break;
            case IN_SEARCH:
                getGame().setCurrentLocation(Zone.DWELLERS);
                printText();
                break;
            case DWELLERS:
                getGame().setCurrentLocation(Zone.OWLHOME);
                printText();
                break;
            case OWLHOME:
                getGame().setCurrentLocation(Zone.FORREST);
                printText();
                break;
            case FORREST:
                getGame().setCurrentLocation(Zone.SINGLESEARCH);
                printText();
                break;
            case SINGLESEARCH:
                getGame().setCurrentLocation(Zone.START_MENU);
                printText();
                break;
            case WOLFHOME:
               getGame().setCurrentLocation(Zone.HOME);
               printText();
               break;
            case HONEY:
                getGame().setCurrentLocation(Zone.BEERETREAT);
                printText();
                break;
            case BEERETREAT:
                getGame().setCurrentLocation(Zone.REST);
                printText();
                break;
            case HONEYFORBEAR:
                getGame().setCurrentLocation(Zone.SINGLESEARCH);
                printText();
                break;


        }
    }
}
