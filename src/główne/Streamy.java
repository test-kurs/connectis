package główne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamy {
    /*
  Utwórzcie liste o wartościach 4,2,3,1,8,5,7,6.
  Zadanie 1. Wyświetlcie za pomocą streamów listę domyślnym wywołaniem metody oraz
  z dopiskiem pzed każdą liczbą "To jest liczba:" x
  Zadanie 2. Wyświetlcie liczby parzyste
  Zadanie 3. Wyświetlcie liczy większe od 5
  Zadanie 4. Wyświetlcie liczby parzyste posortowane
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

        //Zadanie 1

        //      arrayList.stream().forEach(x -> System.out.println("To jest liczba: " + x));

        //Zadanie 2

        //     arrayList.stream().filter(f -> (f % 2 == 0)).forEach(x -> System.out.println("To jest liczba parzysta: " + x));

//Zadanie 3

        //      arrayList.stream().filter(f -> f > 5).forEach(x -> System.out.println("To jest liczba większa od 5: " + x));

        //Zadanie 4

        //  arrayList.stream().filter(f -> (f % 2 == 0)).sorted().forEach(x -> System.out.println("To jest liczba parzysta: " + x));

        //Zadanie dodatkowe wyświetl liczby parzyste, większe od 5 i dodaj 100 do nich oraz zapisz do listy


        List<Integer> collectToList2 = new ArrayList<>();

        //    arrayList.stream().filter(s -> (s % 2 == 0)).filter( f -> (f < 5)).map(m -> m+100).forEach(collectToList2::add);

        System.out.println(collectToList2);

        //      List <Integer> collectToList = arrayList.stream().filter(s -> (s % 2 == 0)).filter( f -> (f < 5)).map(m -> m+100).collect(Collectors.toList());

        //      System.out.println(collectToList);

        /*
        Utwórz listę z wartościami Ala, Asia, Zosia, Tosia, Kamila
        Zadanie 1. Korzystając ze streamów wypisz długość liter w poszczególnym imieniu
        Zadanie 2. Utwórz drugą liste z imionami ale każde imie ma być napisane z dużej litery oraz posortowane
        */

        List<String> arrayListString = new ArrayList<>();
        arrayListString.add("Ala");
        arrayListString.add("Asia");
        arrayListString.add("Zosia");
        arrayListString.add("Tosia");
        arrayListString.add("Kamila");

        arrayListString.stream().map(str -> str.length()).forEach(System.out::println);

        List<String> answer = arrayListString.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());

        System.out.println(answer);

        //Przykład dla mapy

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "jeden");
        mapa.put(2, "dwa");

        mapa.entrySet().stream().map(x -> (x.getValue().toUpperCase() + " Zosia ")).forEach(System.out::println);
    }
}
