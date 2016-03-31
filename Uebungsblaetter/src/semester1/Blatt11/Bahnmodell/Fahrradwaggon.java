package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Fahrradwaggon extends Waggon {
    protected int Stellplaetze;

    public Fahrradwaggon(){
    }

    public void setStellplaetze(int stellplaetze){
        this.Stellplaetze = stellplaetze;
    }

    public int getStellplaetze(){
        return this.Stellplaetze;
    }

    public String toString(){
        return getClass() + ": " + this.Bezeichnung + ", Stellplätze: " + this.Stellplaetze;
    }
}
