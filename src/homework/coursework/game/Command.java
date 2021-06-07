package homework.coursework.game;

public class Command {

    private Game game; // переменная меню

    public Command(Game game) {
        this.game = game;
    }

    public Command() {

    }

    public Game getGame() {
        return game;
    }

    void execute() {

    }
    public void printText () {
        System.out.println(getGame().getCurrentLocation().getText());
    }
}
