package homeworkLesson1;
//1. Создание проекта, структура и настройки проекта.
//
//2. Задача на тернарный оператор
//Даны переменные типа long start и end.
//Если start меньше end переменной between присвоить значение end - start, в противном случае -1
//
//3. Задача на арифметические операторы
//Найти сумму цифр 2х значного числа
//
//4. Задача на арифметические операторы
//Найти сумму цифр 3х значного числа

public class Task2 {
    public static void main(String[] args) {
        long start = 3;
        long end = 5;
        long between;
        between = start < end ? end - start : -1;
        System.out.println(between);
    }
}
