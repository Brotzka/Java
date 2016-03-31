package semester1.Blatt2; /**
 * Created by fabian on 21.10.15.
 */
import java.util.Date;

public class Tagberechnung
{
    public static void main(String[] args)
    {
        Date d = new Date();

        int h = d.getHours();
        int m = d.getMinutes();
        int s = d.getSeconds();

        //int h = 14;
        //int m = 55;
        //int s = 14;

        int sekProTag = 60 * 60 * 24;

        // Aktuelle Uhrzeit
        System.out.println("Es ist jetzt " + h + ":" + m + ":" + s + " Uhr");

        // Sekunden seit Mitternacht
        int sekVergangen = s + (m * 60) + (h * 60 * 60);
        System.out.println("Es sind " + sekVergangen + " Sekunden seit Mitternacht vergangen.");

        // Sekunden bis Mitternacht
        int sekVerbleibend = sekProTag - sekVergangen;
        System.out.println("Es sind noch " + sekVerbleibend + " Sekunden bis Mitternacht");

        // Prozentwert des vergangenen Tages
        double prozent = (double)sekVergangen / ((double)sekProTag / 100);
        System.out.println("Bisher sind " + prozent + " % des Tages vergangen.");
    }
}
