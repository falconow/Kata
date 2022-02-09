package Task528;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        byte [] data = {3, 10, 4, 5, 7};
        InputStream inputStream = new ByteArrayInputStream(data);
        print(inputStream, System.out);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int read = inputStream.read();
        while (read >= 0) {
            if (read % 2 == 0) {
                outputStream.write(read);
            }
            read = inputStream.read();
        }
        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }



}
