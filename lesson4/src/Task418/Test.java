package Task418;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stack = new Throwable().getStackTrace();
        return stack.length<3 ? null : stack[2].getClassName() + "#" + stack[2].getMethodName();
    }
}