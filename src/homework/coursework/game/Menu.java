package homework.coursework.game;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> listCommand = new ArrayList<>();

    private StartGame startGame = new StartGame();
    private LoadGame loadGame = new LoadGame();
    private ExitGame exitGame = new ExitGame();

    public Menu() {
        addCommand();
    }
    public List<Command> getListCommand() {
        return listCommand;
    }

    public void setListCommand(List<Command> listCommand) {
        this.listCommand = listCommand;
    }

    public void addCommand(){
        listCommand.add(startGame);
        listCommand.add(loadGame);
        listCommand.add(exitGame);
    }

    public void showMenu(){
        System.out.println("1. Начать игру\n2. Загрузить игру\n3. Выйти");

    }
}
