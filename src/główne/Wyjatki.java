package główne;

import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a: ");
        Integer a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        Integer b = scanner.nextInt();

        Integer c = null;

   //     System.out.println(a/0);

        try {
            System.out.println(a/c);
      //  } catch (Exception ex) {
        } catch (ArithmeticException ex) {
            System.out.println(ex.getLocalizedMessage());
            System.out.println(ex.getMessage());
        } catch( NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Udało się? Napisz w komentrzu");
        }
    }
}
