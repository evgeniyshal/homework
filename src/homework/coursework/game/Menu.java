package homework.coursework.game;

import java.util.List;

public class Menu {
    private List<Command> listCommand;
    StartGame startGame = new StartGame();
    LoadGame loadGame = new LoadGame();
    ExitGame exitGame = new ExitGame();
    public Menu() {
    }


    public Menu(List<Command> listCommand) {
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
