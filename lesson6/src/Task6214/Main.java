package Task6214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        getSalesMap(reader);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> result = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            result.merge(scanner.next(), scanner.nextLong(), Long::sum);
        }
        return result;
    }
}
