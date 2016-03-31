package semester1.Blatt11;

/**
 * Created by fabia on 22.01.2016.
 */
public class Vereinsausweis extends Ausweis {
    protected String Verein;

    public Vereinsausweis(String verein){
        this.Verein = verein;
    }

    public Vereinsausweis(){}

    public void setVerein(String verein){
        this.Verein = verein;
    }

    public String getVerein(){
        return this.Verein;
    }

    public String toString(){
        return this.Vorname + " " + this.Nachname + ", " + this.Geschlecht + ", " + this.Verein;
    }


    public static void main(String[] args){
        Vereinsausweis mitgliedA = new Vereinsausweis("OGV Bettwar");

        mitgliedA.setVorname("Fabian");
        mitgliedA.setNachname("Hagen");
        mitgliedA.setGeschlecht("m");

        System.out.println(mitgliedA);
    }
}
