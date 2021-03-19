package homeworkLesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("введите операнд");
        int a = num.nextInt();
        System.out.println("введите операнд");
        int b = num.nextInt();
        System.out.println("введите оператор");
        int c = num.nextInt();

        switch (c) {
            case 3:
                System.out.println(a + b);
                break;
            case 5:
                System.out.println(a-b);
                break;
            case 7:
                System.out.println(a*b);
                break;
            case 9:
                System.out.println(a/(double)b);
                if ( b == 0 ){
                    System.out.println("на ноль делить нельзя");
                }
                break;
                default:
                System.out.println();
        }
    }
}

/*4


2. Задача на switch
Пользователь вводит 3 числа:
1е - первый операнд
2e - второй операнд
3е - оператор
В зависимости от третьего введенного числа нужно вывести в консоль:
сумму, разность, умножение, деления чисел, которые ввел пользователь.
Если 3е введенное число 3, нужно найти сумму,
если 5 - разность,
если 7 - результат умножения,
если 9 - результат деления.*/