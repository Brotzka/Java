package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Knoten {
    protected String nachname;
    protected Knoten next;

    public Knoten(String nachname){
        setNachname(nachname);
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public void setNext(Knoten k){
        this.next = k;
    }

    public Knoten getNext(){
        return this.next;
    }
}
