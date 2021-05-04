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
    }

    @Override
    public void close() throws Exception {

    }
}
