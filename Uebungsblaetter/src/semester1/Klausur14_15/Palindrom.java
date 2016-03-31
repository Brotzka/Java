package semester1.Klausur14_15;

/**
 * Created by fabia on 15.12.2015.
 */
import java.util.Scanner;

public class Palindrom{
    public static boolean palindromTest(char[] feld){
        boolean isPalindrom = false;

        if(feld.length % 2 != 0){
            return false;
        } else {
            // -1 weil feld.length z.B. 8 ergibt, aber das letzte Feld den Index 7 hat
            int halbFeld = (feld.length / 2) - 1;

            // Nur bis zur Hälfte loopen, da die Zweite Hälfte bereits durch die if-Abfrage geprüft wird
            for(int i = 0; i < halbFeld; i++){
                // feld.length - 1, da letzter Feld-Index eins geringer ist als feld.length
                // - i, um den jeweiligen "Spiegelbuchstaben" aus der zweiten Hälfte des Arrays zu erhalten
                if(Character.toLowerCase(feld[i]) != Character.toLowerCase(feld[(feld.length - 1) - i])){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zu überprüfendes Wort eingeben: ");
        String word = input.nextLine();

        char[] wordArray = word.toCharArray();

        if(palindromTest(wordArray)){
            System.out.println("Das übergebene Wort ist ein Palindrom");
        } else {
            System.out.println("Das übegebene Wort ist KEIN Palindrom");
        }
    }
}
