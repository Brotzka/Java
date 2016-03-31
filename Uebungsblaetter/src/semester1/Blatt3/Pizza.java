package semester1.Blatt3; /**
 * Created by fabian on 27.10.15.
 */
import java.util.Scanner;

public class Pizza {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Daten der ersten Pizza abfragen
        System.out.print("Durchmesser 1. Pizza: ");
        float p1d = input.nextFloat();
        System.out.print("Preis 1. Pizza: ");
        float p1p = input.nextFloat();

        // Daten der zweiten Pizza abfrage
        System.out.print("Durchmesser 2. Pizza: ");
        float p2d = input.nextFloat();
        System.out.print("Preis 2. Pizza: ");
        float p2p = input.nextFloat();

        input.close();

        // Fläche und Preis-Fläche-Verhältnis von Pizza 1 berechnen
        double p1f = Math.PI * Math.pow((p1d/2), 2);
        float p1v = p1p / (float)p1f;
        System.out.println("Pizza 1 kostet " + p1v + " Euro pro cm²");

        // Fläche und Preis-Fläche-Verhältnis von Pizza 2 berechnen
        double p2f = Math.PI * Math.pow((p2d/2), 2);
        float p2v = p2p / (float)p2f;
        System.out.println("Pizza 2 kostet " + p2v + " Euro pro cm²");

        // Vergleich der Verhältnisse mittels if-Abfrage
        if(p1v < p2v){
            System.out.println("Pizza 1 hat das bessere Preisleistungsverhältnis.");
        }
        else if(p1v == p2v){
            System.out.println("Das Leistungsverhältnis ist gleich.");
        } else {
            System.out.println("Pizza 2 hat das bessere Preisleistungsverhältnis.");
        }
    }
}
