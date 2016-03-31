package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Bruch {
    protected int Zaehler;
    protected int Nenner;

    public Bruch(int zaehler, int nenner){
        this.Zaehler = zaehler;
        this.Nenner = nenner;
    }

    public int getZaehler(){
        return this.Zaehler;
    }

    public void setZaehler(int zaehler){
        this.Zaehler = zaehler;
    }

    public int getNenner(){
        return this.Nenner;
    }

    public void setNenner(int nenner){
        this.Nenner = nenner;
    }

    public String toString(){
        return this.Zaehler + "/" + this.Nenner;
    }

    public static void main(String[] args){
        Bruch a = new Bruch(3,5);
        Bruch b = new Bruch(7,4);

        System.out.println(multipliziereBruch(a,b));

        System.out.println(addiereBruch(a,b));

    }

    public static Bruch multipliziereBruch(Bruch a, Bruch b){
        int zaehler = a.getZaehler() * b.getZaehler();
        int nenner = a.getNenner() * b.getNenner();

        Bruch ergebnis = new Bruch(zaehler,nenner);
        return ergebnis;
    }

    public static Bruch addiereBruch(Bruch a, Bruch b){
        int zaehler;
        int nenner;
        if(a.getNenner() == b.getNenner()){
            zaehler = a.getZaehler() + b.getZaehler();
            nenner = a.getNenner() + b.getNenner();
        } else {
            zaehler = (a.getZaehler() * b.getNenner()) + (b.getZaehler() * a.getNenner());
            nenner = a.getNenner() * b.getNenner();
        }

        Bruch ergebnis = new Bruch(zaehler,nenner);

        return ergebnis;
    }

    public void multipliziereMitBruch(Bruch b){
        setZaehler(this.Zaehler * b.getZaehler());
        setNenner(this.Nenner * b.getNenner());
    }
}
