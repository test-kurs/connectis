package zadanie_4_10_cz2;

public class Sześciokąt implements Figura {

    private double pole;

    public Sześciokąt(int a) {
        this.pole = (3 * Math.pow(a,2)* Math.sqrt(3))/2;
    }

    @Override
    public double pole() {
        return pole;
    }
}
