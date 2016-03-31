package semester1.Test;

/**
 * Created by fabia on 24.01.2016.
 */
public enum Wochentag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    public static void main(String[] args){
        Wochentag m = Wochentag.MONTAG;

        System.out.println(m);
        System.out.println(DIENSTAG.toString() + "\n");

        Wochentag[] values = Wochentag.values();
        for(Wochentag one: values){
            System.out.println(one.toString() + " -> " + one.ordinal());
        }

        System.out.println("\n" + MITTWOCH.ordinal());

    }
}
