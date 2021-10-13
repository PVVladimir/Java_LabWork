package LabWork;

public class Lab12 {
    public static void main(String[] args) {
        boolean simple = true;
        System.out.print("Simple numbers: ");
        for (int i = 2; i <= 100; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) System.out.print(i + " ");
        }
        System.out.println();
    }
}
