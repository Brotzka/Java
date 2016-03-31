package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe3 {
    public static void main(String[] args){
        int[] a = {3, 3, 9, 4};
        int[] b = {2, 2, 0, 7};

        int[] c = addiere(a,b);

        for(int d: c){
            System.out.print(d + " ");
        }
    }

    public static int[] addiere(int[] a, int[] b){
        int[] ergebnis = new int[a.length];
        int uebertrag = 0;
        for(int x = a.length - 1; x >= 0; x--){
            ergebnis[x] = (a[x] + b[x] + uebertrag) % 10;
            uebertrag = (a[x] + b[x] + uebertrag) / 10;
        }
        return ergebnis;
    }
}
