package semester1.Blatt11;

/**
 * Created by fabia on 23.01.2016.
 */
public class AusweisTest {
    public static void main(String[] args){

        Ausweis Fabian = new Ausweis("Fabian", "Hagen", "m");

        Vereinsausweis Lisa = new Vereinsausweis("OGV Bettwar");
        Lisa.setVorname("Lisa");
        Lisa.setNachname("Hagen");
        Lisa.setGeschlecht("w");

        Studentenausweis Ben = new Studentenausweis("61115010", "FHWS");
        Ben.setNachname("Standhardt");
        Ben.setVorname("Ben");
        Ben.setGeschlecht("m");

        Ausweis[] ausweise = new Ausweis[6];

        ausweise[1] = Lisa;
        ausweise[2] = Fabian;
        ausweise[4] = Ben;

        datenAusgabe(ausweise);
    }

    public static Ausweis[] erzeugeAusweis(){
        Ausweis[] ausweise = new Ausweis[6];

        ausweise[0] = new Ausweis();
        ausweise[1] = new Ausweis();

        ausweise[2] = new Vereinsausweis();
        ausweise[3] = new Vereinsausweis();

        ausweise[4] = new Studentenausweis();
        ausweise[5] = new Studentenausweis();

        return ausweise;
    }

    private static void datenAusgabe(Ausweis[] daten){
        for(int x = 0; x < daten.length; x++){
            if(daten[x] != null){
                System.out.println(daten[x]);
            } else {
                System.out.println("Dieser Index " + x + " ist nicht belegt.");
            }
        }
    }
}
