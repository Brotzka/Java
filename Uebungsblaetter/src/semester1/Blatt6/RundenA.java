package semester1.Blatt6; /**
 * Created by fabia on 19.11.2015.
 */
import java.util.Scanner;

public class RundenA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte eine zu rundende Zahl eingeben: ");
        float x = input.nextFloat();

        input.close();

        System.out.println(round(x));
    }

    public static int round(float a){
        float b = a * 10;
        b = b%10;
        if(b >= 5){
            return (int)a + 1;
        }
        return (int)a;
    }
}
