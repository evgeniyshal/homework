package homework.coursework.game;

public class ExitGame implements Command{
    private final Menu exit;

    public ExitGame(Menu exit) {
        this.exit = exit;
    }


    @Override
    public void execute() {
        exit.exitGame();
    }
}
