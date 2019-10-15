package zadanie_4_10_cz2;

public class Trójkąt implements Figura {

    private double pole;

    public Trójkąt(double a, double h) {
        this.pole = a * h /2;
    }

    public Trójkąt(double a, double b, double c) {
        double p = (a + b + c) / 2;
        this.pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double pole() {
        return pole;
    }
}
