package Task5311;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        byte [] data = {48, 49, 50, 51};
        try {
            System.out.println(readAsString(new ByteArrayInputStream(data), StandardCharsets.US_ASCII));
        } catch (IOException ignored){}

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int res = reader.read();
        while (res >= 0) {
            stringBuilder.append((char) res);
            res = reader.read();
        }
        return stringBuilder.toString();
    }

}
