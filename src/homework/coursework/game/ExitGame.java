package homework.coursework.game;

public class ExitGame extends Command{

    public ExitGame(Menu menu) {
        super(menu);
    }

    public ExitGame() {

    }

    @Override
    public void execute() {
        getMenu().exitGame();
    }
}
