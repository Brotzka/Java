package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Knoten {
    protected String Name;
    protected Knoten nextKnoten;

    public Knoten(String name){
        this.Name = name;
    }

    public void setNextKnoten(Knoten k){
        this.nextKnoten = k;
    }

    public String getName(){
        return this.Name;
    }

    public Knoten getNext(){
        return this.nextKnoten;
    }

    public String toString(){
        return this.Name;
    }
}
