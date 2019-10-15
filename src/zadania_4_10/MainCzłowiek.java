package zadania_4_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCzłowiek {

    public static void main(String[] args) {
        Człowiek człowiek1 = new Człowiek("Henry Twardy", 34, "Warszawa", "M");
        Człowiek człowiek2 = new Człowiek("Zosia Nowak", 19, "Warszawa", "K");
        Człowiek człowiek3 = new Człowiek("Tadeusz Długi", 24, "Gdańsk", "M");
        Człowiek człowiek4 = new Człowiek("Filip Nowak", 38, "Zielona Góra", "M");
        Człowiek człowiek5 = new Człowiek("Ryszard Twardy", 55, "Poznań", "M");

        List<Człowiek> człowiekList = new ArrayList<>();
        człowiekList.add(człowiek1);
        człowiekList.add(człowiek2);
        człowiekList.add(człowiek3);
        człowiekList.add(człowiek4);
        człowiekList.add(człowiek5);

        Map<String, List<Człowiek>> grupowaniePoMieście = człowiekList.stream().collect(Collectors.groupingBy(g -> g.getMiasto()));
     //   System.out.println("Osoby mieszkające w Warszawie");
    //    System.out.println(grupowaniePoMieście.get("Warszawa"));

        long liczbaLudziStarszychniż30 = człowiekList.stream().filter(f -> f.getWiek() > 30).count();

     //   System.out.println("Ile jest ludzi starszych niż 30 lat: " + liczbaLudziStarszychniż30);

        long liczbaLudziMłodszychNiż30 = człowiekList.stream().filter(f -> f.getWiek() < 30).count();

     //   System.out.println("Ile jest ludzi młodszych niż 30 lat: " + liczbaLudziMłodszychNiż30);

        boolean konczyNaK = człowiekList.stream().anyMatch(a -> a.getName().endsWith("k"));

        System.out.println(konczyNaK);

        człowiekList.stream().filter(f -> f.getName().endsWith("k")).forEach(System.out::println);

        Map<String, List<Człowiek>> grupowaniePoPłci = człowiekList.stream().collect(Collectors.groupingBy(g -> g.getPłeć()));

        System.out.println("Kobiety: ");
        System.out.println(grupowaniePoPłci.get("K"));


    }
}
