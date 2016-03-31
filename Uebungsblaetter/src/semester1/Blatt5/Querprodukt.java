package semester1.Blatt5; /**
 * Created by fabia on 09.11.2015.
 */
import java.util.Scanner;

public class Querprodukt {
    public static void main(String[] args){

        /**
         * Eingabe wiederholen lassen, wenn Eingabe nicht im gültigen Bereich ist         *
         */
        int x = 1;
        int rest = 1;
        int summe = 1;
        int eingabe;

        Scanner input = new Scanner(System.in);

        do {
            if(x < 0 || x > 1000000){
                System.out.println("FEHLER - Zahl ist ungültig.");
            }

            System.out.print("Bitte eine Zahl von 0 bis 1.000.000 eingeben: ");
            x = input.nextInt();
            eingabe = x;

        }while(x < 0 || x > 1000000);

        input.close();

        if(x == 0) {
            System.out.println("Das Querprodukt der Zahl " + eingabe + " betraegt 0");
        } else {
            while(rest != 0 && x != 0){
                rest = x % 10;
                x = x / 10;
                summe = summe * rest;
            }
            System.out.println("Das Querprodukt der Zahl " + eingabe + " beträgt: " + summe);
        }
    }
}
