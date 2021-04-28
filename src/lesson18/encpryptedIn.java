package lesson18;

import java.io.IOException;
import java.io.InputStream;

class encryptedIn extends InputStream {
    @Override
    public int read() throws IOException {
        return 0;
    }
}
