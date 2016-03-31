package semester1.Blatt7; /**
 * Created by fabia on 28.11.2015.
 */
import java.util.Scanner;

public class MittelMaxMinAbweichung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Anzahl der Zahlen festlegen
        System.out.print("Anzahl der Werte angeben: ");
        int num = input.nextInt();

        if(num > 0){
            // Array initialisieren
            double[] numbers = new double[num];
            for(int i = 1; i <= num; i++){
                System.out.print(i + ". Wert: ");
                numbers[i - 1] = input.nextDouble();
            }
            input.close();

            double min = numbers[0];
            double max = numbers[0];
            double mittel = 0;
            for(double value: numbers){// Foreach-Schleife durchläuft jeden Array-Eintrag
                if(value < min) min = value;
                if(value > max) max = value;
                mittel = mittel + value;
            }
            mittel = mittel / numbers.length;

            String ergebnis = "";
            ergebnis += "\nKleinster Wert: " + min;
            ergebnis += "\nGrößter Wert: " + max;
            ergebnis += "\nArithmetischer Mittelwert: " + mittel;

            // Standardabweichung berechnen
            double abweichung = 0;
            for(double value: numbers){
                abweichung = abweichung + ((value - mittel) * (value - mittel));
            }
            abweichung = abweichung / numbers.length;
            abweichung = Math.sqrt(abweichung);
            ergebnis += "\nStandardabweichung: " + abweichung;

            System.out.println(ergebnis);
        } else {
            input.close();
            System.out.println("Die Eingabe war nicht gültig.\nDu kannst nicht weniger als eine Zahl eingeben.\nProgramm beendet.");
        }
    }
}
