package semester1.Klausuren.WS1213;

/**
 * Created by fabia on 24.01.2016.
 */
public class TabletPCTest {
    public static void main(String[] args){
        TabletPC[] samsapple_ref = new TabletPC[500];

        int serienNr = 100000;

        for(int x = 0; x < samsapple_ref.length; x++){
            samsapple_ref[x] = new TabletPC("MILKYWAY", serienNr, 10.0, 8);
            serienNr += 2;
        }

        for(TabletPC one: samsapple_ref){
            System.out.println(one);
        }
    }
}
