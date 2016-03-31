package semester1.Blatt11.Bahnmodell;

/**
 * Created by fabia on 23.01.2016.
 */
public class Waggon {
    protected String Bezeichnung;

    protected static String[] Typen = {"Passagierwaggon", "Fahrradwaggon", "Gueterwaggon", "Bistro"};

    public Waggon(){}

    public void setBezeichnung(String bezeichnung){
        this.Bezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        return this.Bezeichnung;
    }

    public static void printTypen(){
        int c = 0;
        for(String Typ: Typen){
            System.out.println("(" + c + "): " + Typ);
            c++;
        }
    }

    public static String[] getTypen(){
        return Typen;
    }
}
