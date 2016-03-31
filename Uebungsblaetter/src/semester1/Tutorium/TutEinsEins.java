package semester1.Tutorium; /**
 * Created by fabia on 24.11.2015.
 */
import java.util.Scanner;

public class TutEinsEins {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie einen Monat an (als Zahl):");
        int x = input.nextInt();

        System.out.println(Monat(x));
        System.out.println(Jahreszeit(x));
        System.out.println(Monat2(x));

        input.close();
    }

    public static String Monat(int tag){
        String monat;
        switch(tag){
            case 1:
                monat = "Januar";
                break;
            case 2:
                monat = "Februar";
                break;
            case 3:
                monat = "März";
                break;
            case 4:
                monat = "April";
                break;
            case 5:
                monat = "Mai";
                break;
            case 6:
                monat = "Juni";
                break;
            case 7:
                monat = "Juli";
                break;
            case 8:
                monat = "August";
                break;
            case 9:
                monat = "Septmeber";
                break;
            case 10:
                monat = "Oktober";
                break;
            case 11:
                monat = "November";
                break;
            case 12:
                monat = "Dezember";
                break;
            default:
                monat = "Keine gültige Monatszahl";
                break;
        }
        return monat;
    }

    public static String Monat2(int tag){
        String[] monat = {"Januar","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember", "Keine gültige Monatszahl übergeben!"};
        switch(tag){
            case 1:
                return monat[0];
            case 2:
                return monat[1];
            case 3:
                return monat[2];
            case 4:
                return monat[3];
            case 5:
                return monat[4];
            case 6:
                return monat[5];
            case 7:
                return monat[6];
            case 8:
                return monat[7];
            case 9:
                return monat[8];
            case 10:
                return monat[9];
            case 11:
                return monat[10];
            case 12:
                return monat[11];
            default:
                return monat[12];
        }
    }

    public static String Jahreszeit(int tag){
        String jahreszeit;
        switch(tag){
            case 3:
            case 4:
            case 5:
                return jahreszeit = "Es ist Frühling!!!";
            case 6:
            case 7:
            case 8:
                return jahreszeit = "Es ist Sommer!!!";
            case 9:
            case 10:
            case 11:
                return jahreszeit = "Es ist Herbst!!!";
            case 12:
            case 1:
            case 2:
                return jahreszeit = "Es ist Winter!!!";
            default:
                return jahreszeit = "Keine gültige Monatseingabe!!!";
        }
    }
}
