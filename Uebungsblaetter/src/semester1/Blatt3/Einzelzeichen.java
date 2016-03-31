package semester1.Blatt3; /**
 * Created by fabian on 27.10.15.
 */
import java.util.Scanner;

public class Einzelzeichen {

    public static void main(String[] args){
        // 1. Scanner starten
        Scanner userinput = new Scanner(System.in);

        // Usereingabe für 1. Scanner entegennehmen
        System.out.print("Gib etwas ein: ");
        String wert = userinput.nextLine();
        userinput.close();

        if(wert.matches("[A-Z]")){
            System.out.println("Großbuchstabe");
        }

        if(wert.matches("[A-Fa-f0-9]")){
            System.out.println("Hexadezimale Ziffer");
        }

        if(wert.matches("[0-1]")){
            System.out.println("binäre Ziffer");
        }

        if(wert.matches("[0-7]")){
            System.out.println("oktale Ziffer");
        }

        if(!wert.matches("[A-Z]") && !wert.matches("[A-Fa-f0-9]") && !wert.matches("[0-1]") && !wert.matches("^[1-7][0-7]*$")){
            System.out.println("Unbekannt");
        }
    }
}
