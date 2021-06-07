package homework.coursework.game;

public class LoadGame extends Command {

    public LoadGame(Menu menu) {
        super(menu);
    }

    public LoadGame() {
    }

    @Override
    public void execute() {
        getMenu().addCommand();
    }
}

