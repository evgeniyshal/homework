package homeworklesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] arr = new int [20];
        int min = (int) Double.MAX_VALUE;
        int max = (int) Double.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        int replace;

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 497 + 3);

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
            replace = minIndex;
            minIndex = maxIndex;
            maxIndex = replace;
            System.out.println(replace);
        }
    }


