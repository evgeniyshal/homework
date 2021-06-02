package homework.coursework.game;

import java.util.List;

public class Menu {
    private List<Command> listCommand;
    StartGame startGame = new StartGame();
    LoadGame loadGame = new LoadGame();
    ExitGame exitGame = new ExitGame();
    public Menu() {
    }
    //TODO
    // Не понимаю, как сделать реализацию? Создать объекты команд?
    // Объекты создавать в Menu или в Main?
    // Добавлять их в список в реализацию методов?

    public Menu(List<Command> listCommand) {
        this.listCommand = listCommand;
    }

    public void startGame(){
        System.out.println("Игра началась");
        listCommand.add(startGame);
    }

    public void loadGame(){
        System.out.println("Загрузка игры");
        listCommand.add(loadGame);
    }

    public void exitGame(){
        System.out.println("Вы вышли из игры");
        listCommand.add(exitGame);
    }

    public void showMenu(){
        System.out.println("1. Начать игру\n2. Загрузить игру\n3. Выйти");

    }
}
