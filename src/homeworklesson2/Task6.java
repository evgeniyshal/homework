package homeworklesson2;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Загадать число от 1 до 100!");
        int minNumber = 1;
        int maxNumber = 100;

        System.out.println("число больше 49?");
        System.out.println(" Да - 1, Нет 2");
        int userNumber = sc.nextInt();

        if (userNumber == 1) {
            maxNumber = maxNumber /2;
            System.out.println("Число  ?");

        } else if (userNumber == 2) {
            minNumber = minNumber * 25;
            System.out.println();

        }

    }
}
