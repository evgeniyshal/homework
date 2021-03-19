 4package homeworkLesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNum = (int) ((Math.random() * 9));


        System.out.println("Введите число:");
        int userNum = sc.nextInt();
        while (true) {
            if (userNum == 0) {
                System.out.println("Выход из программы");
                break;
            } if (userNum == randomNum) {
                System.out.println("Вы угадали!");
                break;
            } if (userNum < randomNum) {
                System.out.println("загаданное число меньше");
            } if (userNum > randomNum) {
                System.out.println("загаданное число больше");
            }

        }
    }
}
