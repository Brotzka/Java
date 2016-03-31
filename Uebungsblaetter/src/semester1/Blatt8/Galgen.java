package semester1.Blatt8;

/**
 * Created by fabia on 03.12.2015.
 */

import java.util.Scanner;

public class Galgen {
    public static void main(String[] args){
        String[] words = {
                "Haus",
                "Programmiersprache",
                "Weihnachtsmann",
                "Kindergarten",
                "Schule",
                "Smartphone",
                "FHWS",
                "Döner",
                "Hauptunterschied",
                "Programm",
                "Browser",
                "Galgenmännchen",
                "Autobahn",
                "Schneemann",
                "Nikolaus",
                "Tannenbaum",
                "Entwicklungsumgebung",
                "Planspiel",
                "Planspiel",
                "Schleife"
        };

        // Anzahl der Array-Einträge ermitteln um ein zufälliges Wort auszuwählen
        int x = (int)(Math.random() * words.length + 1);

        // aktuelles Wort auswählen ...
        String word = words[x - 1];

        // ... und in Array schreiben
        char[] wordA = word.toCharArray();

        // Leeres Array zur Ausgabe erstellen
        char[] wordB = new char[wordA.length];
        for(int i = 0; i < wordA.length; i++){
            wordB[i] = '_';
        }

        // Zähler für Fehlversuche
        int missed = 0;

        Scanner input = new Scanner(System.in);
        // do-while um Vorgang zu wiederholen
        do {
            // Fehlversuche anzeigen
            System.out.println("Du hast bisher " + missed + " von max 15 Fehlversuchen.");

            // Leeres Array ausgeben
            for(char value: wordB){
                System.out.print(value + " ");
            }

            System.out.print("\nBitte gib einen Buchstaben ein: ");
            char w = input.next().charAt(0);

            // Array mit Lösungswort durchlaufen und anschließen auf Erfolg prüfen
            boolean success = false;
            for(int i = 0; i < wordA.length; i++){
                // Buchstaben klein machen, um Tolerant zu erhalten
                if(Character.toLowerCase(wordA[i]) == Character.toLowerCase(w)){
                    // Erratene Buchstaben in zu erratendes Array schreiben...
                    wordB[i] = wordA[i];
                    // ...und success auf TRUE setzen
                    success = true;
                }
            }

            // Wenn kein Buchstabe erraten wurde -> Fehlversuche um 1 erhöhen
            if(!success){
                missed += 1;
                // Wurde damit die maximale Fehlerzahl erreicht, Schleife abbrechen und mit Script fortfahren
                if(missed == 15){
                    break;
                }
            }
        } while(!compare(wordA, wordB));

        if(missed == 15){
            System.out.println("\nDu hast leider verloren! Alle Freiversuche wurden aufgebraucht.");
        } else {
            System.out.println("\nGratulation! Du hast das Wort erraten!\nDas Lösungswort lautet: " + word);
            System.out.println("\nDu hattest " + missed + " Fehlversuche.");
        }
    }

    public static boolean compare(char[] arrayA, char[] arrayB){
        if(arrayA.length != arrayB.length){
            return false;
        } else {
            for(int i = 0; i < arrayA.length; i++){
                if(arrayA[i] != arrayB[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
