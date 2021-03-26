package homeworklesson5strings;

public class Task3 {
    /*3. Написать функцию, которая проверяет, является ли строка палиндромом.
Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо,
так и справа налево.
Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром*/
    public static void main(String[] args) {
        System.out.println(isPalindrome("Шабаш"));
    }
    public static Boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

}
