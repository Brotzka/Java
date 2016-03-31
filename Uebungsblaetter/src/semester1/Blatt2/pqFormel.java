package semester1.Blatt2;

/**
 * Created by fabian on 21.10.15.
 */
public class pqFormel
{
    public static void main(String[] args)
    {
        // Variable initilisieren
        double p = 5;
        double q = -6;

        double wurzelergebnis = Math.sqrt(Math.pow((p / 2),2) - q);

        // Falls der Wert unter der Wurzel negativ ist, wird dieser Block ausgegeben
        if(Double.isNaN(wurzelergebnis))
        {
            System.out.println("Es existieren keine Werte für x!");
        }
        else // Wert ist nicht negativ => weiterrechnen
        {
            double x1 = -(p / 2) + wurzelergebnis;
            double x2 = -(p / 2) - wurzelergebnis;

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }



    }
}
