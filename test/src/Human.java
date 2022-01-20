public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут "+name+", мне "+age+" лет.");
    }
}
