package Task5310;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        char t = '\u03E7';
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write(t);
        writer.close();
    }
}
