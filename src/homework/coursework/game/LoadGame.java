package homework.coursework.game;

public class LoadGame extends Command {

    public LoadGame(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        getMenu().loadGame();
    }
}

