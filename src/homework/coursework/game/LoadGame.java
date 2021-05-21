package homework.coursework.game;

public class LoadGame implements Command {
    private final Menu load;

    public LoadGame(Menu load) {
        this.load = load;
    }


    @Override
    public void execute() {
        load.loadGame();
    }
}

