package MyClass;

public class MyMath {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static int add(int a, int b) {
        count++;
        return a + b;
    }

    public static double add(double a, double b) {
        count++;
        return a + b;
    }

    public static int sub(int a, int b) {
        count++;
        return a - b;
    }

    public static double sub(double a, double b) {
        count++;
        return a - b;
    }

    public static int mult(int a, int b) {
        count++;
        return a * b;
    }

    public static double mult(double a, double b) {
        count++;
        return a * b;
    }

    public static double div(int a, int b) {
        count++;
        return (double) a / b;
    }

    public static double div(double a, double b) {
        count++;
        return a / b;
    }


}
