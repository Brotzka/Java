package semester1.Blatt7;
/**
 * Created by fabia on 28.11.2015.
 */
import java.util.Scanner;

public class Sinus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        double x = input.nextDouble();
        input.close();

        System.out.println("Der Sinus von " + x + " ist: " + sinus(x));
        System.out.println("\nKontrolle: " + Math.sin(x));
    }

    public static double sinus(double x){
        double zaehler = 1;
        double nenner = 1;
        double summe = x;
        double summand = 1;
        int c = 1;
        for(int k = 3; summand > 1E-15 || summand < -1E-15; k = k + 2){
            zaehler = Math.pow(x, k);
            nenner = nenner * k * (k - 1);
            summand = Math.pow(-1,c++) * zaehler / nenner;
            summe = summe + summand;
        }
        return summe;
    }
}
