package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Passagierwaggon extends Waggon {
    protected int Plaetze;

    public Passagierwaggon(){}

    public void setPlaetze(int plaetze){
        this.Plaetze = plaetze;
    }

    public int getPlaetze(){
        return this.Plaetze;
    }

    public String toString(){
        return getClass() + ": " + this.Bezeichnung + ", Sitzplätze: " + this.Plaetze;
    }
}
