package interfejsy;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

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

     //   Collections.sort(zwierzętaList, Comparator.comparingDouble(Zwierzę::wiek));

    //    Collections.sort(zwierzętaList, (t1, t2) -> t1.nazwa().compareTo(t2.nazwa()));

/*        Collections.sort(zwierzętaList, new Comparator<Zwierzę>() {

            @Override
            public int compare(Zwierzę t1, Zwierzę t2) {
                return t1.nazwa().compareTo(t2.nazwa());
            }
        });*/


/*        Collections.sort(zwierzętaList, new Comparator<Zwierzę>() {

            public int compare(Zwierzę t1, Zwierzę t2) {
                return t1.nazwa().compareTo(t2.nazwa());
            }
        });*/

        System.out.println(zwierzętaList);

    }
}
