package homework.lesson5;

public class Task3 {
    /*3. Написать функцию, которая проверяет, является ли строка палиндромом.
Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо,
так и справа налево.*/


    public static void main(String[] args) {
        System.out.println(isPalindrome("Шабаш"));
    }
     public static boolean isPalindrome(String s) {
    return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

}
