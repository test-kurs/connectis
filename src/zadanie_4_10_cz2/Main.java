package zadanie_4_10_cz2;

public class Main {
/*    Utwórz interfejs Figura z metodą pole, zaimplementuj ten interfejs do klas
    - Trapez
    - Sześciokąt foremny
    - Prostokąt i Kwadrat
    - Trójkąt

    Zaimplementuj metodę pole
    -w przypadku prostokąta i kwadratu zastosuj przeciążanie metod
    - w przypadku trójkąta przeciązanie konstruktora
    */
    public static void main(String[] args) {
        Trójkąt trójkąt1 = new Trójkąt(12,4);
        System.out.println(trójkąt1.pole());

        Trójkąt trójkąt2 = new Trójkąt(3,4,5);
        System.out.println(trójkąt2.pole());

        Prostokąt prostokąt1 = new Prostokąt(2,4);
        Prostokąt kwadrat = new Prostokąt(4, null);

        System.out.println("Prostokąt: " + prostokąt1.pole());

        System.out.println( "Kwadrat: " + kwadrat.pole());

        Sześciokąt sześciokąt1 = new Sześciokąt(6);
        System.out.println(sześciokąt1.pole());
    }
}
