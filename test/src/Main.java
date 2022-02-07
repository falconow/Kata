import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Human human = new Human("Dima",29);
//        human.sayHello();

        //String a = null;
        Object a = new Object();
        Integer b = (Integer) a;

    }

    public static void binar(int a) {
        int i, b;
        while(a !=0 ) {
            b = a%2;
            System.out.print(b);
            a = a/2;
        }
    }

    public static void recursionFucn() {
        System.out.println("Привет, JavaRush!");
        recursionFucn();
    }

    static int[] fillArray(int x) {
        int[] result = new int[x];
        for (int i=0;i<x;i++) {
            result[i] =i;
        }
        return result;
    }

    static void printArray(int[] arr) {
        for(int i:arr) {
            System.out.println(i);
        }
    }



    public static int getMinFromFour(int x, int y, int m, int n) {
        int min;
        min = getMinFromTwo(x,y);
        min = getMinFromTwo(min,m);
        min = getMinFromTwo(min,n);
        return min;
    }


    public static int getMinFromTwo(int x, int y) {
        if (x<y) {
            return x;
        }
        else return y;
    }



    public static long determineRainfall(double area, double rainfallAmount) {
        return (long) (area*1000000*rainfallAmount*2);
    }

    public static boolean determineAdult(int age) {
        if (age<0) {
            System.out.println("Ошибка! Введите правильный возраст.");
            return false;
        }
        if (age>=18) {
            return true;
        } else {
            return false;
        }
    }

    public static void printJavaWord(int count) {
        for (int i=0;i<count;i++) {
            System.out.println("Java");
        }
    }

    public static int incrementIfPositive(int a) {
        int b = a+1;
        if (b>0) {
            return b;
        } else {
            return a;
        }
    }

    public static void printHello(String name) {
        System.out.println("Hello "+name+"!");
    }

    public static void printDivisionResult (double x, double y) {
        System.out.println(x/y);
    }

    public static int getMaxInt() {
        return Integer.MAX_VALUE;
    }

    public static int sum(int x, int y) {
        return x+y;
    }
}
