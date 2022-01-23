import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        //System.out.println(priceCalculation(8.5,2));
        //System.out.println(doubleExpression(0.1,0.7,0.8));
        //System.out.println(drawisMonitorsCounter(200,100));
        //System.out.println(charExpression(29));
        //System.out.println(isPowerOfTwo(8));
        //System.out.println('A' + "12");
        //System.out.println(isPalindrome("Was it a cat I saw?"));
        //System.out.println(factorial(3));
        System.out.println(determineGroup(50));
        //printOddNumbers(new int[] {-3,5,20,8,7,3,100});
        //printOddNumbers(new int[] {-4,20,8,100});
//        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[] {1, 3})));
//        long i = 5L;
//        float b = 5.80f;
//        float r = i+b;
//        char e ='t';
//        short t = 2;

    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role:roles ) {
            result.append(role).append(":\n");
            for (int i=0;i<textLines.length;i++) {
                if (textLines[i].startsWith(role+":")) {
                    result.append(i+1).append(") ").append(textLines[i].substring(role.length() + 2)).append("\n");
                }
            }
            result.append("\n");

        }
        return result.toString();
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length+a2.length];
        int i=0, j=0;
        for(int k=0;k<result.length;k++) {
            if (i<a1.length && j<a2.length) {
                if (a1[i]<a2[j]) {
                    result[k] = a1[i];
                    i++;
                } else {
                    result[k] = a2[j];
                    j++;
                }
            } else {
                if (i<a1.length) {
                    result[k]=a1[i];
                    i++;
                } else {
                    result[k]=a2[j];
                    j++;
                }
            }
        }
        return result;
    }


    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arr) {
            if (i % 2 != 0) {
                stringBuilder.append(i);
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder.length()>0 ? stringBuilder.deleteCharAt(stringBuilder.length()-1) : "");
    }

    public static int determineGroup(int age) {
        //return age < 1 ? -1: age < 14 ? 1 : age < 18 ? 2 : age < 66 ? 3:-1;
        if (age>=7 && age<=13) {
            return 1;
        } else if (age>=14 && age<=17) {
            return 2;
        } else if (age>=18 && age<=65) {
            return 3;
        } else {
            return -1;
        }

    }



    public static BigInteger factorial(int value) {
        if (value<=1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value-1));
        }
    }

    public static BigInteger factorial2(int value) {
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
