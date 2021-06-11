package homework.coursework.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Zone currentLocation = Zone.MENU;
    private Zone saveGameLocation;

    private List<Command> listCommand = new ArrayList<>();

    private FirstCommand first;
    private SecondCommand second;
    private ThirdCommand third;
    private FourCommand four;

    public Game() {

        first = new FirstCommand(this);
        second = new SecondCommand(this);
        third = new ThirdCommand(this);
        four = new FourCommand(this);
        addCommand();

    }
    public List<Command> getListCommand() {
        return listCommand;
    }

    public void setListCommand(List<Command> listCommand) {
        this.listCommand = listCommand;
    }

    public void addCommand(){
        listCommand.add(first);
        listCommand.add(second);
        listCommand.add(third);
        listCommand.add(four);
    }

    public void setCurrentLocation(Zone currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void showMenu(){
        System.out.println("1. Начать игру\n2. Загрузить игру\n3. Выйти");

    }
    public Zone getCurrentLocation() {
        return currentLocation;
    }

    public Zone getSaveGameLocation() {
        return saveGameLocation;
    }

    public void setSaveGameLocation(Zone saveGameLocation) {
        this.saveGameLocation = saveGameLocation;
    }
}
