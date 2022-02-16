package Task6215;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (i % 2 == 1) {
                list.addFirst(value);
            }
            i++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        list.forEach((k) -> stringBuilder.append(k).append(" "));
        System.out.println(stringBuilder.toString().trim());
    }
}
