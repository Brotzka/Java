package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe6 {
    public static void main(String[] args){
        double n = 0.7;
        double d = 0.3;

        int q = (int) (n / d);
        double r = n - (d * q);

        System.out.println(r);
    }
}
