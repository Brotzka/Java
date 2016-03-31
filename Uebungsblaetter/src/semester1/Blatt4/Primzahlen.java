package semester1.Blatt4; /**
 * Created by fabian on 06.11.15.
 */
import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein: ");
        int x = input.nextInt();

        input.close();

        boolean isPrim = true;

        if(x > 1) {
            for (int y = 2; y < x; y++) {
                int erg = x % y;

                if (erg == 0) {
                    isPrim = false;
                    // Break, da der Schleifendurchlauf hier abgebrochen werden kann
                    break;
                }
            }

            if (isPrim) {
                System.out.println(x + " ist eine Primzahl");
            } else {
                System.out.println(x + " ist keine Primzahl");
            }
        } else {
            System.out.println(x + " ist keine Primzahl");
        }
    }
}
