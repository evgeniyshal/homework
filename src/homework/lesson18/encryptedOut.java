package lesson18;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class encryptedOut extends FilterOutputStream { // родитель для тех кто будут обр потоки{
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */
    public encryptedOut(OutputStream out) {
        super(out);
    }

    public static String decrypt (byte[] text, String keyWord) {
        byte[] result  = new byte[text.length];
        byte[] keyArr = keyWord.getBytes();
        for(int i = 0; i < text.length;i++) {
            result[i] = (byte) (text[i] ^ keyArr[i% keyArr.length]);
        }
        return new String(result);
    }

        @Override
        public void write(byte[] b) throws IOException {
            super.write(b);
        }
}
