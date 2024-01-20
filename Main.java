import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//   vvv FIRST HOMEWORK vvv
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
//   ^^^ FIRST HOMEWORK ^^^

//   vvv SECOND HOMEWORK vvv
        String firstName = "Tomáš";
        String lastName = "Novák";
        LocalDate dateOfBirth = LocalDate.of(2000, 1, 1);
        BigDecimal numberOfContracts = BigDecimal.valueOf(26); // Total number of contracts for this person.
        BigDecimal carrotSoldTons = BigDecimal.valueOf(12.4578); // Total amount of carrots sold (in tons).
        String cityOfResidence = "Brno";
        String vehicleRegistrationPlate = "1B67854";
        BigDecimal gasConsumption = BigDecimal.valueOf(9.78); // Average car gas consumption per 100 km.
        String ipAddress = "178.12.147.2";
        // Average amount of tons of carrot sold per 1 contract. Rounded to 4 decimal places.
        BigDecimal average = carrotSoldTons.divide(numberOfContracts, 4, RoundingMode.HALF_UP);

        System.out.println();
        System.out.println(firstName + " " + lastName + " sold in average " + average + " tons of carrot per 1 contract.");
//   ^^^ SECOND HOMEWORK ^^^
    }

    public static void ukol1() {
        System.out.println("Hello world!");
    }

    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf(0); // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
            // operátor "+=" znamená: přičti ke stávající
            // hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon motoru je: " + vykonMotoru + " kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }
}
