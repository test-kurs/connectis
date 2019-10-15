package zadania_4_10;

import java.util.Scanner;

public class MainSwitch {

        public static void main(String[] args) {
            // Zadanie 1: Napisz konstrukcję switch case która dla parametru 0,1,2 wypisze "zero", "jeden", "dwa" a standardowo wpisze "koniec"
            //Zadanie 2: Napisz konstrukcje switch case która pobierze z konsoli dwie liczby a potem znak i wykona działanie.
            // Na przykłąd 2 , 3 , + zwróci 5 oraz wypisze liczby jakie zostały podane.
            int x=2;
            switch (x) {
                case 0:
                    System.out.println("zero");
                    System.out.println("koniec");
                    break;
                case 1:
                    System.out.println("jeden");
                    System.out.println("koniec");
                    break;
                case 2:
                    System.out.println("dwa");
                    System.out.println("koniec");
                    break;
                default:
                    System.out.println("koniec");
            }


            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj a");
            double a = scanner.nextDouble();
            System.out.println("Podaj b");
            double b = scanner.nextDouble();
            System.out.println("Podaj znak działania");
            String c = scanner.next();

            switch (c) {
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                default:
                    System.out.println("Podałeś liczby : " + a + " oraz " + b);
            }
        }
    }

