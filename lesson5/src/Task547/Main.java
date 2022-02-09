package Task547;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        try {
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path));
            out.writeObject(new Animal("Жираф"));
            out.writeObject(new Animal("Кошка"));
            out.writeObject(new Animal("Собака"));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(deserializeAnimalArray(Files.readAllBytes(path)));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
            int count = objectInputStream.readInt();
            Animal [] result = new Animal[count];
            for (int i = 0; i < count-1; i++) {
                try {
                    Animal desirialized = (Animal) objectInputStream.readObject();
                    result[i] = desirialized;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
