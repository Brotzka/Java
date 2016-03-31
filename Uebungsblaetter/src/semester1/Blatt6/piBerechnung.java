package semester1.Blatt6; /**
 * Created by fabia on 19.11.2015.
 */
import java.util.Scanner;

public class piBerechnung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Zahl der zu verwendenden Rechtecke eingeben: ");
        double n = input.nextDouble();

        double zwischenergebnis = 0;

        for(int i = 1; i < n; i++){
            zwischenergebnis = zwischenergebnis + (Math.sqrt(1 - Math.pow((i * (1/n)),2)) * 1/n);
        }
        double ergebnis = 4 * zwischenergebnis;

        System.out.println(ergebnis);
    }
}
