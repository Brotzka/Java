package semester1.Klausuren.WS1415;

/**
 * Created by fabia on 25.01.2016.
 */
public class ReiseTest {
    public static void main(String[] args){
        Reise[] nixwieweg = new Reise[80];

        nixwieweg[0] = new Urlaubsreise("Hotel", Transportmittel.FLUGZEUG, Verpflegung.VOLLPENSION, "Barcelona", 7, 4999.99);
        nixwieweg[1] = new Urlaubsreise("Bungalow", Transportmittel.PKW, Verpflegung.KEINE, "Kroatien", 14, 1999.99);
        nixwieweg[2] = new TagesReise(new Uhrzeit(8,0,0), new Uhrzeit(18,45,0), "München", 299);
        Uhrzeit abfahrt2 = new Uhrzeit(4,30,0);
        Uhrzeit ankunft2 = new Uhrzeit(21,15,0);
        nixwieweg[3] = new TagesReise(abfahrt2, ankunft2, "Barcelona", 899.45);

        sucheZiel(nixwieweg);
    }

    public static void sucheZiel(Reise[] reisen){
        for(Reise reise: reisen){
            if(reise.getReiseziel() == "Barcelona"){
                System.out.println(reise + "\n");
            }
        }
    }
}
