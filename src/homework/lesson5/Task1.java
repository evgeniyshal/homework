package homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Task1 {
    public static void main(String[] args) {
          /*1. Задать массив на n слов.
              В цикле считывать с консоли слова (scanner.nextLine()),
       и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
       В итоге в массиве будут только уникальные слова.
       Выход из программы по слову exit (его в массив не добавлять) или если массив заполнен
       Перед завершением программы, вывести получившийся массив в консоль*/

        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];

        while (true) {
            String userWord = in.nextLine();
            if ("exit".equals(userWord)) break;
            for (int i = 0; i < arr.length; i++) {
                if (!userWord.equals(arr[i])) {
                    arr[i] = userWord;
                    break;
                }
            }
        }



        System.out.println(Arrays.toString(arr));
    }
}
