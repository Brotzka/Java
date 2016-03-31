package semester1.Tutorium;

/**
 * Created by fabia on 15.12.2015.
 */
public class Schachbrett {
    public static char[][] initilisiereSchachbrett(){
        char[][] brett = new char[8][8];

        for(int i = 0; i < brett.length; i++){
            for(int x = 0; x < brett.length; x++){
                if(i == 1 || i == 6){
                    brett[i][x] = 'B';
                } else {
                    brett[i][x] = 'L';
                }
            }
        }
        return brett;
    }

    public static void main(String[] args){
        char[][] schachbrett = initilisiereSchachbrett();

        for(int i = 0; i < schachbrett.length; i++){
            for(int x = 0; x < schachbrett.length; x++){
                System.out.print(schachbrett[i][x] + " ");
            }
            System.out.print("\n");
        }
    }
}
