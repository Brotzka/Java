package semester1.Klausuren.WS1314;

/**
 * Created by fabia on 24.01.2016.
 */
public class Liste {

    protected Knoten start;

    public String[] toArray(){

        Knoten temp = this.start;
        int counter = 0;

        while(temp.nextKnoten != null){
            counter += 1;
            temp = temp.nextKnoten;
        }

        String[] ausgabe = new String[counter];

        temp = this.start;
        for(int x = 0; x < ausgabe.length; x++){
            ausgabe[x] = temp.Name;
            temp = temp.nextKnoten;
        }

        return ausgabe;
    }

    public void out(){
        if(start == null)
            return;
        outString(start);
        System.out.println();
    }

    public void outString(Knoten k){
        if(k.getNext() != null)
            outString(k.getNext());
        System.out.print(k.getName() + " ");
    }

    public static void main(String[] args){
        Knoten F = new Knoten("Fabian");

        Knoten L = new Knoten("Lisa");

        Knoten B = new Knoten("Ben");

        Knoten K = new Knoten("Kathi");

        F.setNextKnoten(L);
        L.setNextKnoten(B);
        B.setNextKnoten(K);

        Liste List = new Liste();
        List.start = F;

        String[] ausgabe = List.toArray();

        for(String one: ausgabe){
            System.out.println(one);
        }

        System.out.println("\n");

        List.out();
    }
}
