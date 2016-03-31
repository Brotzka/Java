package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class Uhrzeit {
    int std;
    int min;
    int sek;

    public Uhrzeit(int std, int min, int sek){
        this.std = std;
        this.min = min;
        this.sek = sek;
    }

    public int getStd(){
        return this.std;
    }

    public void setStd(int std){
        this.std = std;
    }

    public int getMin(){
        return this.min;
    }

    public void setMin(int min){
        this.min = min;
    }

    public int getSek(){
        return this.sek;
    }

    public void setSek(int sek){
        this.sek = sek;
    }

    public String toString(){
        return "Stunden: " + std +
                "\nMinunten: " + this.min +
                "\nSekunden: " + this.sek;
    }
}
