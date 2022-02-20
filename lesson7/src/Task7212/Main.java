package Task7212;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import javax.swing.text.html.parser.Entity;
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
        new BufferedReader(new InputStreamReader(System.in, java.nio.charset.StandardCharsets.UTF_8))
                .lines()
                .flatMap(x -> Arrays.stream(x.split("[\\p{Punct}\\s]+")))
                .map(String::toLowerCase)
                .collect(Collectors.toMap(x -> x, x -> 1, Integer::sum))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
