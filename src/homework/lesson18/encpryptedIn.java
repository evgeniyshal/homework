package lesson18;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class encryptedIn extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected encryptedIn(InputStream in) {
        super(in);
    }

    public static byte[] encrypt(String text, String keyWord) {
        byte[] arr = text.getBytes();
        byte[] keyArr = keyWord.getBytes();
        byte[] result = new byte[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = (byte) (arr[i] ^ keyArr[i % keyArr.length]);
        }
        return result;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }
}