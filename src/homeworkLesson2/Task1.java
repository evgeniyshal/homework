package homeworkLesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество ответов");
        int count = in.nextInt();

        if (count <=100 && count >= 90) {
            System.out.println("оценка отлично");
        } else if (count <= 89 && count >= 60) {
            System.out.println("оценка хорошо");
        } else if (count <= 59 && count >= 40) {
            System.out.println("оценка удовлетворительно");
        } else if (count <= 39 && count >= 0) {
            System.out.println("поробуйте в следующий раз");
        }
    }
}
/*1. Задача на if
        Дана целочисленная переменная count - количество верных ответов.
        В зависимости от значения этой переменной вывести в консоль оценку:
        100 - 90 правильных ответов - отлично
        89 - 60 правильных ответов - хорошо
        59 - 40 правильных ответов - удовлетворительно
        39 - 0 правильных ответов - попробуйте в следующий раз*/