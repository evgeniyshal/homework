package homework.coursework.game;

public abstract class Command {
    private Menu menu;

    public Command(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    abstract void execute();
}
