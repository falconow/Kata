package Task2;

public class Human {
    private byte age;
    private String name;
    private String secondName;
    private String favoriteSport;

    public Human() {

    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this(age, name, secondName);
        this.favoriteSport = favoriteSport;
    }


}
