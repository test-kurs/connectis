package zadania_4_10;

import java.text.DecimalFormat;

public class MainMath {
    /*   Korzystając z klasy Math:
 1. Wyświetl liczbę Pi
 2. Zaokrągl liczbę Pi i ją wyświetl
 3. Oblicz sinus 30 stopni
 4. Zrzutuj 3.8 na int i wyświetl
 5. Zaokrągl liczbę 3.8
 6. Pobierz wartość bezwględną z -10
 7. Policz 2 do potęgi 8
 8. Wyciągnij pierwiastek z 16
 9. Zaokrągl liczbę do dwóch miejsc po przecinku 2.34568
 10. Policz pierwiastek sześcienny z 27
 */
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println(Math.PI);
        //Zadanie 2
        System.out.println(Math.round(Math.PI));
        //Zadanie 3
        double sin = Math.sin(Math.PI/6);
        System.out.println(sin);

        //Zadanie 4
        double a = 3.8;
        int b = (int) a;
        System.out.println(b);

        //Zadanie 5
        long round = Math.round(a);
        System.out.println(round);

        //Zadanie 6
        System.out.println(Math.abs(-10));

        //Zadanie 7

        System.out.println(Math.pow(2,8));
        //Zadanie 8
        System.out.println(Math.sqrt(16));

        //Zadanie 9
        double d = 2.34568;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(d));

        //Zadanie 10
        System.out.println(Math.pow(27, 1.0/3.0));

    }
}
