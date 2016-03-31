package semester1.Blatt11;

/**
 * Created by fabia on 22.01.2016.
 */
public class Ausweis {
    protected String Vorname, Nachname, Geschlecht;

    public Ausweis(){

    }

    public Ausweis(String vorname, String nachname, String geschlecht){
        this.Vorname = vorname;
        this.Nachname = nachname;
        this.Geschlecht = geschlecht;
    }

    public void setVorname(String vorname){
        this.Vorname = vorname;
    }
    public String getVorname(){
        return this.Vorname;
    }

    public void setNachname(String nachname){
        this.Nachname = nachname;
    }
    public String getNachname(){
        return this.Nachname;
    }

    public void setGeschlecht(String geschlecht){
        this.Geschlecht = geschlecht;
    }
    public String getGeschlecht(){
        return this.Geschlecht;
    }

    public String toString(){
        return this.Vorname + " " + this.Nachname + ", " + this.Geschlecht;
    }

    public static void main(String[] args){
        Ausweis personA = new Ausweis("Fabian", "Hagen", "m");

        System.out.println(personA);
    }
}
