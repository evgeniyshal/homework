package homeworklesson2;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Загадать число от 1 до 100!");
        int minNum = 1;
        int maxNum = 100;


        while (minNum <= maxNum) {

            int midNum = 50;
            System.out.println("Используйте числа 0 - НЕТ и 1 - ДА");
            System.out.println("Число " + midNum + " больше загадонного?");
            int userNumber = sc.nextInt();


            if (userNumber == 1) {
                midNum = ((maxNum + minNum) / 2); // 150 / 2 = 75
                System.out.println("Число " + midNum + " больше загадонного ?");

            }
        }
    }
}


