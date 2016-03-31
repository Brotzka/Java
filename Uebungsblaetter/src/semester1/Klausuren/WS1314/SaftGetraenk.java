package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class SaftGetraenk extends Getraenk {
    protected double fruchtgehalt;

    public SaftGetraenk(double fruchtgehalt){
        if(fruchtgehalt >= 30 && fruchtgehalt <= 100){
            this.fruchtgehalt = fruchtgehalt;
        } else {
            this.fruchtgehalt = DEFAULTWERT;
        }
    }

    public void setFruchtgehalt(double fruchtgehalt){
        if(fruchtgehalt >= 30 && fruchtgehalt <= 100){
            this.fruchtgehalt = fruchtgehalt;
        }
    }

    public double getFruchtgehalt(){
        return this.fruchtgehalt;
    }

    public String toString(){
        return this.name + ", " + this.fruchtgehalt + "% Fruchtgehalt, " + this.menge + "l, " + this.preis + " Euro";
    }
}
