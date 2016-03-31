package semester1.Blatt11;

/**
 * Created by fabia on 23.01.2016.
 */
public class Studentenausweis extends Ausweis {
    protected String Matrikelnr, Hochschule;

    public Studentenausweis(String matrikelnr, String hochschule){
        this.Matrikelnr = matrikelnr;
        this.Hochschule = hochschule;
    }

    public Studentenausweis(){}

    public void setMatrikelnr(String matrikelnr){
        this.Matrikelnr = matrikelnr;
    }
    public String getMatrikelnr(){
        return this.Matrikelnr;
    }

    public void setHochschule(String hochschule){
        this.Hochschule = hochschule;
    }
    public String getHochschule(){
        return this.Hochschule;
    }

    public String toString(){
        return this.Nachname + ", " + this.Vorname + ", " + this.Matrikelnr + ", " + this.Hochschule;
    }

    public static void main(String[] args){
        Studentenausweis studentA = new Studentenausweis("6115014", "FHWS");

        studentA.setVorname("Fabian");
        studentA.setNachname("Hagen");

        System.out.println(studentA);
    }
}
