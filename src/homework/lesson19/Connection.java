package homework.lesson19;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;;

public class Connection implements AutoCloseable {
    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Connection(Socket socket) throws Exception {
        this.socket = socket;
        output = new ObjectOutputStream(socket.getOutputStream());

        input = new ObjectInputStream(socket.getInputStream());
    }
    public void sendMessage(SimpleMessage message) throws IOException {

        output.writeObject(message);
        output.flush();
    }

    public SimpleMessage readMessage() throws IOException, ClassNotFoundException {
        return (SimpleMessage) input.readObject(); // вернет тип object и приведет к (SimpleMessage)

    }


    @Override
    public void close() throws Exception {
        input.close();
        output.close();
        socket.close();
    }
}
