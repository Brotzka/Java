package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Aufgabe2 {
    public static void main(String[] args){
        int[] feld = {23, 6, 43, 100, 54, 9, 87};

        int[] sortiert = sortiereAbsteigend(feld);

        for(int one: sortiert){
            System.out.print(one + " | ");
        }
    }

    public static int[] sortiereAbsteigend(int[] feld){

        for(int x = 0; x < feld.length - 1; x++){
            int max = feld[x];

            for(int c = x + 1; c < feld.length; c++){
                if(feld[c] > max){
                    max = feld[c];
                    int temp = feld[x];
                    feld[x] = feld[c];
                    feld[c] = temp;
                }
            }
        }

        return feld;
    }
}
