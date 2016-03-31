package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe1 {
    public static void main(String[] args){
        double x = 9;
        double y = 9;

        System.out.println(istDifferenz(x,y));
    }

    public static double istDifferenz(double x, double y){
        double ergebnis;

        if(x >= y){
            ergebnis = x - y;
        } else {
            ergebnis = y - x;
        }
        return ergebnis;
    }
}
