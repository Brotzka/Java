package semester1.Blatt10;

/**
 * Created by Fabian on 06.01.2016.
 */
public class Vorlesung {
    private String Name;
    private String Dozent;
    private String Studiengang;

    public Vorlesung(String Name, String Dozent, String Studiengang){
        this.Name = Name;
        this.Dozent = Dozent;
        this.Studiengang = Studiengang;
    }

    public String getAll(){
        return this.Name + ", " + this.Dozent + ", " + this.Studiengang;
    }

    /**
     * Hinweis:
     * Weitere Setter und Getter wurden zu Gunsten der Übersichtlichkeit weggelassen
     */
}
