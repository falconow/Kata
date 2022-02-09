package Task539;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task539 {
    public static void main(String[] args) throws IOException {
        byte [] data = "Ы".getBytes();
        InputStream inputStream = new ByteArrayInputStream(data);
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        inputStream.close();

    }
}
