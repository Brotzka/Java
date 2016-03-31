package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Personenzug extends Zug{
    protected int Sitzplaetze;
    protected int belegteSitzplaetze;

    public Personenzug(){}

    public void setSitzplaetze(int anzahl){
        this.Sitzplaetze = anzahl;
    }

    public int getSitzplaetze(){
        return this.Sitzplaetze;
    }

    public void updateBelegteSitzplaetze(int neueBuchungen){
        if(neueBuchungen > 0){
            int x = this.belegteSitzplaetze + neueBuchungen;
            if(x > this.belegteSitzplaetze){
                System.err.println("Die maximale Anzahl an Sitzplätzen wurde bereits erreicht. Keine Buchungen mehr möglich!");
            }
        }
    }

    public int getBelegteSitzplaetze(){
        return this.belegteSitzplaetze;
    }
}
