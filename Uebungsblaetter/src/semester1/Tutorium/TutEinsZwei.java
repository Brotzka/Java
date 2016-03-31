package semester1.Tutorium;
/**
 * Created by fabia on 24.11.2015.
 */
import java.util.Scanner;

public class TutEinsZwei {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die Zahl ein, deren Fakultät berechnet werden soll: ");
        int x = input.nextInt();

        input.close();

        System.out.println("Methode 1: " + fakIteartiv(x));
        System.out.println("Methode 2: " + fakIterativ2(x));
    }

    public static int fakIteartiv(int zahl){
        int x = 1;
        for(; zahl > 0; zahl--){
            x = x * zahl;
        }

        return x;
    }

    public static int fakIterativ2(int zahl){
        if (zahl == 0) return 1;
        return zahl * fakIterativ2(zahl - 1);
    }
}
