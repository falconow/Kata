import java.math.BigInteger;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        //System.out.println(priceCalculation(8.5,2));
        //System.out.println(doubleExpression(0.1,0.7,0.8));
        //System.out.println(drawisMonitorsCounter(200,100));
        //System.out.println(charExpression(29));
        //System.out.println(isPowerOfTwo(8));
        //System.out.println('A' + "12");
        System.out.println(isPalindrome("Was it a cat I saw?"));

    }

    public static BigInteger factorial(int value) {
        BigInteger result = new BigInteger("1");
        for(int i=1;i<=value;i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","");
        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }


    public static double priceCalculation(double price, int count) {
        return price*count;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static char charExpression(int a) {
        return (char) ('\\'+a);
    }


    public static boolean isPowerOfTwo(int value) {
        System.out.println(Integer.bitCount(value));
        return true;
    }

}
