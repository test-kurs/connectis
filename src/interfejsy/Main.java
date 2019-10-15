package interfejsy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
   Zadanie 1. Utworzyć kilka instancji Słonia oraz Węża oraz zapisać je do jednej listy.
    Zadanie 2. Posortować listę po nazwie implementująć compareTo oraz wyświetlić
    Zadanie 3. Posorotwać listę po cenie zwierzęcia za pomocą streamów
    Zadanie 4. Posortować listę po wieku oraz odfiltrować listę wybierając zwierzęta starsze niż 5 lat
    Zadanie 5. Dodaj instancje zwierząt to HashSet oraz do TreeSet oraz wypisz
     */
    public static void main(String[] args) {

        // Zadanie 1

        Słoń słoń1 = new Słoń(100, "Bimbo", 5, Boolean.TRUE);
        Słoń słoń2 = new Słoń(250, "Złomek", 7, Boolean.FALSE);
        Słoń słoń3 = new Słoń(120, "Cisek", 12, Boolean.TRUE);
        Słoń słoń4 = new Słoń(10, "Westel", 9, Boolean.TRUE);

        Wąż wąż1 = new Wąż(123, "Kajtek", 1 , Boolean.TRUE, 10);
        Wąż wąż2 = new Wąż(73, "Lenovo", 3 , Boolean.FALSE, 7);
        Wąż wąż3 = new Wąż(90, "Znaczek", 6 , Boolean.TRUE, 9);
        Wąż wąż4 = new Wąż(90, "Znaczek", 6 , Boolean.TRUE, 9);

        List<Zwierzę> zwierzętaList = new ArrayList<>();
        zwierzętaList.add(słoń1);
        zwierzętaList.add(słoń2);
        zwierzętaList.add(słoń3);
        zwierzętaList.add(słoń4);
        zwierzętaList.add(wąż1);
        zwierzętaList.add(wąż2);
        zwierzętaList.add(wąż3);
        zwierzętaList.add(wąż4);

        System.out.println(zwierzętaList);
//Zadanie 2
        zwierzętaList.stream().sorted().forEach(System.out::println);
//Zadanie 3
        zwierzętaList.stream().sorted((x1,x2) -> Double.compare(x1.cena(), x2.cena())).forEach(System.out::println);
//:
        System.out.println("=====");
        zwierzętaList.stream().sorted(Comparator.comparingDouble(Zwierzę::cena)).forEach(System.out::println);

        List<Zwierzę> listaPoCenie = zwierzętaList.stream().sorted(Comparator.comparingDouble(Zwierzę::cena)).collect(Collectors.toList());

        //Zadanie 4
        System.out.println("?????????");
        zwierzętaList.stream().sorted(Comparator.comparingDouble(Organizm::wiek)).filter(x -> x.wiek() > 5).forEach(System.out::println);

        //Zadanie 5

        Set<Zwierzę> treeSet = new TreeSet<>();
        treeSet.add(słoń1);
        treeSet.add(słoń2);
        treeSet.add(słoń3);
        treeSet.add(słoń4);
        treeSet.add(wąż1);
        treeSet.add(wąż2);
        treeSet.add(wąż3);

        //  System.out.println(treeSet);

        Set<Zwierzę> hashSet = new HashSet<>();
        hashSet.add(słoń1);
        hashSet.add(słoń2);
        hashSet.add(słoń3);
        hashSet.add(słoń4);
        hashSet.add(wąż1);
        hashSet.add(wąż2);
        hashSet.add(wąż3);

        //   System.out.println(hashSet);
    }
}
