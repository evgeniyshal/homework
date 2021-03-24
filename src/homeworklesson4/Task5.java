package homeworklesson4;


import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // 5. Создать массив из 11 случайных целых чисел из отрезка [-1;1], вывести массив в консоль.
        // Определить какой элемент встречается в массиве чаще всего и вывести информацию об этом в консоль.
        int[] arr = new int[11];
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3) - 1;
            System.out.println(Arrays.toString(arr));

            if (arr[i] == 1) {
                a = a + 1;
            } else if (arr[i] == 0) {
                b = b + 1;
            } else if (arr[i] == -1) {
                c = c + 1;
            }
        }

        if (a > b && a > c) {
            System.out.println("Число 1 встречается чаще ");
        } else if (b > a && b > c) {
            System.out.println("Число 0 встречается чаще");
        } else if (c > a && c > b) {
            System.out.println("Число -1 встречается чаще");
        } else ;
    }
}








