package homeworklesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double wash = in.nextInt();
        double expend = 0.5;
        int dish = in.nextByte();
        while (wash >= 0 && dish >= 1) {
        System.out.println("Тарелок: " + dish + " / " + "Моющего средства: " + wash);
            dish --;
            wash -=0.5;
        }
        System.out.println("Осталось Тарелок: " + dish + " / " + "Остаток моющего средства:" + wash);
    }
}
