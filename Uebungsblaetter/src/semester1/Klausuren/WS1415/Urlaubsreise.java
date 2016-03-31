package semester1.Klausuren.WS1415;


/**
 * Created by fabia on 25.01.2016.
 */
public class Urlaubsreise extends Reise {
    protected String unterkunft;
    protected Transportmittel anreise;
    protected Verpflegung essen;

    public Urlaubsreise(String unterkunft, Transportmittel anreise, Verpflegung essen, String reiseziel, int reisedauer, double preis){
        super(reiseziel, reisedauer, preis);
        setUnterkunft(unterkunft);
        setAnreise(anreise);
        setEssen(essen);
    }

    public void setUnterkunft(String unterkunft){
        this.unterkunft = unterkunft;
    }

    public String getUnterkunft(){
        return this.unterkunft;
    }

    public void setAnreise(Transportmittel anreise){
        this.anreise = anreise;
    }

    public Transportmittel getAnreise(){
        return this.anreise;
    }

    public void setEssen(Verpflegung esse){
        this.essen = esse;
    }

    public Verpflegung getEssen(){
        return this.essen;
    }

    public String toString(){
        return "Ziel: " + this.reiseziel + "\nDauer: " + this.reisedauer + "\nPreis: " + this.preis +
                "\nUnterkunft: " + this.unterkunft + "\nVerpflegung: " + this.essen + "\nAnreise: " + this.anreise;
    }

}
