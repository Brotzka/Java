package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Bistro extends Waggon {
    protected int Sitzplaetze;

    public Bistro(){
    }

    public void setSitzplaetze(int sitzplaetze){
        this.Sitzplaetze = sitzplaetze;
    }

    public int getSitzplaetze(){
        return this.Sitzplaetze;
    }

    public String toString(){
        return getClass() + ": " + this.Bezeichnung + ", Sitzplätze: " + this.Sitzplaetze;
    }
}
