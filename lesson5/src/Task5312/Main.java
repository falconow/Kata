package Task5312;

import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        double sum = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            try {
                double d = Double.parseDouble(s);
                sum += d;
            } catch (NumberFormatException ignored){}
        }
        System.out.printf(Locale.ENGLISH,"%.6f", sum);
        scanner.close();
    }
}
