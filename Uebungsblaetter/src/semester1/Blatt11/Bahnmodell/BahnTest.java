package semester1.Blatt11.Bahnmodell;

import java.util.Scanner;
/**
 * Created by fabia on 23.01.2016.
 */
public class BahnTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Willkommen beim Zugkonfigurator\nBitte befolgen Sie die Anweisungen.");

        Zug Zug1 = new Zug();
        System.out.println("Zugbezeichnung angeben: ");
        Zug1.setBezeichnung(input.nextLine());

        System.out.println("Leistung der Zugmaschine angeben: ");
        Lok Lok1 = new Lok(input.nextInt());

        System.out.println("Bezeichnung der Lok: ");
        Lok1.setBezeichnung(input.next());

        // Waggons erstellen
        System.out.println("Anzahl der Waggons eingeben: ");
        int laenge = input.nextInt();
        Zug1.setLaenge(laenge);

        Waggon[] waggons = new Waggon[laenge];

        int counter = 0;
        do{
            System.out.println("Waggon " + (counter + 1) + " anlegen");
            System.out.println("Wähle einen Waggontyp (Nummer angeben):");
            Waggon.printTypen();
            System.out.print("Auswahl: ");
            int auswahl = input.nextInt();

            switch(auswahl){
                case 0:
                    Passagierwaggon PassagierW = new Passagierwaggon();
                    System.out.println("Bezeichnung: ");
                    PassagierW.setBezeichnung(input.next());

                    System.out.println("Anzahl der Sitzplätze angeben: ");
                    PassagierW.setPlaetze(input.nextInt());

                    waggons[counter] = PassagierW;
                    break;
                case 1:
                    Fahrradwaggon FahrradW = new Fahrradwaggon();

                    waggons[counter] = FahrradW;
                    break;
                case 2:
                    Gueterwaggon GueterW = new Gueterwaggon();

                    waggons[counter] = GueterW;
                    break;
                case 3:
                    Bistro BistroW = new Bistro();

                    waggons[counter] = BistroW;
                    break;
            }

            counter++;
        }while(counter != laenge);

        System.out.println("\n");

        for(int y = 0; y < waggons.length; y++){
            System.out.println(waggons[y]);
        }
    }
}
