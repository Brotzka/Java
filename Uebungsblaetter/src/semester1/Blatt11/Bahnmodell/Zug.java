package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Zug {
    protected int Laenge;
    protected String Bezeichnung;
    protected String Start, Ziel;

    protected Waggon[] Waggons;

    protected Lok Zugmaschine;

    public Zug(){}

    public void setLaenge(int laenge){
        this.Laenge = laenge;
    }

    public int getLaenge(){
        return this.Laenge;
    }

    public void setBezeichnung(String bezeichnung){
        this.Bezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        return this.Bezeichnung;
    }

    public void setStart(String start){
        this.Start = start;
    }
    public String getStart(){
        return this.Start;
    }

    public void setZiel(String ziel){
        this.Ziel = ziel;
    }

    public String getZiel(){
        return this.Ziel;
    }

    public void setZugmaschine(Lok lok){
        this.Zugmaschine = lok;
    }

    public Lok getZugmaschine(){
        return this.Zugmaschine;
    }

    public String toString(){
        return this.Bezeichnung + ", " + this.Laenge + " Waggons";
    }

    public void printZug(){
        System.out.println("Details zu: " + this.Bezeichnung);
        System.out.println("Zugmaschine: " + this.Zugmaschine);

        for(int x = 0; x < this.Waggons.length; x++){
            System.out.println(this.Waggons[x]);
        }
    }
}
