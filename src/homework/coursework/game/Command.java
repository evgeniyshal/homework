package homework.coursework.game;

public abstract class Command {

    Game game; // переменная меню

    public Command(Game game) {
        this.game = game;
    }

    public Command() {

    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    void execute() {

    }

    public void printText() {
        System.out.println(getGame().getCurrentLocation().getText());
    }
}

