package homework.coursework.game;

import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Game game = new Game();

        System.out.println(game.getCurrentLocation().getText());
        while (!game.isGameOver()) {
            input = scanner.nextLine();
            if ("1".equals(input)) {
                game.getListCommand().get(0).execute();

            } else if ("2".equals(input)) {
                game.getListCommand().get(1).execute();

            } else if ("3".equals(input)) {
                game.getListCommand().get(2).execute();

            } else if ("4".equals(input)) {
                game.getListCommand().get(3).execute();
            }
        }
    }
}

