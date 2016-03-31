package semester1.Blatt10;

/**
 * Created by Fabian on 06.01.2016.
 */
public class Auto {
    private String marke, farbe, model;
    private int hubraum, baujahr;

    private static int producedCars;

    public Auto(String marke, String model, String farbe, int hubraum, int baujahr){
        this.marke = marke;
        this.farbe = farbe;
        this.model = model;
        this.baujahr = baujahr;

        producedCars += 1;

        // Hubraum Abfrage weggelassen
    }

    /**
     * Hinweis:
     * Getter und Setter wurden zu Gunsten der Übersichtlichkeit weggelassen
     */

    public static int berechneUmsatz(int durchschnittspreis){
        return producedCars * durchschnittspreis;
    }


    public static void main(String[] args){
        Auto audi = new Auto("Audi", "Q50", "schwarz", 5489, 2014);
        Auto vw = new Auto("VW", "Polo", "blau", 1999, 2010);

        System.out.println(Auto.berechneUmsatz(23599));
    }
}
