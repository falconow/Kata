package Task417;

public class Main {

    public static void main(String[] args) throws MyNewException {
        Main test = new Main();
        test.testExp();
    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    class MyNewException extends Exception{}
}
