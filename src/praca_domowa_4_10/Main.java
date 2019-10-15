package praca_domowa_4_10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Kot kot = new Kot();
        Pies pies = new Pies();

        List<Głos> zwierzęta = new ArrayList<>();

        zwierzęta.add(kot);
        zwierzęta.add(pies);

        System.out.println(zwierzęta);
    }


}
