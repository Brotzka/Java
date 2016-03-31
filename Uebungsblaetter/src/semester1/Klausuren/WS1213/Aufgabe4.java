package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class Aufgabe4 {
    public static void main(String[] args){
        char[][] test = initialisiereSchachbrett();

        for(char[] first: test){
            for(char second: first){
                System.out.print(second + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println(13%5);
        System.out.println(10/4);

        int k = 0;
        for(int i = 3; i >= 0; i--){
            k = k + i;
        }
        System.out.println(k);

        System.out.println("Summe: " + 20 + 13 + " Jahre");
    }

    public static char[][] initialisiereSchachbrett(){
        char[][] Schachbrett = new char[8][8];

        for(int x = 0; x < 8; x++){
            for(int z = 0; z < 8; z++){
                if(x == 1 || x == 6){
                    Schachbrett[x][z] = 'B';
                } else {
                    Schachbrett[x][z] = 'L';
                }
            }
        }

        return Schachbrett;
    }
}
