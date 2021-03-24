package homeworklesson4;

import java.sql.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // Создать массив из чётных чисел [2, 4, 6, 8, 10, 12 ... 18, 20]
        // и вывести элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int evenCount = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                evenCount++;

            }
        }
        int[] arr = new int[evenCount];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[b] = i;
                b++;
                System.out.println(Arrays.toString(arr));
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

