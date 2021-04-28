package lesson18;

import java.io.IOException;
import java.io.InputStream;

class encryptedIn extends InputStream {
    public static byte[] encrypt(String text, String keyWord){
        byte[] arr = text.getBytes();
        byte[] keyArr = keyWord.getBytes();
        byte[] result = new byte[arr.length];
        for(int i = 0; i< arr.length; i++) {
            result[i] = (byte) (arr[i] ^ keyArr[i % keyArr.length]);
        }
        return result;

    }
    @Override
    public int read() throws IOException {
        return 0;
    }
}
