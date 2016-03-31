package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Lok extends Waggon {
    protected int Leistung;

    public Lok(int leistung){
        this.Leistung = leistung;
    }

    public void setLeistung(int leistung){
        this.Leistung = leistung;
    }

    public int getLeistung(){
        return this.Leistung;
    }

    public String toString(){
        return getClass() + ": " + this.Bezeichnung + ", " + this.Leistung;
    }
}
