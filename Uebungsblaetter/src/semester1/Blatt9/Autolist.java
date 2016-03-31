package semester1.Blatt9;

/**
 * Created by Fabian on 08.12.2015.
 */

public class Autolist {
    public static void main(String[] args){
        Auto[] autos = new Auto[3];
        autos[0] = new Auto("Audi", "schwarz", "Q10", 5234, 2014);
        autos[1] = new Auto("Volkswagen", "pink", "Polo", 800, 1992);
        autos[2] = new Auto("Ford", "dunkelblau", "Mustang", 7001, 1967);

        int max = 0;
        int objectNumber = 0;

        for(int i = 0; i < autos.length; i++){
            if(autos[i].getHubraum() > max){
                max = autos[i].getHubraum();
                objectNumber = i;
            }
        }

        System.out.println(autos[objectNumber].getMarke() + " " + autos[objectNumber].getModel() + " hat den größten Hubraum.");
    }
}
