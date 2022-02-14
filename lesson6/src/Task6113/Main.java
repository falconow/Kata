package Task6113;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> test = new DynamicArray<>();
        test.add("123");
        test.add("Dima");
        test.add("Sasha");
        test.add("Petr");
        test.add("Masha");
        test.add("Andrey");
        System.out.println(test);
        test.remove(2);
        System.out.println(test);
    }
}
