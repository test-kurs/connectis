package główne;

import java.util.*;

public class Lambda {
     /*
    Utwórzcie liste o wartościach 4,2,3,1,8,5,7,6.
    Zadanie 1. Wyświetlcie za pomocą lambdy listę
    Zadanie 2.  Wyświetlcie liczby parzyste
    Zadanie 3. Wyświetlcie liczy większe od 5
    Zadanie 4.  Wyświetlcie liczby parzyste posortowane na dwa sposoby
    Zadanie 5. Napisz dwa interfejsy, który jeden ma metodę dodaj drugi pomnóż.
    Napisz metodę w które zaimplementujesz te metody przy użyciu lambdy.
    Zadanie 6. Napisz metodę, która doda 1 do każdego elementu listy i to wypisze
     */

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(6);

        //Zadnie 1
        arrayList.forEach(x -> System.out.println(x * 2));
        arrayList.forEach(System.out::println);

        for (Integer x : arrayList) {
            System.out.println(x);
        }

        //Zadanie 2
        arrayList.forEach(x -> {
            if (x % 2 == 0) System.out.println(x);
        });

        //Zadanie 3
        System.out.println("=======");

        arrayList.forEach(x -> {
            if (x > 5) System.out.println(x);
        });

        //Zadanie 4
        System.out.println("/////////");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        arrayList.forEach(x -> {
            if (x % 2 == 0) System.out.println(x);
        });

        Set<Integer> treeSet = new TreeSet<>();
        arrayList.forEach(x -> {
            if (x % 2 == 0) treeSet.add(x);
        });
        System.out.println(treeSet);

        //Zadanie 6
        arrayList.forEach(x -> {
            dodajJeden(x);
        });

        //Zadanie 5
        System.out.println("---------");
        oblicz();
    }

    interface Działąnie {
        double działanie(double a, double b);
    }

    interface Obiekt {
        Object operacja(Object a, Object b);
    }

    public static void oblicz() {
        Działąnie dodaj1 = (a,b) -> (a+b);
        System.out.println(dodaj1.działanie(5,7.2));

        Działąnie dodaj2 = (a,b) -> (a*b);
        System.out.println(dodaj2.działanie(5,7.2));

        System.out.println("?????");

        Obiekt obiekt1 = ( a, b) -> ((String) a + (String)b);
        System.out.println(obiekt1.operacja("100", "12DWA"));

        Obiekt obiekt2 = ( a, b) -> ((int) a + (int)b);
        System.out.println(obiekt2.operacja(100, 12));
    }


    public static void dodajJeden(int x) {
        System.out.println(x + 1);
    }
}
