package semester1.Blatt9;

/**
 * Created by fabia on 09.12.2015.
 */
public class Rechner {
    public static void main(String[] args){
        int length = args.length;
        double ergebnis = 0;

        if(args[length - 1].equals("+")) {
            for(int i = 0; i < length - 1; i++){
                ergebnis += Double.parseDouble(args[i]);
            }
        } else if(args[length - 1].equals("-")) {
            for(int i = 0; i < length - 1; i++){
                ergebnis -= Double.parseDouble(args[i]);
            }
        }
        System.out.println("Ergebnis: " + ergebnis);
    }
}
