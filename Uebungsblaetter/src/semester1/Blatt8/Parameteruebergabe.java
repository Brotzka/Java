package semester1.Blatt8;

/**
 * Created by fabia on 03.12.2015.
 */
public class Parameteruebergabe {
    public static void main(String[] args){
        if(args.length < 2 || args.length > 2){
            System.out.println("Es dürfen nur 2 Parameter übergeben werden!");
        } else {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            System.out.println("Ergebnis: " + x * y);
        }
    }
}
