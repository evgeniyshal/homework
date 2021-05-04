package homework.lesson19;

import java.io.IOException;
import java.net.Socket;
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
    private void sendAndPrintMessage(SimpleMessage message) {
        try (Connection connection = new Connection(new Socket(ip,port))) {
            connection.sendMessage(message);

            SimpleMessage fromServer = connection.readMessage();
            System.out.println("от сервера:" + fromServer);

        } catch (IOException e) { // обрыв
            System.out.println("Ошибка отправки - получения сообщения");
        } catch (ClassNotFoundException e) { // не собрать объект
            System.out.println("Ошибка чтения сообщения");
        } catch (Exception e) {
            System.out.println("Ошибка соединения");

        }
    }
}

