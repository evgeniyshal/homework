package homework.coursework.game;

import javax.xml.stream.Location;

public class Command {
    private Menu menu;

    public Command(Menu menu) {
        this.menu = menu;
    }

    public Command() {

    }

    public Menu getMenu() {
        return menu;
    }

    void execute() {

    }
}
