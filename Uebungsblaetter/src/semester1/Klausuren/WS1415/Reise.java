package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Reise {
    protected String reiseziel;
    protected double preis;
    protected int reisedauer;

    public static double DEFAULTPREIS = 100.00;
    public static int DEFAULTDAUER = 7;

    public Reise(String reiseziel, int reisedauer, double preis){
        this.reiseziel = reiseziel;
        setPreis(preis);
        setReisedauer(reisedauer);
    }

    public String getReiseziel(){
        return this.reiseziel;
    }

    public void setReiseziel(String reiseziel){
        this.reiseziel = reiseziel;
    }

    public double getPreis(){
        return this.preis;
    }

    public void setPreis(double preis){
        if(preis > 0){
            this.preis = preis;
        } else {
            this.preis = DEFAULTPREIS;
        }
    }

    public int getReisedauer(){
        return this.reisedauer;
    }

    public void setReisedauer(int reisedauer){
        if(reisedauer > 0){
            this.reisedauer = reisedauer;
        } else {
            this.reisedauer = DEFAULTDAUER;
        }
    }

    public String toString(){
        return "Reiseziel: " + this.reiseziel + "\nPreis: " + this.preis + "\nDauer: " + this.reisedauer;
    }
}
