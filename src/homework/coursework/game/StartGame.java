package homework.coursework.game;

public class StartGame implements Command{
    private final Menu start;

    public StartGame(Menu start) {
        this.start = start;
    }

    @Override
    public void execute() {
        start.startGame();
    }
}
