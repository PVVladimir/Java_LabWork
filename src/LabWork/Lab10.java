package LabWork;

public class Lab10 {
    public static void main(String[] args) {
        int n = 300;
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            //System.out.println(arr[i]);
        }

        System.out.println();
        double min = arr[0];
        double max = arr[0];
        double avg = 0;

        for (double a : arr) {
            min = (a < min) ? a : min;
            max = (a > max) ? a : max;
            avg += a;
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + (avg / arr.length));

    }
}
