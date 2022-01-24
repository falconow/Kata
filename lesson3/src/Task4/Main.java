package Task4;

public class Main {
    public static void main(String[] args) {
        ComplexNumber t1 = new ComplexNumber(104.0,569.0);
        ComplexNumber t2 = new ComplexNumber(569.0,104.0);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}
