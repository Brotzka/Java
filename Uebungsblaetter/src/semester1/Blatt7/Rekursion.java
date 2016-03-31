package semester1.Blatt7;
/**
 * Created by fabia on 28.11.2015.
 */
import java.util.Scanner;

public class Rekursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Basis abfragen
        System.out.print("Basis eingeben: ");
        int b = input.nextInt();

        // Exponent erfragen
        System.out.print("Exponent eingeben: ");
        int x = input.nextInt();

        input.close();

        // Methode aufrufen und Ergebnis ausgeben
        System.out.println("Das Ergebnis beträgt: " + potenz(b, x));
    }

    public static double potenz(int basis, int exponent){
        if(exponent == 0) return 1;

        // Negative Potenz berechnen
        if(exponent < 0){
            exponent = exponent * (-1);
            return 1 / (basis * potenz(basis, exponent - 1));
        }

        return basis * potenz(basis, exponent - 1);
    }
}
