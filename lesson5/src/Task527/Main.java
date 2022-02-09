package Task527;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        byte [] data = {1, -1, 4, 10};
        System.out.println(sumOfStream(new ByteArrayInputStream(data)));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int read = inputStream.read();
        while (read >= 0) {
            sum += read;
            read = inputStream.read();
        }
        inputStream.close();
        return sum;
    }

}
