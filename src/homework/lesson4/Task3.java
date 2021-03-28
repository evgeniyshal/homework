package homework.lesson4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
       /* 3. Дан массив целых чисел [-321, 894, -45, 782, -29, 12, -88]. Отрицательные элементы массива перенести в новый массив.
             Размер массива должен быть равен количеству отрицательных элементов.*/
        int[] arr = {-321, 894, -45, 782, -29, 12, -88};
        int disNumCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                disNumCount++;
            }

            }
        int[] disArr = new int[disNumCount];
        int disPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                disArr[disPos] = arr[i];
                disPos++;
            }
        }
        System.out.println(Arrays.toString(disArr));
    }
}