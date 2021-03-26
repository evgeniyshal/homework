package homeworklesson4arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // 2. Дан массив целых чисел [78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90].
        // Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.
        int[] arr = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};

        int oddCount = 0;
        int evenCount = 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] arrOdd = new int[oddCount];
        int[] arrEven = new int[evenCount];

        int evenPos = 0;
        int oddPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[evenPos] = arr[i];
                evenPos++;
            } else {
                arrOdd[oddPos] = arr[i];
                oddPos++;
            }
        }
        System.out.println(Arrays.toString(arrOdd) + Arrays.toString(arrEven));
    }
}

