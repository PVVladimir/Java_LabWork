package MyClass;

public class MyLine {
//    private MyPoint pointStart;
    public MyPoint pointStart;
//    private MyPoint pointEnd;
    public MyPoint pointEnd;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.pointStart = new MyPoint(x1, y1);
        this.pointEnd = new MyPoint(x2, y2);
    }

    public void setPointStart(int x, int y) {
        this.pointStart = new MyPoint(x, y);
    }

    public void setPointEnd(int x, int y) {
        this.pointEnd = new MyPoint(x, y);
    }

    public MyPoint getPointStart() {
        return pointStart;
    }

    public MyPoint getPointEnd() {
        return pointEnd;
    }

    public class MyPoint {
        public int x;
        public int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
