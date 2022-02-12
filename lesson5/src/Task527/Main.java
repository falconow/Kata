package Task527;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        byte [] data = {1, 9, 8, 27};
        System.out.println(sumOfStream(new ByteArrayInputStream(data)));
        byte b1 = (byte) 11111111;
        System.out.println(Byte.toString(b1));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int read;
        while ((read = inputStream.read()) >= 0) {
            sum += (byte) read;
        }
        inputStream.close();
        return sum;
    }

}
