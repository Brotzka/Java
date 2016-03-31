package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class TagesReise extends Reise {
    protected Uhrzeit abfahrt;
    protected Uhrzeit ankunft;

    public TagesReise(Uhrzeit abfahrt, Uhrzeit ankunft, String reiseziel, double preis){
        super(reiseziel, 1, preis);
    }

    public void setAbfahrt(Uhrzeit abfahrt){
        this.abfahrt = abfahrt;
    }

    public Uhrzeit getAbfahrt(){
        return this.abfahrt;
    }

    public void setAnkunft(Uhrzeit ankunft){
        this.ankunft = ankunft;
    }

    public Uhrzeit getAnkunft(){
        return this.ankunft;
    }

    public String toString(){
        return "Reiseziel: " + this.reiseziel +
                "\nPreis: " + this.preis +
                "\nAbfahrt: " + this.abfahrt +
                "\nAnkunft: " + this.ankunft;
    }
}
