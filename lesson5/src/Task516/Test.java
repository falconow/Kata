package Task516;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        File file1 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");
        File file2 = new File("a\\b\\c\\file.txt");
        File file3 = new File("a\\b\\..\\file.txt");
        File file4 = new File(".a\\..\\b\\c\\file.txt");
        File file5 = new File("a\\..\\b\\c\\file.txt");

        try {
            System.out.println(file1.getCanonicalFile());
            System.out.println(file2.getCanonicalFile());
            System.out.println(file3.getCanonicalFile());
            System.out.println(file4.getCanonicalFile());
            System.out.println(file5.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = -1;
        byte y = (byte ) i;
        int result = (int) y;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(result));
        System.out.println(y);
    }
}
