package semester1.Test;

/**
 * Created by fabia on 24.01.2016.
 */
public class Knoten {
    protected String Nachname;
    protected String Vorname;

    protected Knoten Next;

    protected static Knoten Start = null;


    public Knoten(){
        if(Start == null){
            Start = this;
        }
    }

    /**
     * Noch NICHT fertiggestellt
     * @param k
     */
    public static void updateListe(Knoten k){
        if(Start == null){
            System.err.println("Es wurde noch kein Startknoten festgelegt!");
        } else {
            Knoten temp = Start;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
        }
    }

    public static void setStart(Knoten k){
        Start = k;
    }

    public Knoten withNachname(String nachname){
        this.Nachname = nachname;
        return this;
    }

    public Knoten withVorname(String vorname){
        this.Vorname = vorname;
        return this;
    }

    public Knoten withNext(Knoten k){
        this.Next = k;
        return this;
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

    public void setNext(Knoten k){
        this.Next = k;
    }

    public Knoten getNext(){
        return this.Next;
    }

    public String toString(){
        return this.Nachname + ", " + this.Vorname;
    }

    public static void main(String[] args){

        // Liste initialisieren
        Knoten Liste = null;

        // Erstes Element anlegen
        Liste = new Knoten()
                .withNachname("Hagen")
                .withVorname("Fabian");

        // Ein extra Element anlegen...
        Knoten w = new Knoten()
                .withNachname("Winkler")
                .withVorname("Elke");

        // ...und an die bestehende Kette anfügen
        Liste.setNext(w);

        // Noch ein Element anlegen
        Knoten S = new Knoten()
                .withNachname("Standhardt")
                .withVorname("Ben");

        // Element S in Liste einfügen
        while(Liste != null){

        }

        while(Liste != null){
            System.out.println(Liste);
            Liste = Liste.getNext();
        }
    }
}
