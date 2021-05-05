package homework.lesson19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Server {
    private String ip;
    private int port;
    private Connection connection;
    private String defaultResponse = "\nДоступные команды:\n/count - узнать количество клиентов, которые подключались к серверу\n" +
            "/ping - узнать время за которое сообщение доходит до сервера и возвращается обратно\n" +
            "/exit - завершение программы";
    private Set<String> senders = new HashSet<>();

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
                SimpleMessage message = connection.receiveMessage();

                senders.add(message.getSender());

                String response = handleMessage(message);

                connection.sendMessage(new SimpleMessage("server", response));
            }

        } catch (IOException e) {
            System.out.println("Ошибка соединения");
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка чтения сообщения");
        }
    }

    private String handleMessage(SimpleMessage message) {
        String response = defaultResponse;

        if ("/ping".equals(message.getText())) {
            response = String.valueOf((LocalTime.now().getNano() - message.getTime().getNano()) / 1_000_000);
        } else if ("/count".equals(message.getText())) {
            response = String.valueOf(senders.size());
        }

        return response;
    }
}