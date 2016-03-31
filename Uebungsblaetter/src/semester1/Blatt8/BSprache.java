package semester1.Blatt8;

/**
 * Created by fabia on 07.12.2015.
 */
import java.util.Scanner;

public class BSprache {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte gib einen Satz ein: ");
        String satz = input.nextLine();

        System.out.print(spielen(satz));
    }

    public static String spielen(String satz){

        char[] buchstaben = satz.toCharArray();
        int charCounter = buchstaben.length;

        // Ausgangsarray durchlaufen und die benötigte Länge des neuen Arrays ermitteln
        for(int i = 0; i < buchstaben.length; i++){
            switch(buchstaben[i]){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    charCounter += 2;
                    break;
            }
        }

        char[] neuSatz = new char[charCounter];

        int position = 0;

        // Gegebenes Array erneut durchlaufen und diesmal die Buchstaben in das neue Array schreiben
        for(int c = 0; c < buchstaben.length; c++){
            switch(buchstaben[c]){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    neuSatz[position] = buchstaben[c];
                    neuSatz[position + 1] = 'b';
                    neuSatz[position + 2] = buchstaben[c];
                    position += 3;
                    break;
                default:
                    neuSatz[position] = buchstaben[c];
                    position += 1;
                    break;
            }
        }
        return String.valueOf(neuSatz);
    }
}
