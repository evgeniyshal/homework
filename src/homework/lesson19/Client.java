package homework.lesson19;

import java.util.Scanner;

public class Client {
   private String ip;
   private int port;
   private Scanner scanner;

    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;
        scanner = new Scanner(System.in); // почему в конструкторе создаем объект? почему не в классе?
    }
    public void start() {

        String userCommand = scanner.nextLine();
        if("/help".equals(scanner.nextLine())){
            System.out.println("Введите команду");
        }else {
            System.out.println("Некорректная команда");
        }
    }
}

