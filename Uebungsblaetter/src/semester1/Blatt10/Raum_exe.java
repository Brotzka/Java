package semester1.Blatt10;

/**
 * Created by Fabian on 06.01.2016.
 */
public class Raum_exe {
    public static void main(String[] args){

        /**
         * Aufgabe 2
         */
        // Räume anlegen
        Raum[] raeume = new Raum[2];
        raeume[0] = new Raum("I.2.1", 50);
        raeume[1] = new Raum("I.2.15", 3);

        // Belegung prüfen
        System.out.println("Verfügbarkeit:");
        for(Raum raum: raeume){
            System.out.println(raum.isBelegbar());
        }

        /**
         * Aufgabe 2 ergänzt um Aufgabe 3
         */
        // Einen Raum belegen
        Vorlesung prog1 = new Vorlesung("Programmieren 1", "Prof. Rauch", "E-Commerce");
        raeume[0].setBelegbar(prog1);

        // Belegung erneut prüfen
        System.out.println("\nAktualisierte Verfügbarkeit:");
        for(Raum raum: raeume){
            System.out.println(raum.isBelegbar());
        }

        /**
         * Aufgabe 4
         */
        // Studenten betreten den Raum, Maximalbelegung wird in Klasse Raum geprüft
        // Studenten anlegen
        Student Fabian = new Student("Fabian");
        Student Lisa = new Student("Lisa");
        Student Max = new Student("Max");

        // Raum betreten
        raeume[1].betreteRaum(Fabian);
        raeume[1].betreteRaum(Lisa);
        raeume[1].betreteRaum(Max);

        // Studenten ausgeben lassen
        raeume[1].listStudenten();

        // Studenten den Raum verlassen lassen
        raeume[1].verlasseRaum(Fabian);
        raeume[1].verlasseRaum(Lisa);
        raeume[1].verlasseRaum(Max);
    }
}
