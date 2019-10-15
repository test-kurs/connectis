package zadanie_4_10_cz2;

public class Prostokąt implements Figura {

    private double pole;

    public Prostokąt(Integer a, Integer b) {
        if(b != null) {
            obliczPole(a, b);
        } else {
            obliczPole(a);
        };
    }

    public void obliczPole(int a, int b){
        pole = a * b;
    }

    public void obliczPole(int a){
        pole = a * a;
    }

    @Override
    public double pole() {
        return this.pole;
    }
}
