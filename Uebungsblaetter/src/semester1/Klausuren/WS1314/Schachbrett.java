package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Schachbrett {
    static boolean[][] brett = new boolean[8][8];

    public static void main(String[] args){
        setzeTurm(2,4);
        gibBedrohteFelderAus();
    }

    public static void setzeTurm(int x, int y){
        for(int a = 0; a < 8; a++){
            for(int b = 0; b < 8; b++){
                if(a == x || b == y){
                    brett[a][b] = true;
                } else {
                    brett[a][b] = false;
                }
            }
        }
    }

    public static void gibBedrohteFelderAus(){
        for(boolean[] outer: brett){
            for(boolean inner: outer){
                if(inner){
                    System.out.print("x ");
                } else {
                    System.out.print("o ");
                }
            }
            System.out.print("\n");
        }
    }
}
