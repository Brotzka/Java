package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class TabletPC {
    protected String modell_ref;
    protected int serienNummer;
    protected double displayGroesse;
    protected int akkuLaufzeit;

    public final int DEFAULTWERT = -1;
    public final double DEFAULTGROESSE = -1.0;

    public TabletPC(String modell_ref, int serienNummer, double displayGroesse, int akkuLaufzeit){
        this.modell_ref = modell_ref;

        int length = String.valueOf(serienNummer).length();
        if(length != 6){
            this.serienNummer = DEFAULTWERT;
        } else {
            this.serienNummer = serienNummer;
        }

        if(displayGroesse >= 5.0 && displayGroesse <= 15.0){
            this.displayGroesse = displayGroesse;
        } else {
            this.displayGroesse = DEFAULTGROESSE;
        }

        if(akkuLaufzeit >= 2 && akkuLaufzeit <= 20){
            this.akkuLaufzeit = akkuLaufzeit;
        } else {
            this.akkuLaufzeit = DEFAULTWERT;
        }
    }

    public double getDisplayGroesseInZentimeter(){
        return this.displayGroesse * 2.54;
    }

    public void setSerienNummer(int serienNummer){
        if(String.valueOf(serienNummer).length() == 6){
            this.serienNummer = serienNummer;
        }
    }

    public void setDisplayGroesse(double displayGroesse){
        if(displayGroesse >= 5.0 && displayGroesse <= 15.0){
            this.displayGroesse = displayGroesse;
        }
    }

    public void setAkkuLaufzeit(int akkuLaufzeit){
        if(akkuLaufzeit >= 2 && akkuLaufzeit <= 20){
            this.akkuLaufzeit = akkuLaufzeit;
        }
    }

    public String toString(){
        return this.modell_ref + ", " + this.serienNummer;
    }
}
