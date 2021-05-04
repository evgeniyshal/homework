package homework.lesson19;

public class ServerMain {
    public static void main(String[] args) throws Exception {
        new Server("127.0.0.1", 8999).start();
    }
}
