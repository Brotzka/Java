package semester1.Blatt6; /**
 * Created by fabia on 19.11.2015.
 */
import java.util.Scanner;

public class RundenB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Zu rundende Zahl eingeben: ");
        double zahl = input.nextDouble();

        System.out.print("Anzahl der Nachkommastellen eingeben: ");
        int kommastellen = input.nextInt();

        input.close();

        System.out.println("Ergebnis: " + round(zahl, kommastellen));
    }

    /**
     * Rundet eine Zahl auf eine gegebene Anzahl an Nachkommastellen.
     *
     * @param zahl, Fließkommazagl, die gerundet werden soll
     * @param kommastellen, Anzahl der Nachkommastellen, auf die gerundet werden soll
     * @return
     */
    public static double round(double zahl, int kommastellen){
        // Zahl der Nachkommastellen ermitteln
        int x = -1;
        int rest = 1;
        double z = zahl;
        for( ; rest != 0; x++){
            z = z * 10;
            rest = (int)(z % 10);
        }

        // Höchste 10er-Potenz ermitteln, um mit der letzten Nachkommastelle anfangen zu können
        int potenz = 1;
        for(; x != 0 ; x--){
            potenz = potenz * 10;
        }

        // Vergleichs 10er-Potenz ermitteln, um die Rundung bei der gewünschten Kommastelle zu beenden
        int ziel = 1;
        for(; kommastellen != 0; kommastellen--){
            ziel = ziel * 10;
        }

        // Überprüfen, ob die übergebene Zahl mehr Nachkommastellen hat als gewünscht sind.
        // Falls nein, Zahl zurückgeben
        if(ziel > potenz){
            return zahl;
        }

        // Gegebene Zahl mit der höchsten Potenz multiplizieren und diesen Wert an Schleife übergeben und nach int casten
        int wert = (int)(zahl * potenz);
        int m;
        while(ziel != potenz){

            // Modulo-Ergebnis prüfen -> auf- oder abrunden
            m = wert % 10;
            wert = wert / 10;
            if(m >= 5){
                wert = wert + 1;
            }

            // Potenz verringern um der Zahl der gewünschten Nachkommastellen näher zu kommen
            potenz = potenz / 10;
        }

        // int-Zahl in double-Zahl mit den gewünschten Nachkommastellen zurückrechnen und an aufrufende Stelle zurückgeben
        return (double)wert / ziel;
    }

    /**
     * Ermittelt die Anzahl an Nachkommastellen und gibt diese Anzahl dann als int-Wert zurück
     *
     * @param zahl, Fließkommazahl, deren Anzahl an Nachkommastellen ermittelt werden soll
     * @return
     */
    public static int getKommastellen(double zahl){
        int kommastellen = -1;
        int rest = 1;
        for( ; rest != 0; kommastellen++){
            zahl = zahl * 10;
            rest = (int)(zahl % 10);
        }
        return kommastellen;
    }
}
