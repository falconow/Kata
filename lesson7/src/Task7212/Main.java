package Task7212;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Map<String, Integer> map = reader.lines()
                .flatMap(x -> Arrays.stream(x.split("[\\p{Punct}\\s]+")))
                .collect(Collectors.toMap(x->x, x->1, Integer::sum));
        map.entrySet().stream()
                .sorted((x1, x2) -> {
                    int result = x2.getValue().compareTo(x1.getValue());
                    return result == 0 ? x1.getKey().compareTo(x2.getKey()) : result;
                })
                .limit(10)
                .forEach(x-> System.out.println(x.getKey()));
    }
}
