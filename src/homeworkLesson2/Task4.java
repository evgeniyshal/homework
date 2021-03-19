package homeworkLesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNum = (int) (Math.random()*9);

        for (int i = 1; i < 10; i++) {
            System.out.println("Введите число:");
            int userNum = sc.nextInt();

            if (userNum == 0) {
                System.out.println("Выход из программы");
                break;
            } else if ( userNum < randomNum) {
                System.out.println("загаданное число меньше");
            } else if ( userNum > randomNum) {
                    System.out.println("загаданное число больше");
            } else if (userNum == randomNum) {
                System.out.println("Вы угадали!");
                break;
            }

        }
    }
}
