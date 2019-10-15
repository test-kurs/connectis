package praca_domowa_4_10;

import java.util.*;
import java.util.stream.Collectors;

public class MainPracownicy {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Wojtek Nowak", "Bezrobotny");
        Pracownik pracownik2 = new Pracownik("Wojtek Arek", "Bezrobotny");
        Pracownik pracownik3 = new Pracownik("Filipek Nowak", "Prosto");
        Pracownik pracownik4 = new Pracownik("Tomek Nowak", "Nike");
        Pracownik pracownik5 = new Pracownik("Radek Nowak", "Empik");

        List<Pracownik> pracownicyLista = new ArrayList<>();

        pracownicyLista.add(pracownik1);
        pracownicyLista.add(pracownik2);
        pracownicyLista.add(pracownik3);
        pracownicyLista.add(pracownik4);
        pracownicyLista.add(pracownik5);

        System.out.println("Po firmie:");

        pracownicyLista.stream().sorted(Comparator.comparing(Pracownik::getFirma)).forEach(System.out::println);

        Map<Integer, Pracownik> pracownicyMapa = new HashMap<>();

        pracownicyMapa.put(1, pracownik1);
        pracownicyMapa.put(2, pracownik2);
        pracownicyMapa.put(3, pracownik3);
        pracownicyMapa.put(4, pracownik4);
        pracownicyMapa.put(5 ,pracownik5);

        List<Pracownik> pracownikList2 = pracownicyMapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Pracownik::getFirma))).map(m -> m.getValue()).collect(Collectors.toList());

        List<Pracownik> pracownikList3 = pracownicyMapa.entrySet().stream().map(m -> m.getValue()).sorted(Comparator.comparing(Pracownik::getFirma)).collect(Collectors.toList());

        List<Pracownik> pracownikList4 = pracownicyMapa.entrySet().stream().map(m -> m.getValue()).sorted((t1, t2) -> {
           if(t1.getFirma().compareTo(t2.getFirma()) == 0) {
               return t1.getName().compareTo(t2.getName());
           }
            return t1.getFirma().compareTo(t2.getFirma());
        }

        ).collect(Collectors.toList());

        List<Pracownik> pracownikList5 = pracownicyMapa.entrySet().stream().map(m -> m.getValue()).sorted(Comparator.comparing(Pracownik::getFirma).thenComparing(Pracownik::getName)).collect(Collectors.toList());

        Map <Integer,Pracownik> pracownicyMapa2 = pracownicyMapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Pracownik::getFirma))).collect(Collectors.toMap(Map.Entry::getKey
                , Map.Entry::getValue, (e1,e2)-> e1, HashMap::new));

        System.out.println(pracownikList2);

   //     System.out.println(pracownikList3);

   //     System.out.println("?????????????");

        System.out.println(pracownikList4);

    //    System.out.println(pracownikList5);

    //    System.out.println("===========");

      //  System.out.println(pracownicyMapa2);

    }
}

class Pracownik {
  private String name;
  private String firma;

    public Pracownik(String name, String firma) {
        this.name = name;
        this.firma = firma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", firma='" + firma + '\'' +
                '}';
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
