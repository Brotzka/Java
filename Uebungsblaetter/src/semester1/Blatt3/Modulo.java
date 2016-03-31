package semester1.Blatt3; /**
 * Created by fabian on 27.10.15.
 */
import java.util.*;

public class Modulo {

    public static void main(String[] args) {

        // Scanner für die Benutzereingabe starten
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");

        // Eingabe vom Nutzer
        int x = scanner.nextInt();

        // Scanner schließen
        scanner.close();

        // Teiler festlegen
        int teiler = 7;

        // Modulo berechnen
        int erg = x % teiler;

        // Prüfen ob Modulo einen Rest hat und die Ausgabe dementsprechend gestalten
        if(erg != 0){
            System.out.println("Deine Eingabe ist nicht ohne Rest durch " + teiler + " teilbar. Es bleibt ein Rest von " + erg);
        } else {
            System.out.println("Deine Eingabe ist ohne Rest durch " + teiler + " teilbar.");
        }

        // Ergebnis der Division ausgeben
        System.out.println(x / teiler);

        // Vorezeichentabelle
    }
}
