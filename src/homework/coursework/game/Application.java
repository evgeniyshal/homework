package homework.coursework.game;

import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Game game = new Game();

        System.out.println(game.getCurrentLocation().getText());
        while (true) {
            input = scanner.nextLine();
            if ("1".equals(input)) {
             game.getListCommand().get(0).execute();

            } else if ("2".equals(input)) {
                game.getListCommand().get(1).execute();

            } else if ("3".equals(input)) {
                game.getListCommand().get(2).execute();
                break;
            }
        }
    }
    private static void executeCommand(Command command) {
        command.execute();
        }
    }
/*    // каждый пункт меню отдельная команда
    // Загрузить игру из файла, если нет файла, то нужно сообщить
    //
    // Выйти - завершить работу, просто выход, цикл завершился
    // Начало игры, возможность выйти обратно в меню
    // Сохранить игру сохраняем в файл
    // 2 варианта ответа выходв меню
    Игра завершается, удача не удача.
    Каждый вариант ответа это название какого нибуль параграфа

Взаимодействие с пользователем должно быть реализовано через консоль.
Меню должно быть реализовано с помощью паттерна Команда, где каждый пункт меню - отдельная команда.

Меню:
1. Начать игру
2. Загрузить игру
3. Выйти

После начала игры должна быть возможность выйти в меню при этом в меню появляется новый пункт 'Сохранить игру'.

Когда пользователь выбирает пункт 'Сохранить игру' состояние игры необходимо сохранять в файл и
восстанавливать при выборе пункта 'Загрузить игру'.

Параграфы-узлы в файле 'узлы-и-переходы.png'
Названия, текст параграфов-узлов и варианты ответов в файле 'текст-параграфов.md'
    */
