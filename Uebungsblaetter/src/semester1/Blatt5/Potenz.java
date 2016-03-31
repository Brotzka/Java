package semester1.Blatt5; /**
 * Created by fabia on 09.11.2015.
 */
import java.util.Scanner;

public class Potenz {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Basis eingeben: ");
        double a = input.nextDouble();

        System.out.print("Exponent eingeben: ");
        int b = input.nextInt();

        input.close();

        int zaehler;
        double zwischenergebnis = 1;
        double ergebnis = 1;

        if(b == 0){
            // Potenz 0
            System.out.println("Ergebnis = 1");
        } else if(b < 0){
            // Potenz kleiner 0
            for(zaehler = 0; zaehler != b; zaehler--){
                zwischenergebnis = zwischenergebnis * a;
            }
            ergebnis = 1 / zwischenergebnis;
            System.out.println("Ergebnis = " + ergebnis);
        } else {
            // Potenz größer 0
            for(zaehler = 0; zaehler != b; zaehler++){
                ergebnis = ergebnis * a;
            }
            System.out.println("Ergebnis = " + ergebnis);
        }
    }
}
