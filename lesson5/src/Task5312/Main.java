package Task5312;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double d = Double.parseDouble(scanner.next());
                sum += d;
            } else {
                scanner.next();
            }

        }
        System.out.printf(Locale.US,"%.6f", sum);
    }
}
