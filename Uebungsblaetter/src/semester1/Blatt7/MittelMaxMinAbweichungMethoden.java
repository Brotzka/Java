package semester1.Blatt7;

/**
 * Created by fabia on 02.12.2015.
 */
import java.util.Scanner;

public class MittelMaxMinAbweichungMethoden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Anzahl der Zahlen festlegen
        System.out.print("Anzahl der Werte angeben: ");
        int num = input.nextInt();

        // Prüfen, ob mehr als 0 Werte eingegeben werden sollen
        if(num > 0){
            // Array initialisieren
            double[] numbers = new double[num];
            for(int i = 1; i <= num; i++){
                System.out.print(i + ". Wert: ");
                numbers[i - 1] = input.nextDouble();
            }
            input.close();

            System.out.println("Kleinster Wert: " + min(numbers));
            System.out.println("Größter Wert: " + max(numbers));
            System.out.println("Arithmetischer Mittelwert: " + mittel(numbers));
            System.out.println("Standardabweichung: " + abweichnung(numbers));
        } else {
            input.close();
            System.out.println("Die Eingabe war nicht gültig.\nDu kannst nicht weniger als eine Zahl eingeben.\nProgramm beendet.");
        }
    }

    public static double min(double[] numbers){
        double min = numbers[0];
        for(double value: numbers){
            if(value < min) min = value;
        }
        return min;
    }

    public static double max(double[] numbers){
        double max = numbers[0];
        for(double value: numbers){
            if(value > max) max = value;
        }
        return max;
    }

    public static double mittel(double[] numbers){
        double mittel = 0;
        for(double value: numbers){
            mittel = mittel + value;
        }
        mittel = mittel / numbers.length;
        return mittel;
    }

    public static double abweichnung(double[] numbers){
        double abweichung = 0;
        for(double value: numbers){
            abweichung = abweichung + (Math.pow(value - mittel(numbers),2));
        }
        abweichung = abweichung / numbers.length;
        abweichung = Math.sqrt(abweichung);
        return abweichung;
    }
}