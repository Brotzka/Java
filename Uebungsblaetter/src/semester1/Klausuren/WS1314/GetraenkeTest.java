package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class GetraenkeTest {
    public static void main(String[] args){
        Getraenk[] kneipe_ref = new Getraenk[50];

        SaftGetraenk Multi = new SaftGetraenk(50);
        Multi.setName("Multivitaminsaft");
        Multi.setMenge(0.5);
        Multi.setPreis(2.50);

        SaftGetraenk OSaft = new SaftGetraenk(90);
        OSaft.setName("Orangensaft");
        OSaft.setPreis(3.75);
        OSaft.setMenge(0.75);

        Getraenk Bier = new Getraenk("Pils", 0.5, 3.5);
        Getraenk Weizen = new Getraenk("Weizen", 0.5, 3.5);

        kneipe_ref[0] = Multi;
        kneipe_ref[1] = OSaft;
        kneipe_ref[2] = Bier;
        kneipe_ref[3] = Weizen;

        for(int x = 0; x < kneipe_ref.length; x++){
            if(kneipe_ref[x] != null){
                System.out.println(kneipe_ref[x]);
            } else {
                System.out.println("Feldkomponente mit Index: " + x + " ist nicht belegt!");
            }
        }
    }
}
