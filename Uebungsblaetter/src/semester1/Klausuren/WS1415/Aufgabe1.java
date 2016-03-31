package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Aufgabe1 {
    public static void main(String[] args){
        String wort = "otzto";

        char[] feld = wort.toCharArray();

        System.out.println(palindromTest(feld));
    }

    public static boolean palindromTest(char[] feld){
        System.out.println("Länge: " + feld.length);
        if(feld.length == 1){
            return true;
        } else {
            int c = feld.length - 1;
            for(int x = 0; x < feld.length; x++){
                if(feld[x] != feld[c]){
                    return false;
                }
                c--;
            }
            return true;
        }
    }
}
