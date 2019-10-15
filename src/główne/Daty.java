package główne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Daty {
    /*
Zadanie 1. Pobierz aktualna datę oraz pobierz aktualną datę oraz godziną
Zadanie 2. Dodaj 12 dni do aktualnej daty oraz odejmij 5 dni od aktualnej daty
Zadanie 3. Sprawdź czy data plus 12 dni jest poźniej niż data 5 dni mniejsza
Zadanie 4. Pobierz i wyświetl aktualny dzień tygodnia oraz który to jest dzień w roku.
Zadanie 5. Użyj formatu na dacie Long, Medium, Short, Full oraz "dd-MMM-yy";
Zadanie 6. Czy ten rok to rok przestępny
Zadanie 7. Pobierz datę swoich urodzin sprawdź czy jest to rok przestępny,
     który to dzień tygodnia oraz któy to dzień w roku
*/
    public static void main(String[] args) {
        // Zadanie 1
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Zadanie 2
        LocalDate datePlusDays = localDate.plusDays(12);
        LocalDate dateMinusDays = localDate.minusDays(5);

        System.out.println(datePlusDays + "//" + dateMinusDays);

        //Zadanie 3


        LocalDate today = LocalDate.now();

        System.out.println("Rok przestępny " + today.isLeapYear());

        String formattedLong = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Long to: " + formattedLong);

        //Zadanie 6
        System.out.println(datePlusDays.isAfter(dateMinusDays));

        //Zadanie 7

        LocalDate urodziny = LocalDate.parse("1995-09-21");
        System.out.println(urodziny.isLeapYear());

        //Zadanie 8 Ile minęło sekund do teraz

        LocalTime localTime = LocalTime.now();

        System.out.println("Minęło już:" + localTime.toSecondOfDay() + " sekund");

        //Zadanie 9 ile dni żyjesz?

        System.out.println("Żyję: " + ChronoUnit.DAYS.between(urodziny, today));

        //Zadanie 10. Ile sekund minęło od dnia Twoich narodzin

        LocalDateTime urodzinyLDT = LocalDateTime.parse("1995-09-21 13:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("Minęło: " + ChronoUnit.SECONDS.between(urodzinyLDT, LocalDateTime.now()));
    }

}
