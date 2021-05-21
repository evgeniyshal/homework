package homework.coursework.game;

public class StartGame implements Command{
    private Start start;

    public StartGame(Start start) {
        this.start = start;
    }

    @Override
    public void execute() {
        start.startGame();
    }
}
