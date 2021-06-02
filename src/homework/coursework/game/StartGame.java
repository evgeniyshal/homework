package homework.coursework.game;

public class StartGame extends Command{

    public StartGame(Menu menu) {
        super(menu);
    }

    public StartGame() {
        super();
    }

    @Override
    public void execute() {
        getMenu().startGame();
    }
}
