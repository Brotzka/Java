package semester1.Blatt11;

/**
 * Created by fabia on 23.01.2016.
 */
public class Uhr {
    protected int Stunden, Minuten, Sekunden;

    public Uhr(int std, int min, int sek){
        if((std < 0 || std > 23) || (min < 0 || min > 59) || (sek < 0 || sek > 59)){
            this.Stunden = 12;
            this.Minuten = 0;
            this.Sekunden = 30;
        } else {
            this.Stunden = std;
            this.Minuten = min;
            this.Sekunden = sek;
        }
    }

    private static boolean isValid(int std, int min, int sek){
        return ((std < 0 || std > 23) || (min < 0 || min > 59) || (sek < 0 || sek > 59));
    }

    public int getStunden(){
        return this.Stunden;
    }

    public int getMinuten(){
        return this.Minuten;
    }

    public int getSekunden(){
        return this.Sekunden;
    }

    public void setUhr(int std, int min, int sek){
        if(isValid(std, min, sek)){
            this.Stunden = std;
            this.Minuten = min;
            this.Sekunden = sek;
        } else {
            System.err.println("Die übergebene Uhrzeit hat kein gültiges Format");
        }
    }

    public void naechsteSek(){
        if(this.Sekunden < 59){
            this.Sekunden += 1;
        } else {
            this.Sekunden = 0;
            if(this.Minuten < 59){
                this.Minuten += 1;
            } else {
                this.Minuten = 0;
                if(this.Stunden < 23){
                    this.Stunden += 1;
                } else {
                    this.Stunden = 0;
                }
            }
        }
    }

    public long getTagesSek(){
        long std = this.Stunden * 60 * 60;
        long min = this.Minuten * 60;
        long sek = this.Sekunden;

        return std + min + sek;
    }

    public boolean wecker(Uhr weckzeit){
        // Gibt true oder false zurück
        return((weckzeit.getStunden() == this.Stunden) && (weckzeit.getMinuten() == this.Minuten) && (weckzeit.getSekunden() == this.Sekunden));
    }

    public String toString(){
        return this.Stunden + ":" + this.Minuten + ":" + this.Sekunden;
    }

    public static void printUhr(Uhr[] uhren){
        for(Uhr eine: uhren){
            System.out.println(eine);
        }
    }

    public static void main(String[] args){
        Uhr[] weltzeit = new Uhr[24];

        for(int x = 0; x < weltzeit.length; x++){
            weltzeit[x] = new Uhr(x, 23, 7);
        }

        printUhr(weltzeit);

        for(int x = 0; x < weltzeit.length; x++){
            weltzeit[x].naechsteSek();
        }

        printUhr(weltzeit);
    }
}
