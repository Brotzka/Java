package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe1 {
    public static void main(String[] args){
        System.out.println(istZweistellig(-3436));
    }

    public static boolean istZweistellig(int zahl){
        if((zahl / 100 == 0) && (zahl / 10 != 0)){
            return true;
        }
        return false;
    }
}
