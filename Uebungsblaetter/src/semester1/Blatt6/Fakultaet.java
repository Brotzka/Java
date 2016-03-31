package semester1.Blatt6; /**
 * Created by fabia on 26.11.2015.
 */
import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Zahl eingeben: ");
        int zahl = input.nextInt();

        input.close();

        System.out.println(fakultaet(zahl));
    }

    public static int fakultaet(int zahl){
        int x = 1;
        for(; zahl > 0; zahl--){
            x = x * zahl;
        }
        return x;
    }
}
