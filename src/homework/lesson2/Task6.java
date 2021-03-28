package homework.lesson2;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Загадать число от 1 до 100!");
        int minNum = 1;
        int maxNum = 100;
        int midNum;

        while (minNum <= maxNum) {

            midNum = ((maxNum + minNum) / 2);

            System.out.println("Вы загадали " + midNum + "? 0 - НЕТ и 1 - ДА");

            int userNumber = sc.nextInt();

            if (userNumber == 1) {

                System.out.println("Загаданное число " + midNum);
                break;

            } else {

                System.out.println("Загаданное число больше " + midNum + "? 0 - НЕТ и 1 - ДА");

                userNumber = sc.nextInt();

                if (userNumber == 0) {

                    maxNum = midNum - 1;

                } else if (userNumber == 1) {

                    minNum = midNum + 1;
                }
            }
        }
    }
}


