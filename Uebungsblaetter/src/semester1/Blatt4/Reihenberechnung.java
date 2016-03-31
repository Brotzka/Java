package semester1.Blatt4;

/**
 * Created by Fabian on 05.11.2015.
 */
public class Reihenberechnung {
    public static void main(String[] args){

        int k;
        double aktuelleRechnung, ergebnis, altesErgebnis, zwischenergebnis, differenz;
        zwischenergebnis  = 0;

        for(k = 1; ; k++){
            // aktuellen Wert berechnen
            aktuelleRechnung = 1/(Math.pow(k,2));

            // die jeweiligen Rechnungen für k addieren
            zwischenergebnis = zwischenergebnis + aktuelleRechnung;

            // Endergebnis berechnen
            ergebnis = 6 * zwischenergebnis;

            // Ergebnis des vorherigen Durchlaufs ermitteln
            altesErgebnis = 6 * (zwischenergebnis - aktuelleRechnung);

            // Differenz der Subtraktion von aktuellem Ergebnis und vorherigem Ergebnis ermitteln
            differenz = ergebnis - altesErgebnis;

            // Prüfen, ob Differenz von 0.00001 unterschritten wurde
            if(differenz < (1E-5)){
                System.out.println("Bei Durchlauf " + k + " wurde der gegebene Wert unterschritten. Ergebnis: " + ergebnis);
                System.out.println(differenz);
                break;
            } else {
                System.out.println(k + ". Durchlauf: " + ergebnis);
            }
        }
    }
}
