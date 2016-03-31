package semester1.Blatt2;

/**
 * Created by fabian on 21.10.15.
 */
public class Kreisberechnung
{
    public static void main(String[] args)
    {
        /**
         * Hier Radius und Einheit angeben
         */
        int r = 5;
        String einheit = "cm";

        // Pi in Variable speichern
        double pi = Math.PI;

        // Kreisfläche
        double flaeche = pi * Math.pow(r,2);
        System.out.println("Die Kreisfläche beträgt: " + flaeche + einheit + "²");

        // Kreisumfang
        double umfang = 2 * pi * r;
        System.out.println("Der Kreisumfang beträgt: " + umfang + einheit);

        // Volumen
        double volumen = ((double)4 / (double)3) * pi * Math.pow(r,3);
        System.out.println("Das Kugelvolumen beträgt: " + volumen + einheit + "³");
    }
}
