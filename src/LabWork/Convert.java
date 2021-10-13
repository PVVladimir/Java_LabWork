package LabWork;

public class Convert {
    private double met = 0;
    private double mil = 0;
    private double yrd = 0;
    private double fut = 0;

    private double kil = 0;
    private double grm = 0;
    private double fnt = 0;
    private double krt = 0;

    public Convert(int md, int m, double vol) {
        calcMetric(md, m, vol);
    }

    public Convert() {
        calcMetric(1, 1, 0);
        calcMetric(2, 1, 0);
    }

    public void calcMetric(int md, int m, double vol) {
        System.out.println("md=" + md + " m=" + m + " vol=" + vol);
        if (md == 2) {
            switch (m) {
                case 1 -> {
                    this.met = vol;
                    this.mil = vol / 1609;
                    this.yrd = vol * 1.094;
                    this.fut = vol * 3.281;
                }
                case 2 -> {
                    this.met = vol * 1609;
                    this.mil = vol;
                    this.yrd = vol * 1760;
                    this.fut = vol * 5280;
                }
                case 3 -> {
                    this.met = vol / 1.094;
                    this.mil = vol / 1760;
                    this.yrd = vol;
                    this.fut = vol * 3;
                }
                case 4 -> {
                    this.met = vol / 3.281;
                    this.mil = vol / 5280;
                    this.yrd = vol / 3;
                    this.fut = vol;
                }
                default -> System.out.println("Out of range!");
            }
        } else {
            switch (m) {
                case (1) -> {
                    this.kil = vol;
                    this.grm = vol * 1000;
                    this.fnt = vol * 2.205;
                    this.krt = vol * 5000;
                }
                case (2) -> {
                    this.kil = vol / 1000;
                    this.grm = vol;
                    this.fnt = vol / 454;
                    this.krt = vol * 5;
                }
                case (3) -> {
                    this.kil = vol / 2.205;
                    this.grm = vol * 454;
                    this.fnt = vol;
                    this.krt = vol * 2268;
                }
                case (4) -> {
                    this.kil = vol / 5000;
                    this.grm = vol / 5;
                    this.fnt = vol * 0.0004409;
                    this.krt = vol;
                }
                default -> System.out.println("Out of range!");
            }
        }
    }

    public void getMetricM() {
        System.out.println("Результат:");
        System.out.println("метры: " + this.met);
        System.out.println("мили: " + this.mil);
        System.out.println("ярды: " + this.yrd);
        System.out.println("футы: " + this.fut);
    }

    public void getMetricK() {
        System.out.println("Результат:");
        System.out.println("килограммы: " + this.kil);
        System.out.println("граммы: " + this.grm);
        System.out.println("фунты(lb): " + this.fnt);
        System.out.println("караты: " + this.krt);
    }
}
