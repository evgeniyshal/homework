package homework.coursework.game;

public class ExitGame extends Command{

    public ExitGame(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        getMenu().exitGame();
    }
}
