package semester1.Tutorium; /**
 * Created by fabia on 01.12.2015.
 */
import java.util.Scanner;

public class TutZweiEinsA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Wie viele Dinge sollen auf die Einkaufsliste?");
        int numberOfItems = input.nextInt();

        String[] list = new String[numberOfItems];
        int counter = 0;
        for(String item: list){
            System.out.print("Bitte gib einen Gegenstand ein: ");
            list[counter] = input.next();
            counter++;
        }

        for(String item: list){
            System.out.println(item);
        }

        input.close();
    }
}
