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
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Введите имя отправителя");
        String sender = scanner.nextLine();


        while (true) {
            System.out.println("Введите команду");
            String messageText = scanner.nextLine();
            if("/exit".equals(messageText)) {
                System.out.println("Завершение работы");
                break;
            }
            //TODO
            if ("/ping".equals(messageText) || "/count".equals(messageText))
            sendAndPrintMessage(new SimpleMessage(sender, messageText));

        }
    }

    private void sendAndPrintMessage (SimpleMessage message){
        try (Connection connection = new Connection(new Socket(ip, port))) {

            message.setTime();

            connection.sendMessage(message);

            SimpleMessage fromServer = connection.receiveMessage();

            System.out.println("от сервера:" + fromServer.getText());

        } catch (IOException e) { // обрыв
            System.out.println("Ошибка отправки - получения сообщения");
        } catch (ClassNotFoundException e) { // не собрать объект
            System.out.println("Ошибка чтения сообщения");
        } catch (Exception e) {
            System.out.println("Ошибка соединения");

        }
    }
}


