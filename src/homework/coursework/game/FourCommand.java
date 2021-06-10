package homework.coursework.game;

public class FourCommand extends Command {
    public FourCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        if (game.getCurrentLocation() != Zone.MENU) {
            game.setSaveGameLocation(game.getCurrentLocation());
            game.setCurrentLocation(Zone.MENU);
            Zone.MENU.setText("1. Начать игру\n2. Загрузить игру\n3. Выйти\n4. Сохранить игру");


        }
    }
}

