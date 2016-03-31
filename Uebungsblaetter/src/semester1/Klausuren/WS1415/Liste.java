package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Liste {
    protected Knoten start;
    protected Knoten ende;

    public Liste(Knoten start, Knoten ende){
        setStart(start);
        setEnde(ende);
    }

    public void setStart(Knoten k){
        this.start = k;
    }

    public Knoten getStart(){
        return this.start;
    }

    public void setEnde(Knoten k){
        this.ende = k;
    }

    public Knoten getEnde(){
        return this.ende;
    }

    public void fuegeHinzu(Knoten k){
        if(this.ende == null || this.start == null){
            // Liste ist noch leer
            this.ende = k;
            this.start = k;
        } else {
            Knoten altesEnde = this.ende;
            this.ende = k;
            altesEnde.setNext(k);
        }
    }

    public void entferneErstenKnoten(){
        if(this.start.getNext() == null){
            // Es existiert nur ein Element in der Liste
            this.start = null;
            this.ende = null;
        } else {
            this.start = this.start.getNext();
        }
    }

    public boolean istLeer(){
        return (this.start == null && this.ende == null);
    }
}
