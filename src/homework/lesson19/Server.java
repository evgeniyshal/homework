package homework.lesson19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private String ip;
    private int port;
    private Connection connection;

    public Server(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void start() throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(port)) {//Нужен для ожидания входящих сообщений
            System.out.println("Сервер запущен");
            while (true) {

                Socket newClient = serverSocket.accept();// момент установки соединения с клиентом
                connection = new Connection(newClient);
                SimpleMessage message = connection.readMessage();
                System.out.println(message);
                connection.sendMessage(SimpleMessage.getMessage("сервер", "сообщения"));
            }

        } catch (IOException e) {
            System.out.println("Ошибка соединения");
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка чтения сообщения");
        }
    }
}