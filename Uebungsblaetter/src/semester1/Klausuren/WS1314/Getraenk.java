package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Getraenk {
    protected String name;
    protected double menge;
    protected double preis;

    public final double DEFAULTWERT = -1.0;

    public Getraenk(){}

    public Getraenk(String name, double menge, double preis){
        this.name = name;

        if(menge > 0 && menge <= 1){
            this.menge = menge;
        } else {
            this.menge = DEFAULTWERT;
        }

        if(preis >= 1.0 && preis <= 8.0){
            this.preis = preis;
        } else {
            this.preis = DEFAULTWERT;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMenge(double menge){
        if(menge > 0 && menge <= 1){
            this.menge = menge;
        }
    }

    public double getMenge(){
        return this.menge;
    }

    public void setPreis(double preis){
        if(preis >= 1.0 && preis <= 8.0){
            this.preis = preis;
        }
    }

    public double getPreis(){
        return this.preis;
    }

    public String toString(){
        return this.name + ", Menge: " + this.menge + ", Preis: " + this.preis + " Euro";
    }
}
