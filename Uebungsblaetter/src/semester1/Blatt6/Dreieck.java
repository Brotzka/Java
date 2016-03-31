package semester1.Blatt6; /**
 * Created by fabia on 24.11.2015.
 */
import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Gib an, wie viele Ebenen das Sternen-Dreieck haben soll: ");
        int x = input.nextInt();

        input.close();
        System.out.println(getDreieck(x));
    }

    public static String getDreieck(int reihen){
        String dreieck = "";

        for(int c = 1; c <= reihen; c++){
            for(int a = reihen - c; a > 0; a--){
                dreieck += " ";
            }
            for(int x = 1; x <= c; x++){

                dreieck += "* ";
            }

            dreieck += "\n";
        }
        return dreieck;
    }
}
