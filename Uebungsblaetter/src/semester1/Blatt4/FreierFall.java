package semester1.Blatt4; /**
 * Created by Fabian on 05.11.2015.
 */
import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Gib die Fall-Zeit in Sekunden ein: ");
        int t = input.nextInt();

        input.close();

        double g = 9.80665;

        System.out.println("In Sekundenschritten:");
        for(int i = 1; i <= t; i++) {
            double strecke = 0.5 * g * Math.pow(i,2);
            System.out.println("Zeit: " + i + " Sekunde(n): Zurückgelegte Strecke: " + strecke + "m");
        }

        System.out.println("In 5-Sekunden-Schritten:");
        for(int i = 1; i <= t; i = i + 5) {
            double strecke = 0.5 * g * Math.pow(i,2);
            System.out.println("Zeit: " + i + " Sekunde(n): Zurückgelegte Strecke: " + strecke + "m");
        }
    }
}
