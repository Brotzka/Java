package semester1.Blatt10;

/**
 * Created by Fabian on 06.01.2016.
 */
public class Raum {
    private String Kennung;
    private int Anzahl;
    private boolean Belegbar = true;
    private Vorlesung Vorlesung;
    private Student[] Studenten;

    public Raum(String Kennung, int Anzahl){
        this.Kennung = Kennung;
        this.Anzahl = Anzahl;
        this.Studenten = new Student[this.Anzahl];
    }

    /**
     * Gibt aus, ob ein Raum frei ist oder belegt (inkl. Zugehöriger Vorlesung)
     */
    public String isBelegbar(){
        if(this.Belegbar){
            return this.Kennung + ": " + null;
        }
        return this.Kennung + ": " + this.Vorlesung.getAll();
    }

    /**
     * Belegt einen Raum mit einer Vorlesung
     */
    public void setBelegbar(Vorlesung vorlesung){
        this.Belegbar = false;
        this.Vorlesung = vorlesung;
    }

    /**
     * Raum wird wieder frei gemacht
     */
    public void setBelegbar(boolean value){
        if(value){
            this.Belegbar = true;
            this.Vorlesung = null;
        }
    }

    /**
     * Prüft, ob ein Raum schon voll belegt ist
     */
    public boolean isFull(){
        for(int c = 0; c < this.Studenten.length; c++){
            if(this.Studenten[c] == null){
                return false;
            }
        }
        return true;
    }

    /**
     * Fügt einen Student dem Raum hinzu
     */
    public void betreteRaum(Student student){
        if(!isFull()){
            for(int c = 0; c < this.Anzahl; c++){
                if(this.Studenten[c] == null){
                    this.Studenten[c] = student;
                    break;
                }
            }
        } else {
            System.err.println(student.getName() + ", der Raum ist bereits voll. Du kannst ihn nicht betreten!");
        }
    }

    /**
     * Entfernt den übergebenen Studenten aus dem Raum
     */
    public void verlasseRaum(Student student){
        for(int c = 0; c < this.Anzahl; c++){
            if(this.Studenten[c] == student){
                this.Studenten[c] = null;
            }
        }
    }

    /**
     * Liefert das Array mit Studenten zurück
     */
    public void listStudenten(){
        System.out.println("\nPersonen im Raum " + this.Kennung + ":");
        for(Student person: this.Studenten){
            // Prüfen, ob Wert nicht NULL ist, da ansonsten Fehler (.getName() kann nicht auf NULL angewandt werden)
            if(person != null){
                System.out.println(person.getName());
            }
        }
    }
}
