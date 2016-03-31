package semester1.Blatt8;

/**
 * Created by fabia on 03.12.2015.
 */

public class Lottoziehung {
    public static void main(String[] args){

        int[] numbers = new int[6];

        for(int i = 0; i < 6; i++){
            // Variable festlegen um Doppelwert zu prüfen
            boolean isDouble = true;

            // While-Schleife läuft solange, bis die neue Zahl NICHT schon vorhanden ist
            while(isDouble){
                // Neue Zahl erzeugen
                int newNumber = (int)(49 * Math.random()) + 1;

                // Durchläuft das erzeugte Array und vergleicht jeden schon vorhandenen Wert mit dem neu erzeugten Wert
                for(int value: numbers){
                    if(value != newNumber){
                        // Wert existiert noch nicht -> auf FALSE setzen
                        isDouble = false;
                    } else {
                        // Wert existiert schon -> for-Schleife abbrechen und while-Schleife neu durchlaufen
                        isDouble = true;
                        break;
                    }
                }
                // Aktuelles Feld mit erzeugtem Wert belegen
                numbers[i] = newNumber;
            }
        }

        for(int c = 0; c < numbers.length; c++){
            for(int v = c + 1; v < numbers.length; v++){
                if(numbers[v] < numbers[c]){
                    int min = numbers[v]; // Speichert aktuellen min-Wert
                    int y = numbers[c]; // Speichert Wert des Arrays aus äußerer for-Schleife zwischen
                    numbers[c] = min; // Wert des Arrays aus äußerer for-Schleife überschreiben
                    numbers[v] = y; // Aktuellen Wert des Arrays aus innerer for-Schleife mit Array-Wert aus äußerer for-Schleife überschreiben überschreiben
                }
            }
        }

        for(int value: numbers){
            System.out.print(value + " ");
        }
    }
}
