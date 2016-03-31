package semester1.Tutorium;

/**
 * Created by fabia on 15.12.2015.
 */
public class SmartphoneList {
    public static void main(String[] args){

        // Entweder so initialisieren
        Smartphone[] phones = new Smartphone[4];

        phones[0] = new Smartphone("HTC", "One", 5000);
        phones[1] = new Smartphone("Nokia", "Lumia 8", 6000);
        phones[2] = new Smartphone("Samsung", "Note Edge", 8000);
        phones[3] = new Smartphone("iPhone", "6s", 125);

        // oder so
        Smartphone[] test = {
                new Smartphone("HTC", "One", 5000),
                new Smartphone("Nokia", "Lumia 8", 6000),
                new Smartphone("Samsung", "Note Edge", 8000),
                new Smartphone("iPhone", "6s", 125)
        };

        float preis = Smartphone.getAnzahl() * 399.90f;

        System.out.println(Smartphone.getAnzahl() + " kosten zusammen " + preis + "€");
    }
}
