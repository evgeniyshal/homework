package lesson18;

import java.io.IOException;
import java.io.OutputStream;

public class encryptedOut extends OutputStream {
    public static String decrypt(byte[] text, String keyWord) {
        byte[] result  = new byte[text.length];
        byte[] keyArr = keyWord.getBytes();
        for(int i = 0; i < text.length;i++) {
            result[i] = (byte) (text[i] ^ keyArr[i% keyArr.length]);
        }
        return new String(result);
    }
    @Override
    public void write(int b) throws IOException {

    }
}
