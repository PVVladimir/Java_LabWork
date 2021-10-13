package LabWork;

public class RendomFromArray {
    private int[] values; // значения
    private int[] weights; // веса
    private int[] ranges; // левые границы отрезков
    private int sum = 0; // общая длина всех отрезков (весов)

    public RendomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;

        for (int a : weights) {
            sum += a;
        }

        // генерируем новый массив, в котором количество подряд идщих элементов исходного массива повторяется ровно количеству веса
        ranges = new int[sum];
        int k = 0;
        for (int i = 0; i < this.values.length; i++)
            for (int j = 1; j <= this.weights[i]; j++)
                ranges[k++] = this.values[i];
//        for (int a : ranges) System.out.print(a + " ");
//        System.out.println();
    }

    public int getRandom() {
        int rnd = (int) (Math.random() * (sum - 1));
        return this.ranges[rnd];
    }
}
