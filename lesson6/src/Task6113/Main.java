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
        test.add("Vasya");
        test.add("Anna");
        test.add("Luda");
        test.add("Lena");
        test.add("Petya");
        System.out.println(test);
        test.remove(5);
        System.out.println(test);
        test.add("Nastya");
        System.out.println(test);
        System.out.println(test.get(19));
    }
}
