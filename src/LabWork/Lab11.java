package LabWork;

public class Lab11 {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];

        boolean sorted = true;

        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100);

        for (int a : arr) System.out.print(a + " ");
        System.out.println();
        do {
            sorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                    sorted = false;
                }
            }
            for (int a : arr) System.out.print(a + " ");
            System.out.println(sorted);
        } while (!sorted);

        for (int a : arr) System.out.print(a + " ");
        System.out.println();
    }
}
