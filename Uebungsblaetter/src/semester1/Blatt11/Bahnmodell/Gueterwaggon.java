package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Gueterwaggon extends Waggon {
    protected String Transportgut;
    protected int Gewicht;


    public Gueterwaggon(){
    }

    public void setTransportgut(String transportgut){
        this.Transportgut = transportgut;
    }

    public String getTransportgut(){
        return this.Transportgut;
    }

    public void setGewicht(int gewicht){
        this.Gewicht = gewicht;
    }

    public int getGewicht(){
        return this.Gewicht;
    }

    public String toString(){
        return getClass() + ": " + this.Bezeichnung + ", Transportgut: " + this.Transportgut + ", Gewicht: " + this.Gewicht;
    }
}
