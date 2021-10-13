package LabWork;

public class Lab21 {
    public static void main(String[] args) {
        System.out.println("2.1. Генерация случайного элемента с весом");
        int[] v = {1,7,23};
        int[] w = {10,2,10};
        RendomFromArray r = new RendomFromArray(v, w);

        for (int i = 0; i<100; i++) System.out.print(r.getRandom()+" ");
        System.out.println();
    }
}
