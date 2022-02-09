package Task547;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("test.bin");
        try {
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path));
            out.writeInt(-5);
            out.writeObject(new Animal("213"));
            out.writeObject(new Animal("cat"));
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            byte [] data = Files.readAllBytes(path);
            Animal [] res = deserializeAnimalArray(data);
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int count = objectInputStream.readInt();
            Animal [] result = new Animal[count];
            for (int i = 0; i < count; i++) {
                Animal test = (Animal) objectInputStream.readObject();
                result[i] = test;
            }
            return result;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Object is not Animal",e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class Animal not found",e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Error I/O",e);
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("Bad size Array",e);
        }
    }
}
