package MyClass;

public class Shop<X> {
    public X[] arr;

    public Shop(X[] arr) {
        this.arr = arr;
    }

    public void setData(X[] data) {
        this.arr = data;
    }

    public X[] getData() {
        return arr;
    }

    public void printObject() {
        for (X x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
